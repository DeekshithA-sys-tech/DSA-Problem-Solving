// removing duplicate from sorted array

import java.util.ArrayList;

public class RemoveDuplicate {
    // Brute Force approach
    // public static int removeDuplicates(int[] nums) {

    //     ArrayList<Integer> list = new ArrayList<>();

    //     for(int num : nums){

    //         int size = list.size();

    //         if(size < 2 ||
    //            num != list.get(size - 1) ||
    //            num != list.get(size - 2)){

    //             list.add(num);
    //         }
    //     }

    //     for(int i = 0; i < list.size(); i++){
    //         nums[i] = list.get(i);
    //     }

    //     return list.size();
    // }
    
    // optimal solution
        public static int removeDuplicates(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums){

            int size = list.size();

            if(size < 2 ||
               num != list.get(size - 1) ||
               num != list.get(size - 2)){

                list.add(num);
            }
        }

        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }

        return list.size();
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,2,3,3};
        int result = removeDuplicates(arr);
        System.out.println(result);

    }
}
