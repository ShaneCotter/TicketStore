
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/TicketStore/conf/routes
// @DATE:Tue Apr 04 11:02:52 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def cart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.cart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
    // @LINE:28
    def deleteEvent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteEvent",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delEvent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:16
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:18
    def addTicket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTicket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addticket"})
        }
      """
    )
  
    // @LINE:9
    def addEvent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addEvent",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addevent"})
        }
      """
    )
  
    // @LINE:17
    def signUpSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signUpSubmit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUpSubmit"})
        }
      """
    )
  
    // @LINE:22
    def addTicketSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTicketSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addTicketSubmit"})
        }
      """
    )
  
    // @LINE:14
    def eventTicket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.eventTicket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eventticket"})
        }
      """
    )
  
    // @LINE:24
    def deleteTicket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteTicket",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delTicket/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:11
    def checkout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.checkout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkout"})
        }
      """
    )
  
    // @LINE:13
    def events: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.events",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events"})
        }
      """
    )
  
    // @LINE:26
    def addEventSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addEventSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addEventSubmit"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:12
    def contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.contact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
    // @LINE:8
    def aboutUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.aboutUs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:19
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:15
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
