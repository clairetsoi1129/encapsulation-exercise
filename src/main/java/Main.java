public class Main {
    public static void main(String[] args) {
        Student studentA = new Student("Arthur", Grade.A, 1);
        try {
            System.out.println("Student " + studentA.getName() + " Grade:" + studentA.getGrade());
            studentA.downgrade();
            System.out.println("After downgrade, student " + studentA.getName() + " Grade:" + studentA.getGrade());

            studentA.downgrade();
            System.out.println("After downgrade, student " + studentA.getName() + " Grade:" + studentA.getGrade());

            studentA.downgrade();
            System.out.println("After downgrade, student " + studentA.getName() + " Grade:" + studentA.getGrade());

            studentA.downgrade();
            System.out.println("After downgrade, student " + studentA.getName() + " Grade:" + studentA.getGrade());

            studentA.downgrade();
            System.out.println("After downgrade, student " + studentA.getName() + " Grade:" + studentA.getGrade());

            studentA.downgrade();
            System.out.println("After downgrade, student " + studentA.getName() + " Grade:" + studentA.getGrade());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            studentA.upgrade();
            System.out.println("After upgrade, student " + studentA.getName() + " Grade:" + studentA.getGrade());

            studentA.upgrade();
            System.out.println("After upgrade, student " + studentA.getName() + " Grade:" + studentA.getGrade());

            studentA.upgrade();
            System.out.println("After upgrade, student " + studentA.getName() + " Grade:" + studentA.getGrade());

            studentA.upgrade();
            System.out.println("After upgrade, student " + studentA.getName() + " Grade:" + studentA.getGrade());

            studentA.upgrade();
            System.out.println("After upgrade, student " + studentA.getName() + " Grade:" + studentA.getGrade());

            studentA.upgrade();
            System.out.println("After upgrade, student " + studentA.getName() + " Grade:" + studentA.getGrade());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            @SuppressWarnings("unused")
            Student studentB = new Student("Arthur", Grade.A, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}