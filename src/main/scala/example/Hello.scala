package example

import zio._
import zhttp.http._
import zhttp.service.Server

object Hello extends App {
  val route = HttpApp.collect {
    case Method.GET -> Root =>
      Response.text("Hello, Joe")
  }

  val server = Server.start(8080, route)

  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] =
    server.exitCode
}
