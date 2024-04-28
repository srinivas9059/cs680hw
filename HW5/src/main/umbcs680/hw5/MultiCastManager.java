package umbcs680.hw5;
import java.util.ArrayList;
import java.util.List;

// Message class representing a message exchanged between clients
class Message {
    private String sender;
    private List<String> recipients;
    private String content;

    public Message(String sender, List<String> recipients, String content) {
        this.sender = sender;
        this.recipients = recipients;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public String getContent() {
        return content;
    }
}

// MulticastManager class implementing the Multicast design pattern
class MulticastManager {
    private List<ChatClient> clients;

    public MulticastManager() {
        this.clients = new ArrayList<>();
    }

    public void registerClient(ChatClient client) {
        clients.add(client);
    }

    public void broadcastMessage(Message message) {
        for (ChatClient client : clients) {
            client.receiveMessage(message);
        }
    }
}
