package com.gb.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.gb.constant.ConstantData;
import com.gb.model.GoodEvaluate;
import com.gb.service.GoodEvaluateService;
import com.gb.utils.FileCopyUtil;
import com.gb.utils.ToolUtil;

@Controller
@RequestMapping("goodEvaluate")
@CrossOrigin
public class GoodEvaluateController {

	@Autowired
	private GoodEvaluateService goodEvaluateService;

	@RequestMapping("fge")
	@ResponseBody
	public Map<String, Object> findGoodEvaluate(Integer goodId) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<GoodEvaluate> count = goodEvaluateService.findGoodEvaluate(goodId);
		if (count == null) {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
			map.put("reason", "查找失败");
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
			map.put("reason", "查找成功");
			map.put("admin", count);
		}

		return map;
	}

	// 添加商品评价 多张图
	@RequestMapping(value = "addeva", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addGoodEvaluate(MultipartFile[] pictureUrl, GoodEvaluate goodEvaluate) {
		String str = "";
		Map<String, Object> map = new HashMap<>();
		if (pictureUrl != null) {

			for (MultipartFile photo : pictureUrl) {
				if (str == "") {
					String finalName = UUID.randomUUID() + photo.getOriginalFilename();
					try {
						photo.transferTo(new File(finalName));
						FileCopyUtil.copyFile(finalName);
						str = str + ConstantData.UPLOAD_PATH + finalName;
					} catch (IllegalStateException | IOException e) {
						e.printStackTrace();
						map.put("resultCode", ConstantData.STATUS_CODE_4);
					}
				} else {
					String finalName = UUID.randomUUID() + photo.getOriginalFilename();
					try {
						photo.transferTo(new File(finalName));
						FileCopyUtil.copyFile(finalName);
						str = str + ',' + ConstantData.UPLOAD_PATH + finalName;
					} catch (IllegalStateException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						map.put("resultCode", ConstantData.STATUS_CODE_4);
						map.put("reason", "图片上传失败");
					}
				}

			}
			goodEvaluate.setPictureUrl(str);
			goodEvaluate.setResourceTime(ToolUtil.currentTime());
			int count = goodEvaluateService.addGoodEvaluate(goodEvaluate);
			if (count > 0) {

				map.put("resultCode", ConstantData.STATUS_CODE_1);
				map.put("reason", "添加评价成功");
			} else {
				map.put("resultCode", ConstantData.STATUS_CODE_2);
				map.put("reason", "上传失败");
			}
		}

		return map;
	}

	// 删除评价图片
	@RequestMapping(value = "deleteGoodEvaluate", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deleteGoodEvaluate(Integer userId, Integer goodId) {
		Map<String, Object> map = new HashMap<String, Object>();
		int count = goodEvaluateService.deleteGoodEvaluate(userId, goodId);
		if (count < 1) {
			map.put("resultCode", ConstantData.STATUS_CODE_2);
			map.put("reason", "删除评价失败");
		} else {
			map.put("resultCode", ConstantData.STATUS_CODE_1);
			map.put("reason", "删除评价成功");
			map.put("admin", count);
		}

		return map;
	}

}
