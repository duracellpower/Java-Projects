public class Sort {
    public static void main(String[] args) {
        int[] list = {0, 9, 4, 6, 2, 8, 5, 1, 7, 3};
        //insertionsort(list);
        bubblesort(list);
        for (int value : list) System.out.print(value + " ");
    }

 //   public static void insertionsort(int list[]) {
 //       int n = list.length;
 //       for (int i = 1; i < n; i++) {   // erste Schleife, beginnt zu forderst und vergleicht immer 2 Zahlen
 //           int value = list[i];
 //           int j = i - 1;  // wechselt die werte, sodass der kleinere links ist
 //           while ((j > -1) && (list[j] > value)) { // zweite Schleife, schaut retour, ob dort auch noch immer noch alles aufsteigend ist
 //               list[j + 1] = list[j];
 //               j--; // wenn nicht, weird hier nun alles Vorherige auch wider getauscht, bis wieder alles absteigend ist
 //           }
 //           list[j + 1] = value;
 //       }
 //   }

    public static void bubblesort(int list[]) {

        for (int j = list.length; j > 1; --j) {
            for (int i = 0; i < j-1; ++i) {
                if (list[i] > (list[i+1])) {
                    int temp = list[i];
                    list[i]= list[i+1];
                    list[i+1] = temp;
                }
            }
        }
    }
}


