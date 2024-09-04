package chap04;

public class SwitchExample {
    public static void main(String[] args) {
        String day = switch (args[0]) {
            case "월요일" -> "Start of the work week";
            case "금요일" -> "Almost weekend";
            default -> "Midweek";
        };

        System.out.println(day);
    }
}
