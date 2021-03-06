package com.zdjavapol110.rss.core.modules.event;

import com.zdjavapol110.rss.core.modules.user.repository.UserEntity;
import com.zdjavapol110.rss.core.modules.userdetails.UserReadDto;
import org.springframework.data.domain.Page;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface EventService {

  EventDto createEvent(EventDto eventDto);

  Page<EventDto> getAllEvents(int pageNo, int pageSize, String sortBy, String sortDir);

  Page<EventDto> getAllEventsAfter(
      LocalDate date, int pageNo, int pageSize, String sortBy, String sortDir);

  EventDto getEventById(long id);

  EventDto updateEvent(EventDto eventDto);

  EventDto setCanDelete(EventDto eventDto, Optional<UserReadDto> currentUser);

  List<EventDto> getAllEvents(int pageNo, int pageSize);

  Page<EventDto> findByTitle(
      int pageNo, int pageSize, String sortBy, String sortDir, String keyword);

  void deleteEvent(Long id, UserReadDto deletedBy);

  @Transactional
  void addParticipantToEvent(Long eventId, Long userId);

  Optional<Event> getEventByEventName(String eventName);

  void registerUserToEvent(Long eventId, Set<UserEntity> userEntity);
}
