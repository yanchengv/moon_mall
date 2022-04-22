package com.balawo.moon_mall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.*;

@Configuration
public class LogbookConfiguration {
    @Bean
    public Logbook logbook() {
        //<!--可以输出参数日志到控制台 例如form表单提交的参数日志等 https://github.com/zalando/logbook#spring-boot-starter-->
        Logbook logbook = Logbook.builder()
                .sink(new DefaultSink(
                        new DefaultHttpLogFormatter(),
                        new DefaultHttpLogWriter()
                ))
                .build();
        return logbook;
    }




}
