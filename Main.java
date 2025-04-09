public class Main {
    public static void main(String[] args) {
        int score[] = new int[]{85, 92, 78, 65, 55, 90, 73, 88, 47, 100};
        int sum = 0, i, best = 0, worst = 0;

        for (i = 0; i < score.length; i++){
            if (score[i] >= 90){
                System.out.println("학생 "+ (i+1) + ": 성적 = "+ score[i] + " 평가 = A, 합격");
                sum += score[i];
                best = score[i];

                if(score[i] == 100){
                    System.out.println("최고 점수 100점 발견 ! 더 이상 최고 점수를 찾지 않습니다.");
                    break;
                }

                if(score[i] >=best ){
                    best = score[i];
                }
            }

            else if (score[i] >= 80){
                System.out.println("학생 "+ (i+1) + ": 성적 = "+ score[i] + " 평가 = B, 합격");
                sum += score[i];
            }

            else if (score[i] >= 70){
                System.out.println("학생 "+ (i+1) + ": 성적 = "+ score[i] + " 평가 = C, 합격");
                sum += score[i];
            }

            else if (score[i] >= 60){
                System.out.println("학생 "+ (i+1) + ": 성적 = "+ score[i] + " 평가 = D, 합격");
                sum += score[i];
            }

            else if (score[i] < 60){
                System.out.println("학생 "+ (i+1) + ": 성적 = "+ score[i] + " 평가 = F, 불합격");
                sum += score[i];
                worst = score[i];

                if(score[i] <= worst ){
                    worst = score[i];
                }
            }
        }
        System.out.println("전체 성적 평균: "+ sum / score.length + "." + sum % score.length);
        System.out.println("최고 점수: "+ best);
        System.out.println("최저 점수: "+ worst);
    }
}