package series.serie2;

public class Utils {

    public static int median(int[] v, int l, int r) {
        //throw new UnsupportedOperationException();
        if(v.length > 1)
            v = quickSort(v);
        int mid = (r-l)/2;
        if( (r-l+1)%2==0 ){
            return (v[mid]+v[mid+1])/2;
        }
        return v[mid];
    }

    private static int[] quickSort(int[] a, int l, int r){
        if(l >= r)
            return a;
        int wall = l, aux;
        //right wall smaller than pivot, left bigger than pivot
        for (int i = l; i < r; i++) {
            if(a[i] < a[r]){
                aux = a[wall];
                a[wall] = a[i];
                a[i] = aux;
                wall++;
            }
        }
        //place pivot
        aux = a[wall];
        a[wall] = a[r];
        a[r] = aux;

        //sort left and right of wall
        quickSort(a, 0, wall-1);
        quickSort(a, wall+1, r);

        return a;
    }

    private static int[] quickSort(int[] a){
        return quickSort(a, 0, a.length-1);
    }


}
