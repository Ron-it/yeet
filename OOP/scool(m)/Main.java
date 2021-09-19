public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Name1", "address1", 104, "Maths");
        Person person = new Person("Name2", "address2");
        System.out.println(person.toString());
        System.out.println(teacher.toString());
    }

}
