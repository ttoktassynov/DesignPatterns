package stuctural_patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements Criteria{
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public OrCriteria(Criteria first, Criteria second){
        this.firstCriteria = first;
        this.secondCriteria = second;
    }

    @Override
    public List<Employee> criteria(List<Employee> employeeList) {
        List<Employee> firstCriteriaList = firstCriteria.criteria(employeeList);
        List<Employee> secondCriteriaList = secondCriteria.criteria(employeeList);
        for (Employee emp : firstCriteriaList) {
            if (!secondCriteriaList.contains(emp)) {
                secondCriteriaList.add(emp);
            }
        }
        return secondCriteriaList;
    }
}
