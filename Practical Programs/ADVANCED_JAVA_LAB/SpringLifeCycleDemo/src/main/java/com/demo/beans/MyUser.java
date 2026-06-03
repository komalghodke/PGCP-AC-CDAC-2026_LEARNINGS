package com.demo.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyUser implements 
                                     BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean{
      private int uid;
      private String uname;
      private String email;
	  public MyUser() {
		super();
		System.out.println("in myuser default constructor");
	  }
	  public MyUser(int uid, String uname, String email) {
		super();
		System.out.println("in myuser parametrised constructor");
		this.uid = uid;
		this.uname = uname;
		this.email = email;
	  }
	  public int getUid() {
		  return uid;
	  }
	  public void setUid(int uid) {
		  System.out.println("in myuser uid setter method");
		  this.uid = uid;
	  }
	  public String getUname() {
		  return uname;
	  }
	  public void setUname(String uname) {
		  System.out.println("in myuser uname setter method");
		  this.uname = uname;
	  }
	  public String getEmail() {
		  return email;
	  }
	  public void setEmail(String email) {
		  System.out.println("in myuser email setter method");
		  this.email = email;
	  }
	  @Override
	  public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", email=" + email + "]";
	  }
	  @Override
	  public void setBeanName(String name) {
		  System.out.println("in setBeanName method of BeanAware interface  --->"+name);
		
	  }
	  @Override
	  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		  System.out.println("in setBeanFactoryAware method of BeanFactoryAware interface");
		
	  }
	  @Override
	  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		  System.out.println("in setApplicationContext method of ApplicationContextAware interface");
		
	  }
	  @Override
	  public void afterPropertiesSet() throws Exception {
		  System.out.println("in afterPropertiesSet method of InitializingBean interface");
		
	  }
	  
	  //custom init method
	  public void myinit() {
		  System.out.println("in custom init_method  myinit");
	  }
	  @Override
	  public void destroy() throws Exception {
		  System.out.println("in destroymethod of DespobleBean interface");
		
	  }
	  
	  //custom destroy method
	  public void mydestroy() {
		  System.out.println("in custom destroy_method  mydestroy");
	  }
}
