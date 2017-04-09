
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Eileen/Desktop/TicketStore/conf/routes
// @DATE:Sun Apr 09 23:18:03 BST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def cart(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:32
    def deleteEvent(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "delEvent/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:19
    def signUp(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:16
    def eventTicket(event:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "eventticket" + queryString(List(if(event == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("event", event)))))
    }
  
    // @LINE:33
    def updateEvent(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "updateEvent/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:21
    def addTicket(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addticket")
    }
  
    // @LINE:9
    def addEvent(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addevent")
    }
  
    // @LINE:20
    def signUpSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signUpSubmit")
    }
  
    // @LINE:25
    def addTicketSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addTicketSubmit")
    }
  
    // @LINE:28
    def updateTicket(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "updateTicket/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:13
    def viewContact(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "viewContact")
    }
  
    // @LINE:15
    def adminevents(cat:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adminevents" + queryString(List(if(cat == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:35
    def addContactSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addContactSubmit")
    }
  
    // @LINE:14
    def events(cat:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "events" + queryString(List(if(cat == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:27
    def deleteTicket(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "delTicket/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:17
    def admineventTicket(event:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admineventticket" + queryString(List(if(event == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("event", event)))))
    }
  
    // @LINE:11
    def checkout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "checkout")
    }
  
    // @LINE:30
    def addEventSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addEventSubmit")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:12
    def contact(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
    // @LINE:8
    def aboutUs(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "aboutus")
    }
  
  }

  // @LINE:7
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def loginSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:22
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:18
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:40
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
