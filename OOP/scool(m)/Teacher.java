public class Teacher extends Person {
    private int teacherID;
    private String subject;

    public Teacher(String name, String address, int teacherID, String subject) {
        super(name, address);
        this.teacherID = teacherID;
        this.subject = subject;
    }

    public int getTeacherID() {
        return this.teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "{" + " teacherID='" + getTeacherID() + "'" + ", subject='" + getSubject() + "'" + "}";
    }

}
