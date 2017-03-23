
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Eileen/Desktop/TicketStore/conf/routes
// @DATE:Thu Mar 23 20:36:19 GMT 2017


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
