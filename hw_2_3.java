package hw_2;
/*Напишите метод, который принимает на вход строку (String) и определяет
является ли строка палиндромом (возвращает boolean значение).*/

public class hw_2_3 {
    public static boolean isPalindrome(String inputStr) {
        StringBuilder sb = new StringBuilder();
        sb.append(inputStr);
        if (inputStr.equals(sb.reverse().toString())) {
            return true;
        }   else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("qweewq"));
        System.out.println(isPalindrome("qwe ewq"));
        System.out.println(isPalindrome("qwe asf"));
    }
}
