package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L; // 리터럴은 기본 int형
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver = " + intValue);
    }
}
