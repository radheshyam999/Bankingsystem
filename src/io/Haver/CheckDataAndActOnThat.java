package io.Haver;



import java.util.Scanner;

 class CheckDataAndActOnThat {
 Scanner input =  new Scanner(System.in);
 BasicScltion AcessDataFromBasic = new BasicScltion();
       double TotalBlance=50000;
 	 
 	       double  Withdrawal(){  // function for withdrawal
	           
	           double withdrawalAmount;
 	       	   CheckDataAndActOnThat AcessCheckUser = new CheckDataAndActOnThat();
 	       	   AcessCheckUser.CheckUserAccount();
 	       	   System.out.println("Pleas Enter Amount");
 	       	   withdrawalAmount= input.nextDouble();
 	       	   TotalBlance = TotalBlance-withdrawalAmount;
 	       	   System.out.print("Your Blance is" +TotalBlance);
	          
 	       	   AcessDataFromBasic.BasicStuture ();
	           return TotalBlance;
           
 	       }
            double deposite(){
 	       	double AmountOfDeposite;
 	       	CheckDataAndActOnThat AcessDepsite = new CheckDataAndActOnThat ();
 	       	AcessDepsite.CheckUserAccount ();
 	       	System.out.println("Pleas Enter Amoutn That You Want to Deposite");
 	       	   AmountOfDeposite = input.nextDouble();
 	       	   TotalBlance = TotalBlance+AmountOfDeposite;
 	       	   System.out.println("Your Blance is " + TotalBlance);
	            AcessDataFromBasic.BasicStuture ();
 	       	return 0;
            }


     void  INQUIRE(){
 	       	System.out.println("Your blance is " +TotalBlance);
	     AcessDataFromBasic.BasicStuture ();
 	       	
       }
       void ChangePin(){
 	       	CheckUserAccount ();
	       AcessDataFromBasic.BasicStuture ();
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
			                  System.out.println("Your Process is Going to complete...");
		           	      
		                  }
		           }
		           else{
		           	System.out.println("wrong Account Number Pleas Enter Again");
		           	CheckUserAccount ();
		           }
	           }
	      	   else{
	      	   	System.out.println("Do You Want To Create");
	           }
	      	
	      	
	      }
	      
	       void ChangPhoneNumber(){
 	       	    System.out.print("your phone Number Going To Update ");
 	       	    CheckUserAccount ();
		       AcessDataFromBasic.BasicStuture ();
 	       }
	      
	       void CreateAcount(){
		       String Name, FatherName,MatherName;
		       int PhoneNumber ,AdharCardNumber;
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
		        AdharCardNumber = input.nextInt();
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
		       	   CreateAcount();
		       	
		       }
		       
	       }
	      // void CheckAccountValid(){
 	      
	      	
	       //}
	      
	
	
	
	
}
