package pserso;

import java.util.*;

public class Main {
	
	 public static void main(String[] args)     {
		 Person[] people =new Person[]{new Person("xujian", 20),
		         			new Person("xiewei", 10),
		        			new Person("Mary", 15)};        
		System.out.println("≈≈–Ú«∞");
		        for (Person person : people)  {
		            System.out.print(person.getName()+":"+person.getAge());
		        }

		        Arrays.sort(people);
		        System.out.println("\n≈≈–Ú∫Û");
		        for (Person person : people)  {
		            System.out.print(person.getName()+":"+person.getAge());
		        }
		    }
		}


