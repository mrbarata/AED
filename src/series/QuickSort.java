package series;

public class QuickSort {
    private static int[] quickSort(int[] a, int l, int r){
        if(l == r)
            return a;
        int wall = l, aux;
        //put smaller than pivot left of wall
        for(int i=l; i <= r; ++i)
            if(a[i] > a[r]) {
                aux = a[wall];
                a[wall] = a[i];
                a[i] = aux;
                wall++;
            }
        //put pivot in final place
        if(a[r] < a[wall]) {
            aux = a[wall];
            a[wall] = a[r];
            a[r] = aux;
        }

        //sort left of wall
        quickSort(a, 0, wall-1);
        //sort right of wall
        quickSort(a, wall+1, r);
        return a;
    }

    public static int[] quickSort(int[] a){
        return quickSort(a, 0, a.length-1);
    }
}
