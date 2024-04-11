public class MergeSortMain {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("sorting dengan merge sort");
        MergeSorting30 mSort = new MergeSorting30();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah Diurutkan");
        mSort.printArray(data);
    }
}
