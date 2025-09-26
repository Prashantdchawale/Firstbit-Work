class Animal
{
	String name;
	String type;
	
	Animal() {
		this.name = "Not Given";
		this.type = "Not Available";
	}
	
	Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}

	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	String getColor() {
		return type;
	}


	void setColor(String type) {
		this.type = type;
	}
	
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Type : "+type);
	}
}//class Animal ends 


class Dog extends Animal
{
	String color;
	String sound;
	
	Dog() {
		super();
		this.color = "White";
		this.sound = "Bark";
		System.out.println("Dog Default Constructor");
	}
	Dog(String name, String type, String color, String sound) {
		super(name,type);
		this.color = color;
		this.sound = sound;
		System.out.println("Dog Parameterized Constructor");

	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	String getSound() {
		return sound;
	}
	void setSound(String sound) {
		this.sound = sound;
	}
	
	void display()
	{
		super.display();
		System.out.println("Dog Color :"+color);
		System.out.println("Dog Sound :" +sound);
	}
	
	
}
class TestAnimal {
	public static void main(String[] args) 
	{
		Animal a1=new Animal();
		a1.display();
		System.out.println();
		
		a1=new Dog();
		a1.display();
		System.out.println();

		a1=new Dog("Tommy", "Pet", "Brown", "Woof");
		a1.display();
	}
}