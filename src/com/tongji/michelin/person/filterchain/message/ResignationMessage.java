package com.tongji.michelin.person.filterchain.message;

/**
 * @classname ResignationMessage
 * @description ResignationMessage
 */
public class ResignationMessage extends Message {

    /**
     * message type,The types of information users distinguish
     */
    private String MessageType = "resignation";

    public ResignationMessage(String messageInfo) {
        super(messageInfo);
    }

    public String getMessageType() {
        return MessageType;
    }

    public void setMessageType(String messageType) {
        MessageType = messageType;
    }
}
