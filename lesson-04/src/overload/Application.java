package overload;

public class Application {

	public static void main(String[] args) {

		Overload o1 = new Overload(1, 2);
		Overload o2 = new Overload();

		System.out.println(o1);
		System.out.println(o2);

	}

}