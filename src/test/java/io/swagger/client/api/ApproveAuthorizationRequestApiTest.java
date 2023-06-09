/*
 * Unit Python SDK
 * An API for testing openapi-python-client for unit-sdk
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.UnitResponse17;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ApproveAuthorizationRequestApi
 */
@Ignore
public class ApproveAuthorizationRequestApiTest {

    private final ApproveAuthorizationRequestApi api = new ApproveAuthorizationRequestApi();

    /**
     * Approve Authorization Request by Id
     *
     * Approve a Authorization Request via API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void approveAuthorizationRequestByIdTest() throws Exception {
        String authorizationId = null;
        UnitResponse17 response = api.approveAuthorizationRequestById(authorizationId);

        // TODO: test validations
    }
}
