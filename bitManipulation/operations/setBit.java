
public class setBit {
    public static void setBitValue(int n,int index){
        //prepare a bitmaks

        int bitmaks=1<<index;
        int result=n|bitmaks;
        System.out.println(result);
        
    }
    public static void main(String[] args) {
        int n=10;
        int index=2;
        setBitValue(n,index);
    }
}
