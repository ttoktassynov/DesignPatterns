package stuctural_patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSenior implements Criteria{
    @Override
    public List<Employee> criteria(List<Employee> employeeList) {
        List<Employee> seniorList = new ArrayList<>();
        for (Employee employee : employeeList){
            if (employee.getPosition().equalsIgnoreCase("Senior")){
                seniorList.add(employee);
            }
        }
        return seniorList;
    }
}
