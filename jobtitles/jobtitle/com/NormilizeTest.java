package jobtitle.com;

import static org.junit.Assert.*;
import   org.junit.*;
public class NormilizeTest {

	@Test
	public void testNormalizeJobTitle() {
		String testJobTitle = "C# engineer";
		String testJobTitle2 = "Java engineer";
		String testJobTitle3 = "Architect";
		String testJobTitle4 = "Chief Accountant";
		String testJobTitle5 = "Accountant";
		Normalize n = new Normalize();
		String result = n.normalizeJobTitle("C# engineer");
		String result2 = n.normalizeJobTitle("Java engineer");
		String result3 = n.normalizeJobTitle("Architect");
		String result4 = n.normalizeJobTitle("Chief Accountant");
		String result5 = n.normalizeJobTitle("Accountant");
		assertTrue(result.equals(testJobTitle));
		assertTrue(result2.equals(testJobTitle2));
		assertTrue(result3.equals(testJobTitle3));
		assertTrue(result4.equals(testJobTitle4));
		assertTrue(result5.equals(testJobTitle5));
		
	}

}
