package chap04;

public class forloopExample5 {
    public static void main(String[] args) {
        /* 이중 for문 : 구구단(가로 출력)*/
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " * " + j + " = " + i*j + "\t");
            }
            System.out.println("\t");
        }
        /* 이중 for문 : 구구단(세로 출력)*/
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println("\t");
        }
    }
}
