/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package maven_1.testmaven;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
//import org.testng.annotations.Test;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
 
/**
 *
 * @author fpt
 */
public class TestMavenTest {

     public TestMavenTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testTriangleTrue_0() {
        String input = "5\n3\n4\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is a triangle.\r\n";

        assertEquals(consoleOutput, out.toString());
    }

    
    //True
    @Test
    public void testTriangleTrue_1() {
        String input = "2\n2\n2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertTrue(false);
    }

    @Test
    public void testTriangleTrue_2() {
        String input = "3\n4\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertTrue(TestMaven.isTriangle(3, 4, 5));
    }

    @Test
    public void testTriangleTrue_3() {
        String input = "4\n5\n3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertTrue(TestMaven.isTriangle(4, 5, 3));
    }

    @Test
    public void testTriangleTrue_4() {
        String input = "5\n4\n3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertTrue(TestMaven.isTriangle(5, 4, 3));
    }

    @Test
    public void testTriangleTrue_5() {
        String input = "4\n3\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertTrue(TestMaven.isTriangle(4, 3, 5));
    }

    @Test
    public void testTriangleTrue_6() {
        String input = "10\n20\n29\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertTrue(TestMaven.isTriangle(10, 20, 29));
    }

    @Test
    public void testTriangleTrue_7() {
        String input = "5\n5\n2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertTrue(TestMaven.isTriangle(5, 5, 2));
    }
    
    
    //False
    @Test
    public void testTriangleFalse_1() {
        String input = "0\n0\n0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(0,0,0));
    }

    @Test
    public void testTriangleFalse_2() {
        String input = "0\n0\n1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(0,0,1));
    }

    @Test
    public void testTriangleFalse_3() {
        String input = "1\n0\n0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(1,0,0));
    }

    @Test
    public void testTriangleFalse_4() {
        String input = "0\n2\n0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(0,2,0));
    }

    @Test
    public void testTriangleFalse_5() {
        String input = "1\n1\n0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(1,1,0));
    }

    @Test
    public void testTriangleFalse_6() {
        String input = "1\n0\n1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(1,0,1));
    }

    @Test
    public void testTriangleFalse_7() {
        String input = "0\n1\n2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(0,1,2));
    }

    @Test
    public void testTriangleFalse_8() {
        String input = "1\n2\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(1,2,5));
    }

    @Test
    public void testTriangleFalse_10() {
        String input = "1\n5\n2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(1,5,2));
    }

    @Test
    public void testTriangleFalse_11() {
        String input = "2\n1\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(2,1,5));
    }

    @Test
    public void testTriangleFalse_12() {
        String input = "5\n1\n2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(5,1,2));
    }

    @Test
    public void testTriangleFalse_13() {
        String input = "1\n1\n-1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(1,1,-1));
    }

    @Test
    public void testTriangleFalse_14() {
        String input = "1\n-1\n-1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(1,-1,-1));
    }

    @Test
    public void testTriangleFalse_15() {
        String input = "-1\n-2\n-1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(-1,-2,-1));
    }

    @Test
    public void testTriangleFalse_16() {
        String input = "2\n0\n-1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(2,0,-1));
    }

    @Test
    public void testTriangleFalse_17() {
        String input = "-5\n-2\n-1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle-5,-2,-1));
    }

    @Test
    public void testTriangleFalse_23() {
        String input = "4\n-4\n-4\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(4, -4, -4));
    }

    @Test
    public void testTriangleFalse_24() {
        String input = "-5\n-4\n-3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        TestMaven.main(args);

        String consoleOutput = "Enter side 1: \r\n";
        consoleOutput += "Enter side 2: \r\n";
        consoleOutput += "Enter side 3: \r\n";
        consoleOutput += "This is not a triangle.\r\n";
        
        assertEquals(consoleOutput, out.toString());
//        assertFalse(TestMaven.isTriangle(-5, -4, -3));
    }
    
    @Test
    public void testIsTriangle_1(){
        assertFalse(TestMaven.isTriangle(-5, -4, -3));
    }
    
    //This test case fail
    @Test
    public void testIsTriangle_2(){
        assertFalse(TestMaven.isTriangle(2, 1, 5));
        assertFalse(TestMaven.isTriangle(3, 3, 3));
    }
    
    //This test case fail
    @Test
    public void testIsTriangle_3(){
        assertTrue(TestMaven.isTriangle(1, 1, 5));
    }
    
    @Test
    public void testIsTriangle_4(){
        assertFalse(TestMaven.isTriangle(2, 1, 5));
    }
}