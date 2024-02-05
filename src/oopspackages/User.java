package oopspackages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class User {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String emailId;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	private Long phoneNo;
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	abstract void displayUserDetails();
}

class Employee extends User
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	void getUserDetails() throws IOException {
		System.out.println("Enter the Name:");
		String name = br.readLine();
		setName(name);
		System.out.println("Enter the Email-Id:");
		String email = br.readLine();
		setEmailId(email);
		System.out.println("Enter the Phone number:");
		long phone = Long.parseLong(br.readLine());
		setPhoneNo(phone);		
	}
	@Override
	void displayUserDetails() {
		System.out.println("Employee Details");
		System.out.println("Name:"+getName());
		System.out.println("Email:"+getEmailId());
		System.out.println("Phone:"+getPhoneNo());
	}
	
}

