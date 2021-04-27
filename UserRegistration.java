import java.util.Scanner;

/**
 * UserRegistration
 */
public class UserRegistration {

    public static boolean validateFirstName(String name) {
        String expression = "^[A-Z]{1}[a-zA-Z]{2,}";
        if (name.matches(expression)) {
            System.out.println("'" + name + "'" + " validation success !");
            return true;
        } else {
            System.out.println("'" + name + "'" + " Invalid Input ");
            return false;
        }

    }

    public static boolean validateLastName(String name) {
        String expression = "^[A-Z]{1}[a-zA-Z]{2,}";
        if (name.matches(expression)) {
            System.out.println("'" + name + "'" + " validation success !");
            return true;
        } else {
            System.out.println("'" + name + "'" + " Invalid Input ");
            return false;
        }
    }

    public static boolean validateEmail(String mail) {
        String emailExp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z.-]+$";

        if (mail.matches(emailExp)) {
            System.out.println("'" + mail + "'" + " validation success !");
            return true;
        } else {
            System.out.println("'" + mail + "'" + " Invalid Input ");
            return false;
        }
    }

    public static boolean validateMobileNumber(String number) {
        String mobExp = "([0]{1}\\s|[+][9]{1}[1]{1}\\s)?[6-9]{1}[0-9]{9}";
        if (number.matches(mobExp)) {
            System.out.println("'" + number + "'" + " validation success !");
            return true;
        } else {
            System.out.println("'" + number + "'" + " Invalid Input ");
            return false;
        }
    }

    public static boolean validatePassword(String password) {
        String passwordExp1 = "[a-zA-Z]{8,}"; // password should have minimum 8 characters

        if (password.matches(passwordExp1)) {
            System.out.println("'" + password + "'" + " validation success !");
            return true;
        } else {
            System.out.println("'" + password + "'" + " Invalid Input ");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Project ");
        Scanner scan = new Scanner(System.in);
        // First Name
        System.out.println("Enter First name ");
        String first_name = scan.nextLine();
        System.out.println(validateFirstName(first_name));
        // Last Name
        System.out.println("Enter Last name ");
        String last_name = scan.nextLine();
        System.out.println(validateLastName(last_name));
        // Email
        System.out.println("Enter Mail address");
        String email = scan.nextLine();
        System.out.println(validateEmail(email));
        // Mobile No
        System.out.println("Enter Mobile Number");
        String mobileNo = scan.nextLine();
        System.out.println(validateMobileNumber(mobileNo));
        // Password
        System.out.println("Enter Password");
        String password = scan.nextLine();
        System.out.println(validatePassword(password));

        scan.close();
    }
}