public class Bubble<E extends Comparable<E>> implements Sort<E> {

    public void sort(E[] list) {
        for (int n = list.length; n > 1; --n) {
            for (int i = 0; i < n - 1; ++i) {
                if (list[i].compareTo(list[i + 1]) > 0) {
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }
}
