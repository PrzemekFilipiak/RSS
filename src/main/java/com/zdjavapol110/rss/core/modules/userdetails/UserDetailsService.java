package com.zdjavapol110.rss.core.modules.userdetails;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public interface UserDetailsService {
  Optional<UserReadDto> getUserDetailsFromRequest(HttpServletRequest request);

  UserReadDto getRequiredUserDetailsFromRequest(HttpServletRequest request);
}
