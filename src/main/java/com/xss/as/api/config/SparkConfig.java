package com.xss.as.api.config;

import org.apache.spark.SparkConf;

/**
 * @author xss
 * @description spark 配置接口
 * @date 2020/8/14 18:38
 */
public interface SparkConfig {

    /**
     * 获取 spark 配置
     * @return SparkConf
     */
    SparkConf getConf();

}
