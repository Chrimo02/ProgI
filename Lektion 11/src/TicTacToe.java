public class TicTacToe {
    public static void main(String[] args) {

        boolean[][][] ticTacToe3D = new boolean[3][3][3];
        initializeField(ticTacToe3D);
        printField(fillWithXAndO(ticTacToe3D));
    }

    public static void printField(char[][][] array3D) {

            for (int i = 0; i < array3D.length; i++) {
                for (int j = 0; j < array3D[i].length; j++) {
                    for (int k = 0; k < array3D[j].length; k++) {
                        System.out.print(array3D[0][j][k] + " " + array3D[1][j][k] + " " + array3D[2][j][k] + " " + "\n");
                        if (k == 2) System.out.println();
                    }
                }
            }

    }

    public static char[][][] fillWithXAndO(boolean[][][] input){
        char[][][] output = new char[3][3][3];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                for (int k = 0; k < input[j].length; k++) {
                    if (input[i][j][k]){
                        output[i][j][k] = 'x';
                    }
                    else {
                        output[i][j][k] = 'o';
                    }
                }
            }
        }
        return output;
    }

    public static boolean[][][] initializeField(boolean[][][] array){
        boolean[] initializer = {true,false};
        for (int i = 0; i<array.length;i++)
        {
            for (int j = 0; j<array[i].length;j++)
            {
                for (int k = 0; k<array[j].length;k++)
                {
                    array[i][j][k] = initializer[(int) (Math.random()*2)];
                }
            }

        }
        return array;
    }

}
