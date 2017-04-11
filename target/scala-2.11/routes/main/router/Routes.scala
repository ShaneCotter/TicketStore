
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Eileen/Desktop/TicketStore/conf/routes
// @DATE:Tue Apr 11 23:43:48 BST 2017

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
  // @LINE:11
  EventController_3: controllers.EventController,
  // @LINE:14
  LoginController_4: controllers.LoginController,
  // @LINE:30
  ShoppingCtrl_1: controllers.ShoppingCtrl,
  // @LINE:58
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:11
    EventController_3: controllers.EventController,
    // @LINE:14
    LoginController_4: controllers.LoginController,
    // @LINE:30
    ShoppingCtrl_1: controllers.ShoppingCtrl,
    // @LINE:58
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_0, EventController_3, LoginController_4, ShoppingCtrl_1, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, EventController_3, LoginController_4, ShoppingCtrl_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.HomeController.contact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewContact""", """controllers.HomeController.viewContact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """events""", """controllers.HomeController.events(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eventticket""", """controllers.HomeController.eventTicket(event:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listEvents""", """controllers.EventController.listEvents(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signUp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUpSubmit""", """controllers.HomeController.signUpSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myaccount""", """controllers.HomeController.myAccount"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myOrders""", """controllers.HomeController.myOrders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteAccount""", """controllers.LoginController.deleteAccountPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteMyAccount""", """controllers.LoginController.deleteMyAccount"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reportProblem""", """controllers.HomeController.reportProblem"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateDetails""", """controllers.HomeController.updateDetails"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateDetails""", """controllers.HomeController.updateDetailsSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.HomeController.cart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminevents""", """controllers.HomeController.adminevents(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admineventticket""", """controllers.HomeController.admineventTicket(event:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addevent""", """controllers.HomeController.addEvent"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEventSubmit""", """controllers.HomeController.addEventSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delEvent/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteEvent(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEvent/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEvent(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addticket""", """controllers.HomeController.addTicket"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTicketSubmit""", """controllers.HomeController.addTicketSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delTicket/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteTicket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateTicket/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateTicket(id:Long)"""),
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
  private[this] lazy val controllers_HomeController_contact1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_HomeController_contact1_invoker = createInvoker(
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

  // @LINE:8
  private[this] lazy val controllers_HomeController_viewContact2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewContact")))
  )
  private[this] lazy val controllers_HomeController_viewContact2_invoker = createInvoker(
    HomeController_0.viewContact,
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

  // @LINE:9
  private[this] lazy val controllers_HomeController_events3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("events")))
  )
  private[this] lazy val controllers_HomeController_events3_invoker = createInvoker(
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

  // @LINE:10
  private[this] lazy val controllers_HomeController_eventTicket4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eventticket")))
  )
  private[this] lazy val controllers_HomeController_eventTicket4_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_EventController_listEvents5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listEvents")))
  )
  private[this] lazy val controllers_EventController_listEvents5_invoker = createInvoker(
    EventController_3.listEvents(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EventController",
      "listEvents",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """listEvents"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_LoginController_login6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login6_invoker = createInvoker(
    LoginController_4.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """login/sign up""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_LoginController_loginSubmit7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit7_invoker = createInvoker(
    LoginController_4.loginSubmit(),
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

  // @LINE:16
  private[this] lazy val controllers_HomeController_signUp8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signUp8_invoker = createInvoker(
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
  private[this] lazy val controllers_HomeController_signUpSubmit9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUpSubmit")))
  )
  private[this] lazy val controllers_HomeController_signUpSubmit9_invoker = createInvoker(
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
  private[this] lazy val controllers_LoginController_logout10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout10_invoker = createInvoker(
    LoginController_4.logout,
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

  // @LINE:21
  private[this] lazy val controllers_HomeController_myAccount11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myaccount")))
  )
  private[this] lazy val controllers_HomeController_myAccount11_invoker = createInvoker(
    HomeController_0.myAccount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "myAccount",
      Nil,
      "GET",
      """my account""",
      this.prefix + """myaccount"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_myOrders12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myOrders")))
  )
  private[this] lazy val controllers_HomeController_myOrders12_invoker = createInvoker(
    HomeController_0.myOrders,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "myOrders",
      Nil,
      "GET",
      """""",
      this.prefix + """myOrders"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_LoginController_deleteAccountPage13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteAccount")))
  )
  private[this] lazy val controllers_LoginController_deleteAccountPage13_invoker = createInvoker(
    LoginController_4.deleteAccountPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "deleteAccountPage",
      Nil,
      "GET",
      """""",
      this.prefix + """deleteAccount"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_LoginController_deleteMyAccount14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteMyAccount")))
  )
  private[this] lazy val controllers_LoginController_deleteMyAccount14_invoker = createInvoker(
    LoginController_4.deleteMyAccount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "deleteMyAccount",
      Nil,
      "GET",
      """""",
      this.prefix + """deleteMyAccount"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_reportProblem15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reportProblem")))
  )
  private[this] lazy val controllers_HomeController_reportProblem15_invoker = createInvoker(
    HomeController_0.reportProblem,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "reportProblem",
      Nil,
      "GET",
      """""",
      this.prefix + """reportProblem"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_updateDetails16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateDetails")))
  )
  private[this] lazy val controllers_HomeController_updateDetails16_invoker = createInvoker(
    HomeController_0.updateDetails,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateDetails",
      Nil,
      "GET",
      """""",
      this.prefix + """updateDetails"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_updateDetailsSubmit17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateDetails")))
  )
  private[this] lazy val controllers_HomeController_updateDetailsSubmit17_invoker = createInvoker(
    HomeController_0.updateDetailsSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateDetailsSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """updateDetails"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ShoppingCtrl_showBasket18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket18_invoker = createInvoker(
    ShoppingCtrl_1.showBasket(),
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

  // @LINE:31
  private[this] lazy val controllers_ShoppingCtrl_addToBasket19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket19_invoker = createInvoker(
    ShoppingCtrl_1.addToBasket(fakeValue[Long]),
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

  // @LINE:32
  private[this] lazy val controllers_ShoppingCtrl_addOne20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne20_invoker = createInvoker(
    ShoppingCtrl_1.addOne(fakeValue[Long]),
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

  // @LINE:33
  private[this] lazy val controllers_ShoppingCtrl_removeOne21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne21_invoker = createInvoker(
    ShoppingCtrl_1.removeOne(fakeValue[Long]),
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

  // @LINE:34
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket22_invoker = createInvoker(
    ShoppingCtrl_1.emptyBasket(),
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

  // @LINE:35
  private[this] lazy val controllers_ShoppingCtrl_placeOrder23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder23_invoker = createInvoker(
    ShoppingCtrl_1.placeOrder(),
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

  // @LINE:36
  private[this] lazy val controllers_ShoppingCtrl_viewOrder24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder24_invoker = createInvoker(
    ShoppingCtrl_1.viewOrder(fakeValue[Long]),
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

  // @LINE:37
  private[this] lazy val controllers_HomeController_cart25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_HomeController_cart25_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_HomeController_adminevents26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminevents")))
  )
  private[this] lazy val controllers_HomeController_adminevents26_invoker = createInvoker(
    HomeController_0.adminevents(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "adminevents",
      Seq(classOf[Long]),
      "GET",
      """Admin options""",
      this.prefix + """adminevents"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_HomeController_admineventTicket27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admineventticket")))
  )
  private[this] lazy val controllers_HomeController_admineventTicket27_invoker = createInvoker(
    HomeController_0.admineventTicket(fakeValue[Long]),
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

  // @LINE:43
  private[this] lazy val controllers_HomeController_addEvent28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addevent")))
  )
  private[this] lazy val controllers_HomeController_addEvent28_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_HomeController_addEventSubmit29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEventSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEventSubmit29_invoker = createInvoker(
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

  // @LINE:45
  private[this] lazy val controllers_HomeController_deleteEvent30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delEvent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEvent30_invoker = createInvoker(
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

  // @LINE:46
  private[this] lazy val controllers_HomeController_updateEvent31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEvent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEvent31_invoker = createInvoker(
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

  // @LINE:48
  private[this] lazy val controllers_HomeController_addTicket32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addticket")))
  )
  private[this] lazy val controllers_HomeController_addTicket32_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_HomeController_addTicketSubmit33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTicketSubmit")))
  )
  private[this] lazy val controllers_HomeController_addTicketSubmit33_invoker = createInvoker(
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

  // @LINE:50
  private[this] lazy val controllers_HomeController_deleteTicket34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delTicket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteTicket34_invoker = createInvoker(
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

  // @LINE:51
  private[this] lazy val controllers_HomeController_updateTicket35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateTicket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateTicket35_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_HomeController_addContactSubmit36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addContactSubmit")))
  )
  private[this] lazy val controllers_HomeController_addContactSubmit36_invoker = createInvoker(
    HomeController_0.addContactSubmit,
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

  // @LINE:58
  private[this] lazy val controllers_Assets_versioned37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned37_invoker = createInvoker(
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
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_contact1_route(params) =>
      call { 
        controllers_HomeController_contact1_invoker.call(HomeController_0.contact)
      }
  
    // @LINE:8
    case controllers_HomeController_viewContact2_route(params) =>
      call { 
        controllers_HomeController_viewContact2_invoker.call(HomeController_0.viewContact)
      }
  
    // @LINE:9
    case controllers_HomeController_events3_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_events3_invoker.call(HomeController_0.events(cat))
      }
  
    // @LINE:10
    case controllers_HomeController_eventTicket4_route(params) =>
      call(params.fromQuery[Long]("event", Some(0L))) { (event) =>
        controllers_HomeController_eventTicket4_invoker.call(HomeController_0.eventTicket(event))
      }
  
    // @LINE:11
    case controllers_EventController_listEvents5_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_EventController_listEvents5_invoker.call(EventController_3.listEvents(cat, filter))
      }
  
    // @LINE:14
    case controllers_LoginController_login6_route(params) =>
      call { 
        controllers_LoginController_login6_invoker.call(LoginController_4.login)
      }
  
    // @LINE:15
    case controllers_LoginController_loginSubmit7_route(params) =>
      call { 
        controllers_LoginController_loginSubmit7_invoker.call(LoginController_4.loginSubmit())
      }
  
    // @LINE:16
    case controllers_HomeController_signUp8_route(params) =>
      call { 
        controllers_HomeController_signUp8_invoker.call(HomeController_0.signUp)
      }
  
    // @LINE:17
    case controllers_HomeController_signUpSubmit9_route(params) =>
      call { 
        controllers_HomeController_signUpSubmit9_invoker.call(HomeController_0.signUpSubmit())
      }
  
    // @LINE:18
    case controllers_LoginController_logout10_route(params) =>
      call { 
        controllers_LoginController_logout10_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:21
    case controllers_HomeController_myAccount11_route(params) =>
      call { 
        controllers_HomeController_myAccount11_invoker.call(HomeController_0.myAccount)
      }
  
    // @LINE:22
    case controllers_HomeController_myOrders12_route(params) =>
      call { 
        controllers_HomeController_myOrders12_invoker.call(HomeController_0.myOrders)
      }
  
    // @LINE:23
    case controllers_LoginController_deleteAccountPage13_route(params) =>
      call { 
        controllers_LoginController_deleteAccountPage13_invoker.call(LoginController_4.deleteAccountPage)
      }
  
    // @LINE:24
    case controllers_LoginController_deleteMyAccount14_route(params) =>
      call { 
        controllers_LoginController_deleteMyAccount14_invoker.call(LoginController_4.deleteMyAccount)
      }
  
    // @LINE:25
    case controllers_HomeController_reportProblem15_route(params) =>
      call { 
        controllers_HomeController_reportProblem15_invoker.call(HomeController_0.reportProblem)
      }
  
    // @LINE:26
    case controllers_HomeController_updateDetails16_route(params) =>
      call { 
        controllers_HomeController_updateDetails16_invoker.call(HomeController_0.updateDetails)
      }
  
    // @LINE:27
    case controllers_HomeController_updateDetailsSubmit17_route(params) =>
      call { 
        controllers_HomeController_updateDetailsSubmit17_invoker.call(HomeController_0.updateDetailsSubmit)
      }
  
    // @LINE:30
    case controllers_ShoppingCtrl_showBasket18_route(params) =>
      call { 
        controllers_ShoppingCtrl_showBasket18_invoker.call(ShoppingCtrl_1.showBasket())
      }
  
    // @LINE:31
    case controllers_ShoppingCtrl_addToBasket19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket19_invoker.call(ShoppingCtrl_1.addToBasket(id))
      }
  
    // @LINE:32
    case controllers_ShoppingCtrl_addOne20_route(params) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_addOne20_invoker.call(ShoppingCtrl_1.addOne(itemId))
      }
  
    // @LINE:33
    case controllers_ShoppingCtrl_removeOne21_route(params) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne21_invoker.call(ShoppingCtrl_1.removeOne(itemId))
      }
  
    // @LINE:34
    case controllers_ShoppingCtrl_emptyBasket22_route(params) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket22_invoker.call(ShoppingCtrl_1.emptyBasket())
      }
  
    // @LINE:35
    case controllers_ShoppingCtrl_placeOrder23_route(params) =>
      call { 
        controllers_ShoppingCtrl_placeOrder23_invoker.call(ShoppingCtrl_1.placeOrder())
      }
  
    // @LINE:36
    case controllers_ShoppingCtrl_viewOrder24_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder24_invoker.call(ShoppingCtrl_1.viewOrder(id))
      }
  
    // @LINE:37
    case controllers_HomeController_cart25_route(params) =>
      call { 
        controllers_HomeController_cart25_invoker.call(HomeController_0.cart)
      }
  
    // @LINE:40
    case controllers_HomeController_adminevents26_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_adminevents26_invoker.call(HomeController_0.adminevents(cat))
      }
  
    // @LINE:41
    case controllers_HomeController_admineventTicket27_route(params) =>
      call(params.fromQuery[Long]("event", Some(0L))) { (event) =>
        controllers_HomeController_admineventTicket27_invoker.call(HomeController_0.admineventTicket(event))
      }
  
    // @LINE:43
    case controllers_HomeController_addEvent28_route(params) =>
      call { 
        controllers_HomeController_addEvent28_invoker.call(HomeController_0.addEvent)
      }
  
    // @LINE:44
    case controllers_HomeController_addEventSubmit29_route(params) =>
      call { 
        controllers_HomeController_addEventSubmit29_invoker.call(HomeController_0.addEventSubmit)
      }
  
    // @LINE:45
    case controllers_HomeController_deleteEvent30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteEvent30_invoker.call(HomeController_0.deleteEvent(id))
      }
  
    // @LINE:46
    case controllers_HomeController_updateEvent31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateEvent31_invoker.call(HomeController_0.updateEvent(id))
      }
  
    // @LINE:48
    case controllers_HomeController_addTicket32_route(params) =>
      call { 
        controllers_HomeController_addTicket32_invoker.call(HomeController_0.addTicket)
      }
  
    // @LINE:49
    case controllers_HomeController_addTicketSubmit33_route(params) =>
      call { 
        controllers_HomeController_addTicketSubmit33_invoker.call(HomeController_0.addTicketSubmit)
      }
  
    // @LINE:50
    case controllers_HomeController_deleteTicket34_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteTicket34_invoker.call(HomeController_0.deleteTicket(id))
      }
  
    // @LINE:51
    case controllers_HomeController_updateTicket35_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateTicket35_invoker.call(HomeController_0.updateTicket(id))
      }
  
    // @LINE:53
    case controllers_HomeController_addContactSubmit36_route(params) =>
      call { 
        controllers_HomeController_addContactSubmit36_invoker.call(HomeController_0.addContactSubmit)
      }
  
    // @LINE:58
    case controllers_Assets_versioned37_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned37_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
