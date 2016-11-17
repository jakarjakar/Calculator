package matrixmultiplication;
 //@date Oct 18, 2016
 //@author Artsiom_Berazav

public class Mult {
    public static double [][] result (double m0[][], double m1[][] ) {
        
        
        int length_m0_row = m0.length;
        int length_m0_column = m0[0].length;
        
//        int length_m1_row = m1.length;
        int length_m1_column = m1[0].length;
//        double [][] m2 = new double[length_m0_row][length_m1_column];
//        Mtrx.print(m2);
        
        double[][] m2 = new double[length_m0_row][length_m1_column];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m2[i][j] = 0.00000;
            }
        }
        
        for (int i = 0; i < length_m0_row; i++) {
            for (int j = 0; j < length_m1_column; j++) {
                for (int k = 0; k < length_m0_column; k++) {
//                    m2[i][j] = (m0[i][j] * m1[i][j]) + (m0[i][k] * m1[k][j]); Не работает с не квадратными матрицами, фак!
                    m2[i][j] += m0[i][k] * m1[k][j];
//                    System.out.println("Hi" + Arrays.deepToString(m2));
                }
            }
        } 
        return m2;
    }
}

