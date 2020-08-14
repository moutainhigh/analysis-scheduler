package com.xss.as.config;

import org.apache.spark.sql.SparkSession;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xss
 * @description SparkSession
 * @date 2020/8/14 18:18
 */
@Configuration
public class SparkSessionBean {

    private String appName = "ss";

    private String master = "local[8]";

    @Bean
    @ConditionalOnMissingBean(SparkSession.class)
    public SparkSession sparkSession() {
        return SparkSession.builder()
                .appName(appName)
                .master(master)
                .getOrCreate();
    }

}
