import java.util.*;
public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Which position you want to check the bit: ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;

        //Get Bit 
        if((bitMask & num) == 0){
            System.out.println("Bit was 0");
        }
        else{
            System.out.println("Bit was 1");
        }

        //Set Bit 
        System.out.println("At wich position you want to set the bit (covert it to 1): ");
        int pos2 = sc.nextInt();
        int bitMask2 = 1 << pos2;
        int newNumber = bitMask2 | num;
        System.out.println("The new number after setting is:" + newNumber);

        //Clear Bit 
        System.out.println("At which position you want to clear the bit (convert it to 0): ");
        int pos3 = sc.nextInt();
        int bitMask3 = ~(1 << pos3);
        int newNumber2 = bitMask3 & num;
        System.out.println("The new number after clearing is: " + newNumber2);

        //Update Bit 
        System.out.println("At which position you want to update the bit: ");
        int pos4 = sc.nextInt();
        System.out.println("Enter the new bit value (0 or 1): ");
        int newBit = sc.nextInt(); 
        int bitMask4 = ~(1 << pos4);
        int clearedNumber = bitMask4 & num;
        int bitValue = newBit << pos4;
        int updatedNumber = clearedNumber | bitValue;
        System.out.println("The new number after updating is: " + updatedNumber);
    }
}
