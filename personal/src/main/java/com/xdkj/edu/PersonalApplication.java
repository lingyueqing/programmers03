package com.xdkj.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**启动类
 * @author fuqingqing
 * @date 2020-05-08 21:56
 */
@SpringBootApplication
//设置包的扫描规则
@ComponentScan(basePackages ={"com.xdkj"} )
public class PersonalApplication {
    public static void main(String[] args) {

        SpringApplication.run(PersonalApplication.class, args);
    }

}
