import java.util.*;
public class Strings {
    public static void main(String[] args) {
        //String Declaration
        //1st way 
        String str = "Shaurya";
        //2nd way
        String str2 = new String("Shaurya");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();

        String fullName = firstName + " " + lastName;
        System.out.println("Your full name is: " + fullName);

        //Accessing the characters of the string
         for(int i=0; i<fullName.length(); i++) {
           System.out.println(fullName.charAt(i));
        }


        //String Methods
        System.out.println(fullName.length());
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());

        String nonTrimmedName = "   " + fullName + "   ";
        System.out.println(nonTrimmedName);
        String trimmedName = nonTrimmedName.trim();
        System.out.println(trimmedName);

        System.out.println(fullName.substring(2 , 9)); //start-index is included , but the end-index is not.
        System.out.println(fullName.replace("al" , "i"));
        System.out.println(fullName.startsWith("Son"));
        System.out.println(fullName.endsWith("ya"));

        System.out.println(fullName.charAt(6));
        System.out.println(fullName.indexOf("r"));
        System.out.println(fullName.indexOf("a" , 3));
        System.out.println(fullName.lastIndexOf("o"));
        System.out.println(fullName.lastIndexOf("a" , 10));

        System.out.println(fullName.equals("Harshita")); //Case-sensitive
        System.out.println(fullName.equalsIgnoreCase("simranjeet")); //Not Case-sensitive 

        //parseInt() method
        String name1 = "24680";
        int name2 = Integer.parseInt(name1);
        System.out.println(name2);

        //Integer to String
        int num = 12345;
        String strNum = Integer.toString(num);
        System.out.println(strNum);
    }
}