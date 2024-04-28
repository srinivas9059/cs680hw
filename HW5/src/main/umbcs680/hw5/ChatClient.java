package umbcs680.hw5;
// ChatClient class representing a client in the chat application
class ChatClient {
    private String name;

    public ChatClient(String name) {
        this.name = name;
    }

    public void sendMessage(Message message) {
        System.out.println("[" + name + "] Sending message: " + message.getContent());
    }

    public void receiveMessage(Message message) {
        System.out.println("[" + name + "] Received message from " + message.getSender() + ": " + message.getContent());
    }
}
