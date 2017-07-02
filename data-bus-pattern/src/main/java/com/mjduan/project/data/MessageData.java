package com.mjduan.project.data;

import com.mjduan.project.AbstractDataType;
import com.mjduan.project.IDataType;

/**
 * Hans 2017-07-02 21:04
 */
public class MessageData extends AbstractDataType{
    private final String message;

    public MessageData(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static IDataType of(final String message) {
        return new MessageData(message);
    }
}
