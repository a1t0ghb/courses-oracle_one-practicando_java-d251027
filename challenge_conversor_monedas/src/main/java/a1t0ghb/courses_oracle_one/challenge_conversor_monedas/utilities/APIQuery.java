/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.challenge_conversor_monedas.utilities;

//  IMPORTS: external classes and interfaces.

//  IMPORTS - UTILITIES.

//  Java utilities:
//  - Shortcut for importing ALL Java Utils: 'import java.util.*;'.

//  HTTP requests:
import java.net.URI;                                                //  [Class] Uniform Resource Identifier (URI) to use, for example, with URLs for API calls and HTTP requests: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/net/URI.html'.
import java.net.http.HttpClient;                                    //  [Class] Client to send and receive HTTP requests: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpClient.html'.
import java.net.http.HttpRequest;                                   //  [Class] HTTP request: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html'.
import java.net.http.HttpResponse;                                  //  [Interface] An HttpResponse is not created DIRECTLY, but rather returned as result of an HttpRequest: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpResponse.html'.
import java.io.IOException;                                         //  [Class - Exception, from method '.send()' of class 'HttpClient'] I/O exception: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/IOException.html'.

//  IMPORTS - CUSTOM CLASSES AND CUSTOM INTERFACES.
import a1t0ghb.courses_oracle_one.challenge_conversor_monedas.model_classes.CurrencyAPI;

/**
 * APIQuery class documentation.
 * - ExchangeRate API documentation: 'https://www.exchangerate-api.com/docs/java-currency-api'.
 * @author a1t0ghb
 */
public class APIQuery {

    //  ATTRIBUTES DECLARATION.
    //  - IMPORTANT: regarding primitive types (e.g. int, boolean, etc.), try ALWAYS instead to use their corresponding wrapper classes (e.g. Integer instead of int), to use proper methods, such as comparing and avoiding un-expected behaviours.
    //  - Example of un-intended behaviours: comparing integers. Ref.: 'https://medium.com/@wanisha2013/always-use-equals-to-compare-integer-objects-in-java-e35e469332aa'.
    //  - Wrappers for primitives, for proper use of methods, such as '.equals()', or 'compare()': 'https://www.w3schools.com/java/java_wrapper_classes.asp', 'https://www.geeksforgeeks.org/java/wrapper-class-vs-primitive-data-types-in-java-with-io/'.

    private final String api_url_base = "https://v6.exchangerate-api.com/v6";                   // Ref.: 'https://www.exchangerate-api.com/docs/java-currency-api'.

    //  CONSTRUCTOR.
    //  - Same name as Class, and custom definition.
    //  - If 'empty' (i.e. 'predetermined'), it's usually useful to at least initialize attributes with default values.
    //  - If we define a constructor for the superclass, now ALL OF ITS SUBCLASSES must have a MATCHING constructor.
    //  - [RECORDS] Custom constructor (e.g. canonical, compact, etc.): 'https://www.baeldung.com/java-record-keyword#constructors'.

    //  ATTRIBUTE'S 'GETTERS'.

    //  ATTRIBUTE'S 'SETTERS': usually, public.
    //  - Protected keyword 'this' is used to refer to CURRENT object, to avoid confusions with parameters (in case those have the same name).

    //  INHERITED METHODS TO OVERRIDE: custom definitions for CURRENT class.

    //  METHODS FROM 'IMPLEMENTS'.
    
    //  REGULAR METHODS.

    // public static void main(String[] args) {
    //     // System.out.println("Hello World!");

    //     //  INITIALIZATION OF INSTANCES.

    // }

    /**
     * GetCurrencyData method documentation.
     */
    // TODO: public CurrencyAPI GetCurrencyData(String api_token, String currency_from) {
    public void GetCurrencyData(String api_token, String currency_from) throws IOException, InterruptedException {

        //  Creates URL to connect with proper API's endpoint.
        var api_uri = (URI) URI.create(
            api_url_base + "/" + api_token + "/latest/"+ currency_from
        );
        System.out.println(api_uri);
        // System.out.println(api_uri.getClass().getCanonicalName());                              //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
        
        //  Creates new, default http client to send hettp requests to the API.
        var http_client = (HttpClient) HttpClient.newHttpClient();
        // System.out.println(http_client);
        // System.out.println(http_client.getClass().getCanonicalName());                          //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.

        //  Creates new http request using the API complete url for the request to the API.
        var http_request = (HttpRequest) HttpRequest.newBuilder()
            .uri(api_uri)
            .build();
        // System.out.println(http_request);
        // System.out.println(http_request.getClass().getCanonicalName());                         //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.

        //  Creates http response to handle response from API.
        //  - Method '.send()' from class 'HttpClient', throws Exceptions. Requires handling.
        //  - Exceptions: IOException, InterruptedException. Ref.: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpClient.html#send(java.net.http.HttpRequest,java.net.http.HttpResponse.BodyHandler)'.
        // try {

            var http_response = (HttpResponse<String>) http_client
                .send(http_request, HttpResponse.BodyHandlers.ofString());
            System.out.println(http_response);
            // System.out.println(http_response.getClass().getCanonicalName());                    //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
            
        // } catch (IOException | InterruptedException e) {
        //     System.out.println("[LOG - ERROR] Request to API failed. Please check following error message:");
        //     System.out.println(e.getMessage());
        // }

        //  Prints body of HTTP request; i.e. JSON, in raw format.
        var http_response_json = (String) http_response.body();
        System.out.println(http_response_json);
        // System.out.println(http_response_json.getClass().getCanonicalName());                   //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.

    }

}
