package composite组合模式;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: znj
 * @Date: 2021/5/24 0024 21:59
 */
public class Department {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public void remove(){
        if(departments.size()>0){
            for (Department department:departments) {
                department.remove();
            }
        }
        System.out.println("删除："+name);
    }

    public Set<String> getNames(){
        Set<String> names = new HashSet<>();
        if(departments.size()>0){
            for (Department department:departments) {
                names.addAll(department.getNames());
            }
        }
        names.add(name);
        return names;
    }
}
