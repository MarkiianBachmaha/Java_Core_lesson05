package abstraction;

public class Dog extends Pet {

	public Dog(String name) {
		super();
		this.name = "οερ";
	}

	public Dog() {
		this.name = "οερ";
	}

	@Override
	void voice() {
		System.out.println("Γΰσσσ-Γΰσσσ");
	}

	@Override
	public String toString() {
		return "ί " + name + " -";
	}

}