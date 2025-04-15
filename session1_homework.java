public class session1_homework {
    public static void main(String[] args) {
        int score[] = new int[]{85, 92, 78, 65, 55, 90, 73, 88, 47, 100};
        int i, best = 0, worst = 0;
        float avg = 0, sum = 0;

        System.out.println("학생 성적 결과");
        for (i = 0; i < score.length; i++) {
            if (score[i] > 100 || score[i] < 0) {
                System.out.println("입력할 수 없는 점수입니다.");
                continue;
            } // 100점 초과, 0점 미만의 점수는 오류 메시지

            else if (score[i] >= 90) {
                System.out.println("학생 " + (i + 1) + ": 성적 = " + score[i] + " 평가 = A, 합격"); //A성적 출력
                sum += score[i]; //평균 점수를 위한 수 더하기
                best = score[i]; // 최고 점수 저장
                if (score[i] >= best) {
                    best = score[i]; //최고 점수 갱신 및 저장
                }
                for ( int j = i ; j < score.length; j++) {
                    if (score[i] == 100) {
                        System.out.println("최고 점수 " + score[i] + "점 발견! 더 이상 최고 점수를 찾지 않습니다.");
                        break;
                    }
                } //100점을 발견하면 더 이상 최고점수를 찾지 않기 위한 반복문

            } else if (score[i] >= 80) {
                System.out.println("학생 " + (i + 1) + ": 성적 = " + score[i] + " 평가 = B, 합격"); //B성적 출력
                sum += score[i];

            } else if (score[i] >= 70) {
                System.out.println("학생 " + (i + 1) + ": 성적 = " + score[i] + " 평가 = C, 합격"); //C성적 출력
                sum += score[i];
            } else if (score[i] >= 60) {
                System.out.println("학생 " + (i + 1) + ": 성적 = " + score[i] + " 평가 = D, 합격");//D성적 출력
                sum += score[i];
            } else if (score[i] < 60) {
                System.out.println("학생 " + (i + 1) + ": 성적 = " + score[i] + " 평가 = F, 불합격");//F성적 출력
                sum += score[i];
                worst = score[i]; //최저 점수 저장을 위한 변수

                if (score[i] <= worst) {
                    worst = score[i]; //최저 점수 갱신 및 저장
                }
            }
            avg = sum / score.length; //평균 점수 계산
        }
        System.out.printf("전체 성적 평균: %.2f\n", avg); //평균 점수 출력
        System.out.println("최고 점수: " + best); //최고 점수 출력
        System.out.println("최저 점수: " + worst); //최저 점수 출력
    }
}