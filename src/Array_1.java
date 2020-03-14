import java.util.Arrays;

public class Array_1 {

    public static void printArray(int[] array) {
        System.out.print("Custom loop Array2 [");
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if (i < array.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void reverse(int[] array){
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {

         //Array declarations
        int[] array1 = new int[3];
        int[] array2 = {70, 6, 11};

        //First array1 status
        System.out.println("First Array1 "+Arrays.toString(array1));
        //Filling array by manual
        array1[0] = 32;
        array1[1] = 5;
        array1[2] = 10;
        System.out.println("Manual Array1 "+Arrays.toString(array1));
        //Filling array by for
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }
        System.out.println("loop Array1 "+Arrays.toString(array1));
        System.out.println();
        System.out.println("Usual print Array2"+Arrays.toString(array2));
        printArray(array2);

        //sort array
        Arrays.sort(array2);
        System.out.println("Sorted array ");
        printArray(array2);

        //reverse array
        System.out.println("Reversed array ");
        reverse(array2);
        System.out.println("Usual print Array2"+Arrays.toString(array2));
        printArray(array2);
    }
}