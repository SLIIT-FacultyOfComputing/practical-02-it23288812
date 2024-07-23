import java.util.Scanner;

public class bq1p2{



public static void main( String arg[]){

	Scanner keyboard = new Scanner(System.in);
	
	System.out.printf("enter first name : ");
	String first = keyboard.nextLine();
	System.out.printf("enter second name : ");
	String second = keyboard.nextLine();
	System.out.printf("enter third name : ");
	String third = keyboard.nextLine();
	
	
	StringBuilder stringBuilder = new StringBuilder(); 
          
        stringBuilder.append(third); 
        stringBuilder.append(" "); 
        stringBuilder.append(first); 
        stringBuilder.append(" "); 
        stringBuilder.append(second); 
          
        String result1 = stringBuilder.toString(); 
          
        System.out.println("StringBuilder result: " + result1);
        
        System.out.printf("\n------------------------\n");
	
	System.out.printf("enter your full name : ");
	String fullname = keyboard.nextLine();
	
	if (result1.equalsIgnoreCase(fullname)) {
	System.out.printf("names are same");
	}
	else
	System.out.printf("names are difrnc");



  }
}

