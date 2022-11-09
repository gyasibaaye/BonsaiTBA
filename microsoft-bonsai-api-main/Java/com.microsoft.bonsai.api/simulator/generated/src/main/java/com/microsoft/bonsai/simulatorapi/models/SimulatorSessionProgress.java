/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bonsai.simulatorapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SimulatorSession progress:
 * Has the simulator ever attached to a Scholar;
 * Has the simulator ever iterated (i.e., sent a state and received an action);
 * Has the simulator ever completed an episode (i.e., received an EpisodeFinish
 * message).
 */
public class SimulatorSessionProgress {
    /**
     * The attached property.
     */
    @JsonProperty(value = "attached")
    private SimulatorSessionMilestone attached;

    /**
     * The iterated property.
     */
    @JsonProperty(value = "iterated")
    private SimulatorSessionMilestone iterated;

    /**
     * The finishedEpisode property.
     */
    @JsonProperty(value = "finishedEpisode")
    private SimulatorSessionMilestone finishedEpisode;

    /**
     * Get the attached value.
     *
     * @return the attached value
     */
    public SimulatorSessionMilestone attached() {
        return this.attached;
    }

    /**
     * Set the attached value.
     *
     * @param attached the attached value to set
     * @return the SimulatorSessionProgress object itself.
     */
    public SimulatorSessionProgress withAttached(SimulatorSessionMilestone attached) {
        this.attached = attached;
        return this;
    }

    /**
     * Get the iterated value.
     *
     * @return the iterated value
     */
    public SimulatorSessionMilestone iterated() {
        return this.iterated;
    }

    /**
     * Set the iterated value.
     *
     * @param iterated the iterated value to set
     * @return the SimulatorSessionProgress object itself.
     */
    public SimulatorSessionProgress withIterated(SimulatorSessionMilestone iterated) {
        this.iterated = iterated;
        return this;
    }

    /**
     * Get the finishedEpisode value.
     *
     * @return the finishedEpisode value
     */
    public SimulatorSessionMilestone finishedEpisode() {
        return this.finishedEpisode;
    }

    /**
     * Set the finishedEpisode value.
     *
     * @param finishedEpisode the finishedEpisode value to set
     * @return the SimulatorSessionProgress object itself.
     */
    public SimulatorSessionProgress withFinishedEpisode(SimulatorSessionMilestone finishedEpisode) {
        this.finishedEpisode = finishedEpisode;
        return this;
    }

}
