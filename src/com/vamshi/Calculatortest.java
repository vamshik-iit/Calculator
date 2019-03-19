/*
 * @author KUSA VAMSHI
 * 
 */

/*
 * This is the sample unit test case to verify calculator project(program)
 * 
 */

package com.vamshi;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class Calculatortest {
	@Test
	void testCalc() {
		Calculator i=new Calculator();
		assertEquals(1,i.calculation(3,3,'/'));
	}
}
