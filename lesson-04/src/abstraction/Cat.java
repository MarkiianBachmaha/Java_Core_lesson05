package abstraction;

public class Cat extends Pet {

	public Cat(String name) {
		super();
		this.name = "��";
	}

	public Cat() {
		this.name = "��";
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