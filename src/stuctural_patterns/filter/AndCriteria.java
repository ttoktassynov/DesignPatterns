package stuctural_patterns.filter;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria first, Criteria second){
        this.firstCriteria = first;
        this.secondCriteria = second;
    }
    @Override
    public List<Employee> criteria(List<Employee> employeeList) {
        List<Employee> firstCriteriaList = firstCriteria.criteria(employeeList);
        return secondCriteria.criteria(firstCriteriaList);
    }
}
