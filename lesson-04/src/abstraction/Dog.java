package abstraction;

public class Dog extends Pet {

	public Dog(String name) {
		super();
		this.name = "���";
	}

	public Dog() {
		this.name = "���";
	}

	@Override
	void voice() {
		System.out.println("�����-�����");
	}

	@Override
	public String toString() {
		return "� " + name + " -";
	}

}