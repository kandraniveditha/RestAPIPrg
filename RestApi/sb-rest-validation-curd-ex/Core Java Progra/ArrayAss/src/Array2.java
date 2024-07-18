
public class Array2 {
	
	static String getOddSum(int[] arr) {
		String val = null;
		int sum = 0;
		int oddsum=0;
		int len=0;
		if(arr!=null) {
			len=arr.length;
		}
				if (len == 5) {
			
			val = "1";
		} else {
			
			if (arr == null) {
				val = "-4";	
			} else if(len==5){
			
				for (int i = 0; i <len; i++) {
					
					if (arr[i] <= 0) {
						val = "-2";
					} 
					else if (arr[i] % 2 == 0) {
					
					}
					else if (arr[i] % 2 != 0) {
						oddsum++;
						val=oddsum+" ";	
					}
						if (sum == len) {
							val = "-3";
							
						} 
				
					}
				}
			else
				val="-1";
			}
		
		return val;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,3,4,5};
		String str=getOddSum(arr);
		System.out.println(str);

	


	}

}
