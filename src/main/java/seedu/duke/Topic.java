package seedu.duke;

import java.util.ArrayList;

public class Topic {
    protected String topicName;
    protected boolean hasAttempted;

    public Topic(String topicName) {
        this.topicName = topicName;
        this.hasAttempted = false;
    }

    public String getStatus() {
        if(hasAttempted) {
            return "Attempted";
        }
        else {
            return "Not Attempted";
        }
    }

    public void markAsAttempted() {
        this.hasAttempted = true;
    }

    public void addTopic (ArrayList<Topic> topicList, Topic topic){
        topicList.add(topic);
    }

    public String toString(){
        return "[" + getStatus() + "]" + topicName;
    }
}