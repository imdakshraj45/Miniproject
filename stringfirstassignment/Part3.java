
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
     public boolean twoOccurrences(String stringa, String stringb){

        int numberofocc = stringa.indexOf(stringb,0);    
        
        if(numberofocc == -1){
                return false;
            }   
            else {
                int nextocc = stringa.indexOf(stringb, numberofocc+stringb.length());
                {
                    if(nextocc == -1){
                        return false;
                    }
                else {
                    return true;
                }
                }
            }
    
    }
    public String lastpart(String stra,String strb){
        int firstocc= strb.indexOf(stra,0);
        if (firstocc == -1)
        {
            return strb;
        }
        else
        {
            int nextocc = stra.indexOf(strb, firstocc+strb.length());
                {
                    return strb.substring(nextocc,firstocc+stra.length());
                }
        
    
    }
}
    public void testing()
    {
    String stringa = "i came of to starbucks for coffee";
    String stringb = "of";
    System.out.println("StringA is "+stringa);
    System.out.println("StringB is "+stringb);
    boolean test = twoOccurrences(stringa, stringb);
    System.out.println("This test is " +test);
    
    stringa = "i came to starbucks for coffee";
    stringb = "ca";
    System.out.println("StringA is "+stringa);
    System.out.println("StringB is "+stringb);
    test = twoOccurrences(stringa, stringb);
    System.out.println("This test is " +test);
    
    stringa = "i came off to starbucks for off coffee";
    stringb = "off";
    System.out.println("StringA is "+stringa);
    System.out.println("StringB is "+stringb);
    test = twoOccurrences(stringa, stringb);
    System.out.println("This test is " +test);
    
        lastpart("an","banana");
    lastpart("zoo","forest");
    
    }
    
}