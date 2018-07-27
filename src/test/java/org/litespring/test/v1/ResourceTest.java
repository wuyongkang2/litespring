package org.litespring.test.v1;

import static org.junit.Assert.*;

import java.io.InputStream;


import org.junit.Assert;
import org.junit.Test;
import org.litespring.core.io.ClassPathResource;
import org.litespring.core.io.FileSystemResource;
import org.litespring.core.io.Resource;

public class ResourceTest {

	@Test
	public void testClassPathResource() throws Exception {
		
		Resource r = new ClassPathResource("petstore-v1.xml");
		
		InputStream is = null;
		
		try{
			is = r.getInputStream();
			//ע�⣺���������ʵ�������
			Assert.assertNotNull(is);
		}finally{
			if(is != null){
				is.close();
			}
		}
	}
	
	@Test
	public void testFileSystemResource() throws Exception {
		
		Resource r =  new FileSystemResource("src\\test\\resources\\petstore-v1.xml");
		
		InputStream is = null;
		
		try{
			is = r.getInputStream();
			//ע�⣺���������ʵ�������
			Assert.assertNotNull(is);
		}finally{
			if(is != null){
				is.close();
			}
		}
	}
	

}
