package com.blogger.blog.configuration.listener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextListener implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(final ApplicationContext appContext)
            throws BeansException {
        applicationContext = appContext;

    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

}
