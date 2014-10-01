package sample2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageBeanTest {

	@Test
	public void testSayHello() {
		MessageBean bean = new MessageBeanKr();
		assertEquals("안녕, Spring!", bean.sayHello("Spring"));

		bean = new MessageBeanEn();
		assertEquals("Hello, Spring!", bean.sayHello("Spring"));
	}

}
