package com.company.mosh.mediator;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHundler) {
        eventHandlers.add(eventHundler);
    }

    public void notifyObservers() {
        for (var eventHandler : eventHandlers) {
            eventHandler.hundle();
        }
    }
}
