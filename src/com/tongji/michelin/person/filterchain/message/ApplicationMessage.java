package com.tongji.michelin.person.filterchain.message;


/**
 * @classname ApplicationMessage
 * @description ApplicationMessage
 */
public class ApplicationMessage extends Message {

    /**
     * message type,The types of information users distinguish
     */
    private String MessageType = "application";

    public ApplicationMessage(String messageInfo) {
        super(messageInfo);
    }

    public String getMessageType() {
        return MessageType;
    }

    public void setMessageType(String messageType) {
        MessageType = messageType;
    }
}
