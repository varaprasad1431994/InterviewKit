import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PalindromeTest {
	//for normal addition 
	@Test
	public void testCheckPalindrome() 
	{		 	
         Palindromenumeric palindromenumeric= new Palindromenumeric();
		 assertEquals(true, palindromenumeric.isPalindrome(141));
		 assertEquals(false, palindromenumeric.isPalindrome(345));
		 assertEquals(true, palindromenumeric.isPalindrome(121));
	}

}
