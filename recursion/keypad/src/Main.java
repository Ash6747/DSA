import java.util.Scanner;
public class Main {

    public static String keypadchar(int n){
        if(n == 2){
            return "abc";
        }
        if(n == 3){
            return "def";
        }
        if(n == 4){
            return "ghi";
        }
        if(n == 5){
            return "jkl";
        }
        if(n == 6){
            return "mno";
        }
        if(n == 7){
            return "pqrs";
        }
        if(n == 8){
            return "tuv";
        }
        if(n == 9){
            return "wxyz";
        }
        return "";

    }
    public static String[] keypad(int n){
        if(n == 0){
            String[] output =new String[1];
            output[0]="";
            return output;
        }
        String[] newout = keypad(n/10);
        String lastchar = keypadchar(n%10);
        String[] output = new String[newout.length * lastchar.length()];
        int k= 0;
        for(int i =0 ; i<newout.length ; i++){
            for(int j =0 ; j<lastchar.length() ; j++){
                output[k]= newout[i] + lastchar.charAt(j);
                k++;
            }
        }
        return output;



    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int input = s.nextInt();
        String[] output = keypad(input);
        for(String outputString: output) {
            System.out.println(outputString);
        }
    }
}