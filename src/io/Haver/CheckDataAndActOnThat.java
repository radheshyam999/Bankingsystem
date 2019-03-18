package io.Haver;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

 class CheckDataAndActOnThat {
         Scanner input =  new Scanner(System.in);
	      void CheckUserAccount(){
		       int AccountNumber;
		       char DoYouHave;
		        
	      	   System.out.println("Do You Have Account ..Y/N");
	      	   DoYouHave = input.next().charAt(0);   // i am geting  Data here //
		      
	      	   if (DoYouHave=='Y'){
	      	   	   System.out.println("What Is Your Account No");
	      	   	   AccountNumber = input.nextInt();
	      	   	   System.out.println(AccountNumber); // i Am geting Account number
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
		       	System.out.println("Your Account Going  to Craete");
		       	
		       }
		       
	       }
	       void CheckAccountValid(){
	      	
	       }
	      
	
	
	
	
}
