public class clearBitShraddhadi {
    public static int clearBitusingAnd(int n,int i){

        //prepare a mask
        int bitmaks=~(1<<i);
        return n&bitmaks;


    }
    public static void main(String[] args) {
        int n=10;
        int i=1;
        System.out.println(clearBitusingAnd(n, i));;
    }
}
