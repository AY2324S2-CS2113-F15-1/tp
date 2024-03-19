package seedu.duke;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
public class TopicListTest {
    ArrayList<Topic> topicsList;
    Topic topic1;
    Topic topic2;

    void createTopicList(){
        topicsList = new ArrayList<>();
        createTwoTopics();
    }

    void createTwoTopics(){
        topic1 = new Topic("topic1");
        topic2 = new Topic("topic2");
    }

    @Test
    void getTopics() {
        createTopicList();
        assertEquals("[not attempted] topic1\n [not attempted] topic2\n", new TopicList(topicsList).toString());
    }
}
