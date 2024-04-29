package ex1.domain.entities;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class MonthsUtilityTest {

    @Test
    @DisplayName("The list must have exactly 12 elements.")
    public void monthsToList_ListContain12Elements_Success(){

        assertEquals(12, MonthsUtility.monthsToList(Month.values()).size());

    }

    @Test
    @DisplayName("The list must contain AUGUST in the 8th position.")
    public void monthsToList_AugustInTheEighthPosition_Success(){

        assertEquals(Month.AUGUST, MonthsUtility.monthsToList(Month.values()).get(7));

    }

}