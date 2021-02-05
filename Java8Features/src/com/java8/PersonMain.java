package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PersonMain {

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Persons");
		int n = sc.nextInt();
		System.out.println("Enter details of Persons");
		for (int i = 0; i < n; i++) {
			personList.add(Person.createPerson(sc.next()));
		}

		System.out.println("Enter the person name and age");
		String name = sc.next();
		int age = sc.nextInt();

		Person person = personList.stream().filter(per -> per.getName().equals(name) && per.getAge() == age).findAny()
				.orElse(null);
		if (person == null) {
			System.out.println("Person not found");
		} else {
			System.out.println("\nName:" + person.getName());
			System.out.println("Age:" + person.getAge() + "\n");
		}

		List<String> resultList = personList.stream().map(str -> str.getName()).collect(Collectors.toList());
		resultList.stream().forEach(str -> System.out.println(str));

		Comparator<Person> compareByName = (Person p1, Person p2) -> p1.getName().compareTo(p2.getName());
		Collections.sort(personList, compareByName);
		System.out.println("\nSorted Person List---");
		personList.stream().forEach(per -> System.out.println(per.getName() + " : " + per.getAge()));

		long count = personList.stream().filter(per -> per.getAge() > 11).count();
		System.out.println("\nCount of age :" + count);

		int a = personList.stream().filter(per -> per.getAge() > 11).mapToInt(per -> per.getAge()).sum();
		System.out.println("\nSum of age :" + a);

		OptionalInt max = personList.stream().mapToInt(per -> per.getAge()).max();
		System.out.println("\nMaximum Age:" + max.getAsInt());

		  Optional<Person> per = personList.stream().reduce((p1,p2)->p1.getAge()>p2.getAge()?p1:p2);
		  System.out.println("\nPerson object with maximum age:\n "+per.get());
		  
		System.out.println("\nSet Implementation....");
		personList.stream().map(str -> str.getName()).collect(Collectors.toSet()).forEach(System.out::println);

 System.out.println("\nFirst 3 minimum...");
 personList.stream().filter(p1->p1.getAge()<13).limit(3).collect(Collectors.toList()).forEach(System.out::println);



	}

}
