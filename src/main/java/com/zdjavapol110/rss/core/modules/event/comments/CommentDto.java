package com.zdjavapol110.rss.core.modules.event.comments;

import com.zdjavapol110.rss.core.modules.userdetails.UserReadDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {
  private Long id;
  private String body;
  private UserReadDto createdBy;
  private LocalDate createdDate;
}
