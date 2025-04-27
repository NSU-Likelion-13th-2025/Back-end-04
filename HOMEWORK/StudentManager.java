package HOMEWORK;

public class StudentManager {
    Student[] students;
    int count;

    public StudentManager(int size) {
        students = new Student[size];
        count = 0;
    }
    public void addStudent(String name, int age, float score) {
        if (count < students.length) {
            students[count] = new Student(name, age, score);
            count++;
        }
        else {
            System.out.println("더 이상 학생을 추가할수없음");
        }
    }

    public void printAllStudents() {
        if(count == 0) {
            System.out.println("등록한 학생이 없습니다.");
        }
        else{
            for (int i = 0; i < count; i++) {
                students[i].printInfo();
            }
        }
    }

    public void printAverageScore(){
        if (count == 0) {
            System.out.println("학생이 없습니다.");
            return;
        }
        float sum = 0;
        for (int i = 0; i < count; i++) {
            sum += students[i].score;
        }
        System.out.println("평균 성적: " + (sum/count));
    }

    public void printTopStudents() {
        if (count == 0) {
            System.out.println("학생이 없습니다.");
            return;
        }
        Student top = students[0];
        for (int i = 1; i < count; i++) {
            if (students[i].score > top.score) {
                top = students[i];
            }
        }
        System.out.print("최고 성적 학생: ");
        top.printInfo();

    }
}
