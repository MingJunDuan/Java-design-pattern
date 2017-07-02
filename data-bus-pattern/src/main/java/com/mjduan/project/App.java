package com.mjduan.project;

import java.time.LocalDateTime;

import com.mjduan.project.data.MessageData;
import com.mjduan.project.data.StartingData;
import com.mjduan.project.data.StoppingData;
import com.mjduan.project.members.MessageCollectorMember;
import com.mjduan.project.members.StatusMember;

/**
 * Hans 2017-07-02 21:22
 */
public class App {

    public static void main(String[] args){
        final DataBus dataBus = DataBus.getInstance();
        dataBus.subscribe(new StatusMember(1));
        dataBus.subscribe(new StatusMember(2));

        final MessageCollectorMember foo = new MessageCollectorMember("foo");
        final MessageCollectorMember bar = new MessageCollectorMember("bar");

        dataBus.subscribe(foo);
        dataBus.publish(StartingData.of(LocalDateTime.now()));
        dataBus.publish(MessageData.of("ONly foo should see this"));
        dataBus.subscribe(bar);

        dataBus.publish(MessageData.of("Foo and Bar should see the this"));
        dataBus.unSubscribe(foo);

        dataBus.publish(MessageData.of("Only bar should see this"));
        dataBus.publish(StoppingData.of(LocalDateTime.now()));
    }

}
