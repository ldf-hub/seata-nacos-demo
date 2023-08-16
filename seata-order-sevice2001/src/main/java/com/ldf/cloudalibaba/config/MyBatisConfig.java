package com.ldf.cloudalibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther ldf
 * @create 2023年8月16日17:08:09
 */
@Configuration
@MapperScan({"com.ldf.cloudalibaba.dao"})
public class MyBatisConfig {
}
