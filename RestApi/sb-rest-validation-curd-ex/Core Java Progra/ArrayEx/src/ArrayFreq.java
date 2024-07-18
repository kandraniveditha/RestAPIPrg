//19)Program to find the frequency of each element of an array
public class ArrayFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
	      
	        int [] frq = new int [arr.length];  
	        int visited = -1;  
	        for(int i = 0; i < arr.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < arr.length; j++){  
	                if(arr[i] == arr[j]){  
	                    count++;  
	                    //To avoid counting same element again  
	                    frq[j] = visited;  
	                }  
	            }  
	            if(frq[i] != visited)  
	                frq[i] = count;  
	        }  
	        System.out.println("---------------------------------------");  
	        System.out.println("Frequency Array Each Element");  
	        System.out.println("---------------------------------------");  
	        for(int i = 0; i < frq.length; i++){  
	            if(frq[i] != visited)  
	                System.out.println("    " + arr[i] + "    |    " + frq[i]);  
	        }  
	        System.out.println("----------------------------------------");  
	}

}
