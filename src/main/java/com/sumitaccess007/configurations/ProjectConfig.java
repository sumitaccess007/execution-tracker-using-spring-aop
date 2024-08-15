package com.sumitaccess007.configurations;

import com.sumitaccess007.aspect.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "services")
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public LoggingAspect aspect(){
        return new LoggingAspect();
    }
}
