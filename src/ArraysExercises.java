import util.Input;

import java.util.Arrays;

public class ArraysExercises {

  public static Person[] addPerson(Person[] people, Person single){
     Person[] newArray = Arrays.copyOf(people, people.length + 1);

       newArray[newArray.length - 1] = single;

     return newArray;
    }

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);


        Person[] people = {new Person("Gym"), new Person("Jim"), new Person("Jane")};

        for(Person names : people){
            System.out.println(names.getName());
        }
        people = addPerson(people, new Person("bob"));
        System.out.println(Arrays.toString(people));
        System.out.println(people[4]);


    }
}
