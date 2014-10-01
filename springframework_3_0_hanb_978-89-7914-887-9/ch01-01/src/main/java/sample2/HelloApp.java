package sample2;

public class HelloApp {
	public static void main(String[] args) {
		MessageBean bean = new MessageBeanKr();
		System.out.println(bean.sayHello("Spring"));
	}
}
