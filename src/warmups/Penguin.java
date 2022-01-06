package warmups;

public class Penguin {
    private String name;
    private int weight;
    private String species;
    private String sex;

    public static boolean canfly(){
    return false;
    }

    public static boolean areEvil(){
        return true;
    }

    public Penguin(){

    }

    public Penguin(String name, int weight, String species, String sex){
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.sex = sex;
    }


    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getSpecies() {
        return species;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  setWeight(int weight) {
        this.weight = weight;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        Penguin penguin1 = new Penguin();
        penguin1.setName("McPenguin");
        penguin1.setWeight(70);
        penguin1.setSpecies("turkey");
        penguin1.setSex("male");

        System.out.println(penguin1.getName() + " " + penguin1.getWeight()+ " " +penguin1.getSpecies() + " " + penguin1.getSex());

    }
}
