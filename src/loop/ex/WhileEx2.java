package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;
        while (count <= 10){
            System.out.println(num);
            if(count == 10){
                break;
            }
            num+=2;
            count++;
        }
    }
}
