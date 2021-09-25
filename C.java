package com.percentage;

public class C {
	private String studentName;
	private int rollNumber;
	private String fatherName;
	private long contactNumber;
	private String address;
	
	public C() {
		this.studentName="rabish";
		this.rollNumber=123344;
		this.fatherName="shambhu";
		this.contactNumber=123344L;
		this.address="noida";
	}
	public C(String studentName,int rollNumber,String fatherName,long contactNumber,String a) {
		this.studentName=studentName;
		this.rollNumber=rollNumber;
		this.fatherName=fatherName;
		this.contactNumber=contactNumber;
		this.address=address;
	}
	public  void rabish() {
		System.out.println("studentName="+studentName);
		System.out.println("rollnumber="+ rollNumber);
		System.out.println("fatherName="+fatherName);
		System.out.println("contactNumber="+ contactNumber);
		System.out.println("address="+ address);
	}

}
