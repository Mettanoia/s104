package ex3.domain.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnboundUtilityTest {

    @Test
    void unboundSomething() {
        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                UnboundUtility::unboundSomething
        );
    }
}