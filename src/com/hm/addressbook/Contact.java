package com.hm.addressbook;

public class Contact {

	private String firstname,lastname,personal_email,work_email;
	private int home_phone,work_phone,additional_phone,id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAdditional_phone() {
		return additional_phone;
	}
	public void setAdditional_phone(int additional_phone) {
		this.additional_phone = additional_phone;
	}
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPersonal_email() {
		return personal_email;
	}
	public void setPersonal_email(String personal_email) {
		this.personal_email = personal_email;
	}
	public String getWork_email() {
		return work_email;
	}
	public void setWork_email(String work_email) {
		this.work_email = work_email;
	}
	public int getHome_phone() {
		return home_phone;
	}
	public void setHome_phone(int home_phone) {
		this.home_phone = home_phone;
	}
	public int getWork_phone() {
		return work_phone;
	}
	public void setWork_phone(int work_phone) {
		this.work_phone = work_phone;
	}
	@Override
	public String toString() {
		return "Contact [firstname=" + firstname + ", lastname=" + lastname + ", personal_email=" + personal_email
				+ ", work_email=" + work_email + ", home_phone=" + home_phone + ", work_phone=" + work_phone
				+ ", additional_phone=" + additional_phone + "]";
	}
	public Contact(String firstname, String lastname, String personal_email, String work_email, int home_phone,
			int work_phone, int additional_phone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.personal_email = personal_email;
		this.work_email = work_email;
		this.home_phone = home_phone;
		this.work_phone = work_phone;
		this.additional_phone = additional_phone;
	}
	public Contact(int id,String firstname, String lastname, String personal_email, String work_email, int home_phone,
			int work_phone, int additional_phone) {
		super();
		this.id=id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.personal_email = personal_email;
		this.work_email = work_email;
		this.home_phone = home_phone;
		this.work_phone = work_phone;
		this.additional_phone = additional_phone;
	}
	
	
	public Contact()
	{
		
	}
	
}
