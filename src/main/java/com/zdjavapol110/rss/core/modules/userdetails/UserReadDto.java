package com.zdjavapol110.rss.core.modules.userdetails;

import lombok.Builder;
import lombok.Value;

@Builder(toBuilder = true)
@Value
public class UserReadDto {
  Long id;
  String displayName;
}
