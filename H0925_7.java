class Animal {
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void speak() {
        System.out.println("Cat meows");
    }
}

public class H0925_7 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.speak();
        myDog.speak();
        myCat.speak();
    }
}