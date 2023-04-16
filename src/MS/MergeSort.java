package MS;

public class MergeSort {

    // The merge function merges two sorted sub-arrays into one sorted array
    static void merge(int[] tableau, int debut, int milieu, int fin) {
        // Determine the size of the two sub-arrays to merge
        int taille1 = milieu - debut + 1;
        int taille2 = fin - milieu;

        // Create temporary arrays to store the elements of the two sub-arrays
        int[] gauche = new int[taille1];
        int[] droite = new int[taille2];

        // Copy the elements of the two sub-arrays into the corresponding temporary arrays
        for (int i = 0; i < taille1; i++)
            gauche[i] = tableau[debut + i];
        for (int j = 0; j < taille2; j++)
            droite[j] = tableau[milieu + 1 + j];

        // Merge the elements of the two sub-arrays into the final sorted array
        int i = 0, j = 0;
        int k = debut;
        while (i < taille1 && j < taille2) {
            if (gauche[i] <= droite[j]) {
                tableau[k] = gauche[i];
                i++;
            } else {
                tableau[k] = droite[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from the left array, if any remain
        while (i < taille1) {
            tableau[k] = gauche[i];
            i++;
            k++;
        }

        // Copier les éléments restants du tableau droit, s'il en reste
        while (j < taille2) {
            tableau[k] = droite[j];
            j++;
            k++;
        }
    }

    // Merge sort function
    public static void mergeSort(int[] tableau) {
        int n = tableau.length;
        int m = 1;
        while (m < n) {
            for (int i = 0; i < n - 1; i += 2*m) {
                int debut = i;
                int milieu = i + m - 1;
                int fin = Math.min(i + 2*m - 1, n - 1);
                merge(tableau, debut, milieu, fin);
            }
            m *= 2;
        }
    }
}
