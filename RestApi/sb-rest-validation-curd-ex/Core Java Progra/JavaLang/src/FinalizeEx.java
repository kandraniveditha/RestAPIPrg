
public class FinalizeEx {
 	 
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("To perform clean up Operations");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeEx fx=new FinalizeEx();
		System.out.println(fx);
		fx=null;
		System.gc();
		System.out.println(fx);
		System.out.println("Hello");
	}

}
