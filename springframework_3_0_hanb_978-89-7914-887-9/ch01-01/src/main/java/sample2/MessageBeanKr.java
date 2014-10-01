package sample2;

public class MessageBeanKr implements MessageBean {

	@Override
	public String sayHello(String 이름) {
		return "안녕, " + 이름 + "!";
	}

}
