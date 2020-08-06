
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    public String findsimplegene(String dna)
    {
        String result="";
        int start = dna.indexOf("ATG");
        if(start==-1)
        {
            return "";
        }
        int stop = dna.indexOf("TAA",start+3);
        if(stop==-1)
        {
            return "";
        }
        String s = dna.substring(start+3,stop);
        int len = s.length();
        if(len%3==0)
        {
         result=dna.substring(start,stop+3);
        }
        return result;
    }
    public void testgenesimple(){
        String dna="BBAATGCGMTAATATGGT";
        System.out.println("DNA strand is "+dna);
        String gene = findsimplegene(dna);
        System.out.println("GEne is "+gene);
        
        dna="AATCGCGTAATATGGT";
        System.out.println("DNA strand is "+dna);
        gene = findsimplegene(dna);
        System.out.println("GEne is "+gene);
        
        dna="AATGCGTACTATGGT";
        System.out.println("DNA strand is "+dna);
        gene = findsimplegene(dna);
        System.out.println("GEne is "+gene);
        
        dna="AAGCGTAAGTGGT";
        System.out.println("DNA strand is "+dna);
        gene = findsimplegene(dna);
        System.out.println("GEne is "+gene);
        
        dna="AATGCGCATATAATATGGT";
        System.out.println("DNA strand is "+dna);
        gene = findsimplegene(dna);
        System.out.println("GEne is "+gene);
        
    }
}
