package com.sap.cloud.security.xsuaa.client;

import java.net.URI;
import javax.annotation.Nonnull;

public interface OAuth2TokenKeyService {

	/**
	 * Requests token web key set from OAuth Server.
	 *
	 * @param tokenKeysEndpointUri
	 *            the token endpoint URI (jku).
	 * @return An endpoint which returns the list of JSON Web Token (JWT) keys as
	 *         JSON string.
	 * @throws OAuth2ServiceException
	 *             in case of an error during the http request.
	 */
	String retrieveTokenKeys(@Nonnull URI tokenKeysEndpointUri) throws OAuth2ServiceException;
}
