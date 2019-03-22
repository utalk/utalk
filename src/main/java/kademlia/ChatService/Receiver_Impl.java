package kademlia.ChatService;

import com.google.gson.Gson;
import kademlia.Model.Chat_Message;
import kademlia.Model.Log_Message;
import kademlia.util.HttpUtil;

import java.util.HashMap;
import java.util.Map;

public class Receiver_Impl implements Receiver {
    @Override
    public void receive(String message) {
        Chat_Message m = new Gson().fromJson(message, Chat_Message.class);
        System.out.println("receive "+m.getContent());
        // 输出日志
        Map<String,String> parameters=new HashMap<String,String>();
        parameters.put("value", new Gson().toJson(new Log_Message(m.getMessageID(),
                m.getFrom(),m.getTo(),m.getContent(),
                m.getTime(),"receive")));
//        HttpUtil.sendGet("", parameters);
        if(m.isGroup()){
            // 调用群聊
        }
        // 调用界面方法
    }
}
