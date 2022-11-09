/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bonsai.simulatorapi.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SimulatorSession progress milestone.
 */
public class SimulatorSessionMilestone {
    /**
     * First time, this session made the specified progress.
     */
    @JsonProperty(value = "firstTime")
    private DateTime firstTime;

    /**
     * Get first time, this session made the specified progress.
     *
     * @return the firstTime value
     */
    public DateTime firstTime() {
        return this.firstTime;
    }

    /**
     * Set first time, this session made the specified progress.
     *
     * @param firstTime the firstTime value to set
     * @return the SimulatorSessionMilestone object itself.
     */
    public SimulatorSessionMilestone withFirstTime(DateTime firstTime) {
        this.firstTime = firstTime;
        return this;
    }

}
