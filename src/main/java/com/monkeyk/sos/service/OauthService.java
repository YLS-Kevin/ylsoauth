package com.monkeyk.sos.service;

import java.util.List;

import com.monkeyk.sos.domain.dto.OauthClientDetailsDto;
import com.monkeyk.sos.domain.oauth.OauthClientDetails;

/**
 * 2018/3/12
 *
 * @author Tim
 */
public interface OauthService {

	OauthClientDetails loadOauthClientDetails(String clientId);

	List<OauthClientDetailsDto> loadAllOauthClientDetailsDtos();

	void archiveOauthClientDetails(String clientId);

	OauthClientDetailsDto loadOauthClientDetailsDto(String clientId);

	void registerClientDetails(OauthClientDetailsDto formDto);
}