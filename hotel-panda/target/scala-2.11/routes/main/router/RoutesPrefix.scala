
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Research/Java/hotel-panda/conf/routes
// @DATE:Sun Jun 11 16:43:00 ICT 2017


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
