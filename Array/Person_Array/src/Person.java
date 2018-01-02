/**
 * Created by MatiasBerretta on 1/2/18.
 */
public class Person {

    private String first;
    private String last;
    private int age;

    public Person(String first, String last, int age)
    { // constructor
        this.first = first;
        this.last = last;
        this.age = age;
    }

    public void displayPerson() {
        System.out.print("Name: " + first);
        System.out.print(", Surname: " + last);
        System.out.println(", Age: " + age);
    }

    public String getLast() {
        return last;
    }

}
