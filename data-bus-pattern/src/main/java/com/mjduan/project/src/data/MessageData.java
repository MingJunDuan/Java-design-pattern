package com.mjduan.project.src.data;

import com.mjduan.project.src.AbstractDataType;
import com.mjduan.project.src.IDataType;

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
