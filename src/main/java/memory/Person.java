package memory;

import org.example.Main;

public class Person {

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return "Имя: " + name;
    }

    public String getSurname() {
        return surname;
    }

    public void changePerson(Person person) {
        System.out.println(person);
        person = new Person("Ilya", "Lagutenko");
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
