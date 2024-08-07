import java.util.Scanner;

public class ValidateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pass = sc.nextLine();
        StringValidation(pass);
    }
    public static void StringValidation(String password){
        if (isValidString(password)){
            System.out.println("Approved");
        }else {
            System.out.println("Not approved");
        }
    }
    public static boolean isValidString(String password){
        return password.length() <= 20
                && !password.contains(" ")
                && Character.isUpperCase(password.charAt(0))
                && Character.isDigit(password.charAt(password.length() - 1));
        }
    }


