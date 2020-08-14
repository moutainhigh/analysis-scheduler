package com.xss.as.config;

import org.apache.spark.sql.SparkSession;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author xss
 * @description SparkSession 测试
 * @date 2020/8/14 18:21
 */
@SpringBootTest
public class SparkSessionBeanTest {

    @Resource
    private SparkSession sparkSession;

    @Test
    public void test() {
        // sparkSession.read().text("data/a.txt").show();
    }

}