public class getBit {

    public static void getBitData(int n,int index){
        int bitMask=n>>index;

        int result=bitMask&1;
        System.out.println(result);
    }
    public static void main(String[] args) {
        int n=10;
        int index=2;

        getBitData(n, index);
    }
}
