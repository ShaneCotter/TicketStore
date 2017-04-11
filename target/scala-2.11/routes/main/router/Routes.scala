
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Eileen/Desktop/TicketStore/conf/routes
// @DATE:Tue Apr 11 12:42:32 BST 2017

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
  HomeController_1: controllers.HomeController,
  // @LINE:7
  LoginController_3: controllers.LoginController,
  // @LINE:26
  ShoppingCtrl_0: controllers.ShoppingCtrl,
  // @LINE:51
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:7
    LoginController_3: controllers.LoginController,
    // @LINE:26
    ShoppingCtrl_0: controllers.ShoppingCtrl,
    // @LINE:51
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_1, LoginController_3, ShoppingCtrl_0, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, LoginController_3, ShoppingCtrl_0, Assets_2, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewContact""", """controllers.HomeController.viewContact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """events""", """controllers.HomeController.events(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminevents""", """controllers.HomeController.adminevents(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eventticket""", """controllers.HomeController.eventTicket(event:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admineventticket""", """controllers.HomeController.admineventTicket(event:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signUp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUpSubmit""", """controllers.HomeController.signUpSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addticket""", """controllers.HomeController.addTicket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myaccount""", """controllers.HomeController.myAccount"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTicketSubmit""", """controllers.HomeController.addTicketSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delTicket/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteTicket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateTicket/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateTicket(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEventSubmit""", """controllers.HomeController.addEventSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delEvent/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteEvent(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEvent/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEvent(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addContactSubmit""", """controllers.HomeController.addContactSubmit"""),
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
    HomeController_1.index,
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
    LoginController_3.loginSubmit(),
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
    HomeController_1.aboutUs,
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
    HomeController_1.addEvent,
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
    HomeController_1.cart,
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
    HomeController_1.checkout,
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
    HomeController_1.contact,
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
  private[this] lazy val controllers_HomeController_viewContact7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewContact")))
  )
  private[this] lazy val controllers_HomeController_viewContact7_invoker = createInvoker(
    HomeController_1.viewContact,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "viewContact",
      Nil,
      "GET",
      """""",
      this.prefix + """viewContact"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_events8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("events")))
  )
  private[this] lazy val controllers_HomeController_events8_invoker = createInvoker(
    HomeController_1.events(fakeValue[Long]),
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

  // @LINE:15
  private[this] lazy val controllers_HomeController_adminevents9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminevents")))
  )
  private[this] lazy val controllers_HomeController_adminevents9_invoker = createInvoker(
    HomeController_1.adminevents(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "adminevents",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """adminevents"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_eventTicket10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eventticket")))
  )
  private[this] lazy val controllers_HomeController_eventTicket10_invoker = createInvoker(
    HomeController_1.eventTicket(fakeValue[Long]),
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

  // @LINE:17
  private[this] lazy val controllers_HomeController_admineventTicket11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admineventticket")))
  )
  private[this] lazy val controllers_HomeController_admineventTicket11_invoker = createInvoker(
    HomeController_1.admineventTicket(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "admineventTicket",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admineventticket"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_LoginController_login12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login12_invoker = createInvoker(
    LoginController_3.login,
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

  // @LINE:19
  private[this] lazy val controllers_HomeController_signUp13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signUp13_invoker = createInvoker(
    HomeController_1.signUp,
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

  // @LINE:20
  private[this] lazy val controllers_HomeController_signUpSubmit14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUpSubmit")))
  )
  private[this] lazy val controllers_HomeController_signUpSubmit14_invoker = createInvoker(
    HomeController_1.signUpSubmit(),
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

  // @LINE:21
  private[this] lazy val controllers_HomeController_addTicket15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addticket")))
  )
  private[this] lazy val controllers_HomeController_addTicket15_invoker = createInvoker(
    HomeController_1.addTicket,
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

  // @LINE:22
  private[this] lazy val controllers_LoginController_logout16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout16_invoker = createInvoker(
    LoginController_3.logout,
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

  // @LINE:23
  private[this] lazy val controllers_HomeController_myAccount17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myaccount")))
  )
  private[this] lazy val controllers_HomeController_myAccount17_invoker = createInvoker(
    HomeController_1.myAccount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "myAccount",
      Nil,
      "GET",
      """""",
      this.prefix + """myaccount"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ShoppingCtrl_showBasket18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket18_invoker = createInvoker(
    ShoppingCtrl_0.showBasket(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Nil,
      "GET",
      """ Shopping""",
      this.prefix + """showBasket"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ShoppingCtrl_addToBasket19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket19_invoker = createInvoker(
    ShoppingCtrl_0.addToBasket(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ShoppingCtrl_addOne20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne20_invoker = createInvoker(
    ShoppingCtrl_0.addOne(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ShoppingCtrl_removeOne21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne21_invoker = createInvoker(
    ShoppingCtrl_0.removeOne(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket22_invoker = createInvoker(
    ShoppingCtrl_0.emptyBasket(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Nil,
      "GET",
      """""",
      this.prefix + """emptyBasket"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ShoppingCtrl_placeOrder23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder23_invoker = createInvoker(
    ShoppingCtrl_0.placeOrder(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Nil,
      "GET",
      """""",
      this.prefix + """placeOrder"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ShoppingCtrl_viewOrder24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder24_invoker = createInvoker(
    ShoppingCtrl_0.viewOrder(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_addTicketSubmit25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTicketSubmit")))
  )
  private[this] lazy val controllers_HomeController_addTicketSubmit25_invoker = createInvoker(
    HomeController_1.addTicketSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addTicketSubmit",
      Nil,
      "POST",
      """Admin options""",
      this.prefix + """addTicketSubmit"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_HomeController_deleteTicket26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delTicket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteTicket26_invoker = createInvoker(
    HomeController_1.deleteTicket(fakeValue[Long]),
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

  // @LINE:39
  private[this] lazy val controllers_HomeController_updateTicket27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateTicket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateTicket27_invoker = createInvoker(
    HomeController_1.updateTicket(fakeValue[Long]),
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

  // @LINE:41
  private[this] lazy val controllers_HomeController_addEventSubmit28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEventSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEventSubmit28_invoker = createInvoker(
    HomeController_1.addEventSubmit,
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

  // @LINE:43
  private[this] lazy val controllers_HomeController_deleteEvent29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delEvent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEvent29_invoker = createInvoker(
    HomeController_1.deleteEvent(fakeValue[Long]),
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

  // @LINE:44
  private[this] lazy val controllers_HomeController_updateEvent30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEvent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEvent30_invoker = createInvoker(
    HomeController_1.updateEvent(fakeValue[Long]),
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

  // @LINE:46
  private[this] lazy val controllers_HomeController_addContactSubmit31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addContactSubmit")))
  )
  private[this] lazy val controllers_HomeController_addContactSubmit31_invoker = createInvoker(
    HomeController_1.addContactSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addContactSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addContactSubmit"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Assets_versioned32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned32_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:7
    case controllers_LoginController_loginSubmit1_route(params) =>
      call { 
        controllers_LoginController_loginSubmit1_invoker.call(LoginController_3.loginSubmit())
      }
  
    // @LINE:8
    case controllers_HomeController_aboutUs2_route(params) =>
      call { 
        controllers_HomeController_aboutUs2_invoker.call(HomeController_1.aboutUs)
      }
  
    // @LINE:9
    case controllers_HomeController_addEvent3_route(params) =>
      call { 
        controllers_HomeController_addEvent3_invoker.call(HomeController_1.addEvent)
      }
  
    // @LINE:10
    case controllers_HomeController_cart4_route(params) =>
      call { 
        controllers_HomeController_cart4_invoker.call(HomeController_1.cart)
      }
  
    // @LINE:11
    case controllers_HomeController_checkout5_route(params) =>
      call { 
        controllers_HomeController_checkout5_invoker.call(HomeController_1.checkout)
      }
  
    // @LINE:12
    case controllers_HomeController_contact6_route(params) =>
      call { 
        controllers_HomeController_contact6_invoker.call(HomeController_1.contact)
      }
  
    // @LINE:13
    case controllers_HomeController_viewContact7_route(params) =>
      call { 
        controllers_HomeController_viewContact7_invoker.call(HomeController_1.viewContact)
      }
  
    // @LINE:14
    case controllers_HomeController_events8_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_events8_invoker.call(HomeController_1.events(cat))
      }
  
    // @LINE:15
    case controllers_HomeController_adminevents9_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_adminevents9_invoker.call(HomeController_1.adminevents(cat))
      }
  
    // @LINE:16
    case controllers_HomeController_eventTicket10_route(params) =>
      call(params.fromQuery[Long]("event", Some(0L))) { (event) =>
        controllers_HomeController_eventTicket10_invoker.call(HomeController_1.eventTicket(event))
      }
  
    // @LINE:17
    case controllers_HomeController_admineventTicket11_route(params) =>
      call(params.fromQuery[Long]("event", Some(0L))) { (event) =>
        controllers_HomeController_admineventTicket11_invoker.call(HomeController_1.admineventTicket(event))
      }
  
    // @LINE:18
    case controllers_LoginController_login12_route(params) =>
      call { 
        controllers_LoginController_login12_invoker.call(LoginController_3.login)
      }
  
    // @LINE:19
    case controllers_HomeController_signUp13_route(params) =>
      call { 
        controllers_HomeController_signUp13_invoker.call(HomeController_1.signUp)
      }
  
    // @LINE:20
    case controllers_HomeController_signUpSubmit14_route(params) =>
      call { 
        controllers_HomeController_signUpSubmit14_invoker.call(HomeController_1.signUpSubmit())
      }
  
    // @LINE:21
    case controllers_HomeController_addTicket15_route(params) =>
      call { 
        controllers_HomeController_addTicket15_invoker.call(HomeController_1.addTicket)
      }
  
    // @LINE:22
    case controllers_LoginController_logout16_route(params) =>
      call { 
        controllers_LoginController_logout16_invoker.call(LoginController_3.logout)
      }
  
    // @LINE:23
    case controllers_HomeController_myAccount17_route(params) =>
      call { 
        controllers_HomeController_myAccount17_invoker.call(HomeController_1.myAccount)
      }
  
    // @LINE:26
    case controllers_ShoppingCtrl_showBasket18_route(params) =>
      call { 
        controllers_ShoppingCtrl_showBasket18_invoker.call(ShoppingCtrl_0.showBasket())
      }
  
    // @LINE:27
    case controllers_ShoppingCtrl_addToBasket19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket19_invoker.call(ShoppingCtrl_0.addToBasket(id))
      }
  
    // @LINE:28
    case controllers_ShoppingCtrl_addOne20_route(params) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_addOne20_invoker.call(ShoppingCtrl_0.addOne(itemId))
      }
  
    // @LINE:29
    case controllers_ShoppingCtrl_removeOne21_route(params) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne21_invoker.call(ShoppingCtrl_0.removeOne(itemId))
      }
  
    // @LINE:30
    case controllers_ShoppingCtrl_emptyBasket22_route(params) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket22_invoker.call(ShoppingCtrl_0.emptyBasket())
      }
  
    // @LINE:31
    case controllers_ShoppingCtrl_placeOrder23_route(params) =>
      call { 
        controllers_ShoppingCtrl_placeOrder23_invoker.call(ShoppingCtrl_0.placeOrder())
      }
  
    // @LINE:32
    case controllers_ShoppingCtrl_viewOrder24_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder24_invoker.call(ShoppingCtrl_0.viewOrder(id))
      }
  
    // @LINE:36
    case controllers_HomeController_addTicketSubmit25_route(params) =>
      call { 
        controllers_HomeController_addTicketSubmit25_invoker.call(HomeController_1.addTicketSubmit)
      }
  
    // @LINE:38
    case controllers_HomeController_deleteTicket26_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteTicket26_invoker.call(HomeController_1.deleteTicket(id))
      }
  
    // @LINE:39
    case controllers_HomeController_updateTicket27_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateTicket27_invoker.call(HomeController_1.updateTicket(id))
      }
  
    // @LINE:41
    case controllers_HomeController_addEventSubmit28_route(params) =>
      call { 
        controllers_HomeController_addEventSubmit28_invoker.call(HomeController_1.addEventSubmit)
      }
  
    // @LINE:43
    case controllers_HomeController_deleteEvent29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteEvent29_invoker.call(HomeController_1.deleteEvent(id))
      }
  
    // @LINE:44
    case controllers_HomeController_updateEvent30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateEvent30_invoker.call(HomeController_1.updateEvent(id))
      }
  
    // @LINE:46
    case controllers_HomeController_addContactSubmit31_route(params) =>
      call { 
        controllers_HomeController_addContactSubmit31_invoker.call(HomeController_1.addContactSubmit)
      }
  
    // @LINE:51
    case controllers_Assets_versioned32_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned32_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
