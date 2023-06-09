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

import io.swagger.client.model.AccountsBody;
import io.swagger.client.model.UnitResponse4;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CreateAnAccountApi
 */
@Ignore
public class CreateAnAccountApiTest {

    private final CreateAnAccountApi api = new CreateAnAccountApi();

    /**
     * Create an Account
     *
     * Create an Account via API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createAccountTest() throws Exception {
        AccountsBody body = null;
        UnitResponse4 response = api.createAccount(body);

        // TODO: test validations
    }
}
