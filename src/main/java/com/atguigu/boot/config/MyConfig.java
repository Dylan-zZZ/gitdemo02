package com.atguigu.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.bean.Car;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;


@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true)
//@ConditionalOnBean(name="tom22")
//@ConditionalOnMissingBean(name = "tom")
@ImportResource("classpath:bean.xml")//导入XML文件
@EnableConfigurationProperties(Car.class)
// 1.开启Car的属性配置功能
// 2.把这个组件自动注册容器中
//这样之前就不需要将@ConfigurationProperties与@Component一起用，仅需要使用前者加这个注解就行。
public class MyConfig {

    @Bean
    public User user01(){
        User zhangsan = new User("user01", 18);
        zhangsan.setPet(cat01());
        return zhangsan;
    }

    @Bean("tom22")
    public Pet cat01(){
        return new Pet("tomcatpet");
    }
}
