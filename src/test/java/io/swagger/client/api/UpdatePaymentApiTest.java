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

import io.swagger.client.model.UnitResponse9;
import io.swagger.client.model.UpdateUnitRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UpdatePaymentApi
 */
@Ignore
public class UpdatePaymentApiTest {

    private final UpdatePaymentApi api = new UpdatePaymentApi();

    /**
     * Update Payment
     *
     * Update an Payment via API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePaymentTest() throws Exception {
        UpdateUnitRequest body = null;
        String paymentId = null;
        UnitResponse9 response = api.updatePayment(body, paymentId);

        // TODO: test validations
    }
}
