package abstraction;

public class Cow extends Pet {

	public Cow(String name) {
		super();
		this.name = "������";
	}

	public Cow() {
		this.name = "������";
	}

	@Override
	void voice() {
		System.out.println("����-����");
	}

	@Override
	public String toString() {
		return "� " + name + " -";
	}

}