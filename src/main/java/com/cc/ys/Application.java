package com.cc.ys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @tip 项目启动类(一定要放在所有controllor service 最外层，否则无法自动扫描包)
 * @author ys
 * @version  2019年8月28日15:19:10
 */
@SpringBootApplication
@MapperScan("com.cc.ys.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
