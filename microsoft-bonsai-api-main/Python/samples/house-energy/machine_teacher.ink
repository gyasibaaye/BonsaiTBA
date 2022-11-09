inkling "2.0"
using Number
using Goal
using Math

const MaxDeviation = 2
const MaxIterations = 288

type ObservableState {
    Tset: number,
    Tin: number,
    Tout: number,
}

type SimAction {
    hvacON: number<off=0, on=1,>
}

type SimConfig {
    K: number, # Thermal conductivity
    C: number, # Thermal Capacity
    Qhvac: number, # Heat Flux
    horizon: number, # Signal Length based on EpisodeLength
    Tin_initial: number, # C, initial indoor temperature
    Tout_median: number, # C, outdoor temperature: sine wave signal bias
    Tout_amplitude: number, # C, outdoor temperature: sine wave amplitude 
    Tset_start:  number, # C, starting Tset
    Tset_stop: number, # C, ending Tset
    Tset_transition: number, # time (in iterations of timesteps) to transition from starting Tset to ending Tset
}

function TempDiff(Tin:number, Tset:number) {
    return Math.Abs(Tin - Tset)
}


graph (input: ObservableState): SimAction {
    concept SmartHouse(input): SimAction {
        curriculum {
            source simulator (Action: SimAction, Config: SimConfig): ObservableState {

            }
            goal (State: ObservableState) {
                minimize `Temp Deviation`:
                    TempDiff(State.Tin, State.Tset) in Goal.RangeBelow(MaxDeviation)
            }

            training {
                EpisodeIterationLimit: MaxIterations
            }

            lesson `Lesson 1` {
                scenario {
                    K: 0.5,
                    C: 0.3,
                    Qhvac: 9,
                    horizon: MaxIterations,
                    Tin_initial: number<18 .. 30>,
                    Tout_median: number< 23 .. 30>, # C,
                    Tout_amplitude: number<3 .. 5>,
                    Tset_start: 25,
                    Tset_stop: Number.Int8<20 .. 22>,
                    Tset_transition: Number.Int16<100 .. 148>,

                }
            }
        }
    }
}