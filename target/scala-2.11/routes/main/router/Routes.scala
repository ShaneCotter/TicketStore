
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Eileen/Desktop/TicketStore/conf/routes
// @DATE:Thu Mar 23 20:36:19 GMT 2017

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
  // @LINE:23
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:23
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutus""", """controllers.HomeController.aboutUs"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addevent""", """controllers.HomeController.addEvent"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.HomeController.cart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkout""", """controllers.HomeController.checkout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.HomeController.contact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """events""", """controllers.HomeController.events"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eventticket""", """controllers.HomeController.eventTicket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signUp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTicket""", """controllers.HomeController.addTicket"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEventSubmit""", """controllers.HomeController.addEventSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delEvent/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteEvent(id:Long)"""),
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
  private[this] lazy val controllers_HomeController_aboutUs1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aboutus")))
  )
  private[this] lazy val controllers_HomeController_aboutUs1_invoker = createInvoker(
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

  // @LINE:8
  private[this] lazy val controllers_HomeController_addEvent2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addevent")))
  )
  private[this] lazy val controllers_HomeController_addEvent2_invoker = createInvoker(
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

  // @LINE:9
  private[this] lazy val controllers_HomeController_cart3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_HomeController_cart3_invoker = createInvoker(
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

  // @LINE:10
  private[this] lazy val controllers_HomeController_checkout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkout")))
  )
  private[this] lazy val controllers_HomeController_checkout4_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_HomeController_contact5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_HomeController_contact5_invoker = createInvoker(
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

  // @LINE:12
  private[this] lazy val controllers_HomeController_events6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("events")))
  )
  private[this] lazy val controllers_HomeController_events6_invoker = createInvoker(
    HomeController_0.events,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "events",
      Nil,
      "GET",
      """""",
      this.prefix + """events"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_eventTicket7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eventticket")))
  )
  private[this] lazy val controllers_HomeController_eventTicket7_invoker = createInvoker(
    HomeController_0.eventTicket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "eventTicket",
      Nil,
      "GET",
      """""",
      this.prefix + """eventticket"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login8_invoker = createInvoker(
    HomeController_0.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_signUp9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signUp9_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_HomeController_addTicket10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTicket")))
  )
  private[this] lazy val controllers_HomeController_addTicket10_invoker = createInvoker(
    HomeController_0.addTicket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addTicket",
      Nil,
      "GET",
      """""",
      this.prefix + """addTicket"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_addEventSubmit11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEventSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEventSubmit11_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_HomeController_deleteEvent12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delEvent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEvent12_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
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
    case controllers_HomeController_aboutUs1_route(params) =>
      call { 
        controllers_HomeController_aboutUs1_invoker.call(HomeController_0.aboutUs)
      }
  
    // @LINE:8
    case controllers_HomeController_addEvent2_route(params) =>
      call { 
        controllers_HomeController_addEvent2_invoker.call(HomeController_0.addEvent)
      }
  
    // @LINE:9
    case controllers_HomeController_cart3_route(params) =>
      call { 
        controllers_HomeController_cart3_invoker.call(HomeController_0.cart)
      }
  
    // @LINE:10
    case controllers_HomeController_checkout4_route(params) =>
      call { 
        controllers_HomeController_checkout4_invoker.call(HomeController_0.checkout)
      }
  
    // @LINE:11
    case controllers_HomeController_contact5_route(params) =>
      call { 
        controllers_HomeController_contact5_invoker.call(HomeController_0.contact)
      }
  
    // @LINE:12
    case controllers_HomeController_events6_route(params) =>
      call { 
        controllers_HomeController_events6_invoker.call(HomeController_0.events)
      }
  
    // @LINE:13
    case controllers_HomeController_eventTicket7_route(params) =>
      call { 
        controllers_HomeController_eventTicket7_invoker.call(HomeController_0.eventTicket)
      }
  
    // @LINE:14
    case controllers_HomeController_login8_route(params) =>
      call { 
        controllers_HomeController_login8_invoker.call(HomeController_0.login)
      }
  
    // @LINE:15
    case controllers_HomeController_signUp9_route(params) =>
      call { 
        controllers_HomeController_signUp9_invoker.call(HomeController_0.signUp)
      }
  
    // @LINE:16
    case controllers_HomeController_addTicket10_route(params) =>
      call { 
        controllers_HomeController_addTicket10_invoker.call(HomeController_0.addTicket)
      }
  
    // @LINE:18
    case controllers_HomeController_addEventSubmit11_route(params) =>
      call { 
        controllers_HomeController_addEventSubmit11_invoker.call(HomeController_0.addEventSubmit)
      }
  
    // @LINE:20
    case controllers_HomeController_deleteEvent12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteEvent12_invoker.call(HomeController_0.deleteEvent(id))
      }
  
    // @LINE:23
    case controllers_Assets_versioned13_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
