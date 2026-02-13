class Student {        // Class
    String name;
    int marks;

    void display() {    // Method
        System.out.println(name + " scored " + marks);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();   // Object
        s1.name = "STUDENT";
        s1.marks = 95;
        s1.display();                 // Output: STUDENT scored 95
    }
}
class Student {
    private int marks;      
    public void setMarks(int m) { marks = m; }
    public int getMarks() { return marks; }
}

Student s = new Student();  // Object
s.setMarks(90);
System.out.println(s.getMarks());

class Animal { void eat() { System.out.println("Eating"); } }
class Dog extends Animal { void bark() { System.out.println("Barking"); } }

Dog d = new Dog();   // Object
d.eat();
d.bark();

class Calculator {             // Class
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }  // Overloaded method
}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();  // Object
        System.out.println(calc.add(5, 10));       // Output: 15
        System.out.println(calc.add(5.5, 2.5));    // Output: 8.0
    }
}

class Animal {                 // Parent class
    void sound() { System.out.println("Animal makes sound"); }
}

class Dog extends Animal {      // Child class
    void sound() { System.out.println("Dog barks"); }  // Overridden
}

class Main {
    public static void main(String[] args) {
        Animal a = new Dog();   // Object of child class
        a.sound();              // Output: Dog barks
    }
}

abstract class Car {
    abstract void drive();  // abstract method

    void fuel() {
        System.out.println("Petrol or Diesel");
    }
}

class Tesla extends Car {
    void drive() {
        System.out.println("Driving safely...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Tesla();
        c.drive();
        c.fuel();
    }
}
