package sem_5_hw.service;

import java.util.ArrayList;
import java.util.List;

import sem_5_hw.model.Student;
import sem_5_hw.model.Teacher;
import sem_5_hw.model.Type;
import sem_5_hw.model.User;

public class DataService {

    private List<User> userList;

    public void create(String firstName, String secondName, String middleName, Type type) {
        int id = getFreeID(type);
        if (Type.STUDENT == type) {
            Student student = new Student(firstName, secondName, middleName, id);
            userList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(firstName, secondName, middleName, id);
            userList.add(teacher);
        }
    }

    public User getUserByID(Type type, int id) {
        boolean itsStudent = Type.STUDENT == type;
        User currentuser = null;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent && ((Teacher) user).getTeacherID() == id) {
                currentuser = user;
            }
            if (user instanceof Student && !itsStudent && ((Student) user).getStudentID() == id) {
                currentuser = user;
            }
        }
        return currentuser;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public List<User> getAllStudent(){
        List<User> students = new ArrayList<>();
        for (User user: userList){
            if (user instanceof Student ){
                students.add(user);
            }
        }
        return students;
    }

    private int getFreeID(Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int lastID = 1;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent) {
                lastID = ((Teacher) user).getTeacherID() + 1;
            }
            if (user instanceof Student && !itsStudent) {
                lastID = ((Student) user).getStudentID() + 1;
            }
        }
        return lastID;
    }

}
