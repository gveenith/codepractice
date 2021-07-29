public class LinearIn {

    public static void main(String[] args) {

        int[] outer = new int[] { 1, 2, 4, 6 };
        int[] inner = new int[] { 2, 4 };

        int j = 0;
        for (int i = 0; i < outer.length && j < inner.length; i++) {

            System.out.println(i + "  outer Length:" + outer.length);
            System.out.println(j + "  inner Length:" + inner.length);
            System.out.println(outer[i] + " " + inner[j]);
            if (outer[i] == inner[j]) {
                j++;
            }
        }
        System.out.println(j == inner.length);
    }

}
