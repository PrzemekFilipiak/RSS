package com.zdjavapol110.rss.core.modules.event;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {

    private Long id;
   // private String uuid;
    private String title;
    private String date;
    private String description;

}
