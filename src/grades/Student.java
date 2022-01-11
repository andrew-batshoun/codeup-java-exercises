package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, int grades) {
        this.name = name;
        this.grades.add(grades);
    }

    public Student(String name){
        this.name = name;
    }

    public Student(){

    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        for(float grade: grades){
            sum += grade;
        }
        return sum /grades.size();
    }

    public static void main(String[] args) {
        Student bobby = new Student("Bobby");
        bobby.addGrade(85);
        bobby.addGrade(88);
        bobby.addGrade(86);
        bobby.addGrade(90);
        System.out.println(bobby.grades);
        System.out.printf("%n%.2f%n", bobby.getGradeAverage());

    }
}
