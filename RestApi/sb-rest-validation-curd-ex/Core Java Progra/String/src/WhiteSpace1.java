
public class WhiteSpace1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Remove white spaces";       
        str1 = str1.replaceAll("\\s+", "");    
            
        System.out.println("String after removing all the white spaces : " + str1);    
	}

}
