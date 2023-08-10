package org.example;
import java.util.Scanner;
import java.util.logging.Logger;

public class Apartment {	
	   private static final Logger logger = Logger.getLogger(Apartment.class.getName());

	   private String id;
       private String picture;
       private String rent;	  
       private String location; 	   
       private String water;
       private String electric;
       private String balcony;
       private String internet;
       private String bathrooms;
	   private String bedrooms;
	   private String floor; 
	   private String numberOfApartmentsInFloor;       
	   private String buildingId;
	   private String name;
	   private String studentMajor;
	   private String nameTenant;
       private String ageTenant;
	   String date;


	   
	   
	   
	   public String getStudentMajor() {
			return studentMajor;
		}


		public void setStudentMajor(String studentMajor) {
			this.studentMajor = studentMajor;
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


	public void setName(String name) {
		this.name = name;
	}



	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public String getRent() {
		return rent;
	}


	public void setRent(String rent) {
		this.rent = rent;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getWater() {
		return water;
	}


	public void setWater(String water) {
		this.water = water;
	}


	public String getElectric() {
		return electric;
	}


	public void setElectric(String electric) {
		this.electric = electric;
	}


	public String getBalcony() {
		return balcony;
	}


	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}


	public String getInternet() {
		return internet;
	}


	public void setInternet(String internet) {
		this.internet = internet;
	}


	public String getBathrooms() {
		return bathrooms;
	}


	public void setBathrooms(String bathrooms) {
		this.bathrooms = bathrooms;
	}


	public String getBedrooms() {
		return bedrooms;
	}


	public void setBedrooms(String bedrooms) {
		this.bedrooms = bedrooms;
	}


	public String getFloor() {
		return floor;
	}


	public void setFloor(String floor) {
		this.floor = floor;
	}


	public String getNumberOfApartmentsInFloor() {
		return numberOfApartmentsInFloor;
	}


	public void setNumberOfApartmentsInFloor(String numberOfApartmentsInFloor) {
		this.numberOfApartmentsInFloor = numberOfApartmentsInFloor;
	}


	public String getBuildingId() {
		return buildingId;
	}


	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
   


	public static void addApartment() {
		String p ;
		String location;
		String rent ;
		String  water  ;
		String  internet ;
		String electricety ;
		String bathrooms ;
		String bedrooms ;
		String balcony ;
		
		boolean valid ;
		boolean ynValid ;
		boolean buildingExists ;
		
		Scanner s = new Scanner(System.in);
		
		Apartment ap = new Apartment();
		
   	    logger.info("photo link:");
        p =s.nextLine();
    
        ap.setPicture(p) ; 
        //validation
     
     
        logger.info("location:");
        location =s.nextLine();
        ap.setLocation(location) ; 

        logger.info("rent:");
        rent =s.nextLine();
        valid = Owner.digitsValidator(rent);
        while(!valid) {
        	rent=s.nextLine();
    	    valid = Owner.digitsValidator(rent);
        }
        ap.setRent(rent) ;

     
        logger.info("services(only yes or no)\n");
    
        logger.info("water:");             
        water  =s.nextLine();
        ynValid = Owner.yesNoValidator(water);
        while(!ynValid) {
            water  =s.nextLine();
            ynValid = Owner.yesNoValidator(water);
        }
        ap.setWater(water);

       logger.info("internet");     
       internet  =s.nextLine();
       ynValid =Owner.yesNoValidator(internet);
       while(!ynValid) {
            internet  =s.nextLine();
            ynValid = Owner.yesNoValidator(internet);
       }  
       ap.setInternet(internet);
     
   
       logger.info("electricety:");    
       electricety  =s.nextLine();
       ynValid = Owner.yesNoValidator(electricety);
       while(!ynValid) {
     	    electricety  =s.nextLine();
            ynValid = Owner.yesNoValidator(electricety);
       }
       ap.setElectric(electricety);
     
       logger.info("#bathrooms:");
       bathrooms =s.nextLine();
       valid = Owner.digitsValidator(bathrooms);
       while(!valid) {
    	    bathrooms=s.nextLine();
    	    valid = Owner.digitsValidator(bathrooms);
       }
       ap.setBathrooms(bathrooms) ;
     
       logger.info("#bedrooms:");
       bedrooms =s.nextLine();
       valid = Owner.digitsValidator(bedrooms);
       while(!valid) {
    	    bedrooms=s.nextLine();
    	    valid = Owner.digitsValidator(bedrooms);
       }
       ap.setBedrooms(bedrooms) ;
      
     
       logger.info("balcony:yes or no");
       balcony =s.nextLine();
       ynValid = Owner.yesNoValidator(balcony);
       while(!ynValid) {
     	    balcony  =s.nextLine();
            ynValid = Owner.yesNoValidator(balcony);
       }
       ap.setBalcony(balcony) ;
     

       logger.info("building id:");
       String buildingId =s.nextLine();
       valid = Owner.yesNoValidator(buildingId);
              
       ap.setBuildingId(buildingId) ; 

       logger.info("building name:");
       String buildingName =s.nextLine();
       ap.setName(buildingName) ; 

       logger.info("building floors:");
       String buildingFloors =s.nextLine();
       valid = Owner.yesNoValidator(buildingFloors);
       ap.setFloor(buildingFloors) ; 
       Main.dbApartment.add(ap);   
       buildingExists = false;
       for (Apartment a : Main.dbApartment  ) {
           if (a.getBuildingId().equals(buildingId)) {
        	   buildingExists = true;
               break;
           }
       }  
       if(!buildingExists) {  
       Building bu = new Building();
       bu.setBuildingId(buildingId) ; 
       bu.setBuildingName(buildingName) ; 
       bu.setBuildingFloors(buildingFloors) ;    
  
    }   		
	}
	public String getNameTenant() {
		return nameTenant;
	}


	public void setNameTenant(String nameTenant) {
		this.nameTenant = nameTenant;
	}


	public String getAgeTenant() {
		return ageTenant;
	}


	public void setAgeTenant(String ageTenant) {
		this.ageTenant = ageTenant;
	}


	public static void modify() {
		String p ;
		String location;
		String rent ;
		String bathrooms ;
		String bedrooms ;
		String balcony ;
        boolean flag = true ; 
		Scanner s = new Scanner(System.in);
        String currentId;
  	    logger.info("Enter Appartment id :");
  	    currentId = s.nextLine();
        int modify = 0 ;
        for (Apartment ap : Main.dbApartment  ) {        	
        	if(ap.getId().equals(currentId) ) {
                flag = true ; 
        		logger.info("1.rent"+"\n"+"2.location"+"\n"+"3.picture"+"\n"+"4.balcony"+"\n"+"5.bathrooms"+"\n"+"6.bedrooms"+"\n");  
                modify = s.nextInt();           		
        	}
        	if(flag) {
        		switch(modify){
        		case 1 :
        		{
        			rent = s.nextLine();
         			ap.setRent(rent);
        			break ;
        		}
        		case 2 :
        		{
        			location = s.nextLine();
        			ap.setLocation(location); 
        			break ;
        		}
        		case 3 :
        		{
        			p = s.nextLine();
        			ap.setPicture(p);
        			break ;
        		}
        		case 4 : 
        		{
        			balcony = s.nextLine() ;
        			ap.setBalcony(balcony);  
        			break ;
        		}
        		case 5 :
        		{
        			bathrooms = s.nextLine() ;
        			ap.setBathrooms(bathrooms); 
        			break ;

        		}
        		case 6 :
        		{
        			bedrooms = s.nextLine() ;
        			ap.setBathrooms(bedrooms); 
        			break ; 
        		}
        		default :
        		break ; 	
        		
        		}
            }
        	
        } 
        if(!flag) {
        	logger.info("invalid!");
        }
	}


	
}