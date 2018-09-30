package com.wei.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 需要加注解@ConfigurationProperties，并加上它的prrfix，来指明使用哪个配置
 *
 * @author tanping
 * @date 2018/9/2 10:05
 */
@Component
@ConfigurationProperties(prefix = "wei")
public class DemoWeiBean {

    private String nameCn;
    private int age;
    private int userId;
    private String desc;

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
