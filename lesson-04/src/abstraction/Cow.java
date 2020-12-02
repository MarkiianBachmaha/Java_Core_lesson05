package abstraction;

public class Cow extends Pet {

	public Cow(String name) {
		super();
		this.name = "корова";
	}

	public Cow() {
		this.name = "корова";
	}

	@Override
	void voice() {
		System.out.println("Мууу-Мууу");
	}

	@Override
	public String toString() {
		return "Я " + name + " -";
	}

}