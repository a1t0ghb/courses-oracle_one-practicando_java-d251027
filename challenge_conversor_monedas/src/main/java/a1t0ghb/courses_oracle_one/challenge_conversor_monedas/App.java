/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.challenge_conversor_monedas;

//  IMPORTS: external classes and interfaces.

//  IMPORTS - UTILITIES.
//  Shortcut for importing ALL Java Utils: 'import java.util.*;'.
import java.io.File;                                                //  [Class] Files and directories management: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/File.html'.
import java.io.InputStream;                                         //  [Class] Input stream of bytes (reading files as streams): 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html'.
import java.io.FileInputStream;                                     //  [Class - subclass of 'InputStream'] Reads streams of raw bytes: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileInputStream.html'.
import java.io.FileNotFoundException;                               //  [Class - related to 'InputStream'] Exception when fails to open a file: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileNotFoundException.html'.
import java.io.IOException;                                         //  [Class - superclass of 'FileNotFoundException'] General exception for IO operations: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/IOException.html'.
import org.yaml.snakeyaml.Yaml;                                     //  [Class] Parsing YAML files: 'https://javadoc.io/doc/org.yaml/snakeyaml/latest/org/yaml/snakeyaml/Yaml.html', 'https://bitbucket.org/snakeyaml/snakeyaml/wiki/Documentation#markdown-header-tutorial'.
import java.util.Map;                                               //  [Interface] A key-value mapping: 'https://www.baeldung.com/java-hashmap#basic-usage', 'https://www.w3schools.com/java/java_map.asp', 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html'.
// import java.util.stream.Stream;                                     //  [Interface] Stream as flexible return; e.g. 'one key' as a single String, or a collection, as a Set of Strings: 'https://www.baeldung.com/java-map-key-from-value#a-functional-approach', 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html'.
// import java.util.List;                                              //  [Interface] Part of Java Collections, for ORDERED COLLECTIONS; to use it, create a class that implements this interface, such as 'ArrayList'. e.g. to manage lists from 'Map' instance for parameters. Ref. 'https://www.w3schools.com/java/java_list.asp', 'https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html'.

//  IMPORTS - CUSTOM CLASSES AND CUSTOM INTERFACES.
// import a1t0ghb.courses_oracle_one.challenge_conversor_monedas.utilities.UtilitiesForMapInterface;

/**
 *
 * @author a1t0ghb
 */
public class App {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // System.out.println("Hello World!");
        System.out.println();

        //  ATTRIBUTES DECLARATION.
        //  - IMPORTANT: regarding primitive types (e.g. int, boolean, etc.), try ALWAYS instead to use their corresponding wrapper classes (e.g. Integer instead of int), to use proper methods, such as comparing and avoiding un-expected behaviours.
        //  - Example of un-intended behaviours: comparing integers. Ref.: 'https://medium.com/@wanisha2013/always-use-equals-to-compare-integer-objects-in-java-e35e469332aa'.
        //  - Wrappers for primitives, for proper use of methods, such as '.equals()', or 'compare()': 'https://www.geeksforgeeks.org/java/wrapper-class-vs-primitive-data-types-in-java-with-io/'.

        //  List of input filepaths to process and get paramateres from: 'https://www.w3schools.com/java/java_arrays.asp'.
        var input_files_filepaths = new String[2];
        input_files_filepaths[0] = "src/main/resources/input_config.yaml";
        input_files_filepaths[1] = "src/main/resources/input_secrets.yaml";
        
        // var menu = (String) """
        // ********** ********** ********** ********** **********
        // Bienvenido/a al Conversor de Moneda =].

        // 1) [USD] Dólar Americano        => [ARS] Peso Argentino.
        // 2) [ARS] Peso Argentino         => [USD] Dólar Americano.
        // 3) [USD] Dólar Americano        => [BRL] Real Brasileño.
        // 4) [BRL] Real Brasileño         => [USD] Dólar Americano.
        // 5) [USD] Dólar Americano        => [COP] Peso Colombiano.
        // 6) [COP] Peso Colombiano        => [USD] Dólar Americano.
        // 7) Salir.

        // Por favor elije una opción válida:
        // """;

        // @SuppressWarnings("unused")
        // var menu_currency = (String) """
        // ********** ********** ********** ********** **********
        // Por gavor ingresa la cantidad que deseas convertir:
        // """;

        // //  Wrapper for booleans: 'https://medium.com/@AlexanderObregon/switching-between-true-and-false-with-java-booleans-288e0ee3a331', 'https://labex.io/tutorials/java-how-to-check-if-a-boolean-variable-is-false-in-java-559933', 'https://www.geeksforgeeks.org/java/java-lang-boolean-class-java/'.
        // var is_menu_exit = Boolean.FALSE;                                           //  Default status for exiting menu: false.

        //  INITIALIZATION OF INSTANCES.

        // var stream_from_map = new UtilitiesForMapInterface();                       //  Custom class for methods with instances of class 'Map'.

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

            var input_file = new File(input_files_filepath);                                                //  Can receive either a relative or absolute (i.e. starting with '/') path.
            System.out.println("[LOG] Validating if file (with provided path) exists:");
            System.out.println("Filename: " + input_file.getName());
            System.out.println("Folder path: " + input_file.getParent());
            System.out.println();

            //  Validates if file exists, and if so, show it's properties: 'https://www.w3schools.com/java/java_files_read.asp'.
            if (input_file.exists()) {
                System.out.println("[LOG - SUCCESS] File found.");
                System.out.println("Absolute path: " + input_file.getAbsolutePath());
                System.out.println("Writeable: " + input_file.canWrite());
                System.out.println("Readable: " + input_file.canRead());
                System.out.println("File size in bytes: " + input_file.length());
            } else {
                System.out.println("[LOG - ERROR] File does not exist.");
            }
            System.out.println();

        }
        // System.out.println();

        //  Loads '.yaml' file: 'input_config.yaml'.
        //  - Uses SnakeYAML library: 'https://bitbucket.org/snakeyaml/snakeyaml/wiki/Documentation'.
        //  - Approach: load from file (or stream): 'https://bitbucket.org/snakeyaml/snakeyaml/wiki/Documentation#markdown-header-loading-yaml'.
        //    - Support example: construct a Java object of any type. Ref. 'https://bitbucket.org/snakeyaml/snakeyaml/src/master/src/test/java/examples/AnyObjectExampleTest.java'.
        System.out.println("-");
        // try {

            InputStream stream_input_file = new FileInputStream(input_files_filepaths[0]);                  // Throws exception: 'FileNotFoundException': 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileInputStream.html#%3Cinit%3E(java.lang.String)'.
            System.out.println("[LOG] Reading '.yaml' file...");
            System.out.println(input_files_filepaths[0]);
            var yaml = new Yaml();
            //  Method 'yaml.load()' returns an Java instance of class 'Object'.
            // Object data = yaml.load(stream_input_secrets);                                                  //  Approach 01: basic. Threat return as a 'generic' Object.
            // Map<String, Object> data = yaml.load(stream_input_secrets);                                     //  Approach 02: recommended. CAST into a instance of clas 'Map' for dictionary-like behaviour; i.e. key-value map / dictionary, usually key as String, and value as an Object.
            // Map<String, Object> data = (Map<String, Object>) yaml.load(stream_input_secrets);               //  Approach 03: more explicit variable declaration with CASTING.
            var data = (Map<String, Object>) yaml.load(stream_input_file);                                  //  Approach 04: practical approach with 'var' declaration, yet still recommended, including proper casting. to Map<String, Object< in this case.
            // System.out.println(data);
            stream_input_file.close();                                                                      //  Manual close. Consider using 'try-with-resources'. Throws exception: 'IOException': 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileInputStream.html#close()'.

        // } catch (FileNotFoundException e) {
        //     System.out.println("[LOG - ERROR] File can't be opened for reading.");
        //     System.out.println(e.getMessage());                                                             //  Print error details.
        // } catch (IOException e) {
        //     System.out.println("[LOG - ERROR] General I/O exception happened when trying to read file.");
        //     System.out.println(e.getMessage());                                                             //  Print error details.
        // }
        var parameters = (Map<String, Object>) data.get("parameters");
        System.out.println(parameters);
        System.out.println();

        //  Gets list of options for currencies conversion.
        //  - Gets parameter from previous YAML import and casting into an instance of class Map; e.g. 'var data = (Map<String, Object>) yaml.load(stream_input_secrets);'
        System.out.println("-");
        System.out.println("[LOG] Getting list of options for currencies conversion...");
        var menu_options = (Map<String, Object>) parameters.get("menu_options");
        System.out.println(menu_options);
        System.out.println();

        // System.out.println("-");
        // for (String i : menu_options.keySet()) {
        //     System.out.println("Key: " + i + " | Value: " + menu_options.get(i));
        // }
        // var temp1 = (List<?>) menu_options.get("1");
        // System.out.println(temp1);
        // System.out.println(temp1.get(0));

        //  Loads '.yaml' file: secrets.
        //  - Uses SnakeYAML library: 'https://bitbucket.org/snakeyaml/snakeyaml/wiki/Documentation'.
        //  - Approach: load from file (or stream): 'https://bitbucket.org/snakeyaml/snakeyaml/wiki/Documentation#markdown-header-loading-yaml'.
        System.out.println("-");
        // try {

            InputStream stream_input_file_secrets = new FileInputStream(input_files_filepaths[1]);          // Throws exception: 'FileNotFoundException': 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileInputStream.html#%3Cinit%3E(java.lang.String)'.
            System.out.println("[LOG] Reading '.yaml' file...");
            System.out.println(input_files_filepaths[1]);
            var yaml_secrets = new Yaml();
            var data_secrets = (Map<String, Object>) yaml_secrets.load(stream_input_file_secrets);
            // System.out.println(data_secrets);
            stream_input_file_secrets.close();                                                              //  Manual close. Consider using 'try-with-resources'. Throws exception: 'IOException': 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileInputStream.html#close()'.

        // } catch (FileNotFoundException e) {
        //     System.out.println("[LOG - ERROR] File can't be opened for reading.");
        //     System.out.println(e.getMessage());                                                             //  Print error details.
        // } catch (IOException e) {
        //     System.out.println("[LOG - ERROR] General I/O exception happened when trying to read file.");
        //     System.out.println(e.getMessage());                                                             //  Print error details.
        // }
        var secrets = (Map<String, Object>) data_secrets.get("secrets");
        // System.out.println(secrets);
        System.out.println();

        //  Gets ExchangeRate API token.
        //  - Gets parameter from previous YAML import and casting into an instance of class Map; e.g. 'var data = (Map<String, Object>) yaml.load(stream_input_secrets);'
        System.out.println("-");
        System.out.println("[LOG] Getting API token...");
        @SuppressWarnings("unused")
        var _EXCHANGERATE_API_TOKEN = (String) secrets.get("_EXCHANGERATE_API_TOKEN").toString();           //  Access an item from a 'Map' instance ('https://www.w3schools.com/java/java_hashmap.asp'), and converts 'Object' to 'String' with 'Object's inherent method '.toString()' ('https://www.baeldung.com/java-object-string-representation'). 
        // System.out.println(_EXCHANGERATE_API_TOKEN);
        System.out.println();
        
        // //  [TEST] 'Map' utilities custom method: get key(s) from value.
        // System.out.println("-");
        // System.out.println("[LOG] Getting key of map, based on value...");
        // Stream<String> key_stream = stream_from_map.GetKeysFromValue(secrets, "<value>");
        // var key = (String) key_stream.findFirst().get();
        // System.out.println(key);
        // System.out.println();

        // //  MAIN APP.

        // int cont = 0;
        // while(is_menu_exit.equals(false)) {
        //     System.out.println(menu);
        //     cont++;
        //     if (cont == 2) {
        //         is_menu_exit = true;
        //     }
        //     System.out.println(cont);
        //     System.out.println(is_menu_exit);
        // }

        System.out.println("-");
        System.out.println();

        //  CONSTRUCTOR.
        //  - Same name as Class, and custom definition.
        //  - If 'empty' (i.e. 'predetermined'), it's usually useful to at least initialize attributes with default values.
        //  - If we define a constructor for the superclass, now ALL OF ITS SUBCLASSES must have a MATCHING constructor.

        //  ATTRIBUTE'S 'GETTERS'.

        //  ATTRIBUTE'S 'SETTERS': usually, public.
        //  - Protected keyword 'this' is used to refer to CURRENT object, to avoid confusions with parameters (in case those have the same name).

        //  INHERITED METHODS TO OVERRIDE: custom definitions for CURRENT class.

        //  METHODS FROM 'IMPLEMENTS'.
        
        //  REGULAR METHODS.

    }
    
}
//  EOF.