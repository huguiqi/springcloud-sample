package com.config;

import com.filter.fallback.ProducerFallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sam on 2018/5/17.
 */
@Configuration
public class Config {


    @Bean
    public ProducerFallback fallbackFilter() {
        return new ProducerFallback();
    }
}
