public class Class002_StaticTest {
	public static int id;
	public int age;

	public static void main(String[] args) {
		Class002_StaticTest class002_StaticTest = new Class002_StaticTest();
		System.out.println(Class002_StaticTest.id); //0
		System.out.println(class002_StaticTest.age);  //0

		class002_StaticTest.change();  //1,0,1,1
		System.out.println(Class002_StaticTest.id);//1
		System.out.println(Class002_StaticTest.id);//1
		System.out.println(class002_StaticTest.age);//0
		class002_StaticTest.change();//2,0,2,1
		System.out.println(id);//2
		System.out.println(class002_StaticTest.age);//0


	}

	public void change() {
		Class002_StaticTest class002_StaticTest = new Class002_StaticTest();
		class002_StaticTest.age++;
		Class002_StaticTest.id++;
		System.out.println("In change(): id = " + id + " age = " + age);
		System.out.println("In change(): id = " + id + " class002_StaticTest.age = " + class002_StaticTest.age);

	}
}