package abstraction;

public class Application {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Cow cow = new Cow();
		Dog dog = new Dog();

		System.out.println(cat);
		cat.voice();
		System.out.println(cow);
		cow.voice();
		System.out.println(dog);
		dog.voice();

	}

}