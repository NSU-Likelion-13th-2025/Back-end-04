package Homework4;

class  Student{
    String name;
    int Scores[] ;

    Student(String name, int Scores[]){
        this.name = name;
        this.Scores = Scores;
    }

    public int sumScore() {
        int sum = 0;
        for (int i = 0 ; i < Scores.length ; i++) {
            sum += Scores[i];
        }
        return sum;
    }

    void printInfo(){
        int sum = sumScore();

        System.out.println("학생 이름: " + name);
        System.out.println("점수 합계: " + sum);
        if( sum/Scores.length >= 90){
            System.out.println("등급 : A");
        }
        else if (sum/Scores.length >= 80){
            System.out.println("등급 : B");
        }
        else if (sum/Scores.length >= 70){
            System.out.println("등급 : C");
        }
        else if (sum/Scores.length >= 60){
             System.out.println("등급 : D");
        }
        else{
            System.out.println("등급 : F");
        }
    }
}

class GraduateStudent extends Student{
    String subject;
    GraduateStudent(String name,int Scores[] ,String subject){
        super(name, Scores);
        this.subject = subject;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("학과 : "+subject);
    }
}
public class Main {
    public static void main(String[] args) {
        GraduateStudent graduateStudent = new GraduateStudent("한상훈", new int[]{95,92,85},"지능정보통신공학");
        graduateStudent.printInfo();
    }
}
