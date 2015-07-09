import org.apache.velocity.util.StringUtils;
import org.junit.*;
import static org.junit.Assert.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SomeMethodsTest {
	
		@Test
		public void testAdd() {
			int res = SomeMethods.add(15, 30);
			assertEquals(45, res);
		}
		
		//access the tested method via reflection
		@Test
		public void testAddPrivate() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException, NoSuchMethodException{
		Method methPrivAdd = SomeMethods.class.getDeclaredMethod("addPrivate", int.class, int.class);
		System.out.println(methPrivAdd.getName() + "  " + methPrivAdd.isAccessible());
		if (!methPrivAdd.isAccessible()) {
			methPrivAdd.setAccessible(true);
		}
		int result = (Integer)methPrivAdd.invoke(null, (Object[])new Integer[]{1,5});
		System.out.println("Result of invoked private method is: " + result);

		assertEquals((int)6, result);
		
		StringUtils.capitalizeFirstLetter("blabla");
		}
	//dummy comment, committed from web 
}
