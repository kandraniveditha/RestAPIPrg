
public class CloneEx implements Cloneable {
int x=100;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		 CloneEx ex=new CloneEx();
		 CloneEx ex1=ex;// shallow cloning
		 CloneEx demo=(CloneEx)ex.clone();//deep cloning
		 demo.x=900;
		 System.out.println(demo.x);
		 System.out.println(ex.x);
	}

}
