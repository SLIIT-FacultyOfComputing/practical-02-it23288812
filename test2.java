public class test2 { 
    public static void main(String[] args) { 
	String str = "Hello"; 
	for (char c : str.toCharArray()) { 
	    // Do something with each character 
	} 
	  
	// Alternatively, using StringBuilder 
	StringBuilder sb = new StringBuilder(str); 
	for (int i = 0; i < sb.length(); i++) { 
	    char c = sb.charAt(i); 
	    // Do something with each character 
	}
	    } 
} 
