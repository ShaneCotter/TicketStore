
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/TicketStore/conf/routes
// @DATE:Fri Apr 21 12:03:37 IST 2017

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
  // @LINE:12
  EventController_3: controllers.EventController,
  // @LINE:15
  LoginController_4: controllers.LoginController,
  // @LINE:31
  ShoppingCtrl_1: controllers.ShoppingCtrl,
  // @LINE:66
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:12
    EventController_3: controllers.EventController,
    // @LINE:15
    LoginController_4: controllers.LoginController,
    // @LINE:31
    ShoppingCtrl_1: controllers.ShoppingCtrl,
    // @LINE:66
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrders""", """controllers.HomeController.viewOrders"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeFromCart""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeFromCart(itemId:Long)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewAccounts""", """controllers.HomeController.viewAccounts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteUser""", """controllers.HomeController.deleteUser(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """markAsRead""", """controllers.HomeController.markAsRead(id:Long, status:Boolean)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """markAsProccessed""", """controllers.HomeController.markAsProccessed(id:Long, status:Boolean)"""),
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
  private[this] lazy val controllers_HomeController_viewOrders3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrders")))
  )
  private[this] lazy val controllers_HomeController_viewOrders3_invoker = createInvoker(
    HomeController_0.viewOrders,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "viewOrders",
      Nil,
      "GET",
      """""",
      this.prefix + """viewOrders"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_events4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("events")))
  )
  private[this] lazy val controllers_HomeController_events4_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_HomeController_eventTicket5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eventticket")))
  )
  private[this] lazy val controllers_HomeController_eventTicket5_invoker = createInvoker(
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

  // @LINE:12
  private[this] lazy val controllers_EventController_listEvents6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listEvents")))
  )
  private[this] lazy val controllers_EventController_listEvents6_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_LoginController_login7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login7_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_LoginController_loginSubmit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit8_invoker = createInvoker(
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

  // @LINE:17
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

  // @LINE:18
  private[this] lazy val controllers_HomeController_signUpSubmit10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUpSubmit")))
  )
  private[this] lazy val controllers_HomeController_signUpSubmit10_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_LoginController_logout11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout11_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_HomeController_myAccount12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myaccount")))
  )
  private[this] lazy val controllers_HomeController_myAccount12_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_HomeController_myOrders13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myOrders")))
  )
  private[this] lazy val controllers_HomeController_myOrders13_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_LoginController_deleteAccountPage14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteAccount")))
  )
  private[this] lazy val controllers_LoginController_deleteAccountPage14_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_LoginController_deleteMyAccount15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteMyAccount")))
  )
  private[this] lazy val controllers_LoginController_deleteMyAccount15_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_HomeController_reportProblem16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reportProblem")))
  )
  private[this] lazy val controllers_HomeController_reportProblem16_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_HomeController_updateDetails17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateDetails")))
  )
  private[this] lazy val controllers_HomeController_updateDetails17_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_HomeController_updateDetailsSubmit18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateDetails")))
  )
  private[this] lazy val controllers_HomeController_updateDetailsSubmit18_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_ShoppingCtrl_showBasket19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket19_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_ShoppingCtrl_addToBasket20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket20_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_ShoppingCtrl_addOne21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne21_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_ShoppingCtrl_removeOne22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne22_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_ShoppingCtrl_removeFromCart23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeFromCart"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeFromCart23_invoker = createInvoker(
    ShoppingCtrl_1.removeFromCart(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeFromCart",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """removeFromCart""" + "$" + """itemId<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket24_invoker = createInvoker(
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

  // @LINE:37
  private[this] lazy val controllers_ShoppingCtrl_placeOrder25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder25_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_ShoppingCtrl_viewOrder26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder26_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_HomeController_cart27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_HomeController_cart27_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_HomeController_adminevents28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminevents")))
  )
  private[this] lazy val controllers_HomeController_adminevents28_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_HomeController_admineventTicket29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admineventticket")))
  )
  private[this] lazy val controllers_HomeController_admineventTicket29_invoker = createInvoker(
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

  // @LINE:46
  private[this] lazy val controllers_HomeController_addEvent30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addevent")))
  )
  private[this] lazy val controllers_HomeController_addEvent30_invoker = createInvoker(
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

  // @LINE:47
  private[this] lazy val controllers_HomeController_addEventSubmit31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEventSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEventSubmit31_invoker = createInvoker(
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

  // @LINE:48
  private[this] lazy val controllers_HomeController_deleteEvent32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delEvent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEvent32_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_HomeController_updateEvent33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEvent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEvent33_invoker = createInvoker(
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

  // @LINE:51
  private[this] lazy val controllers_HomeController_addTicket34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addticket")))
  )
  private[this] lazy val controllers_HomeController_addTicket34_invoker = createInvoker(
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

  // @LINE:52
  private[this] lazy val controllers_HomeController_addTicketSubmit35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTicketSubmit")))
  )
  private[this] lazy val controllers_HomeController_addTicketSubmit35_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_HomeController_deleteTicket36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delTicket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteTicket36_invoker = createInvoker(
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

  // @LINE:54
  private[this] lazy val controllers_HomeController_updateTicket37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateTicket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateTicket37_invoker = createInvoker(
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

  // @LINE:56
  private[this] lazy val controllers_HomeController_addContactSubmit38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addContactSubmit")))
  )
  private[this] lazy val controllers_HomeController_addContactSubmit38_invoker = createInvoker(
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
  private[this] lazy val controllers_HomeController_viewAccounts39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewAccounts")))
  )
  private[this] lazy val controllers_HomeController_viewAccounts39_invoker = createInvoker(
    HomeController_0.viewAccounts,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "viewAccounts",
      Nil,
      "GET",
      """""",
      this.prefix + """viewAccounts"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_HomeController_deleteUser40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteUser")))
  )
  private[this] lazy val controllers_HomeController_deleteUser40_invoker = createInvoker(
    HomeController_0.deleteUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteUser",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """deleteUser"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_HomeController_markAsRead41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("markAsRead")))
  )
  private[this] lazy val controllers_HomeController_markAsRead41_invoker = createInvoker(
    HomeController_0.markAsRead(fakeValue[Long], fakeValue[Boolean]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "markAsRead",
      Seq(classOf[Long], classOf[Boolean]),
      "GET",
      """""",
      this.prefix + """markAsRead"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_HomeController_markAsProccessed42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("markAsProccessed")))
  )
  private[this] lazy val controllers_HomeController_markAsProccessed42_invoker = createInvoker(
    HomeController_0.markAsProccessed(fakeValue[Long], fakeValue[Boolean]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "markAsProccessed",
      Seq(classOf[Long], classOf[Boolean]),
      "GET",
      """""",
      this.prefix + """markAsProccessed"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_Assets_versioned43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned43_invoker = createInvoker(
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
    case controllers_HomeController_viewOrders3_route(params) =>
      call { 
        controllers_HomeController_viewOrders3_invoker.call(HomeController_0.viewOrders)
      }
  
    // @LINE:10
    case controllers_HomeController_events4_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_events4_invoker.call(HomeController_0.events(cat))
      }
  
    // @LINE:11
    case controllers_HomeController_eventTicket5_route(params) =>
      call(params.fromQuery[Long]("event", Some(0L))) { (event) =>
        controllers_HomeController_eventTicket5_invoker.call(HomeController_0.eventTicket(event))
      }
  
    // @LINE:12
    case controllers_EventController_listEvents6_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_EventController_listEvents6_invoker.call(EventController_3.listEvents(cat, filter))
      }
  
    // @LINE:15
    case controllers_LoginController_login7_route(params) =>
      call { 
        controllers_LoginController_login7_invoker.call(LoginController_4.login)
      }
  
    // @LINE:16
    case controllers_LoginController_loginSubmit8_route(params) =>
      call { 
        controllers_LoginController_loginSubmit8_invoker.call(LoginController_4.loginSubmit())
      }
  
    // @LINE:17
    case controllers_HomeController_signUp9_route(params) =>
      call { 
        controllers_HomeController_signUp9_invoker.call(HomeController_0.signUp)
      }
  
    // @LINE:18
    case controllers_HomeController_signUpSubmit10_route(params) =>
      call { 
        controllers_HomeController_signUpSubmit10_invoker.call(HomeController_0.signUpSubmit())
      }
  
    // @LINE:19
    case controllers_LoginController_logout11_route(params) =>
      call { 
        controllers_LoginController_logout11_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:22
    case controllers_HomeController_myAccount12_route(params) =>
      call { 
        controllers_HomeController_myAccount12_invoker.call(HomeController_0.myAccount)
      }
  
    // @LINE:23
    case controllers_HomeController_myOrders13_route(params) =>
      call { 
        controllers_HomeController_myOrders13_invoker.call(HomeController_0.myOrders)
      }
  
    // @LINE:24
    case controllers_LoginController_deleteAccountPage14_route(params) =>
      call { 
        controllers_LoginController_deleteAccountPage14_invoker.call(LoginController_4.deleteAccountPage)
      }
  
    // @LINE:25
    case controllers_LoginController_deleteMyAccount15_route(params) =>
      call { 
        controllers_LoginController_deleteMyAccount15_invoker.call(LoginController_4.deleteMyAccount)
      }
  
    // @LINE:26
    case controllers_HomeController_reportProblem16_route(params) =>
      call { 
        controllers_HomeController_reportProblem16_invoker.call(HomeController_0.reportProblem)
      }
  
    // @LINE:27
    case controllers_HomeController_updateDetails17_route(params) =>
      call { 
        controllers_HomeController_updateDetails17_invoker.call(HomeController_0.updateDetails)
      }
  
    // @LINE:28
    case controllers_HomeController_updateDetailsSubmit18_route(params) =>
      call { 
        controllers_HomeController_updateDetailsSubmit18_invoker.call(HomeController_0.updateDetailsSubmit)
      }
  
    // @LINE:31
    case controllers_ShoppingCtrl_showBasket19_route(params) =>
      call { 
        controllers_ShoppingCtrl_showBasket19_invoker.call(ShoppingCtrl_1.showBasket())
      }
  
    // @LINE:32
    case controllers_ShoppingCtrl_addToBasket20_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket20_invoker.call(ShoppingCtrl_1.addToBasket(id))
      }
  
    // @LINE:33
    case controllers_ShoppingCtrl_addOne21_route(params) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_addOne21_invoker.call(ShoppingCtrl_1.addOne(itemId))
      }
  
    // @LINE:34
    case controllers_ShoppingCtrl_removeOne22_route(params) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne22_invoker.call(ShoppingCtrl_1.removeOne(itemId))
      }
  
    // @LINE:35
    case controllers_ShoppingCtrl_removeFromCart23_route(params) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeFromCart23_invoker.call(ShoppingCtrl_1.removeFromCart(itemId))
      }
  
    // @LINE:36
    case controllers_ShoppingCtrl_emptyBasket24_route(params) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket24_invoker.call(ShoppingCtrl_1.emptyBasket())
      }
  
    // @LINE:37
    case controllers_ShoppingCtrl_placeOrder25_route(params) =>
      call { 
        controllers_ShoppingCtrl_placeOrder25_invoker.call(ShoppingCtrl_1.placeOrder())
      }
  
    // @LINE:38
    case controllers_ShoppingCtrl_viewOrder26_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder26_invoker.call(ShoppingCtrl_1.viewOrder(id))
      }
  
    // @LINE:39
    case controllers_HomeController_cart27_route(params) =>
      call { 
        controllers_HomeController_cart27_invoker.call(HomeController_0.cart)
      }
  
    // @LINE:43
    case controllers_HomeController_adminevents28_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_adminevents28_invoker.call(HomeController_0.adminevents(cat))
      }
  
    // @LINE:44
    case controllers_HomeController_admineventTicket29_route(params) =>
      call(params.fromQuery[Long]("event", Some(0L))) { (event) =>
        controllers_HomeController_admineventTicket29_invoker.call(HomeController_0.admineventTicket(event))
      }
  
    // @LINE:46
    case controllers_HomeController_addEvent30_route(params) =>
      call { 
        controllers_HomeController_addEvent30_invoker.call(HomeController_0.addEvent)
      }
  
    // @LINE:47
    case controllers_HomeController_addEventSubmit31_route(params) =>
      call { 
        controllers_HomeController_addEventSubmit31_invoker.call(HomeController_0.addEventSubmit)
      }
  
    // @LINE:48
    case controllers_HomeController_deleteEvent32_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteEvent32_invoker.call(HomeController_0.deleteEvent(id))
      }
  
    // @LINE:49
    case controllers_HomeController_updateEvent33_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateEvent33_invoker.call(HomeController_0.updateEvent(id))
      }
  
    // @LINE:51
    case controllers_HomeController_addTicket34_route(params) =>
      call { 
        controllers_HomeController_addTicket34_invoker.call(HomeController_0.addTicket)
      }
  
    // @LINE:52
    case controllers_HomeController_addTicketSubmit35_route(params) =>
      call { 
        controllers_HomeController_addTicketSubmit35_invoker.call(HomeController_0.addTicketSubmit)
      }
  
    // @LINE:53
    case controllers_HomeController_deleteTicket36_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteTicket36_invoker.call(HomeController_0.deleteTicket(id))
      }
  
    // @LINE:54
    case controllers_HomeController_updateTicket37_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateTicket37_invoker.call(HomeController_0.updateTicket(id))
      }
  
    // @LINE:56
    case controllers_HomeController_addContactSubmit38_route(params) =>
      call { 
        controllers_HomeController_addContactSubmit38_invoker.call(HomeController_0.addContactSubmit)
      }
  
    // @LINE:58
    case controllers_HomeController_viewAccounts39_route(params) =>
      call { 
        controllers_HomeController_viewAccounts39_invoker.call(HomeController_0.viewAccounts)
      }
  
    // @LINE:59
    case controllers_HomeController_deleteUser40_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_HomeController_deleteUser40_invoker.call(HomeController_0.deleteUser(id))
      }
  
    // @LINE:60
    case controllers_HomeController_markAsRead41_route(params) =>
      call(params.fromQuery[Long]("id", None), params.fromQuery[Boolean]("status", None)) { (id, status) =>
        controllers_HomeController_markAsRead41_invoker.call(HomeController_0.markAsRead(id, status))
      }
  
    // @LINE:61
    case controllers_HomeController_markAsProccessed42_route(params) =>
      call(params.fromQuery[Long]("id", None), params.fromQuery[Boolean]("status", None)) { (id, status) =>
        controllers_HomeController_markAsProccessed42_invoker.call(HomeController_0.markAsProccessed(id, status))
      }
  
    // @LINE:66
    case controllers_Assets_versioned43_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned43_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
