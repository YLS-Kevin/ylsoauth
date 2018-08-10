package com.monkeyk.sos.domain.oauth;

import static com.monkeyk.sos.infrastructure.CacheConstants.ACCESS_TOKEN_CACHE;
import static com.monkeyk.sos.infrastructure.CacheConstants.REFRESH_TOKEN_CACHE;

import javax.sql.DataSource;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

/**
 * 2018/3/26
 * <p/>
 * 扩展默认的 TokenStore, 增加对缓存的支持
 *
 * @author Tim
 */
public class CustomJdbcTokenStore extends JdbcTokenStore {

	public CustomJdbcTokenStore(DataSource dataSource) {
		super(dataSource);
	}

	@Cacheable(value = ACCESS_TOKEN_CACHE, key = "#tokenValue")
	public OAuth2AccessToken readAccessToken(String tokenValue) {
		return super.readAccessToken(tokenValue);
	}

	@CacheEvict(value = ACCESS_TOKEN_CACHE, key = "#token.value")
	@Override
	public void removeAccessToken(OAuth2AccessToken token) {
		super.removeAccessToken(token);
	}

	@Cacheable(value = REFRESH_TOKEN_CACHE, key = "#token")
	public OAuth2RefreshToken readRefreshToken(String token) {
		return super.readRefreshToken(token);
	}

	@CacheEvict(value = REFRESH_TOKEN_CACHE, key = "#token.value")
	@Override
	public void removeRefreshToken(OAuth2RefreshToken token) {
		super.removeRefreshToken(token);
	}

}
