package com.techxyte;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int id;
	
	private String name;
	
	private String city;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void show1() {
		
		Student st=new Student();
		st.setId(123);
		st.setName("rajesh");
		st.setCity("Manglore");
		
		System.out.println(st.getId()+""+st.getName()+""+st.getCity());
		
		
		System.out.println("Return Successfully");
		
	}

}
