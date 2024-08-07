class Solution {
    public int print2largest(List<Integer> arr) {
        int largest = 0;
        int secondLargest = 0;

       
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > largest) {
                largest = arr.get(i);
            }
        }

      
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != largest && arr.get(i) > secondLargest) {
                secondLargest = arr.get(i);
            }
        }


        if (secondLargest == 0) {
            return -1; //
        }

        return secondLargest;
    }

       
    }
