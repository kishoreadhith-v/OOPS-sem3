package exp10;

/**
 * InnerStudentTest
 */

class InvalidRegNoException extends Exception {
    InvalidRegNoException(){
        super("Registration Number should not exceed 6 characters");
    }
}

class MarkOutOfBoundsException extends Exception {
    MarkOutOfBoundsException(){
        super("Mark should be between 0 and 100");
    }
}

class Student {
    String name, regNo;
    int mark1, mark2, mark3, total;
    float avg;
    Student(String name, String regNo){
        this.name = name;
        try {
            if (regNo.length() > 6) {
            throw new InvalidRegNoException();
            } else {
                this.regNo = regNo;
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    } 
    public void inputMarks(int mark1, int mark2, int mark3){
        try {
            if (mark1 > 100 || mark2 > 100 || mark3 > 100 || mark1*mark2*mark3 < 0) {
                throw new MarkOutOfBoundsException();
            } else {
                this.mark1 = mark1;
                this.mark2 = mark2;
                this.mark3 = mark3;
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    public void calculateTotal(){
        total = mark1 + mark2 + mark3;
    }

    public void calculateAverage(){
        avg = total/3;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Kishore", "22z23200");
        s1.inputMarks(101, 100, 100);
        s1.calculateTotal();
        s1.calculateAverage();
        System.out.println("Total: " + s1.total);
        System.out.println("Average: " + s1.avg);
    }
}
