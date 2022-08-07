package com.atguigu.boot;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.config.MyConfig;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.cache.interceptor.CacheAspectSupport;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


/*主程序类
* @SpringBootApplication 这是一个SpringBoot应用
* */

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class/*scanBasePackages =可以用来进行包扫描进行注解启动----还有@ComponentScan注解也可以实现指定扫描路径*/ )
public class MainApplication {
    public static void main(String[] args) {
        //返回我们的ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);


        //查看容器里的组件名称
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

       /* //从容器中获取组件
        User user01 = run.getBean("user01", User.class);
        User user02 = run.getBean("user01", User.class);
        System.out.println("组件是是否相等"+(user01==user02));


        //config配置类本身也是个组件
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        //测试proxyBeanMethods(默认值是ture)
        //外面无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册到容器中的单实例对象
        //com.atguigu.boot.config.MyConfig$$EnhancerBySpringCGLIB$$56fe1375@7b122839
        //本身获取的就是cglib代理对象
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user==user1);


        //
        User bean1 = run.getBean("user01",User.class);
        Pet tom = run.getBean("tom", Pet.class);
        System.out.println(bean1.getPet()==tom);
        System.out.println(tom);


        //5. 获取组件
        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        System.out.println("===========");
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

        DBHelper bean2 = run.getBean(DBHelper.class);
        System.out.println(bean2);*/

      /*  boolean tom = run.containsBean("tom");
        System.out.println("容器中是否有tom组件"+tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中是否有user01组件"+user01);

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中是否有tom22组件"+tom22);

        boolean haha = run.containsBean("haha");
        boolean hehe = run.containsBean("hehe");
        System.out.println(haha);
        System.out.println(hehe);*/

        /*int beanDefinitionCount = run.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);*/

        /*String[] beanNamesForType = run.getBeanNamesForType(CacheAspectSupport.class);
        System.out.println("======="+beanNamesForType.length);*/
        String[] beanNamesForType = run.getBeanNamesForType(WebMvcProperties.class);
        System.out.println("======"+beanNamesForType.length);

        System.out.println("git test2");
        System.out.println("git test3");

    }
}
