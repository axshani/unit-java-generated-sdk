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

import io.swagger.client.model.UnitResponse14;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ReportCardAsLostApi
 */
@Ignore
public class ReportCardAsLostApiTest {

    private final ReportCardAsLostApi api = new ReportCardAsLostApi();

    /**
     * Report lost as stolen
     *
     * Report lost as stolen via API 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void reportLostCardTest() throws Exception {
        UnitResponse14 response = api.reportLostCard();

        // TODO: test validations
    }
}
