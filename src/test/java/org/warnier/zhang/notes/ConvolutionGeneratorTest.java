package org.warnier.zhang.notes;

import org.junit.Test;

public class ConvolutionGeneratorTest {
    @Test
    public void test(){
        new ConvolutionGenerator(3).generate().print();
    }
}
