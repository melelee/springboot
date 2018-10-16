package com.melelee.test.springboot.demo.configuration;

import org.apache.catalina.filters.RemoteIpFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * 测试
 *
 * @author mengll
 * @create 2018-04-16 15:33
 **/
@Configuration
@Order(1)
public class FilterConfig {
	private Logger logger = LoggerFactory.getLogger(FilterConfig.class);
	@Bean
	public RemoteIpFilter remoteIpFilter() {
		logger.info("new RemoteIpFilter..........");
		return new RemoteIpFilter();
	}

	@Bean
	public FilterRegistrationBean testFilterRegistration() {
		logger.info("new testFilterRegistration..........");
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new MyFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("MyFilter");
		registration.setOrder(1);
		return registration;
	}
}