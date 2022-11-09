// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Bonsai.SimulatorApi.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// It contains simulator state information needed by bonsai platform in
    /// response of an action.
    /// </summary>
    public partial class SimulatorState
    {
        /// <summary>
        /// Initializes a new instance of the SimulatorState class.
        /// </summary>
        public SimulatorState()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the SimulatorState class.
        /// </summary>
        /// <param name="sequenceId">Always startes with 1, and Bonsai platform
        /// increment it at each Step event in advance operation.static
        /// Always just return the sequenceId returned by previous advance
        /// operation response.</param>
        /// <param name="state">State of your simulator model.</param>
        /// <param name="halted">Optional halt parameter to indicate, simulator
        /// wants to halt.
        /// Implicitly false when not present.</param>
        /// <param name="error">No error if not defined or empty</param>
        public SimulatorState(int sequenceId, object state = default(object), bool? halted = default(bool?), string error = default(string))
        {
            SequenceId = sequenceId;
            State = state;
            Halted = halted;
            Error = error;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets always startes with 1, and Bonsai platform increment
        /// it at each Step event in advance operation.static
        /// Always just return the sequenceId returned by previous advance
        /// operation response.
        /// </summary>
        [JsonProperty(PropertyName = "sequenceId")]
        public int SequenceId { get; set; }

        /// <summary>
        /// Gets or sets state of your simulator model.
        /// </summary>
        [JsonProperty(PropertyName = "state")]
        public object State { get; set; }

        /// <summary>
        /// Gets or sets optional halt parameter to indicate, simulator wants
        /// to halt.
        /// Implicitly false when not present.
        /// </summary>
        [JsonProperty(PropertyName = "halted")]
        public bool? Halted { get; set; }

        /// <summary>
        /// Gets or sets no error if not defined or empty
        /// </summary>
        [JsonProperty(PropertyName = "error")]
        public string Error { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="Rest.ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            //Nothing to validate
        }
    }
}
