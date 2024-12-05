public class DoubleMatrix {
    public static void main(String[] args){

        double[][] test = {{5,10,25,58.3,889.4,3.333,77},{2000,1560.48694,333.64846,2135.4864},{465,4864.354,84436.54654}};
        double[] maxima = zeilenMaxima(test);

        for (int i = 0;i<maxima.length;i++){
            System.out.print(maxima[i] + " ");
        }
    }

    public static double[] zeilenMaxima(double[][] matrix){
        double[] ergebnis = new double[matrix.length];
        for (int i = 0; i<matrix.length;i++){
            ergebnis[i] = findMaxEntry(matrix[i]);
        }
        return ergebnis;
    }

    public static double findMaxEntry(double[] array){
        double maximum = 0;
        for (int i = 0; i< array.length;i++){
            if (array[i]>maximum){
                maximum = array[i];
            }
        }
        return maximum;
    }
}
