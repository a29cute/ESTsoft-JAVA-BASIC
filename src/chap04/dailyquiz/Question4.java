package chap04.dailyquiz;

public class Question4 {
    public static void main(String args[]) {
        int n = 64; int k = 6;
        int food = 12000;
        int juice = 2000;
        int result = 0;

        if(n>=10){
            result = (food*n)+(juice*k);
            result -= juice*(n/10);
        } else {
            result = (food*n)+(juice*k);
        }

        System.out.println(result);
    }
}
