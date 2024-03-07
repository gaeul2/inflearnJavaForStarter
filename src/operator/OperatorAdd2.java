package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        //전위 증감연산자
        b = ++a; //a의 값을 먼저 증가시키고
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("======================================");

        a = 1;
        b = 0;
        //후위증감연산자
        b = a++; //a의 현재 값을 b에 먼저 대입하고, 그 후 a값을 증가 (++이 제일마지막에 실행된다)
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
