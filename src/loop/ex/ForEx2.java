package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        int count = 1;
        for (int num = 2; ; num+=2){
            System.out.println(num);
            if(count == 10){
                break;
            }
            count++;
        }
    }
}
