package seedu.duke;

import java.util.ArrayList;
import java.util.Scanner;

public class Duke {
    /**
     * Main entry-point for the java.duke.Duke application.
     */

    public void createTopicList() {
        ArrayList<Topic> topiclist =  new ArrayList<>();
        //ArrayList<Topic> topicsList = Arrays.asList(topics);
    }
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        System.out.println("What is your name?");

        Scanner in = new Scanner(System.in);
        System.out.println("Hello " + in.nextLine());

        //String[] topics =  {"Intro to Java","Code Quality: Coding", "OOP: Classes and Objects", "Java: Objects", "Java: Classes" };
        ArrayList<Topic> topicList =  new ArrayList<>();
        Topic topic1 = new Topic("topic1");
        Topic topic2 = new Topic("topic2");
        topicList.add(topic1);
        topicList.add(topic2);
        new TopicList(topicList);

    }
}
