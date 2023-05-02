package models;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void sayHello() {
		System.out.println("반갑다. 내 이름은 " + name + "이다. 나이는 " + age + " 살 이야.");
	}
}