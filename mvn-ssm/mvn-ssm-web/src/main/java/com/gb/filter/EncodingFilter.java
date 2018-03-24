package com.gb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.gb.utils.FileCopyUtil;

public class EncodingFilter implements Filter{

	/**
	 * Ĭ�ϱ���
	 */
	private String charset = "utf-8";
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String ca = filterConfig.getInitParameter("charset");
		if(null != ca) {
			charset = ca;
		}
		
		FileCopyUtil.copyFiles();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(charset);
		response.setCharacterEncoding(charset);
		response.setContentType("text/html;charset=" + charset);
		
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {
		
	}

}
