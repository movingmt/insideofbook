package sample3;

public class MessageBeanEn implements MessageBean {

	@Override
	public String sayHello(String 이름) {
		return "Hello, " + 이름 + "!";
	}

}
