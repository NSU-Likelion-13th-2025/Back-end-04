package HomeWork3;
import java.util.Scanner;

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
            int input = sc.nextInt(); //숫자 입력, 몇 번째 메뉴를 입력할지
            if (input == 1){
                System.out.println("학생 정보 추가");
                System.out.print("이름 : ");
                String name = sc.next(); //이름 입력

                System.out.print("나이 : ");
                int age = sc.nextInt(); //나이 입력

                System.out.print("성적 : ");
                float score = sc.nextInt(); //성적 입력

                studentManager.addStudent(name, age, score); //입력받은 이름,나이,성적 저장
            } //1을 입력 받았을 때, 학생의 이름,나이,성적을 입력 받아 저장

            else if (input == 2){
                System.out.println("전체 학생 정보 : ");
                studentManager.printAllStudents();
            } //2를 입력 받았을 떄, 입력 받은 모든 학생들의 정보 출력

            else if (input == 3){
                System.out.print("평균 성적 계산 및 출력 :");
                studentManager.printAvgScore();
            } //3을 입력 받았을 때, 입력 받은 학생들의 평균 점수를 계산하여 출력
            else if (input == 4){
                System.out.println("최고 성적 학생 정보 출력");
                studentManager.printTopStudent();
            } //4를 입력 받았을 때, 입력 받은 모든 학생들의 점수를 비교하여 최고 점수 학생 출력

            else if (input == 5){
                System.out.print("종료");
                break;
            } //5를 입력했을 떄 종료
            else {
                System.out.println("제대로된 숫자를 입력해주세요.");
            } //이외의 숫자를 입력 받았을 때, 다시 입력을 위한 안내문 출력
        }
    }
}

