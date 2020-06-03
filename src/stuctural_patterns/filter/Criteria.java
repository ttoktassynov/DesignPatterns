package stuctural_patterns.filter;

import java.util.List;

public interface Criteria {
    List<Employee> criteria(List<Employee> employeeList);
}
