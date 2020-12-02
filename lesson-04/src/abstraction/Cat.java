package abstraction;

public class Cat extends Pet {

	public Cat(String name) {
		super();
		this.name = "κ³ς";
	}

	public Cat() {
		this.name = "κ³ς";
	}

	@Override
	void voice() {
		System.out.println("Μÿσσσ-Μÿσσσ");
	}

	@Override
	public String toString() {
		return "ί " + name + " -";
	}

}