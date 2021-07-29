public class QuickSort {

    public static void main(String[] args) {

        int[] inputArray = new int[] { 1, 8, 6, 2, 4, 7, 3, 5 };
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
        }
        System.out.println(" ");

        int end = inputArray.length - 1;
        quickSort(inputArray, 0, end);
        System.out.println(" ");
        for (int j = 0; j < inputArray.length; j++) {
            System.out.print(inputArray[j]);
        }

    }

    static int[] quickSort(int[] inputArray, int start, int end) {

        // base condition
        if (start < end) {

            int pIndex = partition(inputArray, start, end);

            quickSort(inputArray, start, pIndex - 1);
            quickSort(inputArray, pIndex + 1, end);

        }
        return inputArray;
    }

    static int partition(int[] inputArray, int start, int end) {
        int pivot = end;
        int pIndex = start;
        for (int i = start; i < end; i++) {

            if (inputArray[i] <= inputArray[pivot]) {
                swap(inputArray, i, pIndex);
                pIndex++;
            }

        }
        swap(inputArray, pivot, pIndex);
        return pIndex;
    }

    static int[] swap(int[] inputArray, int index, int pIndex) {
        System.out.println(index + " " + pIndex);
        int temp = inputArray[index];
        inputArray[index] = inputArray[pIndex];
        inputArray[pIndex] = temp;
        return inputArray;
    }

}