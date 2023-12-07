package com.example.Calendar.Controllers;

import com.example.Calendar.Database.EventRepository;

import com.example.Calendar.Models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EventController {
    @Autowired
    EventRepository eventRepository;

    @PostMapping("/newEvent")
    public Event insertNewEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    @GetMapping("/getAllEvent")
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @PutMapping("/updateEvent/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event updatedEvent) {
        Optional<Event> existingEventOptional = eventRepository.findById(id);
        if (existingEventOptional.isPresent()) {
            Event existingEvent = existingEventOptional.get();
            existingEvent.setTitle(updatedEvent.getTitle());
            existingEvent.setTitle(updatedEvent.getLocation());
            existingEvent.setTitle(updatedEvent.getDescription());
            existingEvent.setDate(updatedEvent.getDate());

            eventRepository.save(existingEvent);
            return ResponseEntity.ok(existingEvent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteEvent/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventRepository.deleteById(id);
    }
}
