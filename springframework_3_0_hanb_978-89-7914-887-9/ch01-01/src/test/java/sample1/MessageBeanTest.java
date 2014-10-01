package sample1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageBeanTest {

	@Test
	public void testSayHellow() {
		MessageBean bean = new MessageBean();
		assertEquals("Hello, Spring!", bean.sayHello("Spring"));
	}

}
