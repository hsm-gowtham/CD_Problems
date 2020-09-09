package ChellaDurai_Problems.Test_ques;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestOddSubsequencesTest {

	LongestOddSubsequence longestoddSubsequence;
	@BeforeEach
	void setUp()
	{
		longestoddSubsequence = new LongestOddSubsequence(); 
	}
	@Test
	void normaltest() {
		int a[]=new int[] {13,15,12,18,18,14,5,12,13,32,33,5,1,77,78,79};
		assertEquals(116,longestoddSubsequence.oddSequenceSum(a));
	}
	@Test
	void sameOddLengthtest() {
		int a[]=new int[] {32,33,25,97,12,18,13,15,17,0,4,32,9,7,78,79};
		assertEquals(200,longestoddSubsequence.oddSequenceSum(a));
	}

}
