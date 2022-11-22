package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String res = junitstring.AddStrings("capstone", "project");
		assertEquals("capstoneproject", res);
	}
}

