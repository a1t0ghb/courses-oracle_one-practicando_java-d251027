/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.challenge_conversor_monedas.model_classes;

//  IMPORTS - UTILITIES.

//  API markers for properties-attributes matching:
import com.fasterxml.jackson.annotation.JsonProperty;               //  [Interface] Marker ANNOTATION to indicate property name in JSON: 'https://www.baeldung.com/jackson-annotations#1-jsonproperty', 'https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-annotations/latest/com.fasterxml.jackson.annotation/com/fasterxml/jackson/annotation/JsonProperty.html'.

//  Java utilities:
//  - Shortcut for importing ALL Java Utils: 'import java.util.*;'.
import java.util.Objects;                                           // [Class] Static utilities methods; in this case, for custom Constructor of Java record: 'https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Objects.html', 'https://www.baeldung.com/java-record-keyword#constructors'.
// import java.util.Map;                                               //  [Interface] A key-value mapping: 'https://www.baeldung.com/java-hashmap#basic-usage', 'https://www.w3schools.com/java/java_map.asp', 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html'.

//  IMPORTS - CUSTOM CLASSES AND CUSTOM INTERFACES.

/**
 *  CurrencyAPI record (class) documentation.
 *  @param api_result [API default return] API call result: 'success', or 'error'.
 *  @param api_documentation [API default return] Documentation: 'https://www.exchangerate-api.com/docs'.
 *  @param api_terms_of_use_success [api_result = 'success'] Terms of use: 'https://www.exchangerate-api.com/terms'.
 *  @param api_time_last_update_unix [api_result = 'success'] UNIX timestamp for last time currency rates were updated.
 *  @param api_time_last_update_utc [api_result = 'success'] Datetime (UTC timezone) for last time currency rates were updated.
 *  @param api_time_next_update_unix [api_result = 'success'] UNIX timestamp for next time currency rates to be updated.
 *  @param api_time_next_update_utc [api_result = 'success'] Datetime (UTC timezone) for next time currency rates to be updated.
 *  @param base_code [api_result = 'success'] Currency data requested.
 *  @param conversion_rates [api_result = 'success'] List of exchange rates (as Java Map) for currency requested.
 *  @param api_terms_of_use_error [api_result = 'error'] Terms of use: 'https://www.exchangerate-api.com/terms'.
 *  @param api_error_type [api_result = 'error'] Error reason returned by API call.
 *  @author a1t0ghb
 */
public record CurrencyAPI(
    @JsonProperty("result") String api_result
    , @JsonProperty("documentation") String api_documentation
    , @JsonProperty("terms_of_use") String api_terms_of_use_success
    , @JsonProperty("time_last_update_unix") Integer api_time_last_update_unix
    , @JsonProperty("time_last_update_utc") String api_time_last_update_utc
    , @JsonProperty("time_next_update_unix") Integer api_time_next_update_unix
    , @JsonProperty("time_next_update_utc") String api_time_next_update_utc
    , @JsonProperty("base_code") String api_base_code
    // , @JsonProperty("conversion_rates") Map<String, Double> api_conversion_rates
    , @JsonProperty("terms-of-use") String api_terms_of_use_error
    , @JsonProperty("error-type") String api_error_type
) {
    //  Introduction to Java records: 'https://www.youtube.com/watch?v=_xIA7vhWkLk', 'https://www.theserverside.com/video/Java-records-tutorial'.
    //  NOTE: Class parameters come from picking JSON fields, based on HTTP request testing of API; e.g. on Postman or Apidog.
    //  - Test URL: 'https://v6.exchangerate-api.com/v6/<api_token>/latest/USD'.
    //  NOTE: @JsonProperty() markers are according to example in 'https://angiejones.tech/deserializing-api-responses-into-java-records/'.

    //  ATTRIBUTES DECLARATION.
    //  - IMPORTANT: regarding primitive types (e.g. int, boolean, etc.), try ALWAYS instead to use their corresponding wrapper classes (e.g. Integer instead of int), to use proper methods, such as comparing and avoiding un-expected behaviours.
    //  - Example of un-intended behaviours: comparing integers. Ref.: 'https://medium.com/@wanisha2013/always-use-equals-to-compare-integer-objects-in-java-e35e469332aa'.
    //  - Wrappers for primitives, for proper use of methods, such as '.equals()', or 'compare()': 'https://www.w3schools.com/java/java_wrapper_classes.asp', 'https://www.geeksforgeeks.org/java/wrapper-class-vs-primitive-data-types-in-java-with-io/'.
    //  - [RECORDS] Allowed-only STATIC attributes / variables: 'https://www.baeldung.com/java-record-keyword#static', 'https://www.youtube.com/watch?v=-Y67pdWHr9Y'.

    //  CONSTRUCTOR.
    //  - Same name as Class, and custom definition.
    //  - If 'empty' (i.e. 'predetermined'), it's usually useful to at least initialize attributes with default values.
    //  - If we define a constructor for the superclass, now ALL OF ITS SUBCLASSES must have a MATCHING constructor.
    //  - [RECORDS] Custom constructor (e.g. canonical, compact, etc.): 'https://www.baeldung.com/java-record-keyword#constructors'.
    
    //  CONSTRUCTOR: compact (alternate to canonical; i.e. explicitly declare ALL arguments AGAIN).
    public CurrencyAPI {

        // Enforcing non-null: 'https://xebia.com/blog/how-to-use-java-records/#enforcing-nonnull'.
        Objects.requireNonNull(api_result, "'api_result' cannot be null.");
        Objects.requireNonNull(api_documentation, "'api_documentation' cannot be null.");

    }

    //  CONSTRUCTOR: [custom] for successful API call; i.e. 8 fields retrieved.
    //  - NOTE: it REQUIRES to call compact or canonical Constructor, adjusting parameters.
    public CurrencyAPI(
        String api_result
        , String api_documentation
        , String api_terms_of_use_success
        , Integer api_time_last_update_unix
        , String api_time_last_update_utc
        , Integer api_time_next_update_unix
        , String api_time_next_update_utc
        , String api_base_code
    ) {

        //  Call of compact or canonical Constructor, with adjusted parameters.
        this(
            api_result, api_documentation, api_terms_of_use_success, api_time_last_update_unix, api_time_last_update_utc, api_time_next_update_unix, api_time_next_update_utc, api_base_code
            , null, null
        );

    }

    //  CONSTRUCTOR: [custom] for non-successful API call; i.e. 4 fields retrieved.
    //  - NOTE: it REQUIRES to call compact or canonical Constructor, adjusting parameters.
    public CurrencyAPI(
        String api_result
        , String api_documentation
        , String api_terms_of_use_error
        , String api_error_type
    ) {

        //  Call of compact or canonical Constructor, with adjusted parameters.
        this(
            api_result, api_documentation, null, null, null, null, null, null
            , api_terms_of_use_error, api_error_type
        );

    }

}
