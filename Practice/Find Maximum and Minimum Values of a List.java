import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Kata {

  public int min(int[] list) {
    int i = 0;
    int len = list.length;
    int minint = list[0];
    for(i=1; i<len; i++){
      if(minint > list[i]){
        minint = list[i];
      }
    }
    System.out.println(minint);
    return minint;
  }
  
  public int max(int[] list) {
    int i = 0;
    int len = list.length;
    int maxint = list[0];
    for(i=1; i<len; i++){
      if(maxint < list[i]){
        maxint = list[i];
      }
    }
    System.out.println(maxint);
    return maxint;
  }
}

public class SolutionTest {

    private Kata kata = new Kata();
    
    @Test
    public void testExamples() {
        assertEquals(-110, kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, kata.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, kata.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, kata.max(new int[]{5}));
    }
}
