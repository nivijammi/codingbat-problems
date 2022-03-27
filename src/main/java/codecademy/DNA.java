package codecademy;

/*
program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.
*/
public class DNA {
    public static void main(String[] args) {
        //DNA strands to be used to test the program
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        // find the length
        String dna = dna2;
        int length = dna.length();
        System.out.println("Length of dna: " + length);

        //Find start - Does the DNA strand have the start codon ATG within it?
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);

        //Find stop - Does the DNA strand have the stop codon TGA within it?
        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);

        //find whether there is a protein

    /*Condition 1: start != -1
      Condition 2: stop != -1
      Condition 3: (stop - start) % 3 == 0
		*/
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            System.out.println("Condition 1 and 2 and 3 are satisfied.");

            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No Protein");
        }


    }
}