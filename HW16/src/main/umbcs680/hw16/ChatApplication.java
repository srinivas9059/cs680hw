package umbcs680.hw16;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ChatApplication {
    public static void main(String[] args) {
        // Create MulticastManager
        MulticastManager multicastManager = new MulticastManager();

        // Create ChatClients
        ChatClient client1 = new ChatClient("User1");
        ChatClient client2 = new ChatClient("User2");
        ChatClient client3 = new ChatClient("User3");

        // Register clients with MulticastManager
        multicastManager.registerClient(client1::receiveMessage);
        multicastManager.registerClient(client2::receiveMessage);
        multicastManager.registerClient(client3::receiveMessage);

        // Create and broadcast a message
        Message message = new Message("Admin", null, "Welcome to the chat room!");
        multicastManager.broadcastMessage(message);

        // Get the list of registered clients
        List<String> clients = multicastManager.getClients();
        System.out.println("Registered clients:");
        for (String client : clients) {
            System.out.println("- " + client);
        }
    }
}

class ChatClient {
    private String name;

    public ChatClient(String name) {
        this.name = name;
    }

    public void receiveMessage(Message message) {
        System.out.println("[" + name + "] Received message from " + message.getSender() + ": " + message.getContent());
    }

    public String getName() {
        return name;
    }
}

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

class MulticastManager {
    private List<Consumer<Message>> registeredClients;

    public MulticastManager() {
        this.registeredClients = new ArrayList<>();
    }

    public void registerClient(Consumer<Message> client) {
        registeredClients.add(client);
    }

    public void broadcastMessage(Message message) {
        // Logic to broadcast the message to all registered clients
        for (Consumer<Message> client : registeredClients) {
            client.accept(message);
        }
    }

    public List<String> getClients() {
        List<String> clientNames = new ArrayList<>();
        for (Consumer<Message> client : registeredClients) {
            if (client instanceof ChatClient) {
                ChatClient chatClient = (ChatClient) client;
                clientNames.add(chatClient.getName());
            }
        }
        return clientNames;
    }
}
