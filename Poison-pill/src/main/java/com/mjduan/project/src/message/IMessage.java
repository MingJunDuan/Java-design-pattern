package com.mjduan.project.src.message;

import java.util.Map;

/**
 * Hans 2017-07-15 00:46
 */
public interface IMessage {

    IMessage POISON_PILL = new IMessage() {
        @Override
        public void addHeader(Headers header, String value) {
            throw poison();
        }

        @Override
        public String getHeader(Headers header) {
            throw poison();
        }

        @Override
        public Map<Headers, String> getHeaders() {
            throw poison();
        }

        @Override
        public void setBody(String body) {
            throw poison();
        }

        @Override
        public String getBody() {
            throw poison();
        }

        private RuntimeException poison(){
            return new UnsupportedOperationException("Poison");
        }
    };

    public enum Headers{
        DATE,SENDER
    }

    void addHeader(Headers header,String value);
    String getHeader(Headers header);
    Map<Headers,String> getHeaders();
    void setBody(String body);
    String getBody();

}
