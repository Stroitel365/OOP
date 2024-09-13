package sem_4_hw.service;

import java.time.LocalDate;
import java.util.List;

import sem_4_hw.data.Teacher;

public class TeacherService implements UserService<Teacher>{

    private List<Teacher> teacherList;
    private Integer maxTeacherId = 0;

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }
    
    
    public void initData(List<Teacher> list) {
        this.teacherList = list;
        maxTeacherId = getNewMaxTeacherId();
    }

    @Override
    public void create(String secondName, String firstName, String patronymic, LocalDate dateOfBirth) {
        Teacher teacher = new Teacher( ++maxTeacherId, firstName, secondName, patronymic, dateOfBirth);
        teacherList.add(teacher);
    }
    public void editTeacher(Integer teacherId, String secondName, String firstname, String patronymic){
        for (Teacher teacher: teacherList) {
            if (teacher.getTeacherId().equals(teacherId)){
                teacher.setSecondname(secondName);
                teacher.setFirstname(firstname);
                teacher.setPatronymic(patronymic);
            }
        }
    }
    private Integer getNewMaxTeacherId(){
        Integer result = teacherList.get(0).getTeacherId();
        for (Teacher teacher: teacherList) {
            if (result < teacher.getTeacherId()){
                result = teacher.getTeacherId();
            }
        }
        return result;
    }

}