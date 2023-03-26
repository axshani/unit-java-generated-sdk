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

import io.swagger.client.model.UnitResponse19;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for GetListRewardsApi
 */
@Ignore
public class GetListRewardsApiTest {

    private final GetListRewardsApi api = new GetListRewardsApi();

    /**
     * Get Rewards List
     *
     * Get Rewards List from API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRewardsListTest() throws Exception {
        UnitResponse19 response = api.getRewardsList();

        // TODO: test validations
    }
}
