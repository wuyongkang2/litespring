package org.litespring.test.v4;

import static org.junit.Assert.*;

import org.junit.Test;
import org.litespring.context.ApplicationContext;
import org.litespring.context.support.ClassPathXmlApplicationContext;
import org.litespring.service.v3.PetStoreService;

import junit.framework.Assert;

public class ApplicationContextTestV4 {

	@Test
	public void testGetBeanProperty() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("petstore-v4.xml");
		PetStoreService petStore = (PetStoreService) ctx.getBean("petStore");
		
		Assert.assertNotNull(petStore.getAccountDao());
		Assert.assertNotNull(petStore.getItemDao());
	}

}
