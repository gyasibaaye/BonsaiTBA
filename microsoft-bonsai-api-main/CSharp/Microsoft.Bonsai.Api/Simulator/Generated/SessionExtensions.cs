// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Bonsai.SimulatorApi
{
    using Models;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;

    /// <summary>
    /// Extension methods for Session.
    /// </summary>
    public static partial class SessionExtensions
    {
            /// <summary>
            /// Retrieves all of the simulators currently registered with all
            /// simulator gateways within this workspace.
            /// </summary>
            /// <remarks>
            /// The deployment_mode appears in the query string. It can be one of
            /// Unspecified, Testing, or Hosted. If it has a 'neq:' prefix, that means
            /// "not;"
            /// e.g., {.../simulatorSessions?deployment_mode=neq:Hosted} means the response
            /// should not include
            /// simulators that are hosted.
            ///
            /// The session_status can be one of Attachable, Attached, Detaching, Rejected,
            /// and supports the neq: prefix.
            ///
            /// The collection appears in the query string
            ///
            /// The package appears in the query string
            ///
            /// The filter queries can appear together, like
            /// {.../simulatorSessions?deployment_mode=Hosted&amp;collection=1234-455-33333}
            /// </remarks>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='workspaceName'>
            /// The workspace identifier.
            /// </param>
            /// <param name='deploymentMode'>
            /// A specifier to filter on deployment mode
            /// </param>
            /// <param name='sessionStatus'>
            /// A specifier to filter on session status
            /// </param>
            /// <param name='collection'>
            /// If present, only sessions in this collection
            /// </param>
            /// <param name='package'>
            /// If present, only sessions in this package
            /// </param>
            public static IList<SimulatorSessionSummary> List(this ISession operations, string workspaceName, string deploymentMode = default(string), string sessionStatus = default(string), string collection = default(string), string package = default(string))
            {
                return operations.ListAsync(workspaceName, deploymentMode, sessionStatus, collection, package).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Retrieves all of the simulators currently registered with all
            /// simulator gateways within this workspace.
            /// </summary>
            /// <remarks>
            /// The deployment_mode appears in the query string. It can be one of
            /// Unspecified, Testing, or Hosted. If it has a 'neq:' prefix, that means
            /// "not;"
            /// e.g., {.../simulatorSessions?deployment_mode=neq:Hosted} means the response
            /// should not include
            /// simulators that are hosted.
            ///
            /// The session_status can be one of Attachable, Attached, Detaching, Rejected,
            /// and supports the neq: prefix.
            ///
            /// The collection appears in the query string
            ///
            /// The package appears in the query string
            ///
            /// The filter queries can appear together, like
            /// {.../simulatorSessions?deployment_mode=Hosted&amp;collection=1234-455-33333}
            /// </remarks>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='workspaceName'>
            /// The workspace identifier.
            /// </param>
            /// <param name='deploymentMode'>
            /// A specifier to filter on deployment mode
            /// </param>
            /// <param name='sessionStatus'>
            /// A specifier to filter on session status
            /// </param>
            /// <param name='collection'>
            /// If present, only sessions in this collection
            /// </param>
            /// <param name='package'>
            /// If present, only sessions in this package
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<IList<SimulatorSessionSummary>> ListAsync(this ISession operations, string workspaceName, string deploymentMode = default(string), string sessionStatus = default(string), string collection = default(string), string package = default(string), CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.ListWithHttpMessagesAsync(workspaceName, deploymentMode, sessionStatus, collection, package, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Registers a simulator with the Bonsai platform.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='workspaceName'>
            /// The workspace identifier.
            /// </param>
            /// <param name='body'>
            /// Information and capabilities about the simulator.
            /// </param>
            public static SimulatorSessionResponse Create(this ISession operations, string workspaceName, SimulatorInterface body)
            {
                return operations.CreateAsync(workspaceName, body).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Registers a simulator with the Bonsai platform.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='workspaceName'>
            /// The workspace identifier.
            /// </param>
            /// <param name='body'>
            /// Information and capabilities about the simulator.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<SimulatorSessionResponse> CreateAsync(this ISession operations, string workspaceName, SimulatorInterface body, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.CreateWithHttpMessagesAsync(workspaceName, body, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Retrieves a simulator session corresponding to the sessionId
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='workspaceName'>
            /// The workspace identifier.
            /// </param>
            /// <param name='sessionId'>
            /// The sessionId of the simulator session to fetch
            /// </param>
            public static SimulatorSessionResponse Get(this ISession operations, string workspaceName, string sessionId)
            {
                return operations.GetAsync(workspaceName, sessionId).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Retrieves a simulator session corresponding to the sessionId
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='workspaceName'>
            /// The workspace identifier.
            /// </param>
            /// <param name='sessionId'>
            /// The sessionId of the simulator session to fetch
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<SimulatorSessionResponse> GetAsync(this ISession operations, string workspaceName, string sessionId, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetWithHttpMessagesAsync(workspaceName, sessionId, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Deletes the Simulator session
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='workspaceName'>
            /// The workspace identifier.
            /// </param>
            /// <param name='sessionId'>
            /// The session ID generated during registration
            /// </param>
            public static void Delete(this ISession operations, string workspaceName, string sessionId)
            {
                operations.DeleteAsync(workspaceName, sessionId).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Deletes the Simulator session
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='workspaceName'>
            /// The workspace identifier.
            /// </param>
            /// <param name='sessionId'>
            /// The session ID generated during registration
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task DeleteAsync(this ISession operations, string workspaceName, string sessionId, CancellationToken cancellationToken = default(CancellationToken))
            {
                (await operations.DeleteWithHttpMessagesAsync(workspaceName, sessionId, null, cancellationToken).ConfigureAwait(false)).Dispose();
            }

            /// <summary>
            /// Gets the most recent action sent to the simulator to process.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='workspaceName'>
            /// The workspace identifier.
            /// </param>
            /// <param name='sessionId'>
            /// Unique identification of the simulator.
            /// </param>
            public static EventModel GetMostRecentAction(this ISession operations, string workspaceName, string sessionId)
            {
                return operations.GetMostRecentActionAsync(workspaceName, sessionId).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Gets the most recent action sent to the simulator to process.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='workspaceName'>
            /// The workspace identifier.
            /// </param>
            /// <param name='sessionId'>
            /// Unique identification of the simulator.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<EventModel> GetMostRecentActionAsync(this ISession operations, string workspaceName, string sessionId, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetMostRecentActionWithHttpMessagesAsync(workspaceName, sessionId, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Advance the RL agent with the new state of the simulator, and returns an
            /// action computed by our policy.
            /// Simulatorsession is supposed to use the returned action for stepping inside
            /// the sim and thne getting the new state.false
            /// You can send the same state again, as long as you didn't get a Non-Idle
            /// Action back.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='workspaceName'>
            /// The workspace identifier.
            /// </param>
            /// <param name='sessionId'>
            /// Unique identifier for the simulator.
            /// </param>
            /// <param name='body'>
            /// The new state of the simulator.
            /// </param>
            public static EventModel Advance(this ISession operations, string workspaceName, string sessionId, SimulatorState body)
            {
                return operations.AdvanceAsync(workspaceName, sessionId, body).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Advance the RL agent with the new state of the simulator, and returns an
            /// action computed by our policy.
            /// Simulatorsession is supposed to use the returned action for stepping inside
            /// the sim and thne getting the new state.false
            /// You can send the same state again, as long as you didn't get a Non-Idle
            /// Action back.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='workspaceName'>
            /// The workspace identifier.
            /// </param>
            /// <param name='sessionId'>
            /// Unique identifier for the simulator.
            /// </param>
            /// <param name='body'>
            /// The new state of the simulator.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<EventModel> AdvanceAsync(this ISession operations, string workspaceName, string sessionId, SimulatorState body, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.AdvanceWithHttpMessagesAsync(workspaceName, sessionId, body, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

    }
}
