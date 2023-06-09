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

import io.swagger.client.model.UnitResponse18;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for GetCheckDepositBackImageApi
 */
@Ignore
public class GetCheckDepositBackImageApiTest {

    private final GetCheckDepositBackImageApi api = new GetCheckDepositBackImageApi();

    /**
     * Get Back Check Deposit Image by Id
     *
     * Get Back Check Deposit Image from API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBackCheckDepositImageByIdTest() throws Exception {
        String checkDepositId = null;
        UnitResponse18 response = api.getBackCheckDepositImageById(checkDepositId);

        // TODO: test validations
    }
}
