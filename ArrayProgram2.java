public class ArrayProgram2 {
    public static void rotateLeft(int array[], int d, int n) {
        for (int i = 0; i < d; i++)
            rotateArrayByOne(array, n);
    }

    public static void rotateArrayByOne(int array[], int n) {
        int i, temp;
        temp = array[0];
        for (i = 0; i < n - 1; i++)
            array[i] = array[i + 1];
        array[i] = temp;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};
        int r = 1;
        int n = array.length;
        System.out.println("Array before rotation");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "");
        }
        System.out.println();
        rotateLeft(array, r, n);
        System.out.println("array after rotation");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "");
        }
    }
}
