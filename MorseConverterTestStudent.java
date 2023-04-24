import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MorseConverterTestStudent {

	File codeFile;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvertToEnglishString() {
		String word1=MorseCodeConverter.convertToEnglish(".... . -.-- / - .... . .-. . / -- .- - .");
		assertEquals("hey there mate", word1);
		
		String word2=MorseCodeConverter.convertToEnglish(".-- .... .- - / -.. .- -.-- / .. ... / - --- -.. .- -.--");
		assertEquals("what day is today", word2);
	}

	@Test
	public void testConvertToEnglishFile() throws FileNotFoundException {
		File file = new File("src/Daisy.txt"); 
		try {
			assertEquals("give me your answer do", MorseCodeConverter.convertToEnglish(file));
		} catch (FileNotFoundException e) {
			assertTrue("An unwanted exception was caught", false);
		}
	}

}