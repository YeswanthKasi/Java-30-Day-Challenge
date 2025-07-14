public class Grading_System {
    public static void main(String[] args) {
        int marks = 91;
        String grade = "";
        if (marks>=90) {
            grade = "A+";
        }
        else if (marks>=75) {
            grade = "A";
        }
        System.out.println("\nThe grade is "+grade);

    }
    
}
