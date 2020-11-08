package ca.ioxom.part6.objectswithinobjects;

import java.util.ArrayList;

public class MessagingService {
    private static class Message {
        private final String content;
        private final String sender;
        public Message(String content, String sender) {
            this.content = content;
            this.sender = sender;
        }

        public String getContent() {
            return this.content;
        }

        public String getSender() {
            return this.sender;
        }
    }
    private ArrayList<Message> messages;
    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.messages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
