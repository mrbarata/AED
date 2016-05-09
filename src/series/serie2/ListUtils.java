package series.serie2;

import java.util.Comparator;


public class ListUtils {


    public static <E> E getKBiggest(Node<E> list, int k, Comparator<E> cmp) {
        //throw new UnsupportedOperationException();
        Node<E> k_biggest = list;
        int cnt = 0;
        while(cnt < k && list != null){
            cnt++;
            list = list.next;
        }
        if(cnt != k || k < 1)  //list has less than k elements
            return null;

        while(list != null) {
            k_biggest = k_biggest.next;
            list = list.next;
        }
        return k_biggest.value;
    }

    public static <E> Node<E> merge(Node<E>[] lists, Comparator<E> cmp){
        throw new UnsupportedOperationException();
    }

    public static <E> void internalReverse(Node<Node<E>> list) {
       throw new UnsupportedOperationException();
   }

}
