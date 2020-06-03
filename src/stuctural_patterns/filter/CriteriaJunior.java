package stuctural_patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaJunior implements Criteria{
    @Override
    public List<Employee> criteria(List<Employee> employeeList) {
        List<Employee> juniorList = new ArrayList<>();
        for (Employee employee : employeeList){
            if (employee.getPosition().equalsIgnoreCase("Junior")){
                juniorList.add(employee);
            }
        }
        return juniorList;
    }
}
