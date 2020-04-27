# Zipping two Observables of different sizes hangs

I am using the following versions:

JDK: 11
Monix: 3.1.0
Scala: 2.13.1
SBT: 1.3.10

## How to reproduce

`sbt run`

The program does not terminate sometimes. In `Main`, I am running the same piece of code 50 times. If you drop it to just once or twice, it is less likely to not terminate.
