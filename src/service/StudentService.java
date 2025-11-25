package service;

import model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public boolean addStudent(Student s) {
        if (findById(s.getId()) != null) return false;
        students.add(s);
        return true;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    public List<Student> findByName(String namePart) {
        List<Student> result = new ArrayList<>();
        String q = namePart.toLowerCase();

        for (Student s : students) {
            if (s.getName().toLowerCase().contains(q)) {
                result.add(s);
            }
        }
        return result;
    }

    public boolean updateStudent(int id, String newName, Integer newAge, String newCourse, Double newMarks) {
        Student s = findById(id);
        if (s == null) return false;

        if (newName != null) s.setName(newName);
        if (newAge != null) s.setAge(newAge);
        if (newCourse != null) s.setCourse(newCourse);
        if (newMarks != null) s.setMarks(newMarks);

        return true;
    }

    public boolean deleteStudent(int id) {
        Student s = findById(id);
        if (s == null) return false;
        return students.remove(s);
    }
}
