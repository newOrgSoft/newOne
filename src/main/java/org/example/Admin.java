package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;	
public class Admin {	
	private static final Logger logger = Logger.getLogger(Admin.class.getName());
    static List <Owner> dbAdvertisment=new  ArrayList <Owner> ();
		 String address;
		 private String email;
		 String name;
		 String id;
		 private String password;
		 String phone;
         private static String s2 =  ("|                                                                                                     |");
         private static String s1 = ("| --------------------------------------------------------------------------------------------------- |");
         private static String s3  = "       ";
         private static String s4 =  ("     ");
         private static String s5 =  ("                           |");
         private static String servicesStaticString = ("Services : ");
         private static String waterStaticString = ("Water : ");
         private static String internetStaticString = (" , Iternet : " );
         private static String electicStaticString = (" , Electricity : ");
		public String getEmail() {
			return email;
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
		
		public static int check(String string1, String string2) {
            if((string1.equals("shafiqa@gmail.com") && string2.equals("shafiqa123")) ||(string1.equals("tala@gmail.com") && string2.equals("tala1234")) )
            {	
			    logger.info("\n u logged in sucessfully as admain"); 
				return 1;	
            }
            else {
    	        logger.info("\n admin please try again"); 
    	        return 0;
        }
		}
		public static void viewRequests() {
			
            logger.info("Enter" +"a" +" for accept and "+ "r" + "for reject");
			
			for(Apartment ap : Main.dbApartment) {
				
	logger.info(s1+"\n"+
	            "|id-building"+" buliding name"+" picture"+" rent"+ " location" +" bedrooms"+" bathrooms"+" floor"+" Balcony"+"\n"+
		         s2+"\n"+
		        "|   " +ap.getBuildingId()+s3+ ap.getName()+s4+ ap.getPicture()+"    "+ ap.getRent()+""+ap.getLocation()+"    "+ap.getBedrooms()+s4+ap.getBathrooms()+
		        s4  +  ap.getFloor()+"  "+ ap.getBalcony()+	
		        s5 + "\n"+  servicesStaticString  +waterStaticString+ap.getWater()+electicStaticString +ap.getElectric()+internetStaticString+ap.getInternet()+"\n"+
		         s2+"\n"
	  
		       + s1 +"\n");
			  
			    
	         logger.info("to accept it or reject it first enter as an admin: , write the word(admin)");
	      
			   
					    }
			
			   Main.viewAdminMenu();			
		
		}
		
		
		
		
		
		public static void viewRequestsForAdmin() {
			  
			 
	          Apartment apart1=new Apartment();
			    String staticPicture=("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.apartments.com%2Fblog%2Fwhat-is-a-luxury-apartment&psig=AOvVaw2mUHZKPS8Wd2_lmV74uosq&ust=1690538402290000&source=images&cd=vfe&opi=89978449&ved=0CA0QjRxqFwoTCICH27rQroADFQAAAAAdAAAAABAD");

				apart1.setBuildingId("5");
			    apart1.setName("Abu Salha");
			    apart1.setPicture(staticPicture);
			    apart1.setRent("700 $");
			    apart1.setLocation("Nablus");
			    apart1.setFloor("5");
			    apart1.setBalcony("no");
			    apart1.setWater("yes");
			    
			    apart1.setElectric("yes");
			    
			    apart1.setNameTenant("jebreel");
			    apart1.setStudentMajor("CAP");
			    apart1.setAgeTenant("21");
			    

				  Apartment apart0=new Apartment();

					apart0.setBuildingId("5");
				    apart0.setName("Abu Salha");
				    apart0.setPicture(staticPicture);
				    apart0.setRent("700 $");
				    apart0.setLocation("Nablus");
				    apart0.setFloor("5");
				    apart0.setBalcony("no");
				    apart0.setWater("yes");
				    
				    apart0.setElectric("yes");
				    
				    apart0.setNameTenant("Saleh");
				    apart0.setStudentMajor("Art");
				    apart0.setAgeTenant("20");
				    apart0.setInternet("no");
				    
				    Main.dbApartment.add(apart0);
			
				Apartment apart=new Apartment();
				apart.setBuildingId("4");
			    apart.setName("Alool-Abu Salha");
			    apart.setPicture(staticPicture);
			    apart.setRent("1000 $");
			    apart.setLocation("Nablus-Rafidia");
			    apart.setFloor("4");
			    apart.setBalcony("yes");
			    apart.setWater("yes");
			    apart.setElectric("yes");
			    apart.setInternet("yes");
			    apart.setNameTenant("khalid");
			    apart.setStudentMajor("Medecine");
			    apart.setAgeTenant("23");
			    
			    
				   Main.dbApartment.add(apart);
				   
				  
				    apart1.setInternet("no");
				    
				   Main.dbApartment.add(apart1);

			for(Apartment ap : Main.dbApartment) {
			
				Scanner ss = new Scanner(System.in);
	   
				
			 logger.info(s1+"\n"+
			            "|id-building"+" buliding name"+" picture"+" rent"+ " location" +" bedrooms"+" bathrooms"+" floor"+" Balcony"+"\n"+
				         s2 +"\n"+
				        "|   " +ap.getBuildingId()+s3+ ap.getName()+s4+ ap.getPicture()+"    "+ ap.getRent()+""+ap.getLocation()+"    "+ap.getBedrooms()+s4+ap.getBathrooms()+
				        s4  +  ap.getFloor()+"  "+ ap.getBalcony()+	
				        s5 + "\n"+  servicesStaticString  +waterStaticString+ap.getWater()+electicStaticString +ap.getElectric()+internetStaticString+ap.getInternet()+"\n"+
				        s2+"\n"
			  
				       + s1+"\n"+s2+"\n"+
"|   " +apart.getBuildingId()+s3+ apart.getName()+s4+ apart.getPicture()+"    "+ apart.getRent()+""+apart.getLocation()+"    "+apart.getBedrooms()+s4+apart.getBathrooms()+
s4 +  apart.getFloor()+"  "+ apart.getBalcony()+	
s5 + "\n"+  servicesStaticString  +waterStaticString+apart.getWater()+electicStaticString +ap.getElectric()+internetStaticString+ap.getInternet()+"\n"+
s2+"\n"

+ s1+"\n"
			 
	+ s2 +"\n"+
	 "|   " +apart1.getBuildingId()+s3+ apart1.getName()+s4+ apart1.getPicture()+"    "+ apart1.getRent()+""+apart1.getLocation()+"    "+apart1.getBedrooms()+s4+apart1.getBathrooms()+
	 s4  +  apart1.getFloor()+"  "+ apart1.getBalcony()+	
	 s5 + "\n"+  servicesStaticString  +waterStaticString+apart1.getWater()+electicStaticString +ap.getElectric()+internetStaticString+ap.getInternet()+"\n"+
	 s2 +"\n"

	+ s1+"\n");
			 
			 
			 logger.info(" \n enter modify as owner:");
	        
			String p;
			String location;
			String rent ;
			String  water  ;
			String  internet ;
			String electricety ;
			String bathrooms ;
			String bedrooms ;
			String balcony ;
			
			boolean valid ;

			
	        String currentId;
	  	    logger.info("Enter Appartment id :");
	  	    currentId = ss.nextLine();
	        String invalidStaticString = ("invalid ! ");
	        	
	        	if(ap.getBuildingId().equals(currentId) ) {
	        		logger.info("1.rent"+"\n"+"2.location"+"\n"+"3.picture"+"\n"+"4.internet"+"\n"+"5.water"+"\n"+"6.electric"+"\n"+"7.balcony"+"\n"
	        	                +"8.bathrooms"+"\n"+"9.bedrooms"+"\n");  
	                int modify = ss.nextInt();           		
	        		
	                if(modify ==1){
	        			rent = ss.nextLine();
	        			rent = ss.nextLine();
	        			valid = Owner.digitsValidator(rent);
	        			while(!valid) {
	        				logger.info(invalidStaticString);
	        				valid  = Owner.digitsValidator(rent);
	            			rent = ss.nextLine();
	        			}
	        			ap.setRent(rent);
	        			logger.info(ap.getRent());
	        			
	        			
	        		}
	        		else if (modify ==2) {
	        			location = ss.nextLine();
	        			ap.setLocation(location);              	
	        	    }
	        		else if(modify ==3) {
	        			p = ss.nextLine();
	        			valid = Owner.urlValidator(p);
	        			while(!valid) {
	        				logger.info(invalidStaticString);
	            			valid = Owner.urlValidator(p);
	            			p = ss.nextLine();
	        			}
	        			ap.setPicture(p);              	                       
	        		}
	        		else if(modify ==4) {
	        		    internet = ss.nextLine() ;
	        			valid = Owner.yesNoValidator(internet);
	        			while(!valid) {
	        				logger.info(invalidStaticString);
	            			valid = Owner.yesNoValidator(internet);
	            		    internet = ss.nextLine() ;
	        			}
	        			ap.setInternet(internet);              	                       
	        		}
	        		else if(modify ==5) {
	        		    water = ss.nextLine() ;
	        			valid = Owner.yesNoValidator(water);
	        			while(valid) {
	        				logger.info(invalidStaticString);
	            			valid = Owner.yesNoValidator(water);
	            			water = ss.nextLine() ;
	        			}
	        			ap.setWater(water);              	                       
	        		}
	        		else if(modify ==6) {
	        			electricety = ss.nextLine() ;
	        			valid = Owner.yesNoValidator(electricety);
	        			while(!valid) {
	        				logger.info(invalidStaticString);
	            			valid = Owner.yesNoValidator(electricety);
	            			electricety = ss.nextLine() ;
	        			}
	        			ap.setElectric(electricety);              	                       
	        		}
	        		else if(modify ==7) {
	        			balcony = ss.nextLine() ;
	        			valid = Owner.yesNoValidator(balcony);
	        			while(!valid) {
	        				logger.info(invalidStaticString);
	            			valid = Owner.yesNoValidator(balcony);
	            			balcony = ss.nextLine() ;
	        			}
	        			ap.setBalcony(balcony);              	                       
	        		}
	        		else if(modify ==8) {
	        			bathrooms = ss.nextLine() ;
	        			valid = Owner.digitsValidator(bathrooms);
	        			while(!valid) {
	        				logger.info(invalidStaticString);
	        				valid  = Owner.digitsValidator(bathrooms);
	        				bathrooms = ss.nextLine();
	        			}
	        			ap.setBathrooms(bathrooms);              	                       
	        		}
	        		else if(modify ==9) {
	        			bedrooms = ss.nextLine() ;
	        			valid = Owner.digitsValidator(bedrooms);
	        			while(!valid) {
	        				logger.info(invalidStaticString);
	        				valid  = Owner.digitsValidator(bedrooms);
	        				bedrooms = ss.nextLine();
	        			}
	        			ap.setBathrooms(bedrooms);              	                       
	        		}
	              
	        	}
	         
		
			
			 
			 
			 
			 
			}
			
			
			
		
			
			
			}
			
		    
			
			



		
		
		
}


