package java8features;

@FunctionalInterface
interface Addition{
	int add(int fno,int sno);
}
@FunctionalInterface
interface Subtraction{
	int sub(int fno,int sno);
}
@FunctionalInterface
interface Multiplication{
	int mul(int m,int n);
}
public class FunctionInterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using implements keyword can provide implemention
		//using annonymous block
		//using lambda Expression
		
		Addition a=(fno,sno)->
		{
		int result=fno+sno;
		return result;
		};
		int result=a.add(100,150);
		
		System.out.println("Addition of two numbers:"+result);
	
//	Subtraction s=()->
	//{
		
	//	System.out.println("Subtraction of two numbers:"+(fno-sno));
	//};
	//s.sub(200, 400);
	
//	Multiplication m=(k,l)->
	//{
		//System.out.println("Multiplication of two numbers:"+k*1);
	//};
	//m.mul(500, 2);
	}
	
	

}
