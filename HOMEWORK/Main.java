package HOMEWORK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StudentManager manager = new StudentManager(100);

        while(true){
            ShowMenu();
            System.out.print("메뉴를 입력해주세요: ");
            int put = s.nextInt();

            switch(put){
                case 1:
                    System.out.print("이름: ");
                    String name = s.next();
                    System.out.print("나이: ");
                    int age = s.nextInt();
                    System.out.print("성적: ");
                    float score = s.nextFloat();
                    manager.addStudent(name, age, score);
                    break;
                case 2:
                    manager.printAllStudents();
                    break;
                case 3:
                    manager.printAverageScore();
                    break;
                case 4:
                    manager.printTopStudents();
                    break;
                default:
                    System.out.println("잘못된 숫자입니다.");
            }

        }
    }
    static void ShowMenu(){
        System.out.println("1. 학생정보추가");
        System.out.println("2. 전체 학생 정보 ");
        System.out.println("3. 평균성적");
        System.out.println("4. 최고 성적 학생");


    }
}
