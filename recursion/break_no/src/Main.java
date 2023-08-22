public class Main {
    public static void staircase(int n){
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        String ans = "";
        staircase(n,1,"");
    }
    public static void staircase(int n, int i, String ans){

        if ( n == 0){
            System.out.println(ans);
        }else{
            while(i<=n){
                if(n-i >= 0)
                    staircase(n - i,i,ans+i+" ");
                else break;

                i++;
            }
        }



    }
    public static void main(String[] args) {
        int a= 4;
        staircase(a);
        System.out.println("Hello world!");
    }
}