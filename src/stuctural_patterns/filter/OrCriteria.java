package stuctural_patterns.filter;

import java.util.List;

public class OrCriteria implements Criteria{
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Employee> criteria(List<Employee> employeeList) {
        List<Employee> firstCriteriaList = firstCriteria.criteria(employeeList);
        List<Employee> secondCriteriaList = secondCriteria.criteria(employeeList);

        for (Employee employee : firstCriteriaList){
            if (!secondCriteriaList.contains(employee)){
                secondCriteriaList.add(employee);
            }
        }

        return secondCriteriaList;
    }
}
