public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().withFirstName("Sergey").withLastName("Enotovich").withAge(24).build();
        System.out.println(person);
    }
}