package chap03;

public class Question1 {
    public static void main(String[] args) {
        int num = 2;
        if(num%2==0){
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        System.out.println( num%2 == 0 ? "짝수":"홀수");

        int a = 3;
        int b = 6;
        int result = a >= b ? a : b;
        System.out.println(result);


        int score = 49;
        String pass = score >= 60 ? "합격" : "불합격";
        System.out.println(pass);

    }


}
