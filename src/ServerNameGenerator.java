public class ServerNameGenerator {
    static String[] adj ={"charming","cruel","fantastic","gentle","huge","perfect","rough","sharp"};
   static String[] noun = {"mother","father","baby","child","toddler", "teenager","grandmother","student","teacher","computer"};

    public static String randomElement(String[] array){
//       int randomIndex = (int) (Math.random()*(array.length - 1) + 1);
       int randomIndex = (int) (Math.random()* array.length );

        return array[randomIndex];
    }

    public static void main(String[] args) {

            System.out.println("Here is your server name:");
            System.out.println(randomElement(adj) + "-" + randomElement(noun));


    }
}

