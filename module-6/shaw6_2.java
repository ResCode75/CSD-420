// Rachel Shaw - 4/20/2024 - 6_2 Assignment 


import java.util.Comparator;


public class shaw6_2 {
    public static void main(String[] args) {
        //create array of Integers
        Integer arr[] = {5, 3, 4, 2, 7, 9, 6, 8, 1, 10};

        //print unsorted array
        printArray(arr);

        //send array to bubble sort method that extends comparable
        bubbleSort(arr);

        //create comparator object
        Comparator<Integer> compare = new CompareIntegers();
        //send array and comparator to bubbleSort
        bubbleSort(arr, compare);
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] list){
       
       
        //end loop condition
        boolean switchedThisTime = true;

        while (switchedThisTime){
            switchedThisTime = false;
            for (int i = 0; i < (list.length -1); i++){
                
                //if compareTo method returns positive number
                if (list[i].compareTo(list[i+1]) > 0){
            
                    switchedThisTime = true;
                    //save current value at index i
                    E temp = list[i];
                    //swap the values
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    
                    
                }
                
            }
           
        }
        System.out.println("Bubble Sorted list with Comparable:");
        printArray(list);
    }
    

    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator){
        boolean switchedThisTime = true;

        while (switchedThisTime){
            switchedThisTime = false;
            for (int i = 0; i < (list.length -1); i++){
                
                //if compare returns positive number
                if (comparator.compare(list[i], (list[i+1])) > 0){
                    switchedThisTime = true;
                    //save current value at index i
                    E temp = list[i];
                    //swap the values
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    
                    
                }
                
            }
           
        }
        System.out.println("Bubble Sorted list using a comparator:");
        printArray(list);
    }

    public static <E> void printArray(E[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print((array[i]) + ", ");
        }
        System.out.println();
    }
}

//Comparator that defines how list will be sorted
class CompareIntegers implements Comparator<Integer>{
    @Override
    public int compare(Integer int1, Integer int2){
        int result = int1.compareTo(int2);
        return result;
    }
    
}

