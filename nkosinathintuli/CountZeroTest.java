import junit.framework.TestCase;
import static org.junit.Assert.*;

public class CountZeroTest extends TestCase{
	@Test
	public void testArray(){
		CountZero zeroCounter = new CountZero();
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		assertEquals(1,zeroCounter.countZero(arr));
	}
}
