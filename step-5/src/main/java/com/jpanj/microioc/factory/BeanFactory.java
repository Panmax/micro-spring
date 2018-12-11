package com.jpanj.microioc.factory;

import com.jpanj.microioc.BeanDefinition;

public interface BeanFactory {


    Object getBean(String name) throws Exception;

    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;

}
