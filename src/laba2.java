import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class laba2 {
    public static void main(String[] args) {
        String correct = "abcdefghijklmnopqrstuv18340";
        String regex = "^" + correct + "$"; // Добавили якоря ^ и $

        System.out.println("Введите строку:");
        try (Scanner scl = new Scanner(System.in))
        {
            String inputString = scl.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(inputString);

            if (matcher.matches()) {
                System.out.println("Строка соответствует шаблону");
            } else {
                System.out.println("Строка не соответствует шаблону");
            }
        }
    }
}