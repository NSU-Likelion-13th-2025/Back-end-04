package HOMEWORK;

import java.util.Scanner;

class Student {
    protected String name;
    protected int[]scores;

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }
    public int sumScore() {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }
    public void printInfo(){
        int sum = sumScore();
        double avg= (double)sumScore()/scores.length;
        String grade;

        if (avg >= 90) {
            grade = "A";
        }
        else if(avg >= 80){
            grade = "B";
        }
        else if(avg >= 70){
            grade = "C";
        }
        else if(avg >= 60){
            grade = "D";
        }
        else {
            grade = "F";
        }
        System.out.println("이름: "+name);
        System.out.println("합계: "+sum);
        System.out.println("평균: "+avg);
        System.out.println("등급: "+grade);
    }

}

class GraduateStudent extends Student {
    private String subject;

    public GraduateStudent(String name, int[] scores,String subject) {
        super(name, scores);
        this.subject = subject;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("학과: "+subject);
    }
}
public class Main {
    public static void main(String[] args) {
        GraduateStudent graduateStudent = new GraduateStudent(
                "이준섭", new int[]{97,92,88},"컴퓨터소프트웨어학과"
        );
        graduateStudent.printInfo();

    }
}
