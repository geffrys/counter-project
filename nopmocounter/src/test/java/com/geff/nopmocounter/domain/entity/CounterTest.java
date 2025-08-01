package com.geff.nopmocounter.domain.entity;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class CounterTest {
    
    private Counter counter;
    
    @Test
    public void emptyConstructor(){
        counter = new Counter();
        assertNotNull(counter);
        assertNull(counter.getCounterId());
        assertNull(counter.getUserId());
        assertNull(counter.getStartTime());
        assertNull(counter.getFinishTime());
    }

}
