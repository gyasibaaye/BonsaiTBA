/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bonsai.simulatorapi;

import com.microsoft.rest.RestClient;

/**
 * The interface for SimulatorAPI class.
 */
public interface SimulatorAPI {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://api.bons.ai";

    /**
     * Gets the Sessions object to access its operations.
     * @return the Sessions object.
     */
    Sessions sessions();

}
