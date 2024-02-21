public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Smith", "Math");
        teacher1.teach();
    }
}
