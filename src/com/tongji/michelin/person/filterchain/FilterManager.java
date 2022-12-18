package com.tongji.michelin.person.filterchain;

import com.tongji.michelin.person.Person;
import com.tongji.michelin.person.filterchain.message.Message;

/**
 * @classname FilterManager
 * @description Our filter chain manager is mainly used to operate our processing objects, processing information, etc.
 */
public class FilterManager {

    /**
     * Our root handler
     */
    private Person rootPerson;

    /**
     * Current last processor
     */
    private Person currentPerson;

    /**
     * The message we need to deliver
     */
    private Message message;

    /**
     * Methods for performing messaging;
     *
     * @param message passed in at the beginning of the method
     */
    public void doFilterMessage(Message message) {
        this.message = message;
        doFilterMessage();
    }

    /**
     * This method can dynamically add the handler we need to enhance the flexibility of the code.
     *
     * @param person:Added handler
     * @return: is the addition successful
     */
    public boolean addPersonProcess(Person person) {
        /*
         * If NULL is passed in, false is returned directly
         */
        if (person == null) {
            return false;
        }
        /*
          If the root node is empty, put it directly into our root node;
         */
        if (rootPerson == null) {
            this.rootPerson = person;
            this.currentPerson = person;
            return true;
        }

        Person temp = rootPerson;
        /*
         * Loop through whether there are duplicate nodes. If there are duplicate nodes, insert is rejected.
         */
        while (temp != null) {
            // System.out.println(temp);
            if (person.equals(temp)) {
                return false;
            }
            temp = temp.getSuccessor();
        }

        /*
         * The last node points to our newly added node.
         */
        currentPerson.SetSuccessor(person);
        currentPerson = person;
        return true;
    }

    /**
     * The method of executing message passing to deliver message.
     *
     */
    public void doFilterMessage() {
        if (this.message == null) {
            throw new RuntimeException("message must not null!");
        }
        rootPerson.HandleRequest(this.message);
    }

    /**
     * Get our message
     *
     * @return: Get our message
     */
    public Message getMessage() {
        return message;
    }

    /**
     * Set up the message we send
     *
     * @param message send message
     */
    public void setMessage(Message message) {
        this.message = message;
    }

}
