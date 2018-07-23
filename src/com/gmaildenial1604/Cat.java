package com.gmaildenial1604;

public class Cat {
	String breed;
	int age;
	double weight;
	String color;
	String name;

	public Cat(String breed, int age, double weight, String color, String name) {
		super();
		this.breed = breed;
		this.age = age;
		this.weight = weight;
		this.color = color;
		this.name = name;
	}
	

	public Cat() {
		super();
	}



	@Override
	public String toString() {
		return "Cat [breed=" + breed + ", age=" + age + ", weight=" + weight + ", color=" + color + ", name=" + name + "]";
	}

}
