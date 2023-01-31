import java.util.stream.IntStream;

public class Student {
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    private Grade grade;

    @SuppressWarnings({"FieldMayBeFinal", "FieldCanBeLocal", "unused"})
    private int group;

    @SuppressWarnings({"FieldMayBeFinal", "unused"})
    private String secretNickName = "MySecretNickName";

    @SuppressWarnings("FieldCanBeLocal")
    private final int[] ALLOWED_GROUP = new int[]{1, 2, 3, 4, 5};

    public Student(String name, Grade grade, int group) {
        this.name = name;
        this.grade = grade;

        validateGroup(group);
        this.group = group;
    }

    private void validateGroup(int group){
        if (IntStream.of(ALLOWED_GROUP).noneMatch(x -> x == group))
            throw new IllegalArgumentException("Only allow group 1,2,3,4,5");
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
