package kademlia.Model;

public class Log_Message {

    private String messageID;

    private String from;

    private String to;

    private String content;

    private long time;

    private String type;

    public Log_Message(String messageID, String from, String to, String content, long time, String type) {
        this.messageID = messageID;
        this.from = from;
        this.to = to;
        this.content = content;
        this.time = time;
        this.type = type;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
