/*
 * This module contains one package:
 *  com.entertainment.client
 *
 * As the "client" module, it doesn't exports anything, but it DOES
 * "requires" the other module, com.entertainment.
 */
module com.entertainment.client {
    // what other *modules* does this module depend on (use)?
    requires com.entertainment;
}