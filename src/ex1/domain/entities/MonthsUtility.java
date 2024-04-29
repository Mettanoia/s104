package ex1.domain.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class MonthsUtility {

    private MonthsUtility(){}

    static List<Month> monthsToList(Month[] months){

        ArrayList<Month> monthsList = new ArrayList<>();
        Collections.addAll(monthsList, months);


        return monthsList;
    }
}
