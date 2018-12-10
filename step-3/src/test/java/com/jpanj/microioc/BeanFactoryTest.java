package com.jpanj.microioc;

import com.jpanj.microioc.factory.AutowireCapableBeanFactory;
import com.jpanj.microioc.factory.BeanFactory;
import org.junit.Test;

public class BeanFactoryTest {

    @Test
    public void test() throws Exception {
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.jpanj.microioc.HelloWorldService");

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "Hello World!"));
        beanDefinition.setPropertyValues(propertyValues);

        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
