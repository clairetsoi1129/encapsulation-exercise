public enum Grade {
    A,
    B,
    C,
    D,
    E,
    F;

    private static final Grade[] grades = values();

    public Grade next() {
        int ordinal = this.ordinal();
        if (ordinal == grades.length - 1) {
            throw new RuntimeException("Grade " + grades[ordinal] + " is the lowest grades.");
        }
        return grades[(ordinal + 1) % grades.length];
    }

    public Grade previous() {
        int ordinal = this.ordinal();
        if (ordinal == 0) {
            throw new RuntimeException("Grade " + grades[ordinal] + " is the highest grades.");
        }
        return grades[(ordinal - 1) % grades.length];
    }
}
