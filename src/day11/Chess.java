package day11;

public class Chess {
    public static void main(String[] args) {
        String coordinates="a1";
        int a=(int)coordinates.charAt(0);
        int b=(int)coordinates.charAt(1);
        if((a+b)%2==1){
            System.out.println(true);
        }
        System.out.println(false);
    }
}