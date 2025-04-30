package HomeWork3;
import java.util.Scanner;

class Student {
    String name; //학생의 이름 필드를 정의
    int age; // 학생의 나이 필드를 정의
    float score; //학생의 성적 필드를 정의

    Student(String name, int age, float score) { //생성자 정의
        this.name = name ;
        this.age = age;
        this.score = score ;
    }

    String getName (){
        return name;
    }
    int getAge(){
        return age;
    }
    float getScore(){
        return score;
    }

    void printInfo(){
        System.out.println("이름 : " + name + "나이 : " + age + "성적 : " + score); //입력 받은 이름, 나이, 성적 출력하는 메소드
    }

}

class StudentManager{
    Student[] students ; //필드 정의
    int count ; //필드 정의

    StudentManager(int size){
        students = new Student[size];
        count = 0;

    } //생성자 정의

    public void addStudent(String name, int age, float score){
        if(count < students.length){
            students[count] = new Student(name, age, score);
                count+= 1;
            }
            else{
                System.out.print("학생 추가 불가능");
            }

    }

    public void printAllStudents(){
        for(int i = 0 ; i < count ; i++){
            students[i].printInfo();
        }
    }

    public void printAvgScore(){
        float sum = 0;
        for(int i = 0 ; i < count ; i++){
            sum += students[i].getScore();
        }
        sum /= (float)count;
        System.out.println(sum);
    }

    public void printTopStudent(){
        int max=0;
        for (int i = 1 ; i < count ; i++) {
            if (students[0].getScore() < students[i].getScore()) {
                max = i;
            } else {
                students[0].printInfo();
            }
            //최고 점수 정보 출력
        }
        students[max].printInfo();
    }
}

public class Main {
    public static void main(String[] args){
        StudentManager studentManager = new StudentManager(10);
        Scanner sc = new Scanner(System.in);

        System.out.println("1.학생 정보 추가");
        System.out.println("2.전체 학생 정보 출력");
        System.out.println("3.평균 성적 계산 및 출력");
        System.out.println("4.최고 성적 학생 정보 출력");
        System.out.println("5.종료");

        for (;;){
            System.out.print("메뉴를 입력해주세요 : ");
            int input = sc.nextInt();
            if (input == 1){
                System.out.println("학생 정보 추가");
                System.out.print("이름 : ");
                String name = sc.next();

                System.out.print("나이 : ");
                int age = sc.nextInt();

                System.out.print("성적 : ");
                float score = sc.nextInt();
                studentManager.addStudent(name, age, score);

            }

            else if (input == 2){
                System.out.println("전체 학생 정보 : ");
                studentManager.printAllStudents();
            }

            else if (input == 3){
                System.out.print("평균 성적 계산 및 출력 : ");
                studentManager.printAvgScore();

            }

            else if (input == 4){
                System.out.print("최고 성적 학생 정보 출력 : ");
                studentManager.printTopStudent();
            }

            else if (input == 5){
                System.out.print("종료");
                break;
            }
            else {
                System.out.println("제대로된 숫자를 입력해주세요.");
            }
        }
    }
}

