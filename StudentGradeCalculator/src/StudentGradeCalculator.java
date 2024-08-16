import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");

        Float[] marks=new Float[5];

        for(int i=0;i<5;i++){
            System.out.println("Subject"+(i+1)+":");
            marks[i]= scanner.nextFloat();
        }

        float totalMarks=0;
        for(float mark:marks){ 
            totalMarks+=mark;
        }

        double percentageAverage=totalMarks/marks.length;

        String grade;
        if (percentageAverage >=80){
            grade="A";
        } else if (percentageAverage>=70) {
            grade="B";
        } else if (percentageAverage>=55) {
            grade="C";
        } else if (percentageAverage>=40) {
            grade="D";
        }else {
            grade="E";
        }


        System.out.println("Total marks:"+ totalMarks);
        System.out.println("Average mark(%):"+ percentageAverage);
        System.out.println("Grade:"+grade);

    }
}