package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Movie movie = (Movie) factory.getBean("movie");
        System.out.println("movie actor details : " + movie);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Movie movie1 = (Movie) applicationContext.getBean("movie");
        System.out.println("movie actor details1 : " + movie1);

        Movie movie2 = (Movie) applicationContext.getBean("movie1");
        System.out.println("movie actor details1 : " + movie2);

        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie movie3=(Movie)((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("movie1");
        System.out.println("Actor information using application context:\n" +movie3);




    }
}