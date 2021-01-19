public class Teacher  extends Person{
    private String subject;
    private int experience;

    public Teacher(String name, Dimension dim, String subject, int experience) {
        super(name, dim);
        this.subject = subject;
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
