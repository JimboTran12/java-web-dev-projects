public class Teacher {
    private String firstName;
    private String latName;
    private String subject;
    private int years;

    public int getYears() {
        return years;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLatName() {
        return latName;
    }

    public String getSubject() {
        return subject;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLatName(String latName) {
        this.latName = latName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
