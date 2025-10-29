/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//  Package location definition.
package a1t0ghb.courses_oracle_one.challenge_conversor_monedas;

//  IMPORTS: external classes and interfaces.

//  IMPORTS - UTILITIES.
//  Shortcut for importing ALL Java Utils: 'import java.util.*;'.
import java.io.File;                                    //  [Class] Files and directories management: 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/File.html'.

//  IMPORTS - CUSTOM CLASSES AND CUSTOM INTERFACES.

/**
 *
 * @author a1t0ghb
 */
public class App {

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        System.out.println("\n----- ----- -----\n");
        
        //  INITIALIZATION OF INSTANCES.

        //  Validates existence of '.yaml' file: secrets.
        //  - Validates if file exists, and if so, show it's properties: 'https://www.w3schools.com/java/java_files_read.asp'.
        //  - NOTE: starting folder (or ROOT) is project's folder. From here, all other folders are deployed; e.g. 'src'.
        //    - Using Maven's Standard Directory Layout (SDL), as reference: 'https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html'.
        //    - Using TIBCO's guide for content location and folders structure: 'https://docs.tibco.com/pub/str/10.6.3/doc/html/authoring/maven-whatgoeswhere.html#maven-whatgoeswhere_eachfolder'.
        System.out.println("-----");
        File file_input_secrets = new File("src/main/resources/input_secrets.yaml");                     //  Can receive either an absolute or relative path.
        System.out.println("[LOG] Validating if file (with provided path) exists:");
        System.out.println("Filename: " + file_input_secrets.getName());
        System.out.println("Folder path: " + file_input_secrets.getParent());
        System.out.println();
        if (file_input_secrets.exists()) {
            System.out.println("[LOG - SUCCESS] File found.");
            System.out.println("Absolute path: " + file_input_secrets.getAbsolutePath());
            System.out.println("Writeable: " + file_input_secrets.canWrite());
            System.out.println("Readable: " + file_input_secrets.canRead());
            System.out.println("File size in bytes: " + file_input_secrets.length());
        } else {
            System.out.println("[LOG - ERROR] File does not exist.");
        }
        System.out.println();

        System.out.println("----- ----- -----\n");

        //  ATTRIBUTES DECLARATION.

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