public class Person {
    String surname;
    String name;
    String middle_name;
    int phone_number;
    Date birth_date;
    Gender gender;

    public Person(String surname, String name, String middle_name, int phone_number, Date birth_date, Gender gender) {
        this.surname = surname;
        this.name = name;
        this.middle_name = middle_name;
        this.phone_number = phone_number;
        this.birth_date = birth_date;
        this.gender = gender;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %d %s", surname, name, middle_name, birth_date, phone_number, gender);
    }
}
