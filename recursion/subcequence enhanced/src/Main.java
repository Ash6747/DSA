import java.util.Scanner;
public class Main {

    public static void keypad(String input,String sub){
        if(input.length() == 0){
            System.out.println(sub);
            return;
        }
        String out = input.substring(1);
        keypad(out,sub);
        keypad(out,sub+ input.charAt(0));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter");
        String input = s.next();
        keypad(input,"");

    }
}