//package com.pack.config;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//@Component
//public class CorsFilter extends OncePerRequestFilter {
//
//	@Override
//	public void destroy() {
//	
//	}
//	
//	private String getAllowedDomainsRegex() {
//	    return "individual / customized Regex";
//	}
//	
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//	        throws ServletException, IOException {
//	
//		System.out.println("in corss filter");
//	    final String origin = "*";
//	
//	    response.addHeader("Access-Control-Allow-Origin", origin);
//	    response.setHeader("Access-Control-Allow-Methods", "*");
//	    //response.setHeader("Access-Control-Allow-Credentials", "true");
//	    response.setHeader("Access-Control-Allow-Headers",
//	            "*");
//	    response.setHeader("Cache-Control","*");
//	    
//	    filterChain.doFilter(request, response);
//	
//}
//}