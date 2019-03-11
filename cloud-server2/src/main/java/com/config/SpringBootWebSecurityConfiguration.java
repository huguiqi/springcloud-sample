//package com.config;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * Created by sam on 2018/4/14.
// */
//@ConditionalOnMissingBean(WebSecurityConfigurerAdapter.class)
//@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
//public class SpringBootWebSecurityConfiguration {
//    @Configuration
//    @Order(SecurityProperties.BASIC_AUTH_ORDER)
//    static class DefaultConfigurerAdapter extends WebSecurityConfigurerAdapter {
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            super.configure(http);//新包这两行被删了
//            http.csrf().disable();
//        }
//    }
//}
