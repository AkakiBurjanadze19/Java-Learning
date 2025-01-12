package PART6;

import java.util.ArrayList;

public class MessagingServiceUsage {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();

        Message message1 = new Message("author 1", "this is the first message");
        Message message2 = new Message("author 2", "this is the second message");
        Message message3 = new Message("author 3", "this is the third message");

        messagingService.addMessage(message1);
        messagingService.addMessage(message2);
        messagingService.addMessage(message3);

        ArrayList<Message> messages = messagingService.getMessages();

        for (Message message : messages) {
            System.out.println(message.getSender());
            System.out.println(message.getContent());
        }
    }
}
