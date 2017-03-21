
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/matthewcleary/Desktop/TicketStore/conf/routes
// @DATE:Tue Mar 21 21:28:45 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
