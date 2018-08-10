package com.monkeyk.sos.domain.oauth;

import java.util.List;

import com.monkeyk.sos.domain.shared.Repository;

/**
 * 处理 OAuth 相关业务的 Repository
 *
 * @author Tim
 */
public interface OauthRepository extends Repository {

	OauthClientDetails findOauthClientDetails(String clientId);

	List<OauthClientDetails> findAllOauthClientDetails();

	void updateOauthClientDetailsArchive(String clientId, boolean archive);

	void saveOauthClientDetails(OauthClientDetails clientDetails);
}