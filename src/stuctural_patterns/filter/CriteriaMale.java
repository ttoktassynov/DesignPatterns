package stuctural_patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{
    @Override
    public List<Employee> criteria(List<Employee> employeeList) {
        List<Employee> maleList = new ArrayList<>();
        for (Employee employee : employeeList){
            if (employee.getGender().equalsIgnoreCase("Male")){
                maleList.add(employee);
            }
        }
        return maleList;
    }
}
