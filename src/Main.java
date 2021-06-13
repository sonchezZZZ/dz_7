import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String date = "";
        String email = " ";
        System.out.println("Print date");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            date = reader.readLine();
            System.out.println(checkDate(date));
            System.out.println("Print email");
            email = reader.readLine();
            System.out.println(checkEmail(email));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    first task
    public static boolean checkDate(String date) {
//        4 цифры > / > (от 01 до 09 или от 10 до 12) > / > от 0-9 или 10-19 или 20-29 или 30-31
        String regex = "[0-9]{4}\\/((0[1-9])|(1[0-2]))\\/(0[1-9]|[12][0-9]|3[01])\s([01][0-9]|2[0-4]):[0-5][0-9]";
        boolean matches = date.matches(regex);
        return matches;
    }

    //    second task
    public static String checkEmail(String email) {
        String regex = "@(.*\\..*)";
        String domen = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            domen = matcher.group(1);
        }
        return domen;
    }
}
