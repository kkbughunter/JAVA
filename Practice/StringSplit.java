import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Arrays;
public class StringSplit {
    public static String[] solution(String s) {
      int len = s.length();
      if(len == 0 || len == 2){
        String[] result = {s};
        return result;
      }
      
      int arraylen = (int)Math.round(len/2.0);
      String[] result = new String[arraylen];
      int index = 0;
      for(int i=0; i<len; i+=2){
        
        if(i+1 == len){
          result[index++] = s.charAt(i) + "_";
        } else
          result[index++] = "" + s.charAt(i) +  s.charAt(i+1);
      }
      
      return result;
    }
}
// TODO: Replace examples and use TDD development by writing your own tests

public class SampleTest {
    @Test
    public void testEvenString() {
       String s = "abcdef";
       String s1 = "HelloWorld";
       assertEquals("Should handle even string","[ab, cd, ef]", Arrays.toString(StringSplit.solution(s)));
       assertEquals("Should handle even string","[He, ll, oW, or, ld]", Arrays.toString(StringSplit.solution(s1)));
    }
    
    @Test
    public void testOddString() {
       String s = "abcde";
       String s1 = "LovePizza";
       String s2 = "abcdef";
       assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(StringSplit.solution(s)));
       assertEquals("Should handle odd string","[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplit.solution(s1)));
       assertEquals("Should handle even string","[ab, cd, ef]", Arrays.toString(StringSplit.solution(s2)));
      
    }
}
