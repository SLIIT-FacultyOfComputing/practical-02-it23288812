public class test1 { 
    public static void main(String[] args) { 
        StringBuilder stringBuilder = new StringBuilder(); 
          
        stringBuilder.append("Hello"); 
        stringBuilder.append(" "); 
        stringBuilder.append("World"); 
          
        String result = stringBuilder.toString(); 
          
        System.out.println("StringBuilder result: " + result); // Output: StringBuilder result: Hello World 
    } 
} 
