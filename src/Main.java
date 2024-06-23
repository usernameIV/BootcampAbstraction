import com.dio.challenge.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course myCourse = new Course();
        Course myCourse1 = new Course();
        Mentoring myMentoring = new Mentoring();
        Bootcamp btc = new Bootcamp();
        Bootcamp btc1 = new Bootcamp();

        myCourse.setTitle("Java course - Intermediate level!");
        myCourse.setDescription("A java course where you'll learn " +
                "everything to an intermediate level in java!");
        myCourse.setWorkload(25);


        myCourse1.setTitle("Typescript course - Starter package!");
        myCourse1.setDescription("In this typescript-through journey you're about to learn " +
                "the basic tricks every type-script should know!");
        myCourse1.setWorkload(5);

        myMentoring.setTitle("The Mentoring");
        myMentoring.setDescription("The best mentoring group ever!");
        myMentoring.setDate(LocalDate.now());

        /*
        System.out.print(myCourse);
        System.out.print(myCourse1);
        System.out.println(myMentoring);
        */


        btc.setName("Java Bootcamp - Advanced");
        btc.setDescription("A java Bootcamp where you'll learn " +
                "everything to an advanced level in java!");
        btc.getSbj().add(myCourse);
        btc.getSbj().add(myMentoring);
        btc1.getSbj().add(myCourse1);
        btc1.getSbj().add(myMentoring);

        Dev dan = new Dev();
        dan.setName("Danton");
        dan.subscribeInBootcamp(btc);
        dan.subscribeInBootcamp(btc1);
        System.out.println("Subscribed subjects - Danton: "+ dan.getSubjectsSubscribe());
        dan.advance();
        System.out.println("Subscribed subjects - Danton: "+ dan.getSubjectsSubscribe());
        System.out.println("Done subjects - Danton: "+ dan.getDoneSubjects());
        System.out.println("Xp: "+ dan.calculateAllXp());


        Dev bon = new Dev();
        bon.setName("Bonner");
        bon.subscribeInBootcamp(btc1);
        System.out.println("Subscribed subjects - Bonner: "+ bon.getSubjectsSubscribe());
        bon.advance();
        System.out.println("Subscribed subjects - Bonner: "+ bon.getSubjectsSubscribe());
        System.out.println("Done subjects - Bonner: "+ bon.getDoneSubjects());
        System.out.println("Xp: "+ bon.calculateAllXp());
    }
}
