package chap04;

public class WhileLoop3 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 60) {
            i++;
            if(i % 3 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
