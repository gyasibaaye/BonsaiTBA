/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bonsai.simulatorapi.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for UnregisterReason.
 */
public enum UnregisterReason {
    /** Enum value Unspecified. */
    UNSPECIFIED("Unspecified"),

    /** Enum value Finished. */
    FINISHED("Finished"),

    /** Enum value Error. */
    ERROR("Error"),

    /** Enum value NotFound. */
    NOT_FOUND("NotFound");

    /** The actual serialized value for a UnregisterReason instance. */
    private String value;

    UnregisterReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a UnregisterReason instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed UnregisterReason object, or null if unable to parse.
     */
    @JsonCreator
    public static UnregisterReason fromString(String value) {
        UnregisterReason[] items = UnregisterReason.values();
        for (UnregisterReason item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
