package ss13_search.utils;

import ss13_search.model.Spending;

import java.util.Comparator;

public class SortByName implements Comparator<Spending> {
    @Override
    public int compare(Spending spending, Spending o2) {
        int result = spending.getSpendingName().compareTo(o2.getSpendingName());
        if (result < 0) {
            return -1;
        } else if (result > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
