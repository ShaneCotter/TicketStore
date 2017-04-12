
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/projectBackup/conf/routes
// @DATE:Wed Apr 12 12:32:00 IST 2017


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
