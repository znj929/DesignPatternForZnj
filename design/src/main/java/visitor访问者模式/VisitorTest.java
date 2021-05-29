package visitor访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: znj
 * @Date: 2021/5/29 0029 22:05
 */
public class VisitorTest {
    public static void main(String[] args) {
        List<Department> departments1 = new ArrayList<>();

        Department department1_1 = new Department();
        department1_1.setName("1-1节点");
        Department department1_2 = new Department();
        department1_2.setName("1-2节点");
        List<Department> departments1_2_1 = new ArrayList<>();
        Department department1_2_1 = new Department();
        department1_2_1.setName("1-2-1节点");
        departments1_2_1.add(department1_2_1);
        department1_1.setDepartments(departments1_2_1);

        departments1.add(department1_1);
        departments1.add(department1_2);

        List<Department> departments2 = new ArrayList<>();
        Department department2_1 = new Department();
        department2_1.setName("2-1节点");

        Department department2_2 = new Department();
        department2_2.setName("2-2节点");
        departments2.add(department2_2);



        List<Department> departments = new ArrayList<>();
        departments.addAll(departments1);
        departments.addAll(departments2);
        //把结构数据都放入顶级节点 行成一个一个子节点
        Department department = new Department();
        department.setName("顶级节点");
        department.setDepartments(departments);

        Visitor visitor = new RemoveVisitor();
        department.accept(visitor);
    }
}
