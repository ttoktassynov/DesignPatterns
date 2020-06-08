package stuctural_patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria{
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Employee> criteria(List<Employee> employeeList) {
        return secondCriteria.criteria(firstCriteria.criteria(employeeList));
    }
}
