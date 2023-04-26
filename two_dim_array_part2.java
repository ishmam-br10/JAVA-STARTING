import java.util.Arrays;

public class two_dim_array_part2 {
    // https://shorturl.at/aAFNO
    public static void main(String[] args) {
        int[][] integers = {{1, 3, 5}, {7, 8, 9}};
        // System.out.println(Arrays.toString(integers));
        PrintRowbyRow(integers);
        PrintColumnbyColumn(integers);
    }
    public static void PrintRowbyRow(int[][] integers) {
        System.out.println("Print Row by Row: ");
        for(int i = 0; i<2; i++){
            for(int j=0; j< 3; j++){
                System.out.print(integers[i][j] + " ");
            }
        System.out.println();
        }
    }

    public static void PrintColumnbyColumn(int[][] integers) {
        System.out.println("Print Column by Column :");
        for(int i = 0; i< 3; i++){
            for(int j =0; j<2; j++){
                System.out.print(integers[j][i]+" ");
            }
        System.out.println();
        }
    }
}
