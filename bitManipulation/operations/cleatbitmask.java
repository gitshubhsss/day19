public class cleatbitmask {

    public static int clearBit(int n, int clearBit_index_number) {
        // prepare the bitmask

        int bitmaks = 1 << clearBit_index_number;
        return n ^ bitmaks;
    }

    public static void main(String[] args) {
        int n = 10;
        int clearBit_index_number = 1;

        System.out.println(
                clearBit(n, clearBit_index_number));
        ;
    }
}
