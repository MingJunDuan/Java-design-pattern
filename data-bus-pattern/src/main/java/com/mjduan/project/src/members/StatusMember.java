package com.mjduan.project.src.members;

import java.time.LocalDateTime;

import com.mjduan.project.src.IDataType;
import com.mjduan.project.src.IMember;
import com.mjduan.project.src.data.MessageData;
import com.mjduan.project.src.data.StartingData;
import com.mjduan.project.src.data.StoppingData;

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
        System.out.printf("Receiver(StatusMember) #%d sees application started at %s\n",id,started);
    }

    private void handleEvent(StoppingData data) {
        stopped = data.getWhen();
        System.out.printf("Receiver(StatusMember) #%d seems application stopping at %s\n",id,stopped);
        data.getDataBus().publish(MessageData.of(String.format("Goodbye cruel world from '#%d'",id)));
    }

    public LocalDateTime getStarted() {
        return started;
    }

    public LocalDateTime getStopped() {
        return stopped;
    }
}
