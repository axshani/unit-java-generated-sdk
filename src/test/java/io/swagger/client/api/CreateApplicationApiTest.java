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

import io.swagger.client.model.ApplicationsBody;
import io.swagger.client.model.UnitResponse1;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CreateApplicationApi
 */
@Ignore
public class CreateApplicationApiTest {

    private final CreateApplicationApi api = new CreateApplicationApi();

    /**
     * Create Application
     *
     * Create an Application via API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createApplicationTest() throws Exception {
        ApplicationsBody body = null;
        UnitResponse1 response = api.createApplication(body);

        // TODO: test validations
    }
}