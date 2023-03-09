

public class UserRegister {
    private String name;
    private String surname;

    public UserRegister(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "{" + '\'' +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}