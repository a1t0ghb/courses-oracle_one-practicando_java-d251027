/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package a1t0ghb.courses_oracle_one.challenge_conversor_monedas.utilities;

import java.io.IOException;

/**
 *
 * @author a1t0ghb
 */
public class APIQueryTester {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println();

        var my_api_query = new APIQuery();
        System.out.println("-");
        // my_api_query.GetCurrencyData("my_api_token", "my_currency_from");       //  HTTP response: 404 (Page not found). Server didn't find a page, a returns a page for 'broken / dead links'. Gson throws Exception since it's an unexpected JSON structure.
        my_api_query.GetCurrencyData("anytoken", "USD");                        //  HTTP response: 403 (Forbidden access). Server refused to process request, sending a valid JSON response, but referring to forbidden access.
        // System.out.println();

        System.out.println("-");
        System.out.println();

    }

}
