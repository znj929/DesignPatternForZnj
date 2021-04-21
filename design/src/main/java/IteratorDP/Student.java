package IteratorDP;


/**
 * @Author: znj
 * @Date: 2021/4/21 0021 22:34
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Classroom implements Aggregate {

    private Student[] students;
    private int last = 0;

    Classroom(int size) {
        this.students = new Student[size];
    }

    public Student getStudent(int index) {
        return students[index];
    }

    public void addStudent(Student student) {
        this.students[last] = student;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new ClassroomIterator(this);
    }
}

class ClassroomIterator implements Iterator {

    private Classroom classroom;
    private int index;

    public ClassroomIterator(Classroom classroom) {
        this.classroom = classroom;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < classroom.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Student student = classroom.getStudent(index);
        index++;
        return student;
    }
}

class testMain {
    public static void main(String[] args) {
        Classroom classroom = new Classroom(2);
        classroom.addStudent(new Student("张三"));
        classroom.addStudent(new Student("李四"));

        Iterator iterator = classroom.iterator();
        while (iterator.hasNext()){
            Student next = (Student)iterator.next();
            System.out.println(next);
        }
    }
}
