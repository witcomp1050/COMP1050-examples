public class Slide22 {
    static int find(int[] sorted, int target, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (sorted[mid] == target) return mid;
        if (sorted[mid] < target) return find(sorted, target, mid + 1, high);
        return find(sorted, target, low, mid - 1);
    }
    public static void main(String[] args) {
        int[] sorted = {3, 8, 15, 20, 42};
        System.out.println(find(sorted, 20, 0, sorted.length - 1));
        System.out.println(find(sorted, 7, 0, sorted.length - 1));
        System.out.println(find(sorted, 3, 0, sorted.length - 1));
    }
}
