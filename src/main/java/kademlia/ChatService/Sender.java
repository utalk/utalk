package kademlia.ChatService;

import kademlia.Model.Chat_Message;

public interface Sender {

    public void send(String nodeID, Chat_Message message);

}
