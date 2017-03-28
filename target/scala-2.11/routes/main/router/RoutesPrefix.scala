
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jay/Desktop/TicketStore/conf/routes
// @DATE:Tue Mar 28 21:01:59 BST 2017


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
