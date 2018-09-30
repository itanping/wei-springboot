package com.wei.controller.demo;

import com.wei.model.DemoWeiBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注解@RestController，相当于@Controller和@ResponseBody两个注解的结合，使用这个注解的类里面的方法都以json格式输出
 * 注解@EnableConfigurationProperties，指明要加载哪个bean
 *
 * @author tanping
 * @date 2018/9/2 10:20
 */
@RestController
@EnableConfigurationProperties({DemoWeiBean.class})
public class DemoWeiController {

    @Autowired
    private DemoWeiBean demoWeiBean;

    @RequestMapping(value = "/demo/wei/hi")
    public String getDemoHi() {
        String result = "Hello, Spring Boot! 我是" + demoWeiBean.getNameCn() + "，我的简介：" + demoWeiBean.getDesc();
        System.out.println(result);
        return result;
    }
}
