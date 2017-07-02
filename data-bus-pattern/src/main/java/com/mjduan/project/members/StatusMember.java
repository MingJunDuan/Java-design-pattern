package com.mjduan.project.members;

import java.time.LocalDateTime;

import com.mjduan.project.IDataType;
import com.mjduan.project.IMember;
import com.mjduan.project.data.MessageData;
import com.mjduan.project.data.StartingData;
import com.mjduan.project.data.StoppingData;

/**
 * Hans 2017-07-02 21:14
 */
public class StatusMember implements IMember {
    private final int id;
    private LocalDateTime started;
    private LocalDateTime stopped;

    public StatusMember(int id) {
        this.id = id;
    }

    @Override
    public void accept(IDataType iDataType) {
        if (iDataType instanceof StartingData) {
            handleEvent((StartingData)iDataType);
        } else if (iDataType instanceof StoppingData) {
            handleEvent((StoppingData) iDataType);
        }
    }

    private void handleEvent(StartingData data) {
        started = data.getWhen();
        System.out.printf("Receiver #%d sees application started at %s\n",id,started);
    }

    private void handleEvent(StoppingData data) {
        stopped = data.getWhen();
        System.out.printf("Receiver #%d seems application stopping at %s",id,stopped);
        data.getDataBus().publish(MessageData.of(String.format("Goodbye cruel world from '#%d'",id)));
    }

    public LocalDateTime getStarted() {
        return started;
    }

    public LocalDateTime getStopped() {
        return stopped;
    }
}
