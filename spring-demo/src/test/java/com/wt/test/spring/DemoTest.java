package com.wt.test.spring;

import org.junit.jupiter.api.Test;

/**
 * @author qiyu
 * @date 2021/11/24
 */
public class DemoTest {
    @Test
    public void MyTestBeanTest() {
        BeanFactory bf = new XmlBeanFactory( new ClassPathResource("spring-config.xml"));
        MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
        System.out.println(myTestBean.getName());
    }
}
