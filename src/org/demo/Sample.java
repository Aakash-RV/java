package org.demo;

public class Sample {
	
	private void empl() {
		
		System.out.println("Employee Name: Aakash");
		System.out.println("Employee Address: Chennai");
		System.out.println("Employee Id: 01");
	}
	
	private void course() {
		System.out.println("Selenium Automation");
	}
	
	private void institute() {
		
		System.out.println("SmartSkillsTechnologies");
	}
	
	private void branch() {
		
		System.out.println("Pallikaranai");
	}
	
	public static void main(String[] args) {
		Sample s = new Sample();
		s.empl();
		s.course();
		s.institute();
		s.branch();
	}

}
