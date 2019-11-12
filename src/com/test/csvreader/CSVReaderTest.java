package com.test.csvreader;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.csvreader.csvFileReader;

public class CSVReaderTest {
	
	@BeforeClass  
	public static void setUpBeforeClass() throws Exception {  
	        System.out.println("before class");  
	    }  
	@Before  
	public void setUp() throws Exception {  
	        System.out.println("before");  
	    }  
	    
	@Test
	public void testcsvFileReader() {
		csvFileReader csvr =null;
		try {
		csvr = new csvFileReader("..\\Virtusa_test_Jagadish\\resources\\testCsv.csv.txt");
		csvr.searchCSV(1,3);
		}catch (Exception e) {
			System.out.println("File Not Found Error");
		}
		//Assert.assertNotNull(csvr);
		}
	
	@After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  
    

}
