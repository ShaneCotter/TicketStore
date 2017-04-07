
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Eileen/Desktop/TicketStore/conf/routes
// @DATE:Fri Apr 07 10:35:19 BST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:7
  LoginController_2: controllers.LoginController,
  // @LINE:38
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:7
    LoginController_2: controllers.LoginController,
    // @LINE:38
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, LoginController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutus""", """controllers.HomeController.aboutUs"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addevent""", """controllers.HomeController.addEvent"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.HomeController.cart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkout""", """controllers.HomeController.checkout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.HomeController.contact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """events""", """controllers.HomeController.events(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eventticket""", """controllers.HomeController.eventTicket(event:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signUp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUpSubmit""", """controllers.HomeController.signUpSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addticket""", """controllers.HomeController.addTicket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTicketSubmit""", """controllers.HomeController.addTicketSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delTicket/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteTicket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateTicket/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateTicket(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEventSubmit""", """controllers.HomeController.addEventSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delEvent/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteEvent(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEvent/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEvent(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_LoginController_loginSubmit1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit1_invoker = createInvoker(
    LoginController_2.loginSubmit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_aboutUs2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aboutus")))
  )
  private[this] lazy val controllers_HomeController_aboutUs2_invoker = createInvoker(
    HomeController_0.aboutUs,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "aboutUs",
      Nil,
      "GET",
      """""",
      this.prefix + """aboutus"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_addEvent3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addevent")))
  )
  private[this] lazy val controllers_HomeController_addEvent3_invoker = createInvoker(
    HomeController_0.addEvent,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEvent",
      Nil,
      "GET",
      """""",
      this.prefix + """addevent"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_cart4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_HomeController_cart4_invoker = createInvoker(
    HomeController_0.cart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cart",
      Nil,
      "GET",
      """""",
      this.prefix + """cart"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_checkout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkout")))
  )
  private[this] lazy val controllers_HomeController_checkout5_invoker = createInvoker(
    HomeController_0.checkout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "checkout",
      Nil,
      "GET",
      """""",
      this.prefix + """checkout"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_contact6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_HomeController_contact6_invoker = createInvoker(
    HomeController_0.contact,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contact",
      Nil,
      "GET",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_events7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("events")))
  )
  private[this] lazy val controllers_HomeController_events7_invoker = createInvoker(
    HomeController_0.events(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "events",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """events"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_eventTicket8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eventticket")))
  )
  private[this] lazy val controllers_HomeController_eventTicket8_invoker = createInvoker(
    HomeController_0.eventTicket(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "eventTicket",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """eventticket"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_LoginController_login9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login9_invoker = createInvoker(
    LoginController_2.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_signUp10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signUp10_invoker = createInvoker(
    HomeController_0.signUp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signUp",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_signUpSubmit11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUpSubmit")))
  )
  private[this] lazy val controllers_HomeController_signUpSubmit11_invoker = createInvoker(
    HomeController_0.signUpSubmit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signUpSubmit",
      Nil,
      "GET",
      """""",
      this.prefix + """signUpSubmit"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_addTicket12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addticket")))
  )
  private[this] lazy val controllers_HomeController_addTicket12_invoker = createInvoker(
    HomeController_0.addTicket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addTicket",
      Nil,
      "GET",
      """""",
      this.prefix + """addticket"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_LoginController_logout13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout13_invoker = createInvoker(
    LoginController_2.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_addTicketSubmit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTicketSubmit")))
  )
  private[this] lazy val controllers_HomeController_addTicketSubmit14_invoker = createInvoker(
    HomeController_0.addTicketSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addTicketSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addTicketSubmit"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_deleteTicket15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delTicket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteTicket15_invoker = createInvoker(
    HomeController_0.deleteTicket(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteTicket",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """delTicket/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_updateTicket16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateTicket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateTicket16_invoker = createInvoker(
    HomeController_0.updateTicket(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateTicket",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """updateTicket/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_addEventSubmit17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEventSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEventSubmit17_invoker = createInvoker(
    HomeController_0.addEventSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEventSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addEventSubmit"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_deleteEvent18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delEvent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEvent18_invoker = createInvoker(
    HomeController_0.deleteEvent(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteEvent",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """delEvent/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_updateEvent19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEvent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEvent19_invoker = createInvoker(
    HomeController_0.updateEvent(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateEvent",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """updateEvent/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Assets_versioned20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned20_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_LoginController_loginSubmit1_route(params) =>
      call { 
        controllers_LoginController_loginSubmit1_invoker.call(LoginController_2.loginSubmit())
      }
  
    // @LINE:8
    case controllers_HomeController_aboutUs2_route(params) =>
      call { 
        controllers_HomeController_aboutUs2_invoker.call(HomeController_0.aboutUs)
      }
  
    // @LINE:9
    case controllers_HomeController_addEvent3_route(params) =>
      call { 
        controllers_HomeController_addEvent3_invoker.call(HomeController_0.addEvent)
      }
  
    // @LINE:10
    case controllers_HomeController_cart4_route(params) =>
      call { 
        controllers_HomeController_cart4_invoker.call(HomeController_0.cart)
      }
  
    // @LINE:11
    case controllers_HomeController_checkout5_route(params) =>
      call { 
        controllers_HomeController_checkout5_invoker.call(HomeController_0.checkout)
      }
  
    // @LINE:12
    case controllers_HomeController_contact6_route(params) =>
      call { 
        controllers_HomeController_contact6_invoker.call(HomeController_0.contact)
      }
  
    // @LINE:13
    case controllers_HomeController_events7_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_events7_invoker.call(HomeController_0.events(cat))
      }
  
    // @LINE:14
    case controllers_HomeController_eventTicket8_route(params) =>
      call(params.fromQuery[Long]("event", Some(0L))) { (event) =>
        controllers_HomeController_eventTicket8_invoker.call(HomeController_0.eventTicket(event))
      }
  
    // @LINE:15
    case controllers_LoginController_login9_route(params) =>
      call { 
        controllers_LoginController_login9_invoker.call(LoginController_2.login)
      }
  
    // @LINE:16
    case controllers_HomeController_signUp10_route(params) =>
      call { 
        controllers_HomeController_signUp10_invoker.call(HomeController_0.signUp)
      }
  
    // @LINE:17
    case controllers_HomeController_signUpSubmit11_route(params) =>
      call { 
        controllers_HomeController_signUpSubmit11_invoker.call(HomeController_0.signUpSubmit())
      }
  
    // @LINE:18
    case controllers_HomeController_addTicket12_route(params) =>
      call { 
        controllers_HomeController_addTicket12_invoker.call(HomeController_0.addTicket)
      }
  
    // @LINE:19
    case controllers_LoginController_logout13_route(params) =>
      call { 
        controllers_LoginController_logout13_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:22
    case controllers_HomeController_addTicketSubmit14_route(params) =>
      call { 
        controllers_HomeController_addTicketSubmit14_invoker.call(HomeController_0.addTicketSubmit)
      }
  
    // @LINE:24
    case controllers_HomeController_deleteTicket15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteTicket15_invoker.call(HomeController_0.deleteTicket(id))
      }
  
    // @LINE:25
    case controllers_HomeController_updateTicket16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateTicket16_invoker.call(HomeController_0.updateTicket(id))
      }
  
    // @LINE:27
    case controllers_HomeController_addEventSubmit17_route(params) =>
      call { 
        controllers_HomeController_addEventSubmit17_invoker.call(HomeController_0.addEventSubmit)
      }
  
    // @LINE:29
    case controllers_HomeController_deleteEvent18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteEvent18_invoker.call(HomeController_0.deleteEvent(id))
      }
  
    // @LINE:30
    case controllers_HomeController_updateEvent19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateEvent19_invoker.call(HomeController_0.updateEvent(id))
      }
  
    // @LINE:38
    case controllers_Assets_versioned20_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned20_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
