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

// JSON serialization / de-serialization:
import com.google.gson.Gson;                                        //  [Class] Main Gson class; default: 'Gson my_gson = new Gson();'. Ref.: 'https://javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/com/google/gson/Gson.html'.
import com.google.gson.GsonBuilder;                                 //  [Class] For creating a custom Gson, with options other than DEFAULT; e.g. output pretty printing format, add a field naming policy and/or enable output of 'null' values: 'https://javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/com/google/gson/GsonBuilder.html'.
import com.google.gson.JsonSyntaxException;                         //  [Class] Exception for reading / writing a malformed JSON element: 'https://javadoc.io/static/com.google.code.gson/gson/2.13.2/com.google.gson/com/google/gson/JsonSyntaxException.html'.

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
    public CurrencyAPI GetCurrencyData(String api_token, String currency_from) throws IOException, InterruptedException, Exception, JsonSyntaxException {

        //  Creates URL to connect with proper API's endpoint.
        var api_uri = (URI) URI.create(
            api_url_base + "/" + api_token + "/latest/"+ currency_from
        );
        // System.out.println(api_uri);
        // System.out.println(api_uri.getClass().getCanonicalName());                              //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
        // System.out.println();
        
        //  Creates new, default http client to send hettp requests to the API.
        var http_client = (HttpClient) HttpClient.newHttpClient();
        // System.out.println(http_client);
        // System.out.println(http_client.getClass().getCanonicalName());                          //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
        // System.out.println();

        //  Creates new http request using the API complete url for the request.
        var http_request = (HttpRequest) HttpRequest.newBuilder()
            .uri(api_uri)
            .build();
        // System.out.println(http_request);
        // System.out.println(http_request.getClass().getCanonicalName());                         //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
        // System.out.println();

        //  Creates http response to handle response from API.
        System.out.println("[LOG] Sending HTTP request to API...");
        System.out.println();
        //  [POSSIBLE EXCEPTIONS => Throws (for upper class to handle them)] 'https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpClient.html#send(java.net.http.HttpRequest,java.net.http.HttpResponse.BodyHandler)'.
        //  - 'IOException': general errors in I/O operations.
        //  - 'InterruptedException': if I/O operation is interrupted.
        var http_response = (HttpResponse<String>) http_client
            .send(http_request, HttpResponse.BodyHandlers.ofString());
        // System.out.println(http_response);
        // System.out.println(http_response.getClass().getCanonicalName());                        //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
        // System.out.println();

        var http_response_status = (Integer) http_response.statusCode();
        // System.out.println(http_response_status);
        // System.out.println(http_response_status.getClass().getCanonicalName());                 //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
        // System.out.println();

        //  If API call fails, throws MANUAL / CUSTOM Exception.
        if(Integer.compare(200, http_response_status) != 0) {
            System.out.println("[LOG - ERROR] Request to API failed.");
            //  Throws Exception with CUSTOM message; 404 page not found, retrieving an HTML page isntead of JSON, 403 retrieveing successful JSON, but with no data due to permissions, etc.
            //  [POSSIBLE EXCEPTIONS => Throws (for upper class to handle them)] 'https://rollbar.com/guides/java/how-to-throw-exceptions-in-java/'.
            //  - 'Exception': if HTTP response different than 200 (OK).
            throw new Exception("API call failed. Please validate parameteres such as URLs, tokens, and endpoints requested.");
        }
        //  If API call is successful, show informative message.
        System.out.println("[LOG - SUCCESS] Successful API response.");
        System.out.println();

        //  Prints body of HTTP request; i.e. JSON, in raw format.
        var http_response_json = (String) http_response.body();
        // System.out.println(http_response_json);
        // System.out.println(http_response_json.getClass().getCanonicalName());                   //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
        // System.out.println();

        //  Creates a new JSON serializer / de-serializer: 'https://github.com/google/gson/blob/main/UserGuide.md'.
        //  - Configure options other than DEFAULTS: 'https://javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/com/google/gson/GsonBuilder.html'.
        Gson my_gson = new GsonBuilder()
            // .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CASE_WITH_UNDERSCORES)                //  Defining STANDARD matching attributes with JSON fields (e.g. Java: someFieldName => JSON: SOME_FIELD_NAME), in case of NOT USING annotation markers '@SerializedName' in classes: 'https://github.com/google/gson/blob/main/UserGuide.md#json-field-naming-support', 'https://javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/com/google/gson/FieldNamingPolicy.html'.
            // .setPrettyPrinting()                                                                //  JSON output: compact vs. pretty printing: 'https://github.com/google/gson/blob/main/UserGuide.md#compact-vs-pretty-printing-for-json-output-format'.
            .create();
        
        //  Returns an instance of class 'CurrencyAPI'.
        //  [POSSIBLE EXCEPTIONS => Throws (for upper class to handle them)] 'https://javadoc.io/static/com.google.code.gson/gson/2.13.2/com.google.gson/com/google/gson/Gson.html#fromJson(java.lang.String,java.lang.Class)'.
        //  - 'JsonSyntaxException': if json is not a valid representation for an object of type classOfT.
        var my_currency_api = (CurrencyAPI) my_gson.fromJson(http_response_json, CurrencyAPI.class);
        // System.out.println(my_currency_api);
        // System.out.println(my_currency_api.getClass().getCanonicalName());                      //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
        // System.out.println();
        
        return my_currency_api;

    }

}
