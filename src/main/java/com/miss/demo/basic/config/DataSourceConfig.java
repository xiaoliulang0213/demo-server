package com.miss.demo.basic.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "dataSource")
    @Primary
    @ConfigurationProperties(prefix = "datasource.c3p0")
    public DataSource getDataSource(){
        return DataSourceBuilder
                .create()
                .type(com.mchange.v2.c3p0.ComboPooledDataSource.class)
                .build();
    }
}
