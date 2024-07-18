import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MultipleCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream f=new FileOutputStream("Nive.txt"))
		{
			String msg="Welcome to Stream API";
		byte[] s=	msg.getBytes();
		f.write(s);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
