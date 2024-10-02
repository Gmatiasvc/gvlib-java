package gvlib.output;
/*
 * GVlib output module
 DOC: This module has various methods to ease the printing to the console
 ? developer: Gerardo V.
 */
public class ObjectArray {

    private static void Horizontal(Object arr[]) {
        for (Object i : arr) {
            if (i == null) {
                break;
            }
            System.out.print(i + "  ");
        }
        System.out.println("");
    }

    private static void ListNoNumbers(Object arr[]) {
        for (Object i : arr) {
            if (i == null) {
                break;
            }
            System.out.println(i);
        }
    }
    private static void List(Object arr[]) {
        for (Object i : arr) {
            if (i == null) {
                break;
            }
            System.out.print(i+". ");
            System.out.println(i);
        }
    }

    public static void printArray(Object arr[], int format){
        switch(format){
        case 1 ->{
            Horizontal(arr);
        }
        case 2 ->{
            ListNoNumbers(arr);
        }
        case 3 ->{
            List(arr);
        }
    }
    }
}
