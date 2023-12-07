package com.example.Calendar.Controllers;

import com.example.Calendar.Database.CalendarRepository;
import com.example.Calendar.Models.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CalendarController {
    @Autowired
    CalendarRepository calendarRepository;

    @PostMapping("/newcalendar")
    public Calendar insertNewCalendar(@RequestBody Calendar calendar){
        return calendarRepository.save(calendar);
    }
    @GetMapping("/getAllCalendar")
    public List<Calendar> getAllCalendar() {
        return calendarRepository.findAll();
    }

    @PutMapping("/updateCalendar/{id}")
    public ResponseEntity<Calendar> updateCalendar(@PathVariable Long id, @RequestBody Calendar updatedCalendar) {
        Optional<Calendar> existingCalendarOptional = calendarRepository.findById(id);
        if (existingCalendarOptional.isPresent()) {
            Calendar existingCalendar = existingCalendarOptional.get();
            existingCalendar.setName(updatedCalendar.getName());
            existingCalendar.setDate(updatedCalendar.getDate());

            calendarRepository.save(existingCalendar);
            return ResponseEntity.ok(existingCalendar);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/deleteCalendar/{id}")
    public ResponseEntity<Void> deleteCalendar(@PathVariable Long id) {
        Optional<Calendar> calendar = calendarRepository.findById(id);
        if (calendar.isPresent()) {
            calendarRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
