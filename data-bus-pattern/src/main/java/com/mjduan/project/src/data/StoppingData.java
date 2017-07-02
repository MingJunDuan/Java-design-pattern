package com.mjduan.project.src.data;

import java.time.LocalDateTime;

import com.mjduan.project.src.AbstractDataType;
import com.mjduan.project.src.IDataType;

/**
 * Hans 2017-07-02 21:07
 */
public class StoppingData extends AbstractDataType {
    private final LocalDateTime when;

    public StoppingData(LocalDateTime when) {
        this.when = when;
    }

    public LocalDateTime getWhen() {
        return when;
    }

    public static IDataType of(final LocalDateTime when) {
        return new StoppingData(when);
    }
}
