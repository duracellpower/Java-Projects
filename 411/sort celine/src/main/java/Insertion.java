public class Insertion <E extends Comparable<E>> implements Sort<E>{

    public void sort(E[] list) {
        for (int i = 1; i < list.length; i++) {
            E value = list[i];
            int j = i;
            while ((j > 0) && (list[j - 1].compareTo(value)) > 0) {
                list[j] = list[j - 1];
                j--;
            }
            list[j] = value;
        }
    }
}
