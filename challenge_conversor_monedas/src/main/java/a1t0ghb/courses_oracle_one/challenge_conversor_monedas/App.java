/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.challenge_conversor_monedas;

//  IMPORTS: external classes and interfaces.

//  IMPORTS - UTILITIES.

//  File management:
import java.io.File;                                                //  [Class] Files and directories management: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/File.html'.
import java.io.InputStream;                                         //  [Class] Input stream of bytes (reading files as streams): 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html'.
import java.io.FileInputStream;                                     //  [Class - subclass of 'InputStream'] Reads streams of raw bytes: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileInputStream.html'.
import java.io.FileNotFoundException;                               //  [Class - related to 'InputStream'] Exception when fails to open a file: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileNotFoundException.html'.
import java.io.IOException;                                         //  [Class - superclass of 'FileNotFoundException'] General exception for IO operations: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/IOException.html'.

//  YAML parsing:
import org.yaml.snakeyaml.Yaml;                                     //  [Class] Parsing YAML files: 'https://javadoc.io/doc/org.yaml/snakeyaml/latest/org/yaml/snakeyaml/Yaml.html', 'https://bitbucket.org/snakeyaml/snakeyaml/wiki/Documentation#markdown-header-tutorial'.

//  Java utilities:
//  - Shortcut for importing ALL Java Utils: 'import java.util.*;'.
import java.util.Map;                                               //  [Interface] A key-value mapping: 'https://www.baeldung.com/java-hashmap#basic-usage', 'https://www.w3schools.com/java/java_map.asp', 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html'.
// import java.util.stream.Stream;                                     //  [Interface] Stream as flexible return; e.g. 'one key' as a single String, or a collection, as a Set of Strings: 'https://www.baeldung.com/java-map-key-from-value#a-functional-approach', 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html'.
import java.util.List;                                              //  [Interface] Part of Java Collections, for ORDERED COLLECTIONS; to use it, create a class that implements this interface, such as 'ArrayList'. e.g. to manage lists from 'Map' instance for parameters. Ref. 'https://www.w3schools.com/java/java_list.asp', 'https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html'.
// import java.util.ArrayList;                                         //  [Class] Class for implementation of 'List' Interface: 'https://www.w3schools.com/java/java_arraylist.asp'.
import java.util.Scanner;                                           //  [Class] User input via console / terminal: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html', 'https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Java-Scanner-User-Input-example-String-next-int-long-char', 'https://www.baeldung.com/java-scanner', 'https://www.quora.com/How-do-you-use-a-scanner-for-a-loop-in-Java', 'https://medium.com/@AlexanderObregon/reading-multiple-lines-of-input-with-java-scanner-4901bb99cbbd'.

// JSON serialization / de-serialization:
import com.google.gson.JsonSyntaxException;                         //  [Class] Exception for reading / writing a malformed JSON element: 'https://javadoc.io/static/com.google.code.gson/gson/2.13.2/com.google.gson/com/google/gson/JsonSyntaxException.html'.

//  IMPORTS - CUSTOM CLASSES AND CUSTOM INTERFACES.
// import a1t0ghb.courses_oracle_one.challenge_conversor_monedas.utilities.UtilitiesForMapInterface;
import a1t0ghb.courses_oracle_one.challenge_conversor_monedas.utilities.APIQuery;
// import a1t0ghb.courses_oracle_one.challenge_conversor_monedas.model_classes.CurrencyAPI;

/**
 * App class documentation.
 * @author a1t0ghb
 */
public class App {

    //  ATTRIBUTES DECLARATION.
    //  - IMPORTANT: regarding primitive types (e.g. int, boolean, etc.), try ALWAYS instead to use their corresponding wrapper classes (e.g. Integer instead of int), to use proper methods, such as comparing and avoiding un-expected behaviours.
    //  - Example of un-intended behaviours: comparing integers. Ref.: 'https://medium.com/@wanisha2013/always-use-equals-to-compare-integer-objects-in-java-e35e469332aa'.
    //  - Wrappers for primitives, for proper use of methods, such as '.equals()', or 'compare()': 'https://www.w3schools.com/java/java_wrapper_classes.asp', 'https://www.geeksforgeeks.org/java/wrapper-class-vs-primitive-data-types-in-java-with-io/'.

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

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        System.out.println();

        //  ATTRIBUTES DECLARATION.
        //  - IMPORTANT: regarding primitive types (e.g. int, boolean, etc.), try ALWAYS instead to use their corresponding wrapper classes (e.g. Integer instead of int), to use proper methods, such as comparing and avoiding un-expected behaviours.
        //  - Example of un-intended behaviours: comparing integers. Ref.: 'https://medium.com/@wanisha2013/always-use-equals-to-compare-integer-objects-in-java-e35e469332aa'.
        //  - Wrappers for primitives, for proper use of methods, such as '.equals()', or 'compare()': 'https://www.w3schools.com/java/java_wrapper_classes.asp', 'https://www.geeksforgeeks.org/java/wrapper-class-vs-primitive-data-types-in-java-with-io/'.

        //  List of input filepaths to process and get paramateres from: 'https://www.w3schools.com/java/java_arrays.asp'.
        var input_files_filepaths = new String[2];
        // System.out.println(input_files_filepaths);
        // System.out.println(input_files_filepaths.getClass().getCanonicalName());                    //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
        // System.out.println();
        input_files_filepaths[0] = "src/main/resources/input_config.yaml";
        input_files_filepaths[1] = "src/main/resources/input_secrets.yaml";
        
        var menu = (String) """
        ********** ********** ********** ********** **********
        Bienvenido/a al Conversor de Moneda =].

        1) [USD] Dólar Americano        => [ARS] Peso Argentino.
        2) [ARS] Peso Argentino         => [USD] Dólar Americano.
        3) [USD] Dólar Americano        => [BRL] Real Brasileño.
        4) [BRL] Real Brasileño         => [USD] Dólar Americano.
        5) [USD] Dólar Americano        => [COP] Peso Colombiano.
        6) [COP] Peso Colombiano        => [USD] Dólar Americano.
        7) Salir.

        Por favor elije una opción válida; ej. '1' para convertir USD => ARS, '7' para salir, etc.:
        """;
        // System.out.println(menu);
        // System.out.println(menu.getClass().getCanonicalName());                                     //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
        // System.out.println();

        var menu_currency = (String) """
        ********** ********** ********** ********** **********
        Por favor ingresa la cantidad que deseas convertir:
        """;
        // System.out.println(menu_currency);
        // System.out.println(menu_currency.getClass().getCanonicalName());                            //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
        // System.out.println();

        //  No need to use wrapper for booleans: 'https://medium.com/@AlexanderObregon/switching-between-true-and-false-with-java-booleans-288e0ee3a331', 'https://labex.io/tutorials/java-how-to-check-if-a-boolean-variable-is-false-in-java-559933', 'https://www.geeksforgeeks.org/java/java-lang-boolean-class-java/'.
        var is_menu_exit = false;                                                                   //  Default status for exiting menu: false.
        // System.out.println(is_menu_exit);
        // System.out.println(is_menu_exit.getClass().getCanonicalName());                             //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
        // System.out.println();

        //  INITIALIZATION OF INSTANCES.

        //  Using approach of nested try-catch blocks for Exception handling: 'https://www.geeksforgeeks.org/java/nested-try-blocks-in-exception-handling-in-java/', 'https://www.codingshuttle.com/java-programming-handbook/multiple-and-nested-try-catch/'.
        //  - In this 1st nested try-catch block, any error STOPS EXECUTION, since minimum requirements for execution ARE NOT MET.
        try {

            // var stream_from_map = new UtilitiesForMapInterface();                                   //  Custom class for methods with instances of class 'Map'.
            // // System.out.println(stream_from_map);
            // // System.out.println(stream_from_map.getClass().getCanonicalName());                      //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
            // // System.out.println();

            //  Prints current working directory: 'https://www.baeldung.com/java-current-directory'.
            System.out.println("-");
            System.out.println("[LOG] Current working directory:");
            System.out.println(System.getProperty("user.dir"));
            System.out.println();

            //  LOAD VARIABLES FROM LOCAL FILES.

            //  Validates existence of input files with parameters to process, from Array 'input_files_filepaths'.
            //  - NOTE: starting folder (or ROOT) is project's folder. From here, all other folders are deployed; e.g. 'src'.
            //    - Using Maven's Standard Directory Layout (SDL), as reference: 'https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html'.
            //    - Using TIBCO's guide for content location and folders structure: 'https://docs.tibco.com/pub/str/10.6.3/doc/html/authoring/maven-whatgoeswhere.html#maven-whatgoeswhere_eachfolder'.
            System.out.println("-");
            //  Loops through an Array, using for-each loop: 'https://www.w3schools.com/java/java_arrays_loop.asp', 'https://www.baeldung.com/java-for-loop'.
            for (String input_files_filepath : input_files_filepaths) {
                var input_file = new File(input_files_filepath);                                    //  Can receive either a relative or absolute (i.e. starting with '/') path.
                // System.out.println(input_file);
                // System.out.println(input_file.getClass().getCanonicalName());                       //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
                // System.out.println();
                System.out.println("[LOG] Validating if file (with provided path) exists:");
                System.out.println("Filename: " + input_file.getName());
                System.out.println("Folder path: " + input_file.getParent());
                System.out.println();
                //  If file doesn't exist, throws MANUAL / CUSTOM Exception.
                if (input_file.exists() == false) {
                    System.out.println("[LOG - ERROR] File does not exist.");
                    System.out.println(input_files_filepath);
                    System.out.println();
                    //  [POSSIBLE EXCEPTIONS => Stops Execution] 'https://rollbar.com/guides/java/how-to-throw-exceptions-in-java/'.
                    //  - 'Exception': if file doesn't exits.
                    throw new Exception("File does not exist. Please make sure it's present: " + input_files_filepath);
                }
                //  If file exists, it's properties are showed: 'https://www.w3schools.com/java/java_files_read.asp'.
                System.out.println("[LOG - SUCCESS] File found.");
                System.out.println("Absolute path: " + input_file.getAbsolutePath());
                System.out.println("Writeable: " + input_file.canWrite());
                System.out.println("Readable: " + input_file.canRead());
                System.out.println("File size in bytes: " + input_file.length());
                System.out.println();
            }
            // System.out.println();

            //  Loads '.yaml' file: 'input_config.yaml'.
            //  - Uses SnakeYAML library: 'https://bitbucket.org/snakeyaml/snakeyaml/wiki/Documentation'.
            //  - Approach: load from file (or stream): 'https://bitbucket.org/snakeyaml/snakeyaml/wiki/Documentation#markdown-header-loading-yaml'.
            //    - Support example: construct a Java object of any type. Ref. 'https://bitbucket.org/snakeyaml/snakeyaml/src/master/src/test/java/examples/AnyObjectExampleTest.java'.
            System.out.println("-");
            //  [CONFIG. FILES READING] Opens 'InputStream' instance, for reading configuration file.
            //  [POSSIBLE EXCEPTIONS => Stops Execution] 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileInputStream.html#%3Cinit%3E(java.lang.String)'.
            //  - 'FileNotFoundException': if file doesn't exits.
            var stream_input_file = (InputStream) new FileInputStream(input_files_filepaths[0]);
            // System.out.println(stream_input_file);
            // System.out.println(stream_input_file.getClass().getCanonicalName());                    //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
            // System.out.println();
            System.out.println("[LOG] Reading '.yaml' file...");
            System.out.println(input_files_filepaths[0]);
            System.out.println();
            var yaml = new Yaml();
            // System.out.println(yaml);
            // System.out.println(yaml.getClass().getCanonicalName());                                 //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
            // System.out.println();
            // //  Method 'yaml.load()' returns an Java instance of class 'Object'.
            // Object data = yaml.load(stream_input_secrets);                                          //  Approach 01: basic. Threat return as a 'generic' Object.
            // Map<String, Object> data = yaml.load(stream_input_secrets);                             //  Approach 02: recommended. CAST into a instance of clas 'Map' for dictionary-like behaviour; i.e. key-value map / dictionary, usually key as String, and value as an Object.
            // Map<String, Object> data = (Map<String, Object>) yaml.load(stream_input_secrets);       //  Approach 03: more explicit variable declaration with CASTING.
            var data = (Map<String, Object>) yaml.load(stream_input_file);                          //  Approach 04: practical approach with 'var' declaration, yet still recommended, including proper casting. to Map<String, Object< in this case.
            // System.out.println(data);
            // System.out.println(data.getClass().getCanonicalName());                                 //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
            // System.out.println();
            //  [CONFIG. FILES READING] Closes 'InputStream' instance, after reading configuration file.
            //  [POSSIBLE EXCEPTIONS => Stops Execution] 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileInputStream.html#close()'.
            //  - 'IOException': general errors in I/O operations.
            stream_input_file.close();
            var parameters = (Map<String, Object>) data.get("parameters");
            // System.out.println(parameters);
            // System.out.println(parameters.getClass().getCanonicalName());                           //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
            // System.out.println();

            //  Gets list of options for currencies conversion.
            //  - Gets parameter from previous YAML import and casting into an instance of class Map; e.g. 'var data = (Map<String, Object>) yaml.load(stream_input_secrets);'
            System.out.println("-");
            System.out.println("[LOG] Getting list of options for currencies conversion...");
            var menu_options = (Map<String, Object>) parameters.get("menu_options");
            System.out.println(menu_options);
            // System.out.println(menu_options.getClass().getCanonicalName());                         //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
            System.out.println();

            // //  [DEBUG] Drilling through inner instances of 'Map' menu_options.
            // System.out.println("-");
            // //  Prints all Map key-value pairs, through a for loop.
            // for (String i : menu_options.keySet()) {
            //     System.out.println("Key: " + i + " | Value: " + menu_options.get(i));
            // }
            // System.out.println();
            // //  Example: accessing 'List' of exchange rates parameters for option 1; e.g. USD => ARS.
            // //  - How to access a list item: 'https://www.w3schools.com/java/java_list.asp'.
            // //  - List vs. List<?> vs. List<Object>: Java Generics. Refs.
            // //    - 'https://stackoverflow.com/questions/9988211/listobject-and-list'.
            // //    - 'https://stackoverflow.com/questions/1844770/what-does-list-mean-in-java-generics'.
            // //    - 'https://stackoverflow.com/questions/6783316/list-vs-listobject'.
            // //    - 'https://medium.com/@kthsingh.ms/list-vs-list-object-understanding-java-generics-11079c63b6fb'.
            // //    - 'https://hauchee.blogspot.com/2015/09/differences-between-raw-type-parameterized-type-and-wildcard-type.html'.
            // var currency_options_1 = (List<?>) menu_options.get("1");
            // //  Note: get Class name, to understand what class type returns method '.get()' from Map instance.
            // System.out.println(currency_options_1);
            // System.out.println(currency_options_1.getClass().getCanonicalName());                                //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
            // System.out.println();
            // //  Example: accessing 'from' currency for conversion; i.e. 'List' position '0'.
            // var currency_1_from = (String) currency_options_1.get(0);
            // System.out.println(currency_1_from);
            // System.out.println(currency_1_from.getClass().getCanonicalName());                                   //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
            // System.out.println();
            // //  NOTE: appropiate workflow for drilling through objects from YAML imports:
            // //  - Do CASTING INCREMENTALLY; i.e. refer to objects with 'generic' classes such as 'Object' or '?', until the very end, right before you access object. Example:
            // //    a. YAML 1st level: Map<String, Object> for 'parameters'; {parameters: ...}. Key as String, but value as Object, since it has all other YAML data (of different types).
            // //    b. YAML 2nd level: Map<String, Object> for 'menu_options'; {menu_options: ...}. Key as String, but values still as Object, to GRADUALLY / INCREMENTALLY cast it, as required. 
            // //    c. YAML 3rd level (example for option '1'): List<?> for 'currency_options_1'; {1: ...}. Values for option '1', are a 'List'; e.g. ['USD', 'ARS']. Although we know its a List of Strings (i.e. 'List<String>'), since we don't access items YET, we leave it as 'List<?>'.
            // //    d. YAML 4th level (option '1', 'from' currency; i.e. List position '0'): (String) to proper CAST list object in position 0; ['USD', 'ARS']. Finally, since we are accessing the object and we know it's a String, we do the proper CASTING with '(String)'.

            //  Loads '.yaml' file: secrets.
            System.out.println("-");
            //  [CONFIG. FILES READING] Opens 'InputStream' instance, for reading configuration file.
            //  [POSSIBLE EXCEPTIONS => Stops Execution] 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileInputStream.html#%3Cinit%3E(java.lang.String)'.
            //  - 'FileNotFoundException': if file doesn't exits.
            var stream_input_file_secrets = (InputStream) new FileInputStream(input_files_filepaths[1]);
            System.out.println("[LOG] Reading '.yaml' file...");
            System.out.println(input_files_filepaths[1]);
            System.out.println();
            var yaml_secrets = new Yaml();
            var data_secrets = (Map<String, Object>) yaml_secrets.load(stream_input_file_secrets);
            //  [CONFIG. FILES READING] Closes 'InputStream' instance, after reading configuration file.
            //  [POSSIBLE EXCEPTIONS => Stops Execution] 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileInputStream.html#close()'.
            //  - 'IOException': general errors in I/O operations.
            stream_input_file_secrets.close();
            var secrets = (Map<String, Object>) data_secrets.get("secrets");
            // System.out.println(secrets);
            // System.out.println(secrets.getClass().getCanonicalName());                                          //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
            // System.out.println();

            //  Gets ExchangeRate API token.
            //  - Gets parameter from previous YAML import and casting into an instance of class Map; e.g. 'var data = (Map<String, Object>) yaml.load(stream_input_secrets);'
            System.out.println("-");
            System.out.println("[LOG] Getting API token...");
            var _EXCHANGERATE_API_TOKEN = (String) secrets.get("_EXCHANGERATE_API_TOKEN").toString();           //  Access an item from a 'Map' instance ('https://www.w3schools.com/java/java_hashmap.asp'), and converts 'Object' to 'String' with 'Object's inherent method '.toString()' ('https://www.baeldung.com/java-object-string-representation'). 
            // System.out.println(_EXCHANGERATE_API_TOKEN);
            // System.out.println(_EXCHANGERATE_API_TOKEN.getClass().getCanonicalName());                          //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
            System.out.println();
            
            // //  [TEST] 'Map' utilities custom method: get key(s) from value.
            // System.out.println("-");
            // System.out.println("[LOG] Getting key of map, based on value...");
            // Stream<String> key_stream = stream_from_map.GetKeysFromValue(secrets, "<key_value>");
            // var key = (String) key_stream.findFirst().get();
            // System.out.println(key);
            // System.out.println(key.getClass().getCanonicalName());                                              //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
            // System.out.println();

            //  MAIN APP.
            System.out.println("-");
            
            //  Declare-ONLY attributes (as 'null' or 'empty', according to it's data type), for later re-usal: 'https://www.baeldung.com/java-string-initialization'.
            String user_input_menu_option_txt;
            String user_input_menu_option_txt_clean;
            String user_input_menu_option;
            String user_input_currency_amount_txt;
            String user_input_currency_amount_txt_clean;
            Double user_input_currency_amount;
            List<?> user_input_currency_options;
            String user_input_currency_from;
            String user_input_currency_to;
            // var user_input_menu_option_txt = (String) null;                                                     //  Initialize 'null' String. As such, any method called on this object, will throw an error.
            // var user_input_menu_option_txt_clean = (String) null;                                               //  Initialize 'null' String. As such, any method called on this object, will throw an error.
            // var user_input_menu_option = (String) null;                                                         //  Initialize 'null' String. As such, any method called on this object, will throw an error.
            // var user_input_currency_amount_txt = (String) null;                                                 //  Initialize 'null' String. As such, any method called on this object, will throw an error.
            // var user_input_currency_amount_txt_clean = (String) null;                                           //  Initialize 'null' String. As such, any method called on this object, will throw an error.
            // var user_input_currency_amount = (Double) null;                                                     //  Initialize 'null' Double. As such, any method called on this object, will throw an error.
            // var user_input_currency_options = (List<?>) new ArrayList<>();                                      //  Initialize an 'empty' ArrayList, to emulate structure from importing YAML files that uses 'Map' class; specifically 'menu_options'.
            // var user_input_currency_from = (String) null;                                                       //  Initialize 'null' String. As such, any method called on this object, will throw an error.
            // var user_input_currency_to = (String) null;                                                         //  Initialize 'null' String. As such, any method called on this object, will throw an error.

            //  [USER INPUT] Creates a new 'Scanner' instance for reading user inputs.
            //  - Note: if mixing methods 'nextLine()' with nextXXX() methods such as 'next()' or 'nextInt()', beware of consuming line separator: 'https://www.reddit.com/r/learnjava/comments/gsffgs/comment/fs4z1ji/', 'https://www.baeldung.com/java-scanner#2nextint-api'.
            //  - Note: since using approach of Constructor with Stream, there is no Exception that method could throw.
            var scanner = new Scanner(System.in);
            // System.out.println(scanner);
            // System.out.println(scanner.getClass().getCanonicalName());                                          //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
            // System.out.println();

            //  Loop asking user for currency conversion, until user chooses exit; i.e. option '7'.
            //  - Note: condition for while is using primitive booleans ('boolean'), not wrapper Class 'Boolean'; that's why we're using regular operators.
            while(is_menu_exit == false) {

                //  2nd nested try-block for Exception handling: 'https://www.geeksforgeeks.org/java/nested-try-blocks-in-exception-handling-in-java/', 'https://www.codingshuttle.com/java-programming-handbook/multiple-and-nested-try-catch/'.
                //  - In this 2nd nested try-catch block, any error RETURNS TO MAIN MENU, since minimum requirements for execution were met.
                try {

                    //  Prints MAIN menu, with options for user to choose.
                    //  - Note: uses 'print', instead of 'println', since menu text already has a new line.
                    System.out.print(menu);
                    user_input_menu_option_txt = (String) scanner.nextLine();
                    // System.out.println(user_input_menu_option_txt);
                    // System.out.println(user_input_menu_option_txt.getClass().getCanonicalName());               //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
                    // System.out.println();

                    user_input_menu_option_txt_clean = user_input_menu_option_txt.trim();                       //  Cleans user input.
                    user_input_menu_option = user_input_menu_option_txt_clean;
                    
                    //  Evaluates option input from user (after being cleaned).
                    //  - Using switch-case expressions: 'https://www.baeldung.com/java-switch#1-the-new-switch-expression'.
                    switch (user_input_menu_option) {

                        //  User needs to make a conversion; i.e. input from '1' to '6'.
                        case "1", "2", "3", "4", "5", "6" -> {

                            //  Prints currency submenu, to introduce the amount to exchange.
                            //  - Note: uses 'print', instead of 'println', since menu text already has a new line.
                            System.out.print(menu_currency);
                            // user_input_currency_amount = (Double) scanner.nextDouble();
                            // scanner.nextLine();                                                                 //  Cleans leftover newline, from previous '.nextDouble()'. When mixing 'nextLine()' with others next methods of class 'Scanner', to clear Scanner buffer and clean remaining newline before next 'nextLine()': 'https://www.reddit.com/r/learnjava/comments/gsffgs/comment/fs4z1ji/', 'https://www.quora.com/How-do-you-use-a-scanner-for-a-loop-in-Java'.
                            user_input_currency_amount_txt = (String) scanner.nextLine();
                            user_input_currency_amount_txt_clean = user_input_currency_amount_txt.trim();       //  Cleans user input.
                            //  [POSSIBLE EXCEPTIONS => Returns To Main Menu] 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Double.html#valueOf(java.lang.String)'.
                            //  - 'NumberFormatException': if input is not a number. 
                            user_input_currency_amount = Double.valueOf(user_input_currency_amount_txt_clean);
                            
                            //  Get currency exchange parameters, from options defined in the menu; e.g. Option '1': USD to ARS.
                            user_input_currency_options = (List<?>) menu_options
                                .get(user_input_menu_option);                                                   //  From configuration file structure, parameters for option defined in a Array (converted to ArrayList).
                            // System.out.println(user_input_currency_options);
                            // System.out.println(user_input_currency_options.getClass().getCanonicalName());      //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
                            // System.out.println();
                            user_input_currency_from = (String) user_input_currency_options
                                .get(0);                                                                        //  'From' currency, at position '0' in ArraList.
                            // System.out.println(user_input_currency_from);
                            // System.out.println(user_input_currency_from.getClass().getCanonicalName());         //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
                            // System.out.println();
                            user_input_currency_to = (String) user_input_currency_options
                                .get(1);                                                                        //  'To' currency, at position '1' in ArraList.
                            // System.out.println(user_input_currency_to);
                            // System.out.println(user_input_currency_to.getClass().getCanonicalName());           //  Get class of an Object; throws error if it's a primitive data type: 'https://www.quora.com/How-do-we-print-the-class-name-as-output-in-Java'.
                            // System.out.println();

                            //  Creates a new instance of an API query to retrieve the currency data.
                            var api_query = new APIQuery();
                            //  [POSSIBLE EXCEPTIONS => Returns To Main Menu] From CUSTOM implementation:
                            //  - 'IOException': general errors in I/O operations.
                            //  - 'InterruptedException': if I/O operation is interrupted.
                            var currency_api = api_query
                                .GetCurrencyData(_EXCHANGERATE_API_TOKEN, user_input_currency_from);
                            var conversion_rate = currency_api.GetConversionRate(user_input_currency_to);
                            var currency_converted = (Double) (conversion_rate * user_input_currency_amount);

                            System.out.println("El valor '" + user_input_currency_amount + "' [" + user_input_currency_from + "] corresponde al valor final de => '" + currency_converted + "' [" + user_input_currency_to + "].");
                            System.out.println();

                        }
                        
                        //  User wants to leave; i.e. input as '7'.
                        case "7" -> is_menu_exit = true;

                        //  Wrong input from user.
                        default -> {
                            
                            System.out.println("ERROR: opción no válida. Por favor ingresa una opción disponible del menú.");
                            System.out.println();

                        }

                    }
                } catch (JsonSyntaxException e) {
                    System.out.println("[LOG - ERROR] There was an error while trying to read a malformed JSON after API call. Please review the error message for details:");
                    System.out.println(e.getMessage());                                                         //  Print error details.
                    System.out.println();
                } catch (NumberFormatException e) {
                    System.out.println("[LOG - ERROR] There was an error while trying to convert a string to a numeric type. Please review the error message for details:");
                    System.out.println(e.getMessage());                                                         //  Print error details.
                    System.out.println();
                } catch (IOException e) {
                    System.out.println("[LOG - ERROR] Request to API failed; there was a general I/O operation error while connecting to it. Please review the error message for details:");
                    System.out.println(e.getMessage());                                                         //  Print error details.
                    System.out.println();
                } catch (InterruptedException e) {
                    System.out.println("[LOG - ERROR] Request to API failed; there was an error caused by the interruption of the API call. Please review the error message for details:");
                    System.out.println(e.getMessage());                                                         //  Print error details.
                    System.out.println();
                } catch (Exception e) {
                    System.out.println("[LOG - ERROR] There was a general error. Please review the error message for details:");
                    System.out.println(e.getMessage());                                                         //  Print error details.
                    System.out.println();
                }

                // System.out.println();
                
            }

            //  [USER INPUT] Closes 'Scanner' instance, after reading user input.
            //  - Note: according to documentation, the '.close()' methods doesn't throw any Exception: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html#close()'.
            scanner.close();

            System.out.println("[LOG] Exiting main menu... Thank you for using this app!.");
            System.out.println();

        //  Catchs in hierarchical order; from specific to general:
        //  1. 'FileNotFoundException': 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileNotFoundException.html'.
        //  2. 'IOException': 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/IOException.html'.
        //  3. 'Exception': 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Exception.html'.
        } catch (FileNotFoundException e) {
            System.out.println("[LOG - ERROR] There was an error while trying to open a file for reading. Please review the error message for details:");
            System.out.println(e.getMessage());                                                                 //  Print error details.
            System.out.println();
        } catch (IOException e) {
            System.out.println("[LOG - ERROR] There was a general I/O operation error while trying to close a file after reading it. Please review the error message for details:");
            System.out.println(e.getMessage());                                                                 //  Print error details.
            System.out.println();
        } catch (Exception e) {
            System.out.println("[LOG - ERROR] There was a general error. Please review the error message for details:");
            System.out.println(e.getMessage());                                                                 //  Print error details.
            System.out.println();
        }

        System.out.println("[LOG] Finalizing app execution... Thank you for using this app!.");
        System.out.println();

        System.out.println("-");
        System.out.println();

    }
    
}
//  EOF.