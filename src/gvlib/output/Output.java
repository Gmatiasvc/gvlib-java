package gvlib.output;
/*
 * GVlib output module
 DOC: This module has various methods to ease the printing to the console
 ? developer: Gerardo V.
 */
public class Output {

    public static void printArr(Object arr[]) {
        for (Object i : arr) {
            if (i == null) {
                break;
            }
            System.out.print(i + "  ");
        }
        System.out.println("");
    }

    public static void printArrVertical(Object arr[]) {
        for (Object i : arr) {
            if (i == null) {
                break;
            }
            System.out.println(i);
        }
    }

}
