package org.example;

import org.example.Furniture;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
public class Database {
   public static final  List <User> dbUser=new ArrayList <User> ();
	 List <Furniture> dbfurniture=new ArrayList <Furniture>();
	 List <Apartment> dbapartment=new ArrayList <Apartment>();
 private static final Logger logger = Logger.getLogger(Database.class.getName());
String newtenant="new tenant";
public  void login(String email,String password)
		{ 
    User obj0=new User();
    dbUser.add(obj0);
 	obj0.email="haya@gmail.com";
	obj0.setPassword("haya123");
	dbUser.add(obj0);	
	
	  User obj1=new User();

         	obj1.email=email;
			obj1.password=password;
			

		if (!dbUser.contains(obj1)) {
			dbUser.add(obj1);	
		    logger.info(newtenant); 
	
		}
	
		
		else
			 logger.info("this tenant already exists!"); 

					
	
  
     


		}
public void showWhichTenant(String id) {
	
	Owner own=new Owner();
	
	for(int i=0;i<dbUser.size();i++) {
		if(dbUser.get(i).id.equals(id)) {
		
			 logger.info( own.getId()  +             own.getName()     +"\n ");
			
		}
	}
}
  
public  void addTenantStudent(String email,String password,String name,String type,String major,int age,String id)
{
	User obj0=new User(email, password, name, type, major, age,id);
	 if (!dbUser.contains(obj0))
	 {
		    obj0.setType("Student");
		    dbUser.add(obj0);
			
		    logger.info(newtenant);
		    
		    
		    
		    
     }
	
		
		 User obj2=new User();
	     obj2.setAddress("Awarta");
	     obj2.setEmail("shaf@gmail.com");
	     obj2.setName("SHAFIQA");
	     obj2.setId("4");
	     obj2.setAge(20);
	     obj2.setMajor("CE");
	     obj2.setType("student");

	     dbUser.add(obj2);
	     
	  User obj3=new User();
	  obj3.setAddress("Awarta");
	  obj3.setEmail("AHMAD@GMAIL.COM");
	  obj3.setName("AHMAD");
	  obj3.setId("5");
	  obj3.setAge(24);
	  obj3.setMajor("MEDICINE");
	  obj3.setType("student");

	  dbUser.add(obj3);
	  
	  
	  
	  
	  
	  
	  
	 
	
	
}
public  void addTenantNotStudent(String email,String password,String name,String type,String major,int age,String id)
{
	User obj0=new User(email, password, name, type, major, age,id);
	 if (!dbUser.contains(obj0))
	 {
		    obj0.setType("Not Student");
		    obj0.major="";
		    obj0.age=0;
		    obj0.name="";
		    
		    dbUser.add(obj0);	
			
		    logger.info(newtenant);
    }

	 
}


public void addFurniture(String furniture,String costFurniture) {
	Furniture obj0=new Furniture();
			obj0.setType1(furniture);
			obj0.setCost(costFurniture);
	 if (!dbfurniture.contains(obj0))
		 
	 {
		 dbfurniture.add(obj0);
	 }
}

public void addBuilding(Apartment obj) {
 
	 for(int i=0;i<dbapartment.size();i++) {
		 dbapartment.add(obj);
	 }
}

public void viewHousing2(Apartment obj1) {
	 for(int i=0;i<dbapartment.size();i++) {
		 Apartment obj2=new Apartment();
		 obj2.setId(obj1.getId());
		 obj2.setRent(obj1.getRent());
		 obj2.setLocation(obj1.getLocation());
		 obj2.setWater(obj1.getWater());
		 obj2.setElectric(obj1.getElectric());
		 obj2.setBalcony(obj1.getBalcony());
		 obj2.setInternet(obj1.getInternet());
		 obj2.setBathrooms(obj1.getBathrooms());
		 obj2.setBedrooms(obj1.getBedrooms());
		 obj2.setPicture(obj1.getPicture());
		 obj2.setDate(obj1.date);
		 obj2.setBuildingId(obj1.getBuildingId());
		 obj2.setFloor(obj1.getFloor());
		 obj2.setNumberOfApartmentsInFloor(obj1.getNumberOfApartmentsInFloor());
		 dbapartment.add(obj2);
		 if(obj1.getId().equals(obj2.getId())) {
			 viewHousing(obj1);
		 }
	 }
	
}




public void viewHousing(Apartment obj1) {
	 for(int i=0;i<dbapartment.size();i++) {
		 Apartment obj2=new Apartment();
		 obj2.setId(obj1.getId());
		 obj2.setRent(obj1.getRent());
		 obj2.setLocation(obj1.getLocation());
		 obj2.setWater(obj1.getWater());
		 obj2.setElectric(obj1.getElectric());
		 obj2.setBalcony(obj1.getBalcony());
		 obj2.setInternet(obj1.getInternet());
		 obj2.setBathrooms(obj1.getBathrooms());
		 obj2.setBedrooms(obj1.getBedrooms());
		 obj2.setPicture(obj1.getPicture());
		 obj2.setDate(obj1.date);
		 obj2.setBuildingId(obj1.getBuildingId() );
		 obj2.setFloor(obj1.getFloor());
		 obj2.setNumberOfApartmentsInFloor(obj1.getNumberOfApartmentsInFloor());
		 dbapartment.add(obj2);
		 
		 
	 }
	 
}
	


}