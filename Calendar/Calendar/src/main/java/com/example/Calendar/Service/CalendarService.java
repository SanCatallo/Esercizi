package com.example.Calendar.Service;

import com.example.Calendar.Models.Calendar;

import java.util.List;

public interface CalendarService {
    List<Calendar> getAllCalendar();

    Calendar getCalendarById(Long calendarId);

    void addCalendar(Calendar calendar);

    void updateCalendar(Long calendarId, Calendar newCalendar);

    void deleteCalendar(Long calendarId);
}

