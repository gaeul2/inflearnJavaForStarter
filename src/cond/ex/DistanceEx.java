package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 1;

        String what;

        if(distance <= 1){
            what = "도보";
        } else if(distance <= 10){
            what = "자전거";
        } else if (distance <= 100){
            what = "자동차";
        } else {
            what = "비행기";
        }
        System.out.println(what + "을 이용하세요.");
    }
}
