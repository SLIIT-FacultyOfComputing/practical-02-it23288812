import java.util.Scanner;

public class bq1{



public static void main( String arg[]){

	Scanner keyboard = new Scanner(System.in);
	
	System.out.printf("enter first name : ");
	String first = keyboard.nextLine();
	System.out.printf("enter second name : ");
	String second = keyboard.nextLine();
	System.out.printf("enter third name : ");
	String third = keyboard.nextLine();
	
	System.out.println(first+ " " +second+ " " +third);
	
	System.out.printf("\n------------------------------------\n\n");
	
	StringBuilder stringBuilder = new StringBuilder(); 
          
        stringBuilder.append(last); 
        stringBuilder.append(" "); 
        stringBuilder.append(fist); 
        stringBuilder.append(" "); 
        stringBuilder.append(second); 
          
        String result = stringBuilder.toString(); 
          
        System.out.println("StringBuilder result: " + result);
	



  }
}

