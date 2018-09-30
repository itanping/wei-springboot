package com.wei.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 注解@ConfigurationProperties，并加上它的prrfix，来指明使用哪个配置
 * 注解@PropertySource，引入自定义配置文件
 *
 * @author tanping
 * @date 2018/9/2 10:05
 */
@Component
@Configuration
@PropertySource(value = "classpath:application-user.yml")
@ConfigurationProperties(prefix = "wei")
public class DemoUserBean {

    @Value("${name_cn}")
    private String nameCn;
    @Value("${age}")
    private int age;
    @Value("${user_id}")
    private int userId;
    @Value("${desc}")
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
