package io.Haver;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class BasicScltion {
	 void BasicStuture() {
	 	byte MethodOption;
		 Scanner TakeInput = new Scanner(System.in);
		 CheckDataAndActOnThat AcessData = new CheckDataAndActOnThat();
		 System.out.print(1  +"  Withdrawal \t");
		 System.out.println(2 +"  Deposite ");
		 System.out.print(3 + "  Inquire \t");
		 System.out.println("\t"+4  +"  Change Pin ");
		 System.out.print(5 +" Exit \t " + " \t " + " \t");
		 System.out.println(6 +" Create Account");
		 System.out.print("    \t " + " \t " + "\t");
		
		 System.out.println(7 +" Update Phone Number ");
		 System.out.println("Pleas Choose what You want to do ");
		MethodOption = TakeInput.nextByte();
		 switch (MethodOption){
			 case 1:
			 	  AcessData.Withdrawal();
				 break;
			 case 2:
			 	AcessData.deposite ();
				 break;
			 case 3:
			 	
				 AcessData.INQUIRE ();
				 break;
			 case 4:
			 	System.out.println("Thank You For Using");
				 break;
			 case 5:
			 	
				 break;
				 case 6:
				 	AcessData.CreateAcount ();
					 break;
			 case 7:
			 	AcessData.ChangPhoneNumber ();
				 break;
			 	
		 	
		 }
		
	 }
}
