package loop;

public class Continue1 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 5) {
            if (num == 3) {
                num++;
                continue;
            }
            System.out.println("num =" + num);
            num++;
        }
    }
}
