//Input an email from the user. Now print a username from the email by deleting the part after "@".
import java.util.*;
public class printUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        StringBuilder sb = new StringBuilder(email);

        int removeAfter = email.indexOf('@');
        sb.delete(removeAfter , sb.length());
        System.out.println("Your username is: " + sb);
    }
}
