public class Student {
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    private Grade grade;

    @SuppressWarnings({"FieldMayBeFinal", "FieldCanBeLocal", "unused"})
    private Group group;

    @SuppressWarnings({"FieldMayBeFinal", "unused"})
    private String secretNickName = "MySecretNickName";

    public Student(String name, Grade grade, Group group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public void upgrade() {
        this.grade = grade.previous();
    }

    public void downgrade() {
        this.grade = grade.next();
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }
}
