package umbcs680.hw5;


public class ChatApplication {
    public static void main(String[] args) {
        // Create MulticastManager
        MulticastManager multicastManager = new MulticastManager();

        // Create ChatClients
        ChatClient client1 = new ChatClient("User1");
        ChatClient client2 = new ChatClient("User2");
        ChatClient client3 = new ChatClient("User3");

        // Register clients with MulticastManager
        multicastManager.registerClient(client1);
        multicastManager.registerClient(client2);
        multicastManager.registerClient(client3);

        // Create and broadcast a message
        Message message = new Message("Admin", null, "Welcome to the chat room!");
        multicastManager.broadcastMessage(message);
    }
}
