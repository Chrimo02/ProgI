package Textdokument;

public class CrackedWord {
    public static void main(String[] args) {
        Textdokument test1 = new Textdokument(10);
        Textdokument test2 = new Textdokument(5);

        test1.zeilenUndSpalten[0] = new char[]{'1','1','1'};
        test1.zeilenUndSpalten[1] = new char[]{'2','2','2'};
        test1.zeilenUndSpalten[2] = new char[]{'3','3','3'};
        test1.zeilenUndSpalten[3] = new char[]{'4','4','4'};
        test1.zeilenUndSpalten[4] = new char[]{'5','5','5'};
        test1.zeilenUndSpalten[5] = new char[]{'6','6','6'};
        test1.zeilenUndSpalten[6] = new char[]{'7','7','7'};
        test1.zeilenUndSpalten[7] = new char[]{'8','8','8'};
        test1.zeilenUndSpalten[8] = new char[]{'9','9','9'};
        test1.zeilenUndSpalten[9] = new char[]{'a','a','a'};


        test2.zeilenUndSpalten[4] = new char[]{'n','n','n'};
        test2.zeilenUndSpalten[3] = new char[]{'n','n','n'};
        test2.zeilenUndSpalten[2] = new char[]{'n','n','n'};
        test2.zeilenUndSpalten[1] = new char[]{'n','n','n'};
        test2.zeilenUndSpalten[0] = new char[]{'n','n','n'};


        System.out.println(test1.zeilenUndSpalten[0][0]);
        System.out.println();
        System.out.println(test1.zaehleZeichen());
        System.out.println();
        test1.vertauscheZeilen(0,1);
        System.out.println(test1.zeilenUndSpalten[0][0]);
        System.out.println();


        test1.fuegeEinTextdokument(test2,3);

        System.out.println(test1.zeilenUndSpalten[0][0]);
        System.out.println(test1.zeilenUndSpalten[1][0]);
        System.out.println(test1.zeilenUndSpalten[2][0]);
        System.out.println(test1.zeilenUndSpalten[3][0]);
        System.out.println(test1.zeilenUndSpalten[4][0]);
        System.out.println(test1.zeilenUndSpalten[5][0]);
        System.out.println(test1.zeilenUndSpalten[6][0]);
        System.out.println(test1.zeilenUndSpalten[7][0]);
        System.out.println(test1.zeilenUndSpalten[8][0]);
        System.out.println(test1.zeilenUndSpalten[9][0]);
        System.out.println(test1.zeilenUndSpalten[10][0]);
        System.out.println(test1.zeilenUndSpalten[11][0]);
        System.out.println(test1.zeilenUndSpalten[12][0]);
        System.out.println(test1.zeilenUndSpalten[13][0]);
        System.out.println(test1.zeilenUndSpalten[14][0]);

        System.out.println();
        System.out.println(test1.zaehleZeichen());
        test1.vertauscheZeilen(2,5);





    }

}
