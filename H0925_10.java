final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class H0925_10 {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("Alice", 30);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}