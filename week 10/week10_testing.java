public class Exam2 {
    public static void main(String[] args){

//3X3 ARRAY

    char[][] treedee = {
// COLUMN =
// ROW ||
        {'A', 'B', 'C'},
        {'D', 'E', 'F'},
        {'G', 'H', 'I'},
};

//FIRST BOX IS ||, SECOND IS =
    System.out.println(treedee[1][1]);
    System.out.println(treedee[2][0]);
    System.out.println(treedee[0][1]);
    System.out.println(treedee[0][1]);
 
//NESTED FOR LOOP 

// adds one and loops until it reaches 11hrs
    for (int hrs = 0; hrs < 12; hrs++){
// adds one and loops until it reaches 59mins
        for (int mins = 0; mins <60; mins++){
// adds one and loops until it reaches 59secs
            for (int secs = 0; secs < 60; secs++)
//loop starts at the end and the biggest for is based on the smallest one.
            System.out.println(hrs + ":" + mins + ":" + secs);
          
    char[][] treedee = {
        {'A', 'B', 'C'},
        {'D', 'E', 'F'},
        {'G', 'H', 'I'},
    };
       for (int row = 0; row < treedee.length; row++){

        for (int column = 0; column<treedee.length; column++){
            System.out.print(treedee[row][column]);
        }
        System.out.println(" ");
       }
    }
}
