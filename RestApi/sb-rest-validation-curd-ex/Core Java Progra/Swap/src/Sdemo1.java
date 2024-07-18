
public class Sdemo1 {

static int i=100;

static void funx()
{
	System.out.println("Static Method FunX");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Directly:"+i);
		funx();
		
		System.out.println("Using ClassName:"+Sdemo1.i);
		Sdemo1.funx();
		
		Sdemo1 demo=new Sdemo1();
		System.out.println("Using ClassName:"+Sdemo1.i);
		

	}

}
