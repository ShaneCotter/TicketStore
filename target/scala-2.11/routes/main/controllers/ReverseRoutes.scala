
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/projectBackup/conf/routes
// @DATE:Wed Apr 12 12:32:00 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:62
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:11
  class ReverseEventController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def listEvents(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listEvents" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def cart(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:22
    def myOrders(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "myOrders")
    }
  
    // @LINE:45
    def deleteEvent(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "delEvent/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:21
    def myAccount(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "myaccount")
    }
  
    // @LINE:16
    def signUp(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:10
    def eventTicket(event:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "eventticket" + queryString(List(if(event == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("event", event)))))
    }
  
    // @LINE:26
    def updateDetails(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "updateDetails")
    }
  
    // @LINE:46
    def updateEvent(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "updateEvent/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:48
    def addTicket(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addticket")
    }
  
    // @LINE:43
    def addEvent(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addevent")
    }
  
    // @LINE:17
    def signUpSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signUpSubmit")
    }
  
    // @LINE:49
    def addTicketSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addTicketSubmit")
    }
  
    // @LINE:51
    def updateTicket(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "updateTicket/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:27
    def updateDetailsSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateDetails")
    }
  
    // @LINE:8
    def viewContact(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "viewContact")
    }
  
    // @LINE:40
    def adminevents(cat:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adminevents" + queryString(List(if(cat == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:53
    def addContactSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addContactSubmit")
    }
  
    // @LINE:57
    def markAsRead(id:Long, status:Boolean): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "markAsRead" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)), Some(implicitly[QueryStringBindable[Boolean]].unbind("status", status)))))
    }
  
    // @LINE:9
    def events(cat:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "events" + queryString(List(if(cat == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:50
    def deleteTicket(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "delTicket/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:41
    def admineventTicket(event:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admineventticket" + queryString(List(if(event == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("event", event)))))
    }
  
    // @LINE:55
    def viewAccounts(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "viewAccounts")
    }
  
    // @LINE:44
    def addEventSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addEventSubmit")
    }
  
    // @LINE:25
    def reportProblem(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reportProblem")
    }
  
    // @LINE:56
    def deleteUser(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deleteUser" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def contact(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
  }

  // @LINE:14
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def deleteMyAccount(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deleteMyAccount")
    }
  
    // @LINE:15
    def loginSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:18
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:23
    def deleteAccountPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deleteAccount")
    }
  
    // @LINE:14
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:30
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def addOne(itemId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addOne/" + implicitly[PathBindable[Long]].unbind("itemId", itemId))
    }
  
    // @LINE:31
    def addToBasket(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addToBasket/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:36
    def viewOrder(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "viewOrder/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:35
    def placeOrder(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:33
    def removeOne(itemId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + implicitly[PathBindable[Long]].unbind("itemId", itemId))
    }
  
    // @LINE:30
    def showBasket(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "showBasket")
    }
  
    // @LINE:34
    def emptyBasket(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket")
    }
  
  }


}
