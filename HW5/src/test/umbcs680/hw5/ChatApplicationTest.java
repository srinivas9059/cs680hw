package umbcs680.hw5;
import org.junit.jupiter.api.Test;

public class ChatApplicationTest {

    @Test
    public void testSendMessage() {
        // Create a chat client
        ChatClient client = new ChatClient("User1");

        // Create a message
        Message message = new Message("User1", null, "Hello, world!");

        // Send the message
        client.sendMessage(message);
    }
        // Test that the message was sent successfully
      

    @Test
    public void testReceiveMessage() {
        // Create a chat client
        ChatClient client = new ChatClient("User1");

        // Create a message
        Message message = new Message("User2", null, "Hello, User1!");

        // Receive the message
        client.receiveMessage(message);

        // Check that the message was received successfully
        
    }

    @Test
    public void testMulticastManagerBroadcastMessage() {
        // Create a multicast manager
        MulticastManager multicastManager = new MulticastManager();

        // Create chat clients
        ChatClient client1 = new ChatClient("User1");
        ChatClient client2 = new ChatClient("User2");

        // Register clients with the multicast manager
        multicastManager.registerClient(client1);
        multicastManager.registerClient(client2);

        // Create a message
        Message message = new Message("Admin", null, "Welcome to the chat room!");

        // Broadcast the message
        multicastManager.broadcastMessage(message);

        // Check that both clients received the message
        
    }
}
