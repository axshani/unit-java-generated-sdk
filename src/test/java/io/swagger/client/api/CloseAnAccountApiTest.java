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

import io.swagger.client.model.AccountIdCloseBody;
import io.swagger.client.model.UnitResponse4;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CloseAnAccountApi
 */
@Ignore
public class CloseAnAccountApiTest {

    private final CloseAnAccountApi api = new CloseAnAccountApi();

    /**
     * Close an Account by Id
     *
     * Close an Account via API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void closeAccountByIdTest() throws Exception {
        AccountIdCloseBody body = null;
        String accountId = null;
        UnitResponse4 response = api.closeAccountById(body, accountId);

        // TODO: test validations
    }
}
