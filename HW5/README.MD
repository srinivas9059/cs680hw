**Chat Application with Multicast Design Pattern**

This code implements a simple chat application using the Multicast design pattern. The application allows multiple users to participate in a chat room environment, where messages sent by one user are broadcasted to all other users.

**Multicast Implementation:**

- **ChatClient:** Each user participating in the chat is represented by a ChatClient instance. The ChatClient connects to the central ChatApplication using a socket connection.

 It sends messages entered by the user to the ChatApplication and receives messages from other users.

- **ChatApplication:** The ChatApplication acts as the central coordinator for the chat room. It manages incoming connections from ChatClients and facilitates message transmission between clients.

 When a message is received from one client, the ChatApplication uses the MulticastManager to broadcast the message to all other connected clients.

- **MulticastManager:** The MulticastManager implements the Multicast design pattern by handling the multicast communication between ChatClients. It maintains a list of connected clients and broadcasts messages received from one client to all other clients in the list. 

This abstraction allows for efficient communication between multiple clients without the need for each client to maintain separate connections with every other client.
