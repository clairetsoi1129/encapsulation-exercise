import java.util.stream.IntStream;

public class Group {
    @SuppressWarnings("FieldCanBeLocal")
    private final int[] ALLOWED_GROUP = new int[]{1, 2, 3, 4, 5};
    @SuppressWarnings({"FieldCanBeLocal", "FieldMayBeFinal", "unused"})
    private int group;

    public Group(int group) {
        if (IntStream.of(ALLOWED_GROUP).noneMatch(x -> x == group))
            throw new IllegalArgumentException("Only allow group 1,2,3,4,5");
        this.group = group;
    }
}
