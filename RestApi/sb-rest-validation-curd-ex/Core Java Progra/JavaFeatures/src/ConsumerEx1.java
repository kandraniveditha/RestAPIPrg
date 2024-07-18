import java.util.function.Consumer;

class Movie{
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
	
}
public class ConsumerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer<Movie>c1=m->System.out.println(m.name+" Ready to release");
Movie m=new Movie("Spider");
c1.accept(m);
	}

}
