package com.example.Calendar.Service;

import com.example.Calendar.Models.Event;

import java.util.List;

public interface EventService {
    List<Event> getAllEvents();

    Event getEventById(Long eventId);

    void addEvent(Event event);

    void updateEvent(Long eventId, Event newEvent);

    void deleteEvent(Long eventId);
}

