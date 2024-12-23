package GeneralCoreJavaconcepts;

//Constructor overloading and this keyword uses
public class Constructor {

	String name;
	int age;

	public Constructor() {
		System.out.println("Display constr..");
	}

	public Constructor(int i) {
		System.out.println("1 Parameterized constr..");
		System.out.println(i);
	}

	public Constructor(int i, int j) {
		System.out.println("2 Parameterized constr..");
		System.out.println(i + j);

	}

	public Constructor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor ob = new Constructor();
		Constructor ob1 = new Constructor(20);
		Constructor ob2 = new Constructor(25, 30);
		Constructor ob3 = new Constructor("Jatin", 36);

		System.out.println(ob3.name + " " + ob3.age);

	}

}
