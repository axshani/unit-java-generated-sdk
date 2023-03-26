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

import io.swagger.client.model.UnitResponse11;
import io.swagger.client.model.UpdateUnitRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UpdateCounterpartyApi
 */
@Ignore
public class UpdateCounterpartyApiTest {

    private final UpdateCounterpartyApi api = new UpdateCounterpartyApi();

    /**
     * Update Counterparty
     *
     * Update a Counterparty via API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateCounterpartyTest() throws Exception {
        UpdateUnitRequest body = null;
        String counterpartyId = null;
        UnitResponse11 response = api.updateCounterparty(body, counterpartyId);

        // TODO: test validations
    }
}
