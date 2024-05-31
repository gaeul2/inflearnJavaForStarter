package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 1;
//        while (i < 3){
//            System.out.println("현재 숫자는 : " + i);
//            i++;
//        }

        do { // 이거 먼저 실행하고 그다음 조건확인. 조건이 true면 do 실행
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while (i < 3);
    }
}
