package code._5_designPatterns_project.Observer;

import java.util.Iterator;
import java.util.List;

public class ChatWindow implements Observer {
    private String user;
    private ChatSession chatSession;

    public void update() {
        List<Message> messages = this.chatSession.getMessages();
        System.out.println("I'm " + this.user + ". Inbox:");
        Iterator var2 = messages.iterator();

        while(var2.hasNext()) {
            Message message = (Message)var2.next();
            if (!message.user.equals(this.user)) {
                System.out.println("Sender: " + message.user + " -> " + message.message);
            }
        }

    }

    public ChatWindow(String user, ChatSession session) {
        this.user = user;
        this.chatSession = session;
        this.chatSession.registerObserver(this);
    }

    void sendMessage(String text) {
        Message message = new Message(this.user, text);
        this.chatSession.addMessage(message);
        this.chatSession.notifyAllListening();
    }
}