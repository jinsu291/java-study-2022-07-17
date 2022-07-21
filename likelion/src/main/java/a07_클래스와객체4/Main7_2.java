package a07_클래스와객체4;

// 문제 : 99단을 만들어주세요

public class Main7_2 {
    public static void main(String[] args) {
        new 구구단출력기().작동();
    }
    static class 구구단출력기 {
        void 작동() {
            int dan = 2;

            while ( dan <= 9 ) {
                System.out.println("== " + dan + "단 ==");

                int i = 1;

                while ( i <= 9 ) {
                    System.out.println(dan + " * " + i + " = " + dan * i);
                    i++;
                }

                dan++;
            }
    }
    }
}
