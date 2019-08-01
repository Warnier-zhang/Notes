package org.warnier.zhang.notes.algorithm;

import org.junit.Test;
import org.warnier.zhang.notes.algorithm.ConvolutionGenerator;

public class ConvolutionGeneratorTest {
    @Test
    public void test(){
        new ConvolutionGenerator(3).generate().print();
    }
}
