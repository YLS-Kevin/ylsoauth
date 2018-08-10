package com.monkeyk.sos.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.monkeyk.sos.domain.dto.UserFormDto;
import com.monkeyk.sos.domain.dto.UserJsonDto;
import com.monkeyk.sos.domain.dto.UserOverviewDto;

/**
 * @author Tim
 */
public interface UserService extends UserDetailsService {

	UserJsonDto loadCurrentUserJsonDto();

	UserOverviewDto loadUserOverviewDto(UserOverviewDto overviewDto);

	boolean isExistedUsername(String username);

	String saveUser(UserFormDto formDto);
}