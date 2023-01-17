public class App {

    public static void main(String[] args) {

        
        char[][] crossWord = {
                { 'S', 'L', 'A', 'M' },
                { 'T', 'I', 'L', 'E' },
                { 'E', 'A', 'T', 'S' },
                { 'P', 'R', 'O', 'S' }
        };

        System.out.println("8x8");
        System.out.println(" ");
        for (int row = 0; row < crossWord.length; row++) {
            System.out.println(crossWord[row]);
            for (int column = 0; column < crossWord.length; column++) {
                System.out.println(crossWord[column][row]);
            }
        }
        System.out.println(" ");

        System.out.println("Reveresed \n");
        for (int row2 = 3; row2 >= 0; row2--) {
            for (int column2 = 3; column2 >= 0; column2--) {
                if (column2 == 0) {
                    System.out.println(crossWord[row2][column2]);
                }
            }
        }
        System.out.println(" ");
        for (int row3 = 3; row3 >= 0; row3--) {
            for (int column3 = 3; column3 >= 0; column3--) {
                if (column3 == 1) {
                    System.out.println(crossWord[row3][column3]);
                }
            }
        }
        System.out.println(" ");
        for (int row4 = 0; row4 < 3; row4++) {
            for (int column4 = 3; column4 >= 0; column4--) {
                if (column4 == 2) {
                    System.out.println(crossWord[row4][column4]);
                }
            }
        }

        System.out.println("\nNon Plural");
        System.out.println(" ");
        for (int row5 = 0; row5 < 4; row5++) {
            for (int column5 = 0; column5 < 3; column5++) {
                if (row5 == 2) {
                    System.out.print(crossWord[row5][column5]);
                }
            }
        }

        System.out.println(" ");

        for (int row6 = 0; row6 < 4; row6++) {
            for (var column6 = 0; column6 < 3; column6++) {
                if (row6 == 3) {
                    System.out.print(crossWord[row6][column6]);
                }
            }
        }
    }
}

//NEEDS REVISION AND CLEANING
/*
         * WORDS:
         * SLAM, TILE, EATS, PROS,
         * STEP, LIAR, ALTO, MESS,
         * PETS, RAIL, SEM, ALT
         * PALM, PAL, SITS, SIT
         * 
         */
