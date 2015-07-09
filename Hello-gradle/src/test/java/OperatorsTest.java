import org.junit.*;
import static org.junit.Assert.*;

public class OperatorsTest {
	@Test
	public void test_plus_String() {
		String result = "onetwothree";
		assertEquals("onetwo"+"three", result);
	}
	
	@Test
	public void test_plus_int() {
		int result = 6553+1+2+3;
		assertEquals(6559, result);
	}
	
	@Test
	public void test_plus_int_outofrange() {
		int result = Integer.MAX_VALUE+1;
		assertEquals(Integer.MIN_VALUE, result);
	}
	
	@Test
	public void testSysProperty() {
		String someProp = System.getProperty("some.prop");
		assertNotNull(someProp);
		assertEquals("someValue",someProp);
	}
}