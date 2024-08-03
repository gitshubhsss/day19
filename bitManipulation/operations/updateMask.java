public class updateMask {

    public static int clearMask(int n,int i){
        //prepare the bitmask
        int bitmaks=1<<i;
        return n^bitmaks;
    }
    public static int setBit(int n,int i){
        //prepare the bitmask
        int bitmaks=1<<i;
        return n|bitmaks;
    }
    public static int updateMask(int n,int i,int newBit){
        // if(newBit==0){
        //    return clearMask(n, i);
        // }
        // else{
        //     return setBit(n, i);
        // }

        n=clearMask(n, i);

        int bitmaks=newBit<<i;
        return n|bitmaks;
        
    }
    public static void main(String[] args) {
        System.out.println(updateMask(10,1,1));
    }
}