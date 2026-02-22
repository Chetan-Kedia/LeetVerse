class Student{

    char grade = 'O' ;
    private int marks = 99;   // Data hiding

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class Encapsulationn {

    public static void main(String[] args) {

        Student s = new Student();
        System.out.println("Grade : "+ s.grade);
        s.grade = 'E' ;
        System.out.println("Grade : "+ s.grade);
        System.out.println("Marks : +"+  s.getMarks());
         //s.marks = 90 ;
        s.setMarks(85);
        System.out.println("Marks : " + s.getMarks());
    }
}