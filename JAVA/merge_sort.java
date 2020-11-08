import java.util.ArrayList;
import java.util.Arrays;

public class merge_sort {

    public static void merge (ArrayList<Integer> list1, Integer start1, Integer end1, Integer start2, Integer end2 ){

        ArrayList<Integer> temp = new ArrayList<>();

        Integer i = start1;
        Integer j = start2;

        while (i<= end1 && j <= end2){
            if (list1.get(i) < list1.get(j)){
                temp.add(list1.get(i));
                i++;
            }
            else if (list1.get(i) > list1.get(j)){
                temp.add(list1.get(j));
                j++;
            }
            else{
                temp.add(list1.get(i));
                temp.add(list1.get(j));
                i++; j++;
            }

        }

        while (i <= end1){
            temp.add(list1.get(i));
            i++;
        }
        while (j <= end2){
            temp.add(list1.get(j));
            j++;
        }

        Integer it_temp = 0;
        for(Integer k = start1; k <= end2; k++ ){
        list1.set(k, temp.get(it_temp
        ));
        it_temp++;}

    }

    public static void mergeSort(ArrayList<Integer> list1, Integer start, Integer end){
//        Integer start = 0;
//        Integer end = list1.size();

        if (start < end) {

            Integer mid;
            mid = (start + end) / 2;


            mergeSort(list1, start, mid);
            mergeSort(list1, mid + 1, end);
            merge(list1, start, mid, mid+1, end);
        }


    }

    public static void main (String[] args){
        ArrayList input_list = new ArrayList<Integer>(Arrays.asList(11,22,3,4,5,16,7,81,9));

        mergeSort(input_list, 0, input_list.size()-1);
        System.out.println(input_list);


    }
}
