
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    public void testGetName() {
        Student student = new Student("Arthur", Grade.A, new Group(1));
        assertEquals("Arthur", student.getName());
    }

    @Test
    public void testGetGrade() {
        Student student = new Student("Arthur", Grade.A, new Group(1));
        assertEquals(Grade.A, student.getGrade());
    }

    @Test
    public void testNormalDowngrade() {
        Student student = new Student("Arthur", Grade.A, new Group(1));
        student.downgrade();
        assertEquals(Grade.B, student.getGrade());
        student.downgrade();
        assertEquals(Grade.C, student.getGrade());
        student.downgrade();
        assertEquals(Grade.D, student.getGrade());
        student.downgrade();
        assertEquals(Grade.E, student.getGrade());
        student.downgrade();
        assertEquals(Grade.F, student.getGrade());
    }

    @Test
    public void testNormalUpgrade() {
        Student student = new Student("Arthur", Grade.F, new Group(1));
        student.upgrade();
        assertEquals(Grade.E, student.getGrade());
        student.upgrade();
        assertEquals(Grade.D, student.getGrade());
        student.upgrade();
        assertEquals(Grade.C, student.getGrade());
        student.upgrade();
        assertEquals(Grade.B, student.getGrade());
        student.upgrade();
        assertEquals(Grade.A, student.getGrade());
    }

    @Test
    public void testWrongDowngrade() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Student student = new Student("Arthur", Grade.F, new Group(1));
            student.downgrade();
        });

        String expectedMessage = "Grade F is the lowest grades.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testWrongUpgrade() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Student student = new Student("Arthur", Grade.A, new Group(1));
            student.upgrade();
        });

        String expectedMessage = "Grade A is the highest grades.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testWrongGroup() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            @SuppressWarnings("unused")
            Student student = new Student("Arthur", Grade.A, new Group(6));
        });

        String expectedMessage = "Only allow group 1,2,3,4,5";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
