package com.mjduan.project;

import java.util.HashSet;
import java.util.Set;

/**
 * Hans 2017-07-02 20:55
 */
public class DataBus {
    private static final DataBus INSTANCE = new DataBus();
    private final Set<IMember> listeners = new HashSet<>();

    public static DataBus getInstance() {
        return INSTANCE;
    }

    public void subscribe(final IMember member) {
        this.listeners.add(member);
    }

    public void unSubscribe(final IMember member) {
        this.listeners.remove(member);
    }

    public void publish(final IDataType dataType) {
        dataType.setDataBus(this);
        listeners.forEach(listener->listener.accept(dataType));
    }

}
