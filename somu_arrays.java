public class somu_arrays {
    public static void main(String[] args) {
        int [][] marks;
        marks =new int[2][3];
        marks[0][0] = 100;
        marks[0][1] = 101;
        marks[0][2] = 102;
        marks[1][0] = 100;
        marks[1][1] = 101;
        marks[1][2] = 102;
        for(int i=0; i<marks.length; i++){
            for(int j=0;j<marks[i].length; j++){
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }



    }
}
