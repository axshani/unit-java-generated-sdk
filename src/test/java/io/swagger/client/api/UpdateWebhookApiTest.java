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
import io.swagger.client.model.UpdateUnitRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UpdateWebhookApi
 */
@Ignore
public class UpdateWebhookApiTest {

    private final UpdateWebhookApi api = new UpdateWebhookApi();

    /**
     * Update Webhook
     *
     * Update a Webhook via API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateWebhookTest() throws Exception {
        UpdateUnitRequest body = null;
        String webhookId = null;
        UnitResponse28 response = api.updateWebhook(body, webhookId);

        // TODO: test validations
    }
}
