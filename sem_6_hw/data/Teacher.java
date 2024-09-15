package sem_6_hw.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User{

    private Integer teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }


    public Teacher(Integer teacherId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }


    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }

    public void setSecondname(String secondName) {
        super.setSecondName(secondName);
    }


    public void setFirstname(String firstname) {
        super.setFirstName(firstname);
    }
}
