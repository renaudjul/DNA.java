public class DNA{

  public static void main(String[] args){

    // DNA sequencing 
  
    // variables 
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    // enter what variable above you are checking
    String dna = dna3;

    // Find the length
    int length = dna.length();
    System.out.println("Length: " + length);
  
    // Find start codon
    int start = dna.indexOf("ATG");
    System.out.println("Start: " + start);

    // Find stop codon
    int stop = dna.indexOf("TGA");
    System.out.println("Stop: " + stop);

    // Find the protein 
    if(start != -1 && stop != -1 && (stop - start) % 3 == 0){
  
          String protein = dna.substring(start, stop+3);
          System.out.println("Protein: " + protein);

    }else{
            System.out.println("No protein.");
          }
  }

}
