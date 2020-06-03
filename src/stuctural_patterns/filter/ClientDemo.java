package stuctural_patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class ClientDemo {
    public static void main(String [] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Oleg", "Male", "Senior"));
        employeeList.add(new Employee("Timur", "Male", "Junior"));
        employeeList.add(new Employee("Tatyana", "Female", "Junior"));
        employeeList.add(new Employee("Jane", "Female", "Senior"));
        employeeList.add(new Employee("Pat", "Male", "Senior"));
        employeeList.add(new Employee("Vlad", "Male", "Junior"));
        employeeList.add(new Employee("Gia", "Female", "Senior"));
        employeeList.add(new Employee("Sveta", "Female", "Junior"));
        employeeList.add(new Employee("Serik", "Male", "Junior"));
        employeeList.add(new Employee("Mark", "Male", "Senior"));

        Criteria femaleCriteria = new CriteriaFemale();
        Criteria maleCriteria = new CriteriaMale();
        Criteria juniorCriteria = new CriteriaJunior();
        Criteria seniorCriteria = new CriteriaSenior();

        Criteria seniorFemalesCriteria = new AndCriteria(seniorCriteria, femaleCriteria);
        Criteria seniorMalesCriteria = new AndCriteria(seniorCriteria, maleCriteria);
        Criteria juniorFemalesCriteria = new AndCriteria(juniorCriteria, femaleCriteria);
        Criteria juniorMalesCriteria = new AndCriteria(juniorCriteria, maleCriteria);


        System.out.println("Females:");
        PrintList(femaleCriteria.criteria(employeeList));

        System.out.println("Males:");
        PrintList(maleCriteria.criteria(employeeList));

        System.out.println("Juniors:");
        PrintList(juniorCriteria.criteria(employeeList));

        System.out.println("Seniors:");
        PrintList(seniorCriteria.criteria(employeeList));

        System.out.println("Junior Females:");
        PrintList(juniorFemalesCriteria.criteria(employeeList));

        System.out.println("Senior Females:");
        PrintList(seniorFemalesCriteria.criteria(employeeList));

        System.out.println("Junior Males:");
        PrintList(juniorMalesCriteria.criteria(employeeList));

        System.out.println("Senior Males:");
        PrintList(seniorMalesCriteria.criteria(employeeList));

        System.out.println("Senior Females or Junior Males:");
        PrintList((new
                OrCriteria(seniorFemalesCriteria, juniorMalesCriteria)).criteria(employeeList)
        );

        System.out.println("Junior Females or Senior Males:");
        PrintList((new
                OrCriteria(juniorFemalesCriteria, seniorMalesCriteria)).criteria(employeeList)
        );
    }
    public static void PrintList(List<Employee> employeeList){
        System.out.println("====");
        for (Employee emp : employeeList){
            System.out.println(emp.getName() + " " + emp.getGender() + " " + emp.getPosition());
        }
        System.out.println("====");
    }
}
