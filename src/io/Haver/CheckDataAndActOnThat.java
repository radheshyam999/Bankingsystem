package io.Haver;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

 class CheckDataAndActOnThat {
 Scanner input =  new Scanner(System.in);
 	static double TotalBlance;
 	       void Withdrawal(double withdrawalAmount){
 	       	  CheckDataAndActOnThat AcessCheckUser = new CheckDataAndActOnThat();
 	       	  AcessCheckUser.CheckUserAccount();
 	       	  System.out.println("Pleas Enter Amount");
 	       	  withdrawalAmount= input.nextDouble();
 	       	  
           }
 	
 	
 	
 	
         
	      void CheckUserAccount(){
		         int AccountNumber=134567;
		       int YourAccountNumber;
		       char DoYouHave;
		       int AccountPin=4186;
		       int YourAccountPin;
		        
	      	   System.out.println("Do You Have Account ..Y/N");
	      	   DoYouHave = input.next().charAt(0);   // i am geting  Data here //
		      
	      	   if (DoYouHave=='Y'){
	      	   	   System.out.println("What Is Your Account No");
	      	   	   YourAccountNumber = input.nextInt();
	      	   	   System.out.println(YourAccountNumber); // i Am geting Account number
		           if (AccountNumber==YourAccountNumber){
			           System.out.println("What Is Your Pin");
			           YourAccountPin =input.nextInt();
		           	      if(AccountPin==YourAccountPin){
		           	      
		           	      
		                  }
		           }
	           }
	      	   else{
	      	   	System.out.println("Do You Want To Create");
	           }
	      	
	      	
	      }
	      
	       void CreateAcount(String Name, String FatherName, String MatherName, int PhoneNumber,int AdharCardNumber){
	      	    char DetailesTrue;
	      	    System.out.println("What is Your Name");
	      	    Name = input.nextLine();
	      	    System.out.println("What is Father Name");
	      	    FatherName = input.nextLine();
	      	    System.out.println("What is Mather Name");
	      	    MatherName = input.nextLine();
		        System.out.println("What is PhoneNumber");
		        PhoneNumber = input.nextInt();
		       System.out.println("What s ADharCardNumber");
		       PhoneNumber = input.nextInt();
		        System.out.print("pleas check your Detailes");
		        System.out.println(Name);
		       System.out.println(FatherName);
		       System.out.println(MatherName);
		       System.out.println(PhoneNumber);
		       System.out.println(AdharCardNumber);
		       DetailesTrue = input.next().charAt(0);
		       
		       if (DetailesTrue =='Y'){
		       	System.out.println("Your Account Going  to Craete ....");
		       	
		       }
		       else{
		       	   System.out.println("Pleas  insert Data Again");
		       	   CreateAcount(Name,FatherName,MatherName,PhoneNumber,AdharCardNumber);
		       	
		       }
		       
	       }
	       void CheckAccountValid(){
	      
	      	
	       }
	      
	
	
	
	
}
