
public class ToStringEx {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "How are you";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringEx ts=new ToStringEx();
		System.out.println(ts);
		System.out.println(ts.hashCode());
		System.out.println(Integer.toHexString(ts.hashCode()));
		System.out.println(ts.getClass());
		System.out.println(ts.getClass().getName());
	}

}
