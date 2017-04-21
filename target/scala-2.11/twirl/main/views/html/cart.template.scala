
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

class cart extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models._

Seq[Any](format.raw/*1.53*/("""

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
                    """),_display_(/*32.22*/if(user.getBasket().getBasketItems().size() == 0)/*32.71*/{_display_(Seq[Any](format.raw/*32.72*/("""
                        """),format.raw/*33.25*/("""<br>
                        <h3 class ="text-center">Cart is empty <span class="glyphicon glyphicon-shopping-cart"></span></h3>
                    """)))}),format.raw/*35.22*/("""

                    """),_display_(/*37.22*/if(user.getBasket().getBasketItems().size() > 0)/*37.70*/{_display_(Seq[Any](format.raw/*37.71*/("""
                            """),format.raw/*38.29*/("""<!-- Start of For loop - For each p in products add a row -->
                        """),_display_(/*39.26*/for(i <- user.getBasket().getBasketItems()) yield /*39.69*/ {_display_(Seq[Any](format.raw/*39.71*/("""


                            """),format.raw/*42.29*/("""<div class="panel-body">
                                <div class="row">
                                    <div class="col-xs-2">
                                    """),_display_(/*45.38*/if(env.resource("public/images/eventImages/" + i.getTicket.getEvent.getId + ".jpg").isDefined)/*45.132*/ {_display_(Seq[Any](format.raw/*45.134*/("""
                                        """),format.raw/*46.41*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*46.102*/(i.getTicket.getEvent.getId + ".jpg")),format.raw/*46.139*/(""""/>
                                    """)))}/*47.39*/else/*47.44*/{_display_(Seq[Any](format.raw/*47.45*/("""
                                        """),format.raw/*48.41*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                                        """)))}),format.raw/*49.42*/("""
                                    """),format.raw/*50.37*/("""</div>
                                    <div class="col-xs-4">
                                        <h4 class="product-name"><strong>"""),_display_(/*52.75*/i/*52.76*/.getTicket.getEvent.getEventName),format.raw/*52.108*/("""</strong></h4>
                                        <h4><small>"""),_display_(/*53.53*/i/*53.54*/.getTicket.getTicketType),format.raw/*53.78*/("""</small></h4>
                                    </div>
                                    <div class="col-xs-6">
                                        <div class="col-xs-6 text-right">
                                            <h4><strong>Price</strong></h4>
                                            <h4>&euro;"""),_display_(/*58.56*/("%.2f".format(i.getPrice))),format.raw/*58.83*/("""</h4>
                                        </div>
                                        <div class="col-xs-4 pull-right">
                                            <h4><strong>Quantity</strong></h4>
                                            """),_display_(/*62.46*/i/*62.47*/.getQuantity()),format.raw/*62.61*/("""
                                            """),_display_(/*63.46*/if(i.getQuantity < i.getTicket.getQuantity)/*63.89*/ {_display_(Seq[Any](format.raw/*63.91*/("""
                                                """),format.raw/*64.49*/("""<a href=""""),_display_(/*64.59*/routes/*64.65*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*64.97*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a>
                                                <a href=""""),_display_(/*65.59*/routes/*65.65*/.ShoppingCtrl.addOne(i.getId)),format.raw/*65.94*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a>
                                            """)))}),format.raw/*66.46*/("""
                                            """),_display_(/*67.46*/if(i.getQuantity == i.getTicket.getQuantity)/*67.90*/ {_display_(Seq[Any](format.raw/*67.92*/("""
                                                """),format.raw/*68.49*/("""<a href=""""),_display_(/*68.59*/routes/*68.65*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*68.97*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a>
                                                <span class="glyphicon glyphicon-plus-sign"></span>
                                                <br>
                                                Max reached
                                            """)))}),format.raw/*72.46*/("""
                                            """),format.raw/*73.45*/("""<a href=""""),_display_(/*73.55*/routes/*73.61*/.ShoppingCtrl.removeFromCart(i.getId)),format.raw/*73.98*/(""""><span class="glyphicon glyphicon-trash" id="removeCartBtn"></span></a>
                                        </div>
                                    </div>
                                </div>
                                <hr>
                                """)))}),format.raw/*78.34*/("""
                        """),_display_(/*79.26*/if(user.getBasket().getBasketItems().size() > 0)/*79.74*/{_display_(Seq[Any](format.raw/*79.75*/("""
                        """),format.raw/*80.25*/("""<div class="row">
                            <div class="text-center">
                                <div class="col-xs-9">
                                </div>
                                <div class="col-xs-3">
                                    <a href=""""),_display_(/*85.47*/routes/*85.53*/.ShoppingCtrl.emptyBasket()),format.raw/*85.80*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                                        Empty Cart</a>
                                </div>
                            </div>
                        </div>
                        """)))}),format.raw/*90.26*/("""
                    """),format.raw/*91.21*/("""</div>
                    """)))}),format.raw/*92.22*/("""


                    """),format.raw/*95.21*/("""<div class="panel-footer">
                        <div class="row text-center">
                            <div class="col-xs-9">
                                <h4 class="text-right"><strong>
                                    Total: &euro;"""),_display_(/*99.51*/("%.2f".format(user.getBasket.getBasketTotal))),format.raw/*99.97*/("""</strong></h4>
                            </div>
                            """),_display_(/*101.30*/if(user.getBasket.getBasketTotal > 0)/*101.67*/ {_display_(Seq[Any](format.raw/*101.69*/("""
                                """),format.raw/*102.33*/("""<div class="col-xs-3">
                                    <form action="/placeOrder" method="GET">
                                        <script
                                        src="https://checkout.stripe.com/checkout.js" class="stripe-button btn-success"
                                        data-key="pk_test_6pRNASCoBOKtIshFeQd4XMUh"
                                        data-amount=""""),_display_(/*107.55*/user/*107.59*/.getBasket.getStripeTotal),format.raw/*107.84*/(""""
                                        data-name="TC Events"
                                        data-description="Payment"
                                        data-email=""""),_display_(/*110.54*/user/*110.58*/.getEmail()),format.raw/*110.69*/(""""
                                        data-currency="EUR"
                                        data-image="http://cdn.wallpapersafari.com/62/83/v3qT9H.jpg"
                                        data-locale="auto"
                                        data-zip-code="false">
                                        </script>
                                    </form>
                                </div>
                            """)))}),format.raw/*118.30*/("""
                        """),format.raw/*119.25*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,env)

  def f:((models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,env) => apply(user,env)

  def ref: this.type = this

}


}

/**/
object cart extends cart_Scope0.cart
              /*
                  -- GENERATED --
                  DATE: Fri Apr 21 12:25:47 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/cart.scala.html
                  HASH: 29df94565a082e4e698566ed990c75eb8220a322
                  MATRIX: 775->1|1020->52|1048->158|1079->163|1150->209|1176->227|1215->229|1248->235|1991->951|2006->957|2052->982|2507->1410|2565->1459|2604->1460|2657->1485|2838->1635|2888->1658|2945->1706|2984->1707|3041->1736|3155->1823|3214->1866|3254->1868|3313->1899|3511->2070|3615->2164|3656->2166|3725->2207|3814->2268|3873->2305|3933->2347|3946->2352|3985->2353|4054->2394|4208->2517|4273->2554|4440->2694|4450->2695|4504->2727|4598->2794|4608->2795|4653->2819|5001->3140|5049->3167|5327->3418|5337->3419|5372->3433|5445->3479|5497->3522|5537->3524|5614->3573|5651->3583|5666->3589|5719->3621|5863->3738|5878->3744|5928->3773|6062->3876|6135->3922|6188->3966|6228->3968|6305->4017|6342->4027|6357->4033|6410->4065|6758->4382|6831->4427|6868->4437|6883->4443|6941->4480|7244->4752|7297->4778|7354->4826|7393->4827|7446->4852|7740->5119|7755->5125|7803->5152|8083->5401|8132->5422|8191->5450|8242->5473|8515->5719|8582->5765|8689->5844|8736->5881|8777->5883|8839->5916|9273->6322|9287->6326|9334->6351|9546->6535|9560->6539|9593->6550|10072->6997|10126->7022
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|41->11|54->24|54->24|54->24|62->32|62->32|62->32|63->33|65->35|67->37|67->37|67->37|68->38|69->39|69->39|69->39|72->42|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|78->48|79->49|80->50|82->52|82->52|82->52|83->53|83->53|83->53|88->58|88->58|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|94->64|95->65|95->65|95->65|96->66|97->67|97->67|97->67|98->68|98->68|98->68|98->68|102->72|103->73|103->73|103->73|103->73|108->78|109->79|109->79|109->79|110->80|115->85|115->85|115->85|120->90|121->91|122->92|125->95|129->99|129->99|131->101|131->101|131->101|132->102|137->107|137->107|137->107|140->110|140->110|140->110|148->118|149->119
                  -- GENERATED --
              */
          