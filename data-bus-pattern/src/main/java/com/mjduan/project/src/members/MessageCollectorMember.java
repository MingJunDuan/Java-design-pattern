package com.mjduan.project.src.members;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.mjduan.project.src.IDataType;
import com.mjduan.project.src.IMember;
import com.mjduan.project.src.data.MessageData;

/**
 * Hans 2017-07-02 21:09
 */
public class MessageCollectorMember implements IMember {
    private final String name;
    private List<String> messages = new LinkedList<>();

    public MessageCollectorMember(String name) {
        this.name = name;
    }

    @Override
    public void accept(IDataType iDataType) {
        if (iDataType instanceof MessageData) {
            handleEvent((MessageData) iDataType);
        }
    }



    private void handleEvent(MessageData data) {
        System.out.println(name+" sees messages:" + data.getMessage());
        messages.add(data.getMessage());
    }

    public List<String> getMessages() {
        return Collections.unmodifiableList(messages);
    }

}
