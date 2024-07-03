import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Jay", LocalDate.of(1966, 12, 5));


        System.out.println(p1);
    }
}