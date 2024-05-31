package loop.ex;


public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;

        while (true){
            sum += num;
            if (sum > 10){
                System.out.println("sum = " + sum);
                System.out.println( "num =" + num);
                break;
            }
            num++;
        }
    }
}
