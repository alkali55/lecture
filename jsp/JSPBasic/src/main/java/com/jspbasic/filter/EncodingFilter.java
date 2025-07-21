package com.jspbasic.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class EncodingFilter implements Filter{
	
	private String charset = "utf-8";
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

//		System.out.println("필터 동작 중.......");
		
		//
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		String path = httpRequest.getRequestURI();
//		System.out.println(path);
//		System.out.println(httpRequest.getContextPath());
		if(path.startsWith(httpRequest.getContextPath() + "/css/")) {
//			System.out.println("/css 제외");
			chain.doFilter(request, response);
			return;
		}
		
		request.setCharacterEncoding(charset);
		response.setContentType("text/html;charset=" + charset);
		
		chain.doFilter(request, response); // 서블릿으로 요청이 이어짐.
	}
	
}
