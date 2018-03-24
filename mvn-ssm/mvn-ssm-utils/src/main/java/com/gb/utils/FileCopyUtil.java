package com.gb.utils;

import java.io.File;
import java.io.IOException;

import org.springframework.util.FileCopyUtils;

public class FileCopyUtil {

	// Spring mvcͼƬ����·��
	private static final String SOURCE_PATH = "f:/upimgs";
	// Tomcat ��Ŀ����·����ͼƬ�ļ�Ŀ¼
	private static final String DEST_PATH = "F:\\tomcat8\\apache-tomcat-8.5.24\\webapps\\mvn-ssm-web\\upload";

	/**
	 * ���ƶ���ļ�
	 */
	public static void copyFiles() {
		copyFiles(SOURCE_PATH, DEST_PATH);
	}

	/**
	 * ���ƶ���ļ�
	 * 
	 * @param sourcePath
	 * @param destPath
	 */
	public static void copyFiles(String sourcePath, String destPath) {

		File fileSource = new File(sourcePath);
		File[] files = fileSource.listFiles();

		for (File f : files) {
			File destFile = new File(destPath + File.separator + f.getName());
			try {
				FileCopyUtils.copy(f, destFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ���Ƶ����ļ�����ָ����·����Ŀ��·���� ����ǰ���ļ�����ͬ
	 * 
	 * @param sourcePath
	 * @param destPath
	 * @param fileName
	 */
	public static void copyFile(String sourcePath, String destPath, String fileName) {
		File sourceFile = new File(sourcePath + File.separator + fileName);
		File destFile = new File(destPath + File.separator + fileName);

		try {
			FileCopyUtils.copy(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ���Ƶ����ļ�
	 * 
	 * @param fileName
	 */
	public static void copyFile(String fileName) {

		File sourceFile = new File(SOURCE_PATH + File.separator + fileName);
		File destFile = new File(DEST_PATH + File.separator + fileName);

		try {
			FileCopyUtils.copy(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
