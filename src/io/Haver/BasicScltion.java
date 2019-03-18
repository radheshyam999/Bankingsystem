package io.Haver;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class BasicScltion {
	 void BasicStuture() {
	 	byte MethodOption;
		 Scanner TakeInput = new Scanner(System.in);
		 
		 System.out.print(1  +"  Withdrawal \t");
		 System.out.println(2 +"  Deposite ");
		 System.out.print(3 + "  Inquire \t");
		 System.out.println("\t"+4  +"  Change Pin ");
		 System.out.print(5 +" Exit \t " + " \t " + " \t");
		 System.out.println(6 +" Create Account");
		 System.out.print("    \t " + " \t " + "\t");
		
		 System.out.println(7 +" Update Phone Number ");
		 System.out.println("Pleas Enter A Number ");
		MethodOption = TakeInput.nextByte();
		 switch (MethodOption){
			 case 1:
			 	//first method
				 break;
			 case 2:
			 	//Scond Method
				 break;
			 case 3:
			 	//third method
				 break;
			 case 4:
			 	// fourth method
				 break;
			 case 5:
			 	//fifth method
				 break;
				 case 6:
				 	//sixth Method
					 break;
			 case 7:
			 	//seven Method
				 break;
			 	
		 	
		 }
		
	 }
}
