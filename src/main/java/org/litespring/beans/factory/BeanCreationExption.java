package org.litespring.beans.factory;

import org.litespring.beans.BeansException;

public class BeanCreationExption extends BeansException {
	private String beanName;
	public BeanCreationExption(String msg) {
		super(msg);
	}
	public BeanCreationExption(String msg, Throwable cause) {
		super(msg, cause);
	}
	public BeanCreationExption(String beanName, String msg){
		super("Error creating bean with name '" + beanName +"':" + msg);
		this.beanName = beanName;
	}
	public BeanCreationExption(String beanName,String msg,Throwable cause) {
		this(beanName,msg);
		initCause(cause);
	}
	public String getBeanName(){
		return this.beanName;
	}
}
