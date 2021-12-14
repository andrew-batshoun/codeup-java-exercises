public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//TODO:Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);
//TODO:Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Andrawes";
        System.out.println(myString);
//TODO:Change your code to assign a character value to myString. What do you notice?
//java: unclosed character literal  and intellij says there's too many characters

//TODO:Change your code to assign the value 3.14159 to myString. What happens?
//when you try to run it, the programs says incompatible types

//TODO:Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//console says variable myNumber might not have been initialized

        float myNumber = 3.14f;
        System.out.println(myNumber);

//TODO:Change your code to assign the value 3.14 to myNumber. What do you notice?
//That 3.14 is incompatible to long

//TODO:Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//3.14 is considered a float and is not able to be a long data type

//TODO:Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//you can add f to the end of the number or change float to double

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//TODO:What is the difference between the above code blocks? Explain why the code outputs what it does.
//This first code block has a post increment which will only show the previous value and then when called will show the new.  The Second Block is pre-increment which will change the value when it is called.

//TODO: Try to create a variable named class. What happens?
        //class is a reserved word or keyword

//TODO: Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        //it will cause an error because o is a string

        //String theNumberThree = "three";
        //Object o = theNumberThree;
        //int three = (int) o;
        // System.out.println(three);
//TODO: Copy and paste the code above and then run it. Does the result match with your expectation?
        //yes

        //int three = (int) "three";
//TODO: What are the two different types of errors we are observing?
        //That the data type is incompatible and the string is not an integer

        //TODO: Rewrite the following expressions using the relevant shorthand assignment operators:
        //Copied to clipboard
        //int x = 4;
        //x = x + 5;
        //
        //int x = 3;
        //int y = 4;
        //y = y * x;
        //
        //int x = 10;
        //int y = 2;
        //x = x / y;
        //y = y - x;

        //refactored:
        //int x = 4;
        //x +=5;

//        int x = 3;
//        int y = 4;
//        y *= x;

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

//TODO: What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

//        int bigNum = 10000000000;
//        System.out.println(bigNum);

//java: interger number too large

    }
}
