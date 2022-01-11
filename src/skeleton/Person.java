package skeleton;

/**
 * Model an abstract person class.
 * 
 * @author your name
 *
 */
public abstract class Person {
    public String firstname;
    public String lastname;
    public int age;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
}
