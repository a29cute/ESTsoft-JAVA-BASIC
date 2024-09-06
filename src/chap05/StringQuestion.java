package chap05;

public class StringQuestion {
    public static void main(String[] args) {
        /**
         * Q1. "aaaabbccd"문자열 한 글자씩 출력하기
         */
        String str1 = "aaaabbccd";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
        /**
         * Q2. 단어 순서 뒤집기
         */
        String str2 = "Hello Welcome Java";
        String[] words = str2.split(" ");
        String temp = words[0];
        words[0] = words[2];
        words[2] = temp;
        String result = String.join(" ", words);
        System.out.println(result);

        /**
         * Q3. 공백 제외해서 하나의 문자로 출력
         */
        String str3 = "   Hello Welcome Java   ";
        System.out.println(str3.replace(" ", ""));

        /**
         * Q4. 연속된 문자의 반복 횟수로 문자열 압축해보기
         */
        String str4 = "aaaabbccd";//String str4 = "a4b2c2d1";


        StringBuilder builder = new StringBuilder();
        int count = 0; // 연속된 문자 저장
        char current = str4.charAt(0); // 현재 분석 중인 문자 저장

        for (int i = 0; i < str4.length(); i++) {
            if(current == str4.charAt(i)) { //현재 문자가 str의 i번째와 같다면?
                count++; // 같은 문자의 갯수 카운트 증가
            } else { // 현재문자가 str의 i와 다르면?
              builder.append(current).append(count);
              current = str4.charAt(i); // 새로운 문자로 업데이트
                count = 1; // 새로운 문자의 개수 초기화
            }
        }
        builder.append(current).append(count);
        System.out.println(builder.toString());
    }
}
