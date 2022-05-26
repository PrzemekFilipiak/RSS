package com.zdjavapol110.rss.core.modules.event;

import java.util.List;

public interface EventService {

    EventDto createEvent(EventDto eventDto);

    List<EventDto>getAllEvents(int pageNo, int pageSize);

    EventDto getEventById(long id);

    EventDto updateEvent(EventDto eventDto, long id);

    void deleteEventById (long id);
}
