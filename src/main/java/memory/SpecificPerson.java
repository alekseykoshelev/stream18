package memory;

public class SpecificPerson extends Person {

    private final String type;

    public SpecificPerson(String name, String surname, String type) {
        super(name, surname);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void spec() {

    }
}
