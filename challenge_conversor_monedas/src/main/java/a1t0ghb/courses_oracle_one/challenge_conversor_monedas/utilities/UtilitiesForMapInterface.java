/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.challenge_conversor_monedas.utilities;

//  IMPORTS: external classes and interfaces.

//  IMPORTS - UTILITIES.
//  Shortcut for importing ALL Java Utils: 'import java.util.*;'.
import java.util.stream.Stream;                                     //  [Interface] Stream as flexible return; e.g. 'one key' as a single String, or a collection, as a Set of Strings: 'https://www.baeldung.com/java-map-key-from-value#a-functional-approach', 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html'.
import java.util.Map;                                               //  [Interface] A key-value mapping: 'https://www.baeldung.com/java-hashmap#basic-usage', 'https://www.w3schools.com/java/java_map.asp', 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html'.

//  IMPORTS - CUSTOM CLASSES AND CUSTOM INTERFACES.

/**
 *
 * @author a1t0ghb
 */
public class UtilitiesForMapInterface {

    //  INITIALIZATION OF INSTANCES.

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

    //  Get a 'stream' of keys of the 'Map' instance provided, by filtering entries with given 'V' value.
    //  - Ref. 'https://www.baeldung.com/java-map-key-from-value#a-functional-approach'.
    //  - Function's return is 'flexible'; you can convert it to whatever and plausible class you need. Usage examples:
    //    - E.g. a String: 'Stream<String> keyStream1 = keys(capitalCountryMap, "South Africa"); String capital = keyStream1.findFirst().get();'.
    //    - E.g. a Set of Strings: 'Stream<String> keyStream2 = keys(capitalCountryMap, "South Africa"); Set<String> capitals = keyStream2.collect(Collectors.toSet());'.
    public <K, V> Stream<K> GetKeysFromValue(Map<K, V> map, V value) {
        return map
            .entrySet()
            .stream()
            .filter(entry -> value.equals(entry.getValue()))
            .map(Map.Entry::getKey);
    }

}
