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

import io.swagger.client.model.ApplicationIdCancelBody;
import io.swagger.client.model.UnitResponse1;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CancelApplicationApi
 */
@Ignore
public class CancelApplicationApiTest {

    private final CancelApplicationApi api = new CancelApplicationApi();

    /**
     * Cancel Application by Id
     *
     * Cancel a Application via API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cancelApplicationByIdTest() throws Exception {
        ApplicationIdCancelBody body = null;
        String applicationId = null;
        UnitResponse1 response = api.cancelApplicationById(body, applicationId);

        // TODO: test validations
    }
}
