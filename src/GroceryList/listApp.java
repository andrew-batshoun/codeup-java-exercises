package GroceryList;

import util.Input;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class listApp {


    public static void main(String[] args) {
        Input input = new Input();

        ArrayList<String> groceryCat = new ArrayList<>();
        groceryCat.add("meat");
        groceryCat.add("produce");
        groceryCat.add("dairy");
        groceryCat.add("bakery");

        HashMap<String, Integer> groceryList = new HashMap<>();


        boolean createList = input.yesNo("Would you like to create a grocery list?");
        boolean confirm = true;

        if (createList) {

            boolean newItem = input.yesNo("Would you like to enter a new Item?");
            if (newItem) {
                Collections.sort(groceryCat);
                boolean doAgain = true;
                while (doAgain) {
                    String userCat = input.getString("Choose a category: " + groceryCat + "or type exit if your done.");

                    switch (userCat) {
                        case "meat":
                            String meatInput = input.getString("Enter the name of the item");
                            Integer meatCount = input.getInt("How many?");
                            groceryList.put(meatInput, meatCount);
                            break;

                        case "produce":
                            String produceInput = input.getString("Enter the name of the item");
                            Integer produceCount = input.getInt("How many?");
                            groceryList.put(produceInput, produceCount);
                            break;

                        case "dairy":
                            String itemInput = input.getString("Enter the name of the item");
                            Integer itemCount = input.getInt("How many?");
                            groceryList.put(itemInput, itemCount);
                            break;
                        case "bakery":
                            String bakeryInput = input.getString("Enter the name of the item");
                            Integer bakeryCount = input.getInt("How many?");
                            groceryList.put(bakeryInput, bakeryCount);
                            break;
                        case "exit":
                            System.out.println("Here is your list : \n" + groceryList);
                            doAgain = false;
                            break;
                        default:
                            System.out.println("That's a strange category.");
                    }
                }

            } else {
                System.out.println("Okay, take care!");
            }
        } else {
            System.out.println("Okay, Have a Good day!");

        }

    }
}
