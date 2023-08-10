package org.example;
import org.example.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
public class Main {	
    private static final Logger logger = Logger.getLogger(Main.class.getName());
	public static boolean dashboardChoice;
	public static boolean modifyChoice;
	static List<Apartment> dbApartment = new ArrayList<Apartment>();
    static List<Building> dbBuilding = new ArrayList<Building>();
    static List<Owner> dbOwner = new ArrayList<Owner>();
    
    protected static List<Apartment> dbAdvertisement = new ArrayList<Apartment>();

    
    private static String s1 = "Please this is not an invalid email\\n reenter ur email";
    private static String s2 = "\nPlease enter your password:";
    private static String s3 = "The entry is not correct!.";
    static Scanner s = new Scanner(System.in);
    static int num;
    static String email = "0";
    static String password = "0";
    static String name = "0";
    static String major = "0";
    private static String type = "0";
    static int age = 0;
    static String id = "0";
    static String phoneNumber = "0";

    private static User user1 = new User();
    static Owner own = new Owner();
    static Database db = new Database();
    static Apartment ap = new Apartment();
    static String furniture;
    static Furniture furniture1 = new Furniture();
    static String costFurniture;
	public static boolean validInformation;
	public static boolean addNewApartmentChoice;	

    
  static void start1() {
	  logger.info(" \n"+"                                    HELLO\n"+
	  		      "                            WELCOME TO SAKANCOM \n"+
                  "                    Please choose your type: \n" +
			      "                    1-Admin \n"+
                  "                    2-Tenant\n"+
			      "                    3-Owner\n") ;
		
	    num=s.nextInt();
		switch(num)
		{
		case 1:
		{			
			viewAdmin()	;
			break;
		}
		
		case 2:
		{ 
			 logger.info("\n \n Now please log in as tenant to book an apartment ! \n");
	         tenantStart(); 		
			 break;
		}
		
		case 3:
		{
			 logger.info("\n ");

		     logger.info("Please enter your email as owner:"); 
		    String emailowner;
		    emailowner=s.nextLine();
		    emailowner=s.nextLine();

		    own.setEmail(emailowner);
		     
		     while(!(emailowner.contains("@"))) {
			     logger.info(s1); 
			     emailowner=s.nextLine();
		         own.setEmail(emailowner);
	         }	
	         logger.info(s2); 
	         password=s.nextLine();	

	         logger.info("\nPlease enter your phone number:"); 
	         
	         phoneNumber=s.nextLine();
	     
	         own.setPhone(phoneNumber);
	         String ownername;
	         ownername=s.nextLine();
	         own.setName(ownername);
	         

	         logger.info("1.Add new appratment:\n2.Dashboard:");
	         num = s.nextInt() ;
             if (num == 1){
                 Apartment.addApartment();
             
                Admin.viewRequests();
                 
             }
             else if (num ==2) {
                 break ; 
             }
             
             else if (num ==3 ) {  
        	     Apartment.modify();
             } 
             
             break;
		}    	
			
		
		default :
		{
			 logger.info(s3);
		}
		
			
		
		}
  }

public static void viewForTenant() {
	logger.info("Please determine wheather u r a student or not \n 1-Student 2-Not a student"); 
     num=s.nextInt();
     switch(num) {
     case 1:
     {
    	  
    		logger.info("Hello student!\n"); 
    		logger.info("Please enter your name\n"); 
    	 	name=s.nextLine();
    	 	name=s.nextLine();
    	 	user1.name = name;
    	 	
    		logger.info("Please enter your id\n"); 
    	 	id=s.nextLine();
    	
    	 	user1.id=id;
    	
    	 	logger.info("Please enter your age\n"); 
    		age=s.nextInt();
    		user1.age=age;

    		
    		logger.info("Please enter your major\n"); 
    		major=s.nextLine();
    		major=s.nextLine();
    		user1.major=major;
    	
    	
    	
    		db.addTenantStudent(email,password,name,type,major,age,id);
    	
    		
           viewTenantMenuStudent();
              		
    		break;
 	 
     } 
     case 2:
     {    	  
 		logger.info("Hello student!\n"); 
 		logger.info("Please enter your name\n"); 
 	 	name=s.nextLine();
 	 	name=s.nextLine();
 	 	user1.name=name;
 	
 		db.addTenantNotStudent(email,password,name,type,major,age,id);
    	 
    	 viewTenantMenuNotStudent();
    	 break;
     }
     default:
     {
    	 logger.info(s3);
    	 
     }
     }
	
}

static void viewAdmin(){
	 logger.info("Please enter your email as admin"); 
	 email=s.nextLine();
	 while(!(email.contains("@"))) {
			logger.info(s1); 
			email=s.nextLine();
	 }		
     logger.info(s2); 
     password=s.nextLine();
     Admin.check(email, password);

}
static void viewAdminMenu(){

				String str ;

    	    str = s.nextLine();
    	    str = s.nextLine();
		    if(str.equals("admin")) 
		    {
		    	Main.viewAdmin();
		    	logger.info(" \n                               Admin Menue  \n"+ 
		    			"1-Scenes of requests for advertisement of housing and the ability to accept and reject it\n"+
		    		    "2-Watching reservations via the system\n");
		    	
		    	
		    	
	num=s.nextInt();
switch(num) {	
		    case 1:
		    {  	
	       logger.info("\n now u can refused or accept it"+"\n");
		    str = s.nextLine();
		    str = s.nextLine();
		    while(!str.equals("a") && !str.equals("r")) {
			    logger.info("invalid!");
			    }
	                  	
		    if(str.equals("a")) 
		    {
		    
		            logger.info("Accepted !!,now enter as an admin to book , please enter the word:  "+ "tenant"+"\n");
				    str = s.nextLine();
		          if (str.equals("tenant")) {
		        	Main.tenantStart(); 
		        	
		        	 
		         }
		    }
		    
		     
		    
		    else if (str.equals("r"))
		    {	
		    	logger.info("Refused,try to request again ");
              Apartment.addApartment();

		    	
		    }
		    else {
		    	logger.info("try again!");

     	 
      }
		    break ; 
		    }
		     
		    	     case 2:{
		    	    	 
		    	    	 
		    	    	 break;
		    	    	 
		    	     }
		    	     default :
		    	     {
		    	    	 break;
		    	     }
		    }
      
		    }
	
}
public static void viewTenantMenuStudent(){
	logger.info(" \n                               Tenant Menue - Student \n"+ 
	"1-View the available housing contains Picture,Price,location, and services available in them\n"+
    "2-Book according to the ID of the available \\n"+
    "3-Info about this apartment contains people who live in it, such as ages and university majors\n"+
	"4-Advertise furniture \n"+
	"5-Your final book report (dashboard)\n");
	
	 num=s.nextInt();
     switch(num) {
     case 1:
     {
    	String str;
    	Admin.viewRequestsForAdmin();
    	 
	
		logger.info("please write the number 2 to continue booking !\n");
	    str = s.nextLine();
	    str = s.nextLine();
	    if(str.equals("2")) {
	    logger.info("please write the number of the department u like!");
	    str = s.nextLine();
	    for(int i=0;i<dbApartment.size();i++) {
	    dbApartment.get(i).setBuildingId(str);
	        String d=str;
	    	
		    logger.info("r u sure to book the department that has the id="+d+"\n" +
		    "if yes write the word(yes)");
		    str = s.nextLine();
		    if(str.equals("yes")) {

		    	logger.info("u have book the department with the id ="+d+"\n" +"Please write number :3 to view it's information"+"\n");
		    str = s.nextLine();

	                for (Apartment person : dbApartment) {
	               if (person.getBuildingId().equals(d)) {
	            	   
	               logger.info("The student/s in your apertment is/are with thier informations :\n"+
	               "Name of the Apartment  Name of the student  Major of the student   age of the student"+"\n"
	   +person.getName()+"                  "+ person.getNameTenant()+"               "+person.getStudentMajor()+
	   "                          "+person.getAgeTenant());	 
	            	
	                
	               }
	           }
	    
		    }	
		    else {
			    logger.info("choose another department to book ! :) \n");

		    }
          

	    }
	    String f;
	

	    logger.info("please enter(4) if u want to advartise a furniture ");
	    
	    f=s.nextLine();
	    if(f.equals("4")) {
	    	
	    
	    logger.info("Please write what type of furniture u wnat to adertise \n");
    	 furniture=s.nextLine();
    	 furniture=s.nextLine();
    	 furniture1.setType1(furniture);
    	 logger.info("Please write the cost \n");
         costFurniture=s.nextLine();
         furniture1.setCost(costFurniture);
         db.addFurniture(furniture,costFurniture);
	    }
	    
    	 logger.info("Please enter (5)to show ur final dashboard :  \n");
    	 String s1;
    	    s1=s.nextLine();
    	    if(s1.equals("5")) {
    	  tenantDashboard();}
	
	    
	    }

    	
    	break;
      } 
     case 2:
     {
    	 
    	 break;
     }
     case 3:
     {
    	 
         tenantDashboard();

  	 
    	 break;
     }
      case 4:
      {
    	 
    	 break;
     }
     case 5:{
	 
	 break;
     }
     
     default:
     {
    	 break ;
     }
     }
	
	

}

static void tenantStart() {
logger.info("Please enter your email as tenant:"); 
email=s.nextLine();
email=s.nextLine();
while(!(email.contains("@"))) {
logger.info("Please this is not an invalid email\n reenter ur email"); 
email=s.nextLine();
user1.email=email;

}		
logger.info(s2); 
password=s.nextLine();	
 User.checkUser(email, password);



viewForTenant();
}
static void viewTenantMenuNotStudent(){
	logger.info(" \n                               Tenant Menue - Not Student \n"+ 
	"1-View the available housing contains Picture,Price,location, and services available in them\n"+
    "2-Book according to the ID of the available housing\n"+
	"3-Advertise furniture \n"+
	"4-Your final book report (dashboard)\n"); 

	 num=s.nextInt();
    switch(num) {
    case 1:
    {
   	 
   	 
   	break;
     } //end case 1
    case 2:
    {
   	 
   	 break;
    }
    case 3:
    {
   	 
   	 break;
    }
     case 4:
     {
   	 
   	 break;
    }
    
    default:
    {
   	 logger.info(s3);
    }
   
    }
    tenantDashboard();
}

public static void tenantDashboard() {
	

	 logger.info("\nThis is is for "+	user1.name+" Only :D \n"+
	  		   	" |   Name:"+ user1.name +"    | "+" Age:" +user1.age+"     |  "+"Major:"+user1.major +" |\n "+
			 "\n                       From the Owner:\n "+
	  			"| "+" Owner Email: "  + own.getEmail() +"         "       +  "   Owner Name: "  +   own.getName()+"     Owner Phone: " +own.getPhone()     );
	  			
	  		   	
	  		   	
	  		   	
	  		
	          
	 logger.info("This window is only for owner to modify the data please enter {modify}");

  	 
}

public static void main(String[] args) 
{
	start1();		
}



}