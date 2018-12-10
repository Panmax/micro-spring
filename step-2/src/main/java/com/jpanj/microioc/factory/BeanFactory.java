package com.jpanj.microioc.factory;

import com.jpanj.microioc.BeanDefinition;

public interface BeanFactory {


    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);

}
