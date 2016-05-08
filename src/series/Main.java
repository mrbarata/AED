package series;

public class Main {
    public static void main(String[] args){
        int[] a = {0,3,2,5,1,4,7,6,8};
        printArr(a, "Unsorted");
        printArr(QuickSort.quickSort(a), "Sorted");
    }

    public static void printArr(int[] a, String name){
        System.out.print(name + ": ");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length-1]);
    }
}
