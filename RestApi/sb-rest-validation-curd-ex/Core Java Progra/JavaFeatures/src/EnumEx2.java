
public class EnumEx2 {
enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATUDRDAY

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Day d=Day.MONDAY;
switch(d) {
case SUNDAY:
	System.out.println("SUNDAY");
	break;
case MONDAY:
	System.out.println("MONDAY");
	break;
case TUESDAY:
	System.out.println("TUESDAY");
	break;
	default:
		System.out.println("Other DAy");
}
	}

}
