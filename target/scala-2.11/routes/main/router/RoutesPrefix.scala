
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/TicketStore/conf/routes
// @DATE:Wed Mar 15 11:47:18 GMT 2017


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
