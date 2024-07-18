
public class Reverse7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stores the reverse of given string 
		String string="Mom World";
        String reversedStr = "";    
            
        for(int i = string.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + string.charAt(i);    
        }    
            
        System.out.println("Original string: " + string);    
            
        System.out.println("Reverse of given string: " + reversedStr);    
	}

}
