package sem_5_hw.model;

public class Teacher extends User{


    private int teacherID;

    public Teacher(String firstName, String secondName, String middleName, int teacherID) {
        super(firstName, secondName, middleName);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }
    

    
}
