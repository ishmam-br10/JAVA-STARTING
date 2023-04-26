public class two_dimen_array_part3 {
    //https://shorturl.at/tMV29
    public static void main(String[] args) {
        
    }
    public static void Print2DArray(int[][] integers) {
        for(int i= 0; i< integers.length; i++){
            for(int j = 0; j<integers[i].length; j++){
                System.out.print(integers[i][j]);
            }
            System.out.println();
        }
    }
}
