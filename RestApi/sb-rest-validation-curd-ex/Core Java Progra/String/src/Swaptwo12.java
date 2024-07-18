
public class Swaptwo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Niveditha", str2 = "chowdary ";    
        System.out.println("Strings before swapping: " + str1 + " " + str2);        
       str1 = str1 + str2;        
       str2 = str1.substring(0, (str1.length() - str2.length()));       
       str1 = str1.substring(str2.length());    
           
       System.out.println("Strings after swapping: " + str1 + " " + str2);    
	}

}
