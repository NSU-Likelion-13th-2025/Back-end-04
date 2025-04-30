package HomeWork3;

public class StudentManager {
    Student[] students ; //필드 정의
    int count ; //필드 정의

    StudentManager(int size){
        students = new Student[size]; //학생 수 지정
        count = 0; // 입력 된 학생 수 카운트

    } //생성자 정의
    public void addStudent(String name, int age, float score){
        if(count < students.length){
            students[count] = new Student(name, age, score);
            count+= 1;
        } // 학생 정보 입력 했을 때 카운트 1 증가
        else{
            System.out.print("학생 추가 불가능");
        } // 지정한 학생 수 초과로 입력이 들어오면 거부함
    }
    public void printAllStudents(){
        for(int i = 0 ; i < count ; i++){
            students[i].printInfo(); //입력받은 학생 정보를 출력
        }
    }
    public void printAvgScore(){
        float sum = 0; //평균을 위한 합산 점수
        for(int i = 0 ; i < count ; i++){
            sum += students[i].getScore(); // 학생 점수를 더함
        }
        sum /= (float)count; //평균 계산 
        System.out.println(sum); //평균 출력
    }
    public void printTopStudent(){
        int max=0; //최고 점수를 받는 학생의 배열 번호
        for (int i = 1 ; i < count ; i++) {
            if (students[0].getScore() < students[i].getScore()) {
                max = i;
            }
            //최고 점수 정보 출력
        }
        students[max].printInfo(); //최고 점수 학생 정보 출력
    }
}
