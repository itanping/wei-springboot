package com.wei.controller.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注解@RestController，相当于@Controller和@ResponseBody两个注解的结合，使用这个注解的类里面的方法都以json格式输出
 *
 * @author tanping
 * @date 2018/8/28 18:57
 */
@RestController
public class DemoController {

    @Value("${wei.name_cn}")
    private String name_cn;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/demo/hi")
    public String getDemoHi() {
        String result = "Hello, Spring Boot! 我是" + name_cn + "，端口：" + port;
        System.out.println(result);
        return result;
    }

}
