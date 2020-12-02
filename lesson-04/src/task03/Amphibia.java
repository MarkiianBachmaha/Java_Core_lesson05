package task03;

public class Amphibia {

	protected String name;

	public void eat() {
		System.out.println("I am eating");
	}

	public void sleep() {
		System.out.println("I am sleeping");
	}

	public void swim() {
		System.out.println("I am swimming");
	}

	public void walk() {
		System.out.println("I am walking");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Amphibia [toString()=" + super.toString() + "]";
	}

}