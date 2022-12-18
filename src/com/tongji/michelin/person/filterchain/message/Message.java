package com.tongji.michelin.person.filterchain.message;

/**
 * @classname Message
 * @description Our base class for passing messages
 */
public abstract class Message {

    /**
     * Content of specific message
     */
    protected String messageInfo;

    /**
     * Construct method, set our information
     *
     * @param messageInfo info of message
     */
    public Message(String messageInfo) {
        this.messageInfo = messageInfo;
    }

    /**
     * @return: get class message
     */
    public String getMessageInfo() {
        return messageInfo;
    }

    /**
     * @param messageInfo:set message
     */
    public void setMessageInfo(String messageInfo) {
        this.messageInfo = messageInfo;
    }
}
