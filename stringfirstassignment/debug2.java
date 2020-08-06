
/**
 * Write a description of debug2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class debug2 {
    public void findAbc(String input){
       int count=0; 
       int index = input.indexOf("abc");
       System.out.println(index);
       while (true){
           if (index == -1 || index >= input.length() - 3){
               
               break;
           }
           String found = input.substring(index+1, index+4);
           System.out.println(found);
           index = input.indexOf("abc",index+4);
           System.out.println("index after updating " + index);
       }
   }

   public void test(){
       //findAbc("abcd");
       findAbc("abcabcabcabca");
   }

}
