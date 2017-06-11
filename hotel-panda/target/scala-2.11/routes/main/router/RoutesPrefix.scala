
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Research/Java/hotel-panda/conf/routes
// @DATE:Sun Jun 11 08:54:47 ICT 2017


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
