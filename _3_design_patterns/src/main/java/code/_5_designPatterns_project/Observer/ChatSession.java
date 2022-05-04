package code._5_designPatterns_project.Observer;

import java.util.ArrayList;
import java.util.List;

public class ChatSession extends Subject {
    private List<Message> messages = new ArrayList();

    public ChatSession() {
    }

    public List<Message> getMessages() {
        return this.messages;
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }
}
