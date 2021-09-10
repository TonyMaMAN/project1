public class charu {
    public static void main(String[] args) {
        int[] ins = {2, 3, 5, 1, 23, 6, 78, 34};
        for (int i = 1; i < ins.length; i++) {
            for (int j = i; j > 0; j--) {
                if (ins[j] < ins[j - 1]) {
                    int temp = ins[j - 1];
                    ins[j - 1] = ins[j];
                    ins[j] = temp;
                }
            }
        }

        for (int k = 0; k < ins.length; k++)
            System.out.println(ins[k]);
    }
}




