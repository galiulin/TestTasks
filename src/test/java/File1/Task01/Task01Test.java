package File1.Task01;

import org.junit.*;

import static org.junit.Assert.*;


public class Task01Test {

    int[] array;

    @Before
    /**
     * Creating an array and filling of data for the test
     * */
    public void setUp() throws Exception {
        /*set the number of repeating numbers*/
        int countOfRepeatingNumbers = 50000;
        /*Set the number of repetitions*/
        int countOfRepeations = 3;

        array = new int[countOfRepeatingNumbers * countOfRepeations];
        for (int circle = 0; circle < countOfRepeations; circle++) {
            for (int pozitionGlobal = countOfRepeatingNumbers * circle, pozitionInCircle = 0; pozitionGlobal < (countOfRepeatingNumbers * (circle + 1)); pozitionGlobal++, pozitionInCircle++) {
                array[pozitionGlobal] = pozitionInCircle;
            }
        }
    }

    @After
    public void clearArray()
    {
        array = null;
    }

    /**
     * Generates a random number. Removes it from the array. The findInt() method must find a remote number.
     * */
    @Test
    public void findInt() throws Exception {
        int rnd = (int) (Math.random() * array.length);
        int t = array[rnd];
        array[rnd] = 0;
        assertEquals(t, Task01.findInt(array));

//        assertEquals(10, Task01.findInt(array));//check TestCase
    }


}

