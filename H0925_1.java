//interface Animal {
//    void speak();
//}
//
//class Dog implements Animal {
//    public void speak() {
//        System.out.println("Bark");
//    }
//}
//
//class Cat implements Animal {
//    public void speak() {
//        System.out.println("Meow");
//    }
//}
//
//class AnimalFactory {
//    public Animal createAnimal(String type) {
//        if (type.equals("Dog")) {
//            return new Dog();
//        } else if (type.equals("Cat")) {
//            return new Cat();
//        }
//        return null;
//    }
//}
//
//public class H0925_1 {
//    public static void main(String[] args) {
//        AnimalFactory factory = new AnimalFactory();
//        Animal animal = factory.createAnimal("Dog");
//        animal.speak();
//    }
//}