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
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for GetCounterpartyApi
 */
@Ignore
public class GetCounterpartyApiTest {

    private final GetCounterpartyApi api = new GetCounterpartyApi();

    /**
     * Get Counterparty by Id
     *
     * Get a Counterparty from API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findCounterpartyByIdTest() throws Exception {
        String counterpartyId = null;
        String included = null;
        UnitResponse11 response = api.findCounterpartyById(counterpartyId, included);

        // TODO: test validations
    }
}