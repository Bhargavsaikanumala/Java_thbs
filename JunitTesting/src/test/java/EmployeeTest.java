import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {
	 
	@Test
	public void test() {
		Employee e1= new Employee();
		String actual=e1.chechStr("HelloAb");
		String expected="Ab";
		assertEquals(expected,actual);
	}
}

