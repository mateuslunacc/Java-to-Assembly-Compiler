/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl;

import org.xtext.example.mydsl.JavaStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class JavaStandaloneSetup extends JavaStandaloneSetupGenerated {
  public static void doSetup() {
    new JavaStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}