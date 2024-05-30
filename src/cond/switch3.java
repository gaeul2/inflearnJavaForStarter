package cond;

public class switch3 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2: //break없으면 다음꺼로 넘어감
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }

        System.out.println(coupon);
    }

}
