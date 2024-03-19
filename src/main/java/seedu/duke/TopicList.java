package seedu.duke;

import java.util.ArrayList;
import java.util.Scanner;

public class TopicList {
    private ArrayList<Topic> topicList;
    private static Ui ui;


    public void startGame(int index, ArrayList<Topic> topicList) {
        ui.printMessage(topicList.get(index - 1).topicName);
        ui.printMessage("There are 10 questions in this question set. Type in the correct answer and press enter to move on to the next question.");
    }

    public TopicList(ArrayList<Topic> topicList) {
        int numberOfTopics = topicList.size();
        ui = new Ui();
        ui.printMessage("Here are the topics in CS2113: ");
        for (int index = 0; index < numberOfTopics; index++) {
            System.out.println((index + 1) + ". " + topicList.get(index));
        }
        ui.printMessage("Please enter the index of the topic you would like to attempt: ");
        try {
            Scanner input = new Scanner(System.in);
            int chosenTopic = Integer.parseInt(input.nextLine());
            startGame(chosenTopic, topicList);
        } catch (IndexOutOfBoundsException e){
            ui.printMessage("Topic number not in the list, please try again. ");
        }
    }
}
