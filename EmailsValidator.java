import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailsValidator {
    public static void main(String[] args) {

        List<String> emails = new ArrayList<>();
        // Valid emails
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");

        // Invalid emails
        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emails.add(".abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc@%*.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@abc@gmail.com");
        // emails.add("abc@gmail.com.1a");
        // emails.add("abc@gmail.com.aa.au");

        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,6}$";

        Pattern pattern = Pattern.compile(regex);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " : " + matcher.matches());
        }

    }
}
