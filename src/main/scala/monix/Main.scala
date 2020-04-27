package monix

import cats.effect.ExitCode
import monix.eval.{Task, TaskApp}
import monix.reactive.Observable

object Main extends TaskApp {
  override def run(args: List[String]): Task[ExitCode] = {
    val task = Observable(1, 2, 3).zip(Observable(1, 2, 3, 4)).completedL
    // Run it 50 times
    Task.traverse(Range(0, 50).toList)(_ => task).map(_ => ExitCode.Success)
  }
}
