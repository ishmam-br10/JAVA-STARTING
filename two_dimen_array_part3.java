public class two_dimen_array_part3 {
    //https://shorturl.at/tMV29
    public static void main(String[] args) {
        //its a ragged array
        int[][] integers ={
            {1, 2, 3},
            {5, 6},
            {7, 8, 9, 4, 10}
        };
        Print2DArray(integers);
        
    }
    public static void Print2DArray(int[][] integers) {
        for(int i= 0; i< integers.length; i++){
            for(int j = 0; j<integers[i].length; j++){
                System.out.print(integers[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
