package p1;
public class String7{

    public static void countLowerAndUpperCase(String str) {
        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            }
            else if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            }
        }
        System.out.println("Lowercase letters: " + lowerCaseCount);
        System.out.println("Uppercase letters: " + upperCaseCount);
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        countLowerAndUpperCase(str);
    }
}

