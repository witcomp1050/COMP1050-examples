public class Slide79 {
    static void doubleAll(int[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] *= 2;
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a;
        b[0] = 99;
        System.out.println(a[0]);
        
        doubleAll(a);
        System.out.println(a[1] + " " + a[2]);
        
        int[] c = a.clone();
        c[0] = 0;
        System.out.println(a[0] + " " + c[0]);
    }
}
