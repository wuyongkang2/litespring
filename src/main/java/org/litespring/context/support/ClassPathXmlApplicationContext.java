package org.litespring.context.support;

import org.litespring.beans.factory.support.DefaultBeanFactory;
import org.litespring.beans.factory.xml.XmlBeanDefinitionReader;
import org.litespring.context.ApplicationContext;
import org.litespring.core.io.ClassPathResource;
import org.litespring.core.io.Resource;

public class ClassPathXmlApplicationContext extends AbstractApplicationContext {


	public ClassPathXmlApplicationContext(String configFile) {
		super(configFile);
	}
	
	@Override
	protected Resource getResourceByPath(String path) {
		return new ClassPathResource(path,this.getBeanClassloader());
	}

}