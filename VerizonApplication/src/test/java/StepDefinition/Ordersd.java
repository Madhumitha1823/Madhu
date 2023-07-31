package StepDefinition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.junit.Assert.*;

public class Ordersd {

    private RequestSpecification request;
    private Response response;
    private String customerId;
    private String orderId;

    @Given("a customer with ID {string}")
    public void givenCustomerWithID(String customerId) {
        this.customerId = customerId;
    }

    @Given("an order payload with the following details:")
    public void givenOrderPayloadWithDetails(io.cucumber.datatable.DataTable dataTable) {
        // Code to extract and prepare the order payload data
    }

    @Given("an existing order with ID {string}")
    public void givenExistingOrderWithID(String orderId) {
        this.orderId = orderId;
    }

    @When("I send a POST request to {string} with the payload")
    public void sendPostRequestWithPayload(String endpoint, io.cucumber.datatable.DataTable dataTable) {
        // Code to extract payload from the DataTable and send POST request
    }

    @When("I send a PUT request to {string} with the payload")
    public void sendPutRequestWithPayload(String endpoint, io.cucumber.datatable.DataTable dataTable) {
        // Code to extract payload from the DataTable and send PUT request
    }

    @When("I send a GET request to {string}")
    public void sendGetRequest(String endpoint) {
        response = request.get(endpoint);
    }

    @Then("the response status code should be {int}")
    public void verifyResponseStatusCode(int expectedStatusCode) {
        assertEquals(expectedStatusCode, response.getStatusCode());
    }

    @Then("the response should be in JSON format")
    public void verifyResponseIsJSON() {
        // Code to verify if the response is in JSON format
    }

    @Then("the response should contain the following details:")
    public void verifyResponseContainsDetails(io.cucumber.datatable.DataTable dataTable) {
        // Code to extract data from the response and verify against the DataTable
    }
}