package visitor访问者模式;

/**
 * @Author: znj
 * @Date: 2021/5/29 0029 22:11
 */
public class RemoveVisitor implements Visitor{

    @Override
    public void visit(Department department) {
        if(department.getDepartments().size()>0){
            for (Department child: department.getDepartments()) {
                child.accept(this);
            }
        }
        System.out.println("删除-》"+department.getName());
    }
}
