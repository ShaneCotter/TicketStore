
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/TicketStore/conf/routes
// @DATE:Fri Apr 21 12:03:37 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:66
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseEventController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def listEvents: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EventController.listEvents",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listEvents" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def cart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.cart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
    // @LINE:23
    def myOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.myOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myOrders"})
        }
      """
    )
  
    // @LINE:48
    def deleteEvent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteEvent",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delEvent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:22
    def myAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.myAccount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myaccount"})
        }
      """
    )
  
    // @LINE:17
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:11
    def eventTicket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.eventTicket",
      """
        function(event0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eventticket" + _qS([(event0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("event", event0))])})
        }
      """
    )
  
    // @LINE:27
    def updateDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateDetails",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateDetails"})
        }
      """
    )
  
    // @LINE:49
    def updateEvent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateEvent",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateEvent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:51
    def addTicket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTicket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addticket"})
        }
      """
    )
  
    // @LINE:9
    def viewOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.viewOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrders"})
        }
      """
    )
  
    // @LINE:46
    def addEvent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addEvent",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addevent"})
        }
      """
    )
  
    // @LINE:18
    def signUpSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signUpSubmit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUpSubmit"})
        }
      """
    )
  
    // @LINE:52
    def addTicketSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTicketSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addTicketSubmit"})
        }
      """
    )
  
    // @LINE:54
    def updateTicket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateTicket",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateTicket/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:28
    def updateDetailsSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateDetailsSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateDetails"})
        }
      """
    )
  
    // @LINE:8
    def viewContact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.viewContact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewContact"})
        }
      """
    )
  
    // @LINE:43
    def adminevents: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.adminevents",
      """
        function(cat0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminevents" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0))])})
        }
      """
    )
  
    // @LINE:56
    def addContactSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addContactSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addContactSubmit"})
        }
      """
    )
  
    // @LINE:60
    def markAsRead: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.markAsRead",
      """
        function(id0,status1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "markAsRead" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0), (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("status", status1)])})
        }
      """
    )
  
    // @LINE:10
    def events: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.events",
      """
        function(cat0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0))])})
        }
      """
    )
  
    // @LINE:53
    def deleteTicket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteTicket",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delTicket/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:44
    def admineventTicket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.admineventTicket",
      """
        function(event0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admineventticket" + _qS([(event0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("event", event0))])})
        }
      """
    )
  
    // @LINE:58
    def viewAccounts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.viewAccounts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewAccounts"})
        }
      """
    )
  
    // @LINE:47
    def addEventSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addEventSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addEventSubmit"})
        }
      """
    )
  
    // @LINE:26
    def reportProblem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.reportProblem",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reportProblem"})
        }
      """
    )
  
    // @LINE:59
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUser" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id0)])})
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
  
    // @LINE:7
    def contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.contact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
    // @LINE:61
    def markAsProccessed: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.markAsProccessed",
      """
        function(id0,status1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "markAsProccessed" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0), (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("status", status1)])})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def deleteMyAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.deleteMyAccount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteMyAccount"})
        }
      """
    )
  
    // @LINE:16
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
  
    // @LINE:24
    def deleteAccountPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.deleteAccountPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteAccount"})
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

  // @LINE:31
  class ReverseShoppingCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def addOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addOne/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0)})
        }
      """
    )
  
    // @LINE:32
    def addToBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addToBasket",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToBasket/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:35
    def removeFromCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.removeFromCart",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeFromCart" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0)})
        }
      """
    )
  
    // @LINE:38
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.viewOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrder/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:37
    def placeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.placeOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "placeOrder"})
        }
      """
    )
  
    // @LINE:34
    def removeOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.removeOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeOne/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0)})
        }
      """
    )
  
    // @LINE:31
    def showBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.showBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showBasket"})
        }
      """
    )
  
    // @LINE:36
    def emptyBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.emptyBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emptyBasket"})
        }
      """
    )
  
  }


}
