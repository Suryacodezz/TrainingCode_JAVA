package innerclasses;

import java.time.LocalDate;

public class Exam {
    void evaluate(int marks){
        class GradeCalculator{
            String calcualte(){
                if(marks>=75) return "distinction";
                else if (marks>=60) return "first class";
                else return "pass";
                }
            }
        GradeCalculator gc=new GradeCalculator();
        System.out.println(gc.calcualte());
    }
        void displayExamDate(){
            LocalDate date=LocalDate.now();
            System.out.println("the exa date is:"+date);
        }
        public static void main(String[] args) {
            Exam exam=new Exam();
            exam.evaluate(67);
            exam.evaluate(88);
            exam.displayExamDate();
        }
    }
/*
   - grade logic is scoped to the "evaluate" method
   - it avoids polluting the class with healper methods
   - it helps in designing the codebase in a clenaer way
 */
