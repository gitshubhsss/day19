public class clearLastIthBit {

    public static int clearLastBits(int n,int i){
        //prepare the bit mask
        int bitmaks=(~0<<i);
        int result=n&bitmaks;
        return result;
    }
    public static void main(String[] args) {
        int n=15;
        int i=2;
        System.out.println(clearLastBits(n,i));;
    }
}
