public class Eclips_new {
    public static void main(String[] args) {
        System.out.println(madHAv(new int[]{2, 1, 1}));
        System.out.println(madHAv(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(madHAv(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(madHAv(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(madHAv(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(madHAv(new int[]{3, 1, 2, 3, 0}));

    }

    static int madHAv(int[] a) {
        //check for validation
        //int k=a.length*(a.length+1)/2;
        int ismadhav = 0;
        int k = 1;
        while (k < a.length) {
            int temp = k * (k + 1) / 2;
            if (temp == a.length) {
                ismadhav = 1;
                break;
            }
            k++;
        }
        if (ismadhav == 0) {
            return 0;
        }
        int i = 0;
        int loop = 1;
        while (i < a.length) {
            int inloop = loop;
            int sum = 0;
            while (inloop > 0) {
                sum += a[i++];
                inloop--;
                //System.out.println(sum);
            }
            if (sum != a[0]) {
                return 0;
            }
            loop++;

        }
        return 1;

    }


}
