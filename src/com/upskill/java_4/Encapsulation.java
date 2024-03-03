package com.upskill.java_4;

public class Encapsulation {

// Encapsulation used to hide the data using setter and getter method
	




                                                                   
private String name = "rasel";                                      //Read & Write 
private int mobileNumber = 5586547 ;                                   // Retrieve, Read only                              
private int ssn = 5586547;                                      //Update write only
private String username ="upskill";                             // Retrieve, Read only  
private String password = "upskill123";                          //   Update, write only



            //Setter Method - name                                        // set the data, write
            public void setName(String value){
	             name = value;
}
	   //Getter Method - name                                  //get the data, write
	   public String getName(){
		return name;
	}

		//Getter Method - mobileNumber                         //get the data, write
		public int getmobileNumber(){
			return mobileNumber;
		}

			//Setter Method - ssn                                //set the data, write
			public void setssn(int value){
				ssn = value;
			}
			// Getter Method - userName                            //get the data, write
		public String getUsername(){
			return username;
			
		
}
		
		//Setter Method - password
      public void setPassword(String value){                         //set the data, write  
    	 password = value;
    }
}


