package Lesson11;

public class SearchUtils {

    public static int LinearSeach(int[] array, int element){

        for (int i = 0; i < array.length; i++){
            if (array[i] == element){
                return i;

            }
        }
        return -1;
    }
    public static int binarySearch(int[] array, int element) {
        int start = 0;
        int end = array.length -1;
        int curentindex = end/2;
        int step = 0;

        while (start <= end){

            System.out.println("hag: " + ++step);

            int currentElement = array[ curentindex];
            if (currentElement == element){
                return curentindex;
            }else if (element < currentElement){
                end = curentindex -1;

            }else {
                start = curentindex +1;
            }
            curentindex = (start+end)/2;
        }
        return -1;
    }

    public static int jumpSearch(int[] array, int element){

        int jump = (int) Math.sqrt(array.length);
        int start = 0;
        int end = jump;


        while (end < array.length){

            if (array[end] > element) {
                break;
            }
            start = end +1;
            end = start+jump;
        }

        if (end >= array.length){
            end = array.length -1;

        }

        for (int i = start; i <= end; i++){
            if (array[i] == element){
                return i;
            }
            if (array[i]>element){
                break;
            }
        }
        return -1;

    }
}
