package com.example.spring_02.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Auther: shiyunkai
 * @Date: 2019/03/21 11:48
 * @Description: 从配置文件中读取属性值,使用@Value注解,只能注入简单数据类型
 */
@PropertySource(value = "classpath:myproperts/myprop.properties")
@Component
@ConfigurationProperties(prefix = "person2") //perfix不能和其它配置文件中的相同，否则会读取到其它配置文件中的属性,优先读取application.properties和application.yml
@Data //添加setting, getting, toString等方法
public class Person2 {

    @Value("${person.lastName}")
    private String lastName;

    @Value("${person.age}")
    private int age;

    private boolean boss;

    private Date birth;

    private Map<String, String> maps;

    private List<String> list;

    private Dog dog;

    private String hello;

}
