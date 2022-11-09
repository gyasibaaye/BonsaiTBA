/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bonsai.simulatorapi;

import com.microsoft.bonsai.simulatorapi.models.Event;
import com.microsoft.bonsai.simulatorapi.models.ProblemDetailsException;
import com.microsoft.bonsai.simulatorapi.models.SimulatorInterface;
import com.microsoft.bonsai.simulatorapi.models.SimulatorSessionResponse;
import com.microsoft.bonsai.simulatorapi.models.SimulatorSessionSummary;
import com.microsoft.bonsai.simulatorapi.models.SimulatorState;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Sessions.
 */
public interface Sessions {
    /**
     * Retrieves all of the simulators currently registered with all
     simulator gateways within this workspace.
     * The deployment_mode appears in the query string. It can be one of
     Unspecified, Testing, or Hosted. If it has a 'neq:' prefix, that means "not;"
     e.g., {.../simulatorSessions?deployment_mode=neq:Hosted} means the response should not include
     simulators that are hosted.
     The session_status can be one of Attachable, Attached, Detaching, Rejected,
     and supports the neq: prefix.
     The collection appears in the query string
     The package appears in the query string
     The filter queries can appear together, like
     {.../simulatorSessions?deployment_mode=Hosted&amp;collection=1234-455-33333}.
     *
     * @param workspaceName The workspace identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ProblemDetailsException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;SimulatorSessionSummary&gt; object if successful.
     */
    List<SimulatorSessionSummary> list(String workspaceName);

    /**
     * Retrieves all of the simulators currently registered with all
     simulator gateways within this workspace.
     * The deployment_mode appears in the query string. It can be one of
     Unspecified, Testing, or Hosted. If it has a 'neq:' prefix, that means "not;"
     e.g., {.../simulatorSessions?deployment_mode=neq:Hosted} means the response should not include
     simulators that are hosted.
     The session_status can be one of Attachable, Attached, Detaching, Rejected,
     and supports the neq: prefix.
     The collection appears in the query string
     The package appears in the query string
     The filter queries can appear together, like
     {.../simulatorSessions?deployment_mode=Hosted&amp;collection=1234-455-33333}.
     *
     * @param workspaceName The workspace identifier.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<SimulatorSessionSummary>> listAsync(String workspaceName, final ServiceCallback<List<SimulatorSessionSummary>> serviceCallback);

    /**
     * Retrieves all of the simulators currently registered with all
     simulator gateways within this workspace.
     * The deployment_mode appears in the query string. It can be one of
     Unspecified, Testing, or Hosted. If it has a 'neq:' prefix, that means "not;"
     e.g., {.../simulatorSessions?deployment_mode=neq:Hosted} means the response should not include
     simulators that are hosted.
     The session_status can be one of Attachable, Attached, Detaching, Rejected,
     and supports the neq: prefix.
     The collection appears in the query string
     The package appears in the query string
     The filter queries can appear together, like
     {.../simulatorSessions?deployment_mode=Hosted&amp;collection=1234-455-33333}.
     *
     * @param workspaceName The workspace identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SimulatorSessionSummary&gt; object
     */
    Observable<List<SimulatorSessionSummary>> listAsync(String workspaceName);

    /**
     * Retrieves all of the simulators currently registered with all
     simulator gateways within this workspace.
     * The deployment_mode appears in the query string. It can be one of
     Unspecified, Testing, or Hosted. If it has a 'neq:' prefix, that means "not;"
     e.g., {.../simulatorSessions?deployment_mode=neq:Hosted} means the response should not include
     simulators that are hosted.
     The session_status can be one of Attachable, Attached, Detaching, Rejected,
     and supports the neq: prefix.
     The collection appears in the query string
     The package appears in the query string
     The filter queries can appear together, like
     {.../simulatorSessions?deployment_mode=Hosted&amp;collection=1234-455-33333}.
     *
     * @param workspaceName The workspace identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SimulatorSessionSummary&gt; object
     */
    Observable<ServiceResponse<List<SimulatorSessionSummary>>> listWithServiceResponseAsync(String workspaceName);
    /**
     * Retrieves all of the simulators currently registered with all
     simulator gateways within this workspace.
     * The deployment_mode appears in the query string. It can be one of
     Unspecified, Testing, or Hosted. If it has a 'neq:' prefix, that means "not;"
     e.g., {.../simulatorSessions?deployment_mode=neq:Hosted} means the response should not include
     simulators that are hosted.
     The session_status can be one of Attachable, Attached, Detaching, Rejected,
     and supports the neq: prefix.
     The collection appears in the query string
     The package appears in the query string
     The filter queries can appear together, like
     {.../simulatorSessions?deployment_mode=Hosted&amp;collection=1234-455-33333}.
     *
     * @param workspaceName The workspace identifier.
     * @param deploymentMode A specifier to filter on deployment mode
     * @param sessionStatus A specifier to filter on session status
     * @param collection If present, only sessions in this collection
     * @param packageParameter If present, only sessions in this package
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ProblemDetailsException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;SimulatorSessionSummary&gt; object if successful.
     */
    List<SimulatorSessionSummary> list(String workspaceName, String deploymentMode, String sessionStatus, String collection, String packageParameter);

    /**
     * Retrieves all of the simulators currently registered with all
     simulator gateways within this workspace.
     * The deployment_mode appears in the query string. It can be one of
     Unspecified, Testing, or Hosted. If it has a 'neq:' prefix, that means "not;"
     e.g., {.../simulatorSessions?deployment_mode=neq:Hosted} means the response should not include
     simulators that are hosted.
     The session_status can be one of Attachable, Attached, Detaching, Rejected,
     and supports the neq: prefix.
     The collection appears in the query string
     The package appears in the query string
     The filter queries can appear together, like
     {.../simulatorSessions?deployment_mode=Hosted&amp;collection=1234-455-33333}.
     *
     * @param workspaceName The workspace identifier.
     * @param deploymentMode A specifier to filter on deployment mode
     * @param sessionStatus A specifier to filter on session status
     * @param collection If present, only sessions in this collection
     * @param packageParameter If present, only sessions in this package
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<SimulatorSessionSummary>> listAsync(String workspaceName, String deploymentMode, String sessionStatus, String collection, String packageParameter, final ServiceCallback<List<SimulatorSessionSummary>> serviceCallback);

    /**
     * Retrieves all of the simulators currently registered with all
     simulator gateways within this workspace.
     * The deployment_mode appears in the query string. It can be one of
     Unspecified, Testing, or Hosted. If it has a 'neq:' prefix, that means "not;"
     e.g., {.../simulatorSessions?deployment_mode=neq:Hosted} means the response should not include
     simulators that are hosted.
     The session_status can be one of Attachable, Attached, Detaching, Rejected,
     and supports the neq: prefix.
     The collection appears in the query string
     The package appears in the query string
     The filter queries can appear together, like
     {.../simulatorSessions?deployment_mode=Hosted&amp;collection=1234-455-33333}.
     *
     * @param workspaceName The workspace identifier.
     * @param deploymentMode A specifier to filter on deployment mode
     * @param sessionStatus A specifier to filter on session status
     * @param collection If present, only sessions in this collection
     * @param packageParameter If present, only sessions in this package
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SimulatorSessionSummary&gt; object
     */
    Observable<List<SimulatorSessionSummary>> listAsync(String workspaceName, String deploymentMode, String sessionStatus, String collection, String packageParameter);

    /**
     * Retrieves all of the simulators currently registered with all
     simulator gateways within this workspace.
     * The deployment_mode appears in the query string. It can be one of
     Unspecified, Testing, or Hosted. If it has a 'neq:' prefix, that means "not;"
     e.g., {.../simulatorSessions?deployment_mode=neq:Hosted} means the response should not include
     simulators that are hosted.
     The session_status can be one of Attachable, Attached, Detaching, Rejected,
     and supports the neq: prefix.
     The collection appears in the query string
     The package appears in the query string
     The filter queries can appear together, like
     {.../simulatorSessions?deployment_mode=Hosted&amp;collection=1234-455-33333}.
     *
     * @param workspaceName The workspace identifier.
     * @param deploymentMode A specifier to filter on deployment mode
     * @param sessionStatus A specifier to filter on session status
     * @param collection If present, only sessions in this collection
     * @param packageParameter If present, only sessions in this package
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SimulatorSessionSummary&gt; object
     */
    Observable<ServiceResponse<List<SimulatorSessionSummary>>> listWithServiceResponseAsync(String workspaceName, String deploymentMode, String sessionStatus, String collection, String packageParameter);

    /**
     * Registers a simulator with the Bonsai platform.
     *
     * @param workspaceName The workspace identifier.
     * @param body Information and capabilities about the simulator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ProblemDetailsException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SimulatorSessionResponse object if successful.
     */
    SimulatorSessionResponse create(String workspaceName, SimulatorInterface body);

    /**
     * Registers a simulator with the Bonsai platform.
     *
     * @param workspaceName The workspace identifier.
     * @param body Information and capabilities about the simulator.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SimulatorSessionResponse> createAsync(String workspaceName, SimulatorInterface body, final ServiceCallback<SimulatorSessionResponse> serviceCallback);

    /**
     * Registers a simulator with the Bonsai platform.
     *
     * @param workspaceName The workspace identifier.
     * @param body Information and capabilities about the simulator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimulatorSessionResponse object
     */
    Observable<SimulatorSessionResponse> createAsync(String workspaceName, SimulatorInterface body);

    /**
     * Registers a simulator with the Bonsai platform.
     *
     * @param workspaceName The workspace identifier.
     * @param body Information and capabilities about the simulator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimulatorSessionResponse object
     */
    Observable<ServiceResponse<SimulatorSessionResponse>> createWithServiceResponseAsync(String workspaceName, SimulatorInterface body);

    /**
     * Retrieves a simulator session corresponding to the sessionId.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId The sessionId of the simulator session to fetch
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ProblemDetailsException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SimulatorSessionResponse object if successful.
     */
    SimulatorSessionResponse get(String workspaceName, String sessionId);

    /**
     * Retrieves a simulator session corresponding to the sessionId.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId The sessionId of the simulator session to fetch
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SimulatorSessionResponse> getAsync(String workspaceName, String sessionId, final ServiceCallback<SimulatorSessionResponse> serviceCallback);

    /**
     * Retrieves a simulator session corresponding to the sessionId.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId The sessionId of the simulator session to fetch
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimulatorSessionResponse object
     */
    Observable<SimulatorSessionResponse> getAsync(String workspaceName, String sessionId);

    /**
     * Retrieves a simulator session corresponding to the sessionId.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId The sessionId of the simulator session to fetch
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimulatorSessionResponse object
     */
    Observable<ServiceResponse<SimulatorSessionResponse>> getWithServiceResponseAsync(String workspaceName, String sessionId);

    /**
     * Deletes the Simulator session.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId The session ID generated during registration
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ProblemDetailsException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String workspaceName, String sessionId);

    /**
     * Deletes the Simulator session.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId The session ID generated during registration
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String workspaceName, String sessionId, final ServiceCallback<Void> serviceCallback);

    /**
     * Deletes the Simulator session.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId The session ID generated during registration
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String workspaceName, String sessionId);

    /**
     * Deletes the Simulator session.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId The session ID generated during registration
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String workspaceName, String sessionId);

    /**
     * Gets the most recent action sent to the simulator to process.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId Unique identification of the simulator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ProblemDetailsException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Event object if successful.
     */
    Event getMostRecentAction(String workspaceName, String sessionId);

    /**
     * Gets the most recent action sent to the simulator to process.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId Unique identification of the simulator.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Event> getMostRecentActionAsync(String workspaceName, String sessionId, final ServiceCallback<Event> serviceCallback);

    /**
     * Gets the most recent action sent to the simulator to process.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId Unique identification of the simulator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Event object
     */
    Observable<Event> getMostRecentActionAsync(String workspaceName, String sessionId);

    /**
     * Gets the most recent action sent to the simulator to process.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId Unique identification of the simulator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Event object
     */
    Observable<ServiceResponse<Event>> getMostRecentActionWithServiceResponseAsync(String workspaceName, String sessionId);

    /**
     * Advance the RL agent with the new state of the simulator, and returns an action computed by our policy.
     Simulatorsession is supposed to use the returned action for stepping inside the sim and thne getting the new state.false
     You can send the same state again, as long as you didn't get a Non-Idle Action back.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId Unique identifier for the simulator.
     * @param body The new state of the simulator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ProblemDetailsException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Event object if successful.
     */
    Event advance(String workspaceName, String sessionId, SimulatorState body);

    /**
     * Advance the RL agent with the new state of the simulator, and returns an action computed by our policy.
     Simulatorsession is supposed to use the returned action for stepping inside the sim and thne getting the new state.false
     You can send the same state again, as long as you didn't get a Non-Idle Action back.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId Unique identifier for the simulator.
     * @param body The new state of the simulator.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Event> advanceAsync(String workspaceName, String sessionId, SimulatorState body, final ServiceCallback<Event> serviceCallback);

    /**
     * Advance the RL agent with the new state of the simulator, and returns an action computed by our policy.
     Simulatorsession is supposed to use the returned action for stepping inside the sim and thne getting the new state.false
     You can send the same state again, as long as you didn't get a Non-Idle Action back.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId Unique identifier for the simulator.
     * @param body The new state of the simulator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Event object
     */
    Observable<Event> advanceAsync(String workspaceName, String sessionId, SimulatorState body);

    /**
     * Advance the RL agent with the new state of the simulator, and returns an action computed by our policy.
     Simulatorsession is supposed to use the returned action for stepping inside the sim and thne getting the new state.false
     You can send the same state again, as long as you didn't get a Non-Idle Action back.
     *
     * @param workspaceName The workspace identifier.
     * @param sessionId Unique identifier for the simulator.
     * @param body The new state of the simulator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Event object
     */
    Observable<ServiceResponse<Event>> advanceWithServiceResponseAsync(String workspaceName, String sessionId, SimulatorState body);

}
