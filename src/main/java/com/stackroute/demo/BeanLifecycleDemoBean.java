package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying the bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing the bean");

    }
    public void customInit(){
        System.out.println("Initializing the bean using custom method");
    }

    public void customDestroy(){
        System.out.println("destroying the bean");
    }
}
