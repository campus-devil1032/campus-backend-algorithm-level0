package models;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void sayHello() {
		System.out.println("�ݰ���. �� �̸��� " + name + "�̴�. ���̴� " + age + " �� �̾�.");
	}
}