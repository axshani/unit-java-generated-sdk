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

import io.swagger.client.model.UnitResponse21;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for GetInstitutionApi
 */
@Ignore
public class GetInstitutionApiTest {

    private final GetInstitutionApi api = new GetInstitutionApi();

    /**
     * Get Institution by Routing Number
     *
     * Get an Institution from API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findInstitutionByRoutingNumberTest() throws Exception {
        String routingNumber = null;
        UnitResponse21 response = api.findInstitutionByRoutingNumber(routingNumber);

        // TODO: test validations
    }
}