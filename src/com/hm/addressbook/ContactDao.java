package com.hm.addressbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContactDao {

	private Connection connection;
	
	public ContactDao()
	{
		connection=Cont.getConnection();
	}
	
	 public void addContact(Contact cont) {
		 
		 System.out.println("inside addcontct");
	        try {
	            PreparedStatement preparedStatement = connection
	                    .prepareStatement("insert into address_book(firstname,lastname,home_phone,work_phone,additional_phone,personal_email,work_email) values (?, ?, ?, ?, ?, ?, ?)");
	         
	            preparedStatement.setString(1, cont.getFirstname());
	            preparedStatement.setString(2, cont.getLastname());
	            preparedStatement.setInt(3, cont.getHome_phone());
	            preparedStatement.setInt(4, cont.getWork_phone());
	            preparedStatement.setInt(5, cont.getAdditional_phone());
	            preparedStatement.setString(6, cont.getPersonal_email());
	            preparedStatement.setString(7, cont.getWork_email());
	            int status=preparedStatement.executeUpdate();
	            System.out.println("ststus:"+status);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	
	 public void deleteContact(int id) {
	        try {
	            PreparedStatement preparedStatement = connection
	                    .prepareStatement("delete from address_book where id=?");
	          
	            preparedStatement.setInt(1, id);
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 public void updateContact(Contact cont) {
	        try {
	            PreparedStatement preparedStatement = connection
	                    .prepareStatement("update address_book set firstname=?, lastname=?, home_phone=?, work_phone=?, additional_phone=?, personal_email=?, work_email=?" +
	                            "where id=?");
	            // Parameters start with 1
	           
	            preparedStatement.setString(1, cont.getFirstname());
	            preparedStatement.setString(2, cont.getLastname());
	            preparedStatement.setLong(3, cont.getHome_phone());
	            preparedStatement.setLong(4, cont.getWork_phone());
	            preparedStatement.setLong(5, cont.getAdditional_phone());
	            preparedStatement.setString(6, cont.getPersonal_email());
	            preparedStatement.setString(7, cont.getWork_email());
	            preparedStatement.setInt(8, cont.getId());
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 public Contact getContact(int id){
		 Contact contact=new Contact();
		 try {
	            PreparedStatement preparedStatement= connection.prepareStatement("select * from address_book where id=?");
	           preparedStatement.setInt(1, id);
	            ResultSet rs = preparedStatement.executeQuery();
	            
	            while (rs.next()) {
	   
	               
	                contact.setId(rs.getInt("id"));
	                contact.setFirstname(rs.getString("firstname"));
	                contact.setLastname(rs.getString("lastname"));
	                contact.setHome_phone(rs.getInt("home_phone"));
	                contact.setWork_phone(rs.getInt("work_phone"));
	                contact.setAdditional_phone(rs.getInt("additional_phone"));
	                contact.setPersonal_email(rs.getString("personal_email"));
	                contact.setWork_email(rs.getString("work_email"));
	                
	            }
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

		 
		 return contact;
	 }
	 public List<Contact> getAllContacts() {
	        List<Contact> cont = new ArrayList<Contact>();
	        try {
	            Statement statement = connection.createStatement();
	            ResultSet rs = statement.executeQuery("select * from address_book");
	            while (rs.next()) {
	                Contact conts = new Contact();
	               
	                conts.setId(rs.getInt("id"));
	                conts.setFirstname(rs.getString("firstname"));
	                conts.setLastname(rs.getString("lastname"));
	                conts.setHome_phone(rs.getInt("home_phone"));
	                conts.setWork_phone(rs.getInt("work_phone"));
	                conts.setAdditional_phone(rs.getInt("additional_phone"));
	                conts.setPersonal_email(rs.getString("personal_email"));
	                conts.setWork_email(rs.getString("work_email"));
	                cont.add(conts);
	            }
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return cont;
	    }
	 
	 
}
