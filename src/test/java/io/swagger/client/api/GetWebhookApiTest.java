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

import io.swagger.client.model.UnitResponse28;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for GetWebhookApi
 */
@Ignore
public class GetWebhookApiTest {

    private final GetWebhookApi api = new GetWebhookApi();

    /**
     * Get Webhook Id
     *
     * Get a Webhook from API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findWebhookByIdTest() throws Exception {
        String webhookId = null;
        UnitResponse28 response = api.findWebhookById(webhookId);

        // TODO: test validations
    }
}
