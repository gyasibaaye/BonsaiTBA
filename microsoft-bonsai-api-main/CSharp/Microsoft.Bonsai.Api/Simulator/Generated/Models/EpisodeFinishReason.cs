// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Bonsai.SimulatorApi.Models
{
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using System.Runtime;
    using System.Runtime.Serialization;

    /// <summary>
    /// Defines values for EpisodeFinishReason.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum EpisodeFinishReason
    {
        [EnumMember(Value = "Invalid")]
        Invalid,
        [EnumMember(Value = "Unspecified")]
        Unspecified,
        [EnumMember(Value = "LessonChanged")]
        LessonChanged,
        [EnumMember(Value = "Terminal")]
        Terminal,
        [EnumMember(Value = "Interrupted")]
        Interrupted
    }
    internal static class EpisodeFinishReasonEnumExtension
    {
        internal static string ToSerializedValue(this EpisodeFinishReason? value)
        {
            return value == null ? null : ((EpisodeFinishReason)value).ToSerializedValue();
        }

        internal static string ToSerializedValue(this EpisodeFinishReason value)
        {
            switch( value )
            {
                case EpisodeFinishReason.Invalid:
                    return "Invalid";
                case EpisodeFinishReason.Unspecified:
                    return "Unspecified";
                case EpisodeFinishReason.LessonChanged:
                    return "LessonChanged";
                case EpisodeFinishReason.Terminal:
                    return "Terminal";
                case EpisodeFinishReason.Interrupted:
                    return "Interrupted";
            }
            return null;
        }

        internal static EpisodeFinishReason? ParseEpisodeFinishReason(this string value)
        {
            switch( value )
            {
                case "Invalid":
                    return EpisodeFinishReason.Invalid;
                case "Unspecified":
                    return EpisodeFinishReason.Unspecified;
                case "LessonChanged":
                    return EpisodeFinishReason.LessonChanged;
                case "Terminal":
                    return EpisodeFinishReason.Terminal;
                case "Interrupted":
                    return EpisodeFinishReason.Interrupted;
            }
            return null;
        }
    }
}
