public class clearRange {
    public static int clearRangeOfBits(int n, int start, int end) {

        // find the bitmask form start to end will make all the values
        // form 2 to 7 to 0

        int a =(~0<<end);
        int b=(1>>start);

        return a|b;

        

    }

    public static void main(String[] args) {
        int n = 31;
        int start = 1;
        int end = 3;
        System.out.println(clearRangeOfBits(n, start, end));
    }
}
