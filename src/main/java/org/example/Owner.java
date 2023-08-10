package org.example;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Owner {
	   public String email;
       private  String password;     
       private String address;
       private  String name;
	   private String id;	   
	   private String phone;
	   Owner o;
       static List <Owner> ownerArray=new  ArrayList <Owner> ();
       boolean log=false;
       public Owner() {
    	   this.initialuser();
       }
      
   	public  void initialuser() {
   		this.address="nablus";
		this.email="Ragheb@gmail.com";
		this.setId("3");
		this.setPassword("123");
		this.phone="056998527";
		this.setName("Ragheb");
	
		ownerArray.add(this);
   	}
   	public static int checkOwner(String string1, String string2) {
		if((string1.equals("ragheb@gmail.com") && string2.equals("ragheb123")) )
				{
					return 1 ;
				}
		
		return 0;
	}
   	public static boolean idAndPhoneValidator(String idAndPhone)
   	{
   		boolean b = true ; 
   		if(!digitsValidator(idAndPhone) || idAndPhone.length() !=10) 
   			return !b ;
   		
   		return b ;
   	}

   	public static boolean urlValidator(String url)
   	{
   	    try {
   	        new URL(url).toURI();
   	        return true;
   	    }
   	    catch (URISyntaxException exception) {
   	        return false;
   	    }
   	    catch (MalformedURLException exception) {
   	        return false;
   	    }
   	}

   	public static boolean yesNoValidator(String str){
   	     boolean b = true ;
		if( str.equals("yes") || str.equals("no")) 
   			return b ;
   		
   		else 
   			return !b ;
   	}

   	public static boolean digitsValidator(String str) { 
   	    for (int i = 0; i < str.length(); i++) {
   	      if (!Character.isDigit(str.charAt(i))) { // in case that a char is NOT a digit, enter to the if code block
   	        return false;
   	      }
   	    }    
   	    	return true ; 

   	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}



	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phoneNumber) {
		this.phone = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

   	
}