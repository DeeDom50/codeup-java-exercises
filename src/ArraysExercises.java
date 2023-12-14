import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        // Exercise 1
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        // Exercise 2
        Person[] people = new Person[3];
        people[0] = new Person("Alice");
        people[1] = new Person("Bob");
        people[2] = new Person("Charlie");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        // Exercise 3
        people = addPerson(people, new Person("David"));

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    // Static method to add a person to an array of Person objects
    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[newArray.length - 1] = newPerson;
        return newArray;
    }
}
