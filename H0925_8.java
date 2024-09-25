class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class H0925_8 {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println(person.getName());

        person.setAge(30);
        System.out.println(person.getAge());
    }
}