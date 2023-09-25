package manager;

import model.Student;

import java.util.ArrayList;

public class StudentManager implements IStudentManager<Student> {
    ArrayList<Student> list = new ArrayList<>();
    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void update(int id, Student student) {
            list.set(id,student);
    }

    @Override
    public void remove(int id) {
        int index = findByid(id);
        list.remove(index);
    }

    @Override
    public ArrayList<Student> findAll() {
        return this.list;
    }

    @Override
    public ArrayList<Student> getName(String name) {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student:list) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())){
                students.add(student);
            }
        }
        return students;
    }

    @Override
    public int findByid(int id) {
        for (Student student: list) {
            if (student.getId()==id){
                return id;
            }
        }
        return -1;
    }
}
