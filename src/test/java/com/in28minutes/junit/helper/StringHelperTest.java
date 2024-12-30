package com.in28minutes.junit.helper;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringHelperTest {

    StringHelper helper = new StringHelper();

    private String input;
    private String expectedOutput;

    // Constructor to receive parameters
    public StringHelperTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    // Provide the parameters using a static method
    @Parameters
    public static Collection<String[]> testConditions() {
        String[][] expectedOutputs = {{"AACD", "CD"},{"ACD","CD"}};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void test() {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }
}
