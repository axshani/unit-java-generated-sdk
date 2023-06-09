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

import io.swagger.client.model.UnitResponse24;
import io.swagger.client.model.UserIdApitokensBody;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CreateOrgApiTokenApi
 */
@Ignore
public class CreateOrgApiTokenApiTest {

    private final CreateOrgApiTokenApi api = new CreateOrgApiTokenApi();

    /**
     * Create Org API Token
     *
     * Create an Org API Token via API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createOrgApiTokenTest() throws Exception {
        UserIdApitokensBody body = null;
        UnitResponse24 response = api.createOrgApiToken(body);

        // TODO: test validations
    }
}
