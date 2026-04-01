interface Assignments {
    void giveAssignment();
}

interface Quizzes {
    void takeQuiz();
}

abstract class CourseE {
    abstract void startCourse();
}

class ProgrammingCourse extends CourseE implements Assignments, Quizzes {

    @Override
    void startCourse() {
        System.out.println("Programming Course Started.");
    }

    @Override
    public void giveAssignment() {
        System.out.println("Assignment: Build a Java project.");
    }

    @Override
    public void takeQuiz() {
        System.out.println("Quiz: OOP Concepts Quiz Started.");
    }

    void guestInstructor() {
        Instructor guest = new Instructor() {
            @Override
            public void teach() {
                System.out.println("Guest Instructor: Teaching one-time lecture on AI.");
            }
        };

        guest.teach();
    }
}

interface Instructor {
    void teach();
}

public class Q10 {
    public static void main(String[] args) {
        ProgrammingCourse course = new ProgrammingCourse();
        course.startCourse();
        course.giveAssignment();
        course.takeQuiz();
        course.guestInstructor();
    }
}