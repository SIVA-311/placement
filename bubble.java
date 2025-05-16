public class bubble {
    public static void main(String[] args) {
        int[] vv = {5, 2, 9, 1, 8, 6};

        for (int i = 0; i < vv.length; i++) {
            for (int j = 0; j < vv.length - 1; j++) {
                if (vv[j] > vv[j + 1]) {

                    int temp = vv[j];
                    vv[j] = vv[j + 1];
                    vv[j + 1] = temp;
                }
            }
        }
        for (int num : vv) {
            System.out.print(num + " ");
        }
    }
}
