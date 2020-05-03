
    class Program {
        public static void orderArrayASC(int[] array){

            for(int i=0; i<array.length-1;i++){
                for(int x=i;x<array.length;x++){
                    if(array[x]<array[i]){
                        int temp = array[i];
                        array[i] = array[x];
                        array[x] = temp;
                    }
                }
            }



            }





        public static int[] largestRange(int[] array) {
            orderArrayASC(array);

            int currentMaxRange=1;
            int rangeCounter = 1;
            int maxOfCurrentLargestRange=array[0];
            for(int i=0;i<array.length-1;i++){
                if(array[i+1]==array[i]){
                    continue;
                }

                if(array[i+1]==array[i]+1){
                    rangeCounter++;

                }
                if((array[i+1]!=array[i]+1)||(i==array.length-2)){
                    if(rangeCounter>currentMaxRange){
                        currentMaxRange = rangeCounter;
                        rangeCounter = 1;
                        maxOfCurrentLargestRange = array[i];
                        if(array[i+1]==array[i]+1){
                            maxOfCurrentLargestRange++;
                        }
                    }

                }


            }


            // Write your code here.
            return new int[]{(maxOfCurrentLargestRange-currentMaxRange)+1, maxOfCurrentLargestRange};
        }
    }


