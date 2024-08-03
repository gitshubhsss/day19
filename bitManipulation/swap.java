public class swap {
    public static void main(String[] args) {
        int a = 3;
        int b = 15;
        
        a =  b | a;
        System.out.println("a : "+a);
        a=3;
        b = a & b ;
        System.out.println("b : "+b);
    }

}
