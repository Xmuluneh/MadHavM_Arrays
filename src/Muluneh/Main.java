package Muluneh;

public class Main {

    public static void main(String[] args) {

        System.out.println(madHav(new int[]{2, 1, 1}));
        System.out.println(madHav(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(madHav(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(madHav(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(madHav(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(madHav(new int[]{3, 1, 2, 3, 0}));
    }

    static int madHav(int[] a) {
        int k = 1;
        int isMadHav = 0;
        while (k < a.length) {
            int len = a.length * (a.length + 1) / 2;
            if (len == a.length) {
                isMadHav = 1;
                break;
            }
            k++;
        }
        if (isMadHav == 0) {
            return 0;
        }
        int i = 0;
        int loop = 1;
        while (i < a.length) {
            int inLoop = loop;
            int sum = 0;
            while (inLoop > 0) {
                sum += a[i++];
                inLoop--;
            }
            if (sum != a[0]) {
                return 0;
            }
            loop++;
        }
        return 1;
    }
}
