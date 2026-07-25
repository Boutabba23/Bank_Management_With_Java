public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age can not be negative");
        }
        if (name == null || name.isBlank() || name.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Name Can not have a number!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{Name : " + name + ", Age : " + age + "}";
    }
}
