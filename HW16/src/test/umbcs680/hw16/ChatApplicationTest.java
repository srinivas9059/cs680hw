package umbcs680.hw16;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChatApplicationTest {

    @Test
    public void testBroadcastMessage() {
        // Create a multicast manager
        MulticastManager multicastManager = new MulticastManager();

        // Create chat clients
        TestChatClient client1 = new TestChatClient("User1");
        TestChatClient client2 = new TestChatClient("User2");

        // Register clients with the multicast manager
        multicastManager.registerClient(client1::receiveMessage);
        multicastManager.registerClient(client2::receiveMessage);

        // Create a message
        Message message = new Message("Admin", null, "Welcome to the chat room!");

        // Broadcast the message
        multicastManager.broadcastMessage(message);

        // Check that both clients received the message
        assertEquals(1, client1.getReceivedMessages().size());
        assertEquals(1, client2.getReceivedMessages().size());
        assertEquals("Welcome to the chat room!", client1.getReceivedMessages().get(0));
        assertEquals("Welcome to the chat room!", client2.getReceivedMessages().get(0));
    }

    // A test chat client for testing message reception
    static class TestChatClient {
        public String name;
        private List<String> receivedMessages;

        public TestChatClient(String name) {
            this.name = name;
            this.receivedMessages = new ArrayList<>();
        }

        public void receiveMessage(Message message) {
            receivedMessages.add(message.getContent());
        }

        public List<String> getReceivedMessages() {
            return receivedMessages;
        }
    }

    
}
