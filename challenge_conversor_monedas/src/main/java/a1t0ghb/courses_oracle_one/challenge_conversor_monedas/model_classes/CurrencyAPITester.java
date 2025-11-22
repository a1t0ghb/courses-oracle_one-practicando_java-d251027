/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package a1t0ghb.courses_oracle_one.challenge_conversor_monedas.model_classes;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author a1t0ghb
 */
public class CurrencyAPITester {

    public static void main(String[] args) {

        System.out.println();

        // TEST: WITH NO MAP / DICTIONARY OF CURRENCY DATES, ONLY 1ST LEVEL OF JSON RESPONSE.

        var my_currency_all = new CurrencyAPI(
            "success"
            , "https://www.exchangerate-api.com/docs"
            , "https://www.exchangerate-api.com/terms"
            , 1763510402
            , "Wed, 19 Nov 2025 00:00:02 +0000"
            , 1763596802
            , "Thu, 20 Nov 2025 00:00:02 +0000"
            , "ARS"
            , null
            , "invalid-key"
        );
        
        System.out.println("-");
        System.out.println("CASE: my_currency_all.");
        System.out.println();
        System.out.println(my_currency_all);
        System.out.println(my_currency_all.getClass().getCanonicalName());
        System.out.println();
        System.out.println(my_currency_all.api_result());
        System.out.println(my_currency_all.api_result().getClass().getCanonicalName());
        System.out.println();
        System.out.println(my_currency_all.api_time_last_update_unix());
        System.out.println(my_currency_all.api_time_last_update_unix().getClass().getCanonicalName());
        System.out.println();
        System.out.println(my_currency_all.api_error_type());
        System.out.println(my_currency_all.api_error_type().getClass().getCanonicalName());
        System.out.println();

        // //  NOTE: ERROR; amount of parameters MUST MATCH amount any of Constructors defined.
        // //  - If do not want to pass parameters; use 'null' instead.
        // var my_currency_min = new CurrencyAPI(
        //     "success"
        //     , "https://www.exchangerate-api.com/docs"
        //     , "https://www.exchangerate-api.com/terms"
        //     // , null
        //     // , null
        //     // , null
        //     // , null
        //     // , null
        //     // , null
        //     // , null
        // );

        var my_currency_min_extra_null = new CurrencyAPI(
            "success"
            , "https://www.exchangerate-api.com/docs"
            , "https://www.exchangerate-api.com/terms"
            , null
            , null
            , null
            , null
            , null
            , null
        );

        System.out.println("-");
        System.out.println("CASE: my_currency_min_extra_null.");
        System.out.println();
        System.out.println(my_currency_min_extra_null);
        System.out.println(my_currency_min_extra_null.getClass().getCanonicalName());
        System.out.println();
        System.out.println(my_currency_min_extra_null.api_result());
        System.out.println(my_currency_min_extra_null.api_result().getClass().getCanonicalName());
        System.out.println();
        System.out.println(my_currency_min_extra_null.api_time_last_update_unix());
        // System.out.println(my_currency_min_extra_null.api_time_last_update_unix().getClass().getCanonicalName());       //  Throws error, since it's 'null'.
        System.out.println();
        System.out.println(my_currency_min_extra_null.api_error_type());
        // System.out.println(my_currency_min_extra_null.api_error_type().getClass().getCanonicalName());       //  Throws error, since it's 'null'.
        System.out.println();

        // //  NOTE: ERROR; due to Constructor built, since it's enforced to have MINIMUM 'api_result', 'api_documentation' AND 'api_terms_of_use' as NOT 'null'; i.e. method 'Objects.requireNonNull()'.
        // //  - Throws error when EXECUTING (after COMPILING) of: 'Exception in thread "main" java.lang.NullPointerException'.
        // var my_currency_one_of_min_null = new CurrencyAPI(
        //     "success"
        //     , null
        //     , null
        //     , null
        //     , null
        //     , null
        //     , null
        //     , null
        //     , null
        //     , null
        // );

        var my_currency_success = new CurrencyAPI(
            "success"
            , "https://www.exchangerate-api.com/docs"
            , "https://www.exchangerate-api.com/terms"
            , 1763510402
            , "Wed, 19 Nov 2025 00:00:02 +0000"
            , 1763596802
            , "Thu, 20 Nov 2025 00:00:02 +0000"
            , "ARS"
            , null
            // , "invalid-key"
        );

        System.out.println("-");
        System.out.println("CASE: my_currency_success.");
        System.out.println();
        System.out.println(my_currency_success);
        System.out.println(my_currency_success.getClass().getCanonicalName());
        System.out.println();
        System.out.println(my_currency_success.api_result());
        System.out.println(my_currency_success.api_result().getClass().getCanonicalName());
        System.out.println();
        System.out.println(my_currency_success.api_time_last_update_unix());
        System.out.println(my_currency_success.api_time_last_update_unix().getClass().getCanonicalName());
        System.out.println();
        System.out.println(my_currency_success.api_error_type());
        // System.out.println(my_currency_success.api_error_type().getClass().getCanonicalName());      //  Throws error, since it's 'null'.
        System.out.println();

        //  NOTE: due to how alternate Constructor cases where defined, this case is the same as previous 'my_currency_success'.
        // var my_currency_success_extra_null = new CurrencyAPI(
        //     "success"
        //     , "https://www.exchangerate-api.com/docs"
        //     , "https://www.exchangerate-api.com/terms"
        //     , 1763510402
        //     , "Wed, 19 Nov 2025 00:00:02 +0000"
        //     , 1763596802
        //     , "Thu, 20 Nov 2025 00:00:02 +0000"
        //     , "ARS"
        //     , null
        //     , null
        // );

        // TEST: WITH MAP / DICTIONARY OF CURRENCY DATES.
        Map<String, Double> my_hash_map = new HashMap<>();
        my_hash_map.put("ARS", 1.0);
        my_hash_map.put("AED", 0.002646);
        my_hash_map.put("AFN", 0.04781);

        var my_currency_with_conversion_rates = new CurrencyAPI(
            "success"
            , "https://www.exchangerate-api.com/docs"
            , "https://www.exchangerate-api.com/terms"
            , 1763510402
            , "Wed, 19 Nov 2025 00:00:02 +0000"
            , 1763596802
            , "Thu, 20 Nov 2025 00:00:02 +0000"
            , "ARS"
            , my_hash_map
            // , "{\"ARS\": 1, \"AED\": 0.002646, \"AFN\": 0.04781}"    //  NOTE: this creates a Map<String, String> ONLY.
            // , {"ARS": 1, "AED": 0.002646, "AFN": 0.04781}            //  Error; Map must be created regularly, instead of 'on the go' with only text.
        );

        System.out.println("-");
        System.out.println("CASE: my_currency_with_conversion_rates.");
        System.out.println();
        System.out.println(my_currency_with_conversion_rates);
        System.out.println(my_currency_with_conversion_rates.getClass().getCanonicalName());
        System.out.println();
        System.out.println(my_currency_with_conversion_rates.api_result());
        System.out.println(my_currency_with_conversion_rates.api_result().getClass().getCanonicalName());
        System.out.println();
        System.out.println(my_currency_with_conversion_rates.api_time_last_update_unix());
        System.out.println(my_currency_with_conversion_rates.api_time_last_update_unix().getClass().getCanonicalName());
        System.out.println();
        System.out.println(my_currency_with_conversion_rates.api_conversion_rates());
        System.out.println(my_currency_with_conversion_rates.api_conversion_rates().getClass().getCanonicalName());
        System.out.println();

        System.out.println("-");
        System.out.println();
        
    }

}
