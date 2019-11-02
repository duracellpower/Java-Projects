public class Sort {
    public static void main(String[] args) {
        int[] list = {0, 9, 4, 6, 2, 8, 5, 1, 7, 3};
        insertionsort(list);
        for (int value : list) System.out.print(value + " ");
    }

    public static void insertionsort(int list[]) {
        int n = list.length;
        for (int i = 1; i < n; i++) {   // erste Schleife, beginnt zu forderst und vergleicht immer 2 Zahlen
            int value = list[i];
            int j = i-1;  // wechselt die werte, sodass der kleinere links ist
            while ((j > -1) && (list[j] > value)){ // zweite Schleife, schaut retour, ob dort auch noch immer noch alles aufsteigend ist
                list [j+1] = list[j];
                j--; // wenn nicht, weird hier nun alles Vorherige auch wider getauscht, bis wieder alles absteigend ist
            }
            list[j+1]=value;
        }
    }
}



//for i = 1 to (length(A)-1)
//        value = A[i]
//        j = i
//        while (j > 0) and (A[j-1] > value)
//        A[j] = A[j - 1]
//        j = j-1
//        A[j] = value