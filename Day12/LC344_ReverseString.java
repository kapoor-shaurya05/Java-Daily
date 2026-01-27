public class LC344_ReverseString{
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;

        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        LC344_ReverseString obj = new LC344_ReverseString();
        obj.reverseString(s);
        System.out.println(s);
    }
}