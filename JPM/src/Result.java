import java.io.*;

import static java.util.stream.Collectors.joining;


class Result {

    /*
     * Complete the 'dnaComplement' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String dnaComplement(String s) {
        // Write your code here

        //reverse the string

        StringBuilder t = new StringBuilder();
        t.append(s);
        String dna = t.reverse().toString();


        //replace
        String dnaWC = null;
        for (int i = 0; i < dna.length(); i++) {

            if (dna.charAt(i) == 'T') {
                dna.replace(dna.charAt(i), 'A');
            }
            if (dna.charAt(i) == 'A') {
                dna.replace(dna.charAt(i), 'T');
            }
            if (dna.charAt(i) == 'C') {
                dna.replace(dna.charAt(i), 'G');
            }
            if (dna.charAt(i) == 'G') {
                dna.replace(dna.charAt(i), 'C');
            }
            dnaWC = dna;
        }
        return dnaWC;//        String c ="";
//        switch (i1){
//            case "A" : c = "T";
//                break;
//            case "T" : c = "A";
//                break;
//            case "C" : c = "G";
//                break;
//            case "G" : c = "C";
//                break;
//        }
//        //output
        return c;
    }

}
