package Jenkins_gradle;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PRIMAv1Test {

	@Test 
	public void test1() { 
		assertEquals(PRIMAv1.valorPrimaMain(55, 10),400,0.1);
	}

	
	@Test public void test2() { 
		assertEquals(PRIMAv1.valorPrimaMain(30, 20),900,0.1);
	}

	@Test
	public void test3() {
		assertEquals(PRIMAv1.valorPrimaMain(25, 30),850,0.1); 
	}
	
	@Test
	public void test4() {
		assertEquals(PRIMAv1.valorPrimaMain(45, 20),400,0.1);
	}
	
	
	@Test public void test5() { 
		assertEquals(PRIMAv1.valorPrimaMain(60, 22),400,0.1);
	}

}
