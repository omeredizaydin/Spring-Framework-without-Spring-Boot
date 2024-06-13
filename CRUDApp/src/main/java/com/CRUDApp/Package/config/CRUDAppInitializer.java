package com.CRUDApp.Package.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//dispatcher servlet
public class CRUDAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[0];
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[]{ CRUDAppConfig.class};
  }

  @Override
  protected String[] getServletMappings() {
    return new String[]{"/myapp.com/*"};
  }
}
