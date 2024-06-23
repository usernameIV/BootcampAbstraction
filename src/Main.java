import com.dio.challenge.domain.Course;
import com.dio.challenge.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course myCourse = new Course();
        Mentoring myMentoring = new Mentoring();
        myCourse.setTitle("Java course - Intermediate level!");
        myCourse.setDescription("A java course where you'll learn " +
                "everything to an intermediate level in java!");
        myCourse.setWorkload(10);

        myMentoring.setTitle("The Mentoring");
        myMentoring.setDescription("The best mentoring group ever!");
        myMentoring.setDate(LocalDate.now());

        System.out.println(myCourse);
        System.out.println();
        System.out.println();
        System.out.println(myMentoring);

    }
}
