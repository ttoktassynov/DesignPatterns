package stuctural_patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{
    @Override
    public List<Employee> criteria(List<Employee> employeeList) {
        List<Employee> femaleList = new ArrayList<>();

        for (Employee employee : employeeList){
            if (employee.getGender().equalsIgnoreCase("Female")){
                femaleList.add(employee);
            }
        }

        return femaleList;
    }
}
