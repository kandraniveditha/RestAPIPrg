
public class VarargsEx {
	void display(int arr[]) {
		for(int i:arr) {
			System.out.println(i);
		}
	}
	void disp(int ...arr) {
		for(int i:arr) {
			System.out.println(i);
		}
	}
	void disp(String ...arr) {
		for(String i:arr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
VarargsEx va=new VarargsEx();
int arr[]=new int[] {10,20,30};
va.display(arr);
System.out.println("======================");
va.disp(arr);
System.out.println("=======================");
va.disp(500);
System.out.println("=======================");

va.disp("Rani","Lilly","Malli");
String[] str=new String[] {"Kalpana","Niveditha","UjjwalNaidu"};
	}

}
