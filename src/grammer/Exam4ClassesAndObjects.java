package grammer;

import models.Person;

public class Exam4ClassesAndObjects {

	public static void main(String[] args) {
		Person person1 = new Person("John", 25);
		Person person2 = new Person("Jane", 30);

		person1.sayHello();
		person2.sayHello();
	}
}
