package com.jpanj.microioc.xml;

import com.jpanj.microioc.BeanDefinition;
import com.jpanj.microioc.io.ResourceLoader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class XmlBeanDefinitionReaderTest {

    @Test
    public void test() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("microioc.xml");
        Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
        Assert.assertTrue(registry.size() > 0);
    }

}
