import kademlia.ChatService.Sender;
import kademlia.ChatService.Sender_Impl;
import kademlia.Kademlia;
import kademlia.Model.Chat_Message;
import kademlia.listener.UDPListener;
import kademlia.node.Key;
import kademlia.node.Node;

import java.util.concurrent.TimeoutException;

/**
 * All rights Reserved, Designed by Popping Lim
 *
 * @Author: Popping Lim
 * @Date: 2019/3/21
 * @Todo:
 */
public class Main {

    private static final String[] KEYS = new String[] {
            "738a4793791b8a672050cf495ac15fdae8c5e171",
            "1e8f1fb41a86a828dc14f0f72a97388ecf22d0b0",
            "4e876501a5aa9bc0890aa7b2066a51f011a05bee",
            "6901145bb2f1b655f106b72b1f5351e34d71c96c",
            "6c7950726634ef8b9f0708879067aa935313cebe",
            "2e706bd3d73524e58229ab489ce106834627a6ae"
    };

    public static void main(String args[]) {
        Sender sender = new Sender_Impl();
        /**
         *  初始化 node
         */

        Sender_Impl.kademlia = new Kademlia(
                Key.build(KEYS[1]),
                "udp://127.0.0.1:9002"
        );

        try {
            Sender_Impl.kademlia.bootstrap(Node.builder().advertisedListener(
                    new UDPListener("udp://127.0.0.1:9001")
            ).build());

            sender.send(KEYS[0], new Chat_Message("123","11","11","11",System.currentTimeMillis(),true));
        }catch (TimeoutException e) {
            e.printStackTrace();
        } finally {
//            Sender_Impl.kademlia.close();
        }
    }
}
