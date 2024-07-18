package jaba8features;
@FunctionalInterface
interface X{
	void display(String msg);
}

public class FunctionalInterfaceex {

	public static void main(String[] args) {
		//Annomous Block
		X x=new X() {
			public void dispaly(String msg) {
				System.out.println(msg);
			}

			@Override
			public void display(String msg) {
				// TODO Auto-generated method stub
				
			}
			
	};
	x.display("Focus more");

}
	}
		// TODO Auto-generated method stub
//FunctionalInterfaceex fun=new FunctionalInterfaceex();
//fun.display("Fouces on it");
	//}

	//@Override
	//public void display(String msg) {
		// TODO Auto-generated method stub
//		System.out.println("Display the data");
	//}

//}
