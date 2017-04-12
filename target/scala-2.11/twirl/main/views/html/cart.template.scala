
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cart_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class cart extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models._

Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*7.1*/("""
    """),format.raw/*8.5*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Cart", user)/*9.20*/ {_display_(Seq[Any](format.raw/*9.22*/("""

    """),format.raw/*11.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="cartContent">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <div class="panel-title">
                            <div class="row">
                                <div class="col-xs-6">
                                    <h5 id = iconCart><span class="glyphicon glyphicon-shopping-cart" id="iconCart"></span>
                                        Shopping Cart</h5>
                                </div>
                                <div class="col-xs-6">
                                    <a href=""""),_display_(/*24.47*/routes/*24.53*/.HomeController.events(0)),format.raw/*24.78*/("""">
                                        <button type="button" class="btn btn-success btn-sm btn-block">
                                            <span class="glyphicon glyphicon-share-alt"></span> Continue shopping
                                        </button></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    """),_display_(/*32.22*/if(user.getBasket() == null)/*32.50*/ {_display_(Seq[Any](format.raw/*32.52*/("""
                        """),format.raw/*33.25*/("""<br>
                        <h3>Cart is empty !</h3>
                    """)))}),format.raw/*35.22*/("""

                    """),_display_(/*37.22*/if(user.getBasket() != null)/*37.50*/ {_display_(Seq[Any](format.raw/*37.52*/("""
                            """),format.raw/*38.29*/("""<!-- Start of For loop - For each p in products add a row -->
                        """),_display_(/*39.26*/for(i <- user.getBasket().getBasketItems()) yield /*39.69*/ {_display_(Seq[Any](format.raw/*39.71*/("""


                            """),format.raw/*42.29*/("""<div class="panel-body">
                                <div class="row">
                                    <div class="col-xs-2"><img class="img-responsive" src="http://placehold.it/100x70">
                                    </div>
                                    <div class="col-xs-4">
                                        <h4 class="product-name"><strong>"""),_display_(/*47.75*/i/*47.76*/.getTicket.getEvent.getEventName),format.raw/*47.108*/("""</strong></h4>
                                        <h4><small>"""),_display_(/*48.53*/i/*48.54*/.getTicket.getTicketType),format.raw/*48.78*/("""</small></h4>
                                    </div>
                                    <div class="col-xs-6">
                                        <div class="col-xs-6 text-right">
                                            <h6><strong>&euro;
                                                """),_display_(/*53.50*/("%.2f".format(i.getPrice))),format.raw/*53.77*/(""" """),format.raw/*53.78*/("""<span class="text-muted">x</span></strong>
                                            </h6>
                                        </div>
                                        <div class="col-xs-4">
                                            """),_display_(/*57.46*/i/*57.47*/.getQuantity()),format.raw/*57.61*/("""
                                        """),format.raw/*58.41*/("""<a href=""""),_display_(/*58.51*/routes/*58.57*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*58.89*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a>
                                        <a href=""""),_display_(/*59.51*/routes/*59.57*/.ShoppingCtrl.addOne(i.getId)),format.raw/*59.86*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a>
                                        </div>
                                        <div class="col-xs-2">
                                            <button type="button" class="btn btn-link btn-xs">
                                                <span class="glyphicon glyphicon-trash"> </span>
                                            </button>
                                        </div>
                                    </div>
                                </div>
                                <hr>

                                <hr>
                                """)))}),format.raw/*71.34*/("""

                        """),format.raw/*73.25*/("""<div class="row">
                            <div class="text-center">
                                <div class="col-xs-9">
                                    <h6 class="text-right">Empty cart</h6>
                                </div>
                                <div class="col-xs-3">
                                    <a href=""""),_display_(/*79.47*/routes/*79.53*/.ShoppingCtrl.emptyBasket()),format.raw/*79.80*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                                        Empty Cart</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    """)))}),format.raw/*85.22*/("""


                    """),format.raw/*88.21*/("""<div class="panel-footer">
                        <div class="row text-center">
                            <div class="col-xs-9">
                                <h4 class="text-right"><strong>
                                    Total: &euro; """),_display_(/*92.52*/("%.2f".format(user.getBasket.getBasketTotal))),format.raw/*92.98*/("""</strong></h4>
                            </div>
                            """),_display_(/*94.30*/if(user.getBasket.getBasketTotal > 0)/*94.67*/ {_display_(Seq[Any](format.raw/*94.69*/("""
                                """),format.raw/*95.33*/("""<div class="col-xs-3">
                                    <form action="/placeOrder" method="GET">
                                        <script
                                        src="https://checkout.stripe.com/checkout.js" class="stripe-button btn-success"
                                        data-key="pk_test_6pRNASCoBOKtIshFeQd4XMUh"
                                        data-amount=""""),_display_(/*100.55*/user/*100.59*/.getBasket.getStripeTotal),format.raw/*100.84*/(""""
                                        data-name="TC Events"
                                        data-description="Payment"
                                        data-email=""""),_display_(/*103.54*/user/*103.58*/.getEmail()),format.raw/*103.69*/(""""
                                        data-currency="EUR"
                                        data-image="http://cdn.wallpapersafari.com/62/83/v3qT9H.jpg"
                                        data-locale="auto"
                                        data-zip-code="false">
                                        </script>
                                    </form>
                                </div>
                            """)))}),format.raw/*111.30*/("""
                        """),format.raw/*112.25*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object cart extends cart_Scope0.cart
              /*
                  -- GENERATED --
                  DATE: Wed Apr 12 13:31:40 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/cart.scala.html
                  HASH: 270994ff635d2b9cf985ed3bc895f17ea2f7ec5b
                  MATRIX: 754->1|973->26|1001->132|1032->137|1103->183|1129->201|1168->203|1201->209|1944->925|1959->931|2005->956|2460->1384|2497->1412|2537->1414|2590->1439|2696->1514|2746->1537|2783->1565|2823->1567|2880->1596|2994->1683|3053->1726|3093->1728|3152->1759|3550->2130|3560->2131|3614->2163|3708->2230|3718->2231|3763->2255|4092->2557|4140->2584|4169->2585|4444->2833|4454->2834|4489->2848|4558->2889|4595->2899|4610->2905|4663->2937|4799->3046|4814->3052|4864->3081|5546->3732|5600->3758|5969->4100|5984->4106|6032->4133|6335->4405|6386->4428|6660->4675|6727->4721|6833->4800|6879->4837|6919->4839|6980->4872|7414->5278|7428->5282|7475->5307|7687->5491|7701->5495|7734->5506|8213->5953|8267->5978
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|41->11|54->24|54->24|54->24|62->32|62->32|62->32|63->33|65->35|67->37|67->37|67->37|68->38|69->39|69->39|69->39|72->42|77->47|77->47|77->47|78->48|78->48|78->48|83->53|83->53|83->53|87->57|87->57|87->57|88->58|88->58|88->58|88->58|89->59|89->59|89->59|101->71|103->73|109->79|109->79|109->79|115->85|118->88|122->92|122->92|124->94|124->94|124->94|125->95|130->100|130->100|130->100|133->103|133->103|133->103|141->111|142->112
                  -- GENERATED --
              */
          