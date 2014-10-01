package sample3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MessageBeanTest {

	@Test
	public void test() {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		MessageBean bean = factory.getBean("messageBean", MessageBean.class);
		assertEquals("Hello, Spring!", bean.sayHello("Spring"));
	}

}
