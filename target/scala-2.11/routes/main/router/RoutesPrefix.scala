
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/TicketStore/conf/routes
// @DATE:Thu Mar 30 10:38:41 IST 2017


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
