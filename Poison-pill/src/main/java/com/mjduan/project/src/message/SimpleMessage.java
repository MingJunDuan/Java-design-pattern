package com.mjduan.project.src.message;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Hans 2017-07-15 00:58
 */
public class SimpleMessage implements IMessage {
    private Map<Headers,String> headers = new HashMap<>();
    private String body;

    @Override
    public void addHeader(Headers header, String value) {
        headers.put(header,value);
    }

    @Override
    public String getHeader(Headers header) {
        return headers.get(header);
    }

    @Override
    public Map<Headers, String> getHeaders() {
        return Collections.unmodifiableMap(headers);
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String getBody() {
        return body;
    }
}
