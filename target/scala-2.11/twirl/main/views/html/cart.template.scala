
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
                    """),_display_(/*32.22*/if(user.getBasket() == null)/*32.50*/ {_display_(Seq[Any](format.raw/*32.52*/("""
                        """),format.raw/*33.25*/("""<br>
                        <h3>Cart is empty !</h3>
                    """)))}),format.raw/*35.22*/("""

                    """),_display_(/*37.22*/if(user.getBasket() != null)/*37.50*/ {_display_(Seq[Any](format.raw/*37.52*/("""
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
                                            <h4>&euro;
                                                """),_display_(/*59.50*/("%.2f".format(i.getPrice))),format.raw/*59.77*/(""" """),format.raw/*59.78*/("""<span class="text-muted">x</span>
                                            </h4>
                                        </div>
                                        <div class="col-xs-4 pull-right">
                                            <h4><strong>Quantity</strong></h4>
                                            """),_display_(/*64.46*/i/*64.47*/.getQuantity()),format.raw/*64.61*/("""
                                            """),_display_(/*65.46*/if(i.getQuantity < i.getTicket.getQuantity)/*65.89*/ {_display_(Seq[Any](format.raw/*65.91*/("""
                                                """),format.raw/*66.49*/("""<a href=""""),_display_(/*66.59*/routes/*66.65*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*66.97*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a>
                                                <a href=""""),_display_(/*67.59*/routes/*67.65*/.ShoppingCtrl.addOne(i.getId)),format.raw/*67.94*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a>
                                            """)))}),format.raw/*68.46*/("""
                                            """),_display_(/*69.46*/if(i.getQuantity == i.getTicket.getQuantity)/*69.90*/ {_display_(Seq[Any](format.raw/*69.92*/("""
                                                """),format.raw/*70.49*/("""<a href=""""),_display_(/*70.59*/routes/*70.65*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*70.97*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a>
                                                <span class="glyphicon glyphicon-plus-sign"></span>
                                                <br>
                                                Max reached
                                            """)))}),format.raw/*74.46*/("""

                                            """),format.raw/*76.45*/("""<a href=""""),_display_(/*76.55*/routes/*76.61*/.ShoppingCtrl.removeFromCart(i.getId)),format.raw/*76.98*/(""""><span class="glyphicon glyphicon-trash"></span></a>
                                        </div>
                                    </div>
                                </div>
                                <hr>
                                """)))}),format.raw/*81.34*/("""

                        """),format.raw/*83.25*/("""<div class="row">
                            <div class="text-center">
                                <div class="col-xs-9">
                                    <h6 class="text-right">Empty cart</h6>
                                </div>
                                <div class="col-xs-3">
                                    <a href=""""),_display_(/*89.47*/routes/*89.53*/.ShoppingCtrl.emptyBasket()),format.raw/*89.80*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                                        Empty Cart</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    """)))}),format.raw/*95.22*/("""


                    """),format.raw/*98.21*/("""<div class="panel-footer">
                        <div class="row text-center">
                            <div class="col-xs-9">
                                <h4 class="text-right"><strong>
                                    Total: &euro; """),_display_(/*102.52*/("%.2f".format(user.getBasket.getBasketTotal))),format.raw/*102.98*/("""</strong></h4>
                            </div>
                            """),_display_(/*104.30*/if(user.getBasket.getBasketTotal > 0)/*104.67*/ {_display_(Seq[Any](format.raw/*104.69*/("""
                                """),format.raw/*105.33*/("""<div class="col-xs-3">
                                    <form action="/placeOrder" method="GET">
                                        <script
                                        src="https://checkout.stripe.com/checkout.js" class="stripe-button btn-success"
                                        data-key="pk_test_6pRNASCoBOKtIshFeQd4XMUh"
                                        data-amount=""""),_display_(/*110.55*/user/*110.59*/.getBasket.getStripeTotal),format.raw/*110.84*/(""""
                                        data-name="TC Events"
                                        data-description="Payment"
                                        data-email=""""),_display_(/*113.54*/user/*113.58*/.getEmail()),format.raw/*113.69*/(""""
                                        data-currency="EUR"
                                        data-image="http://cdn.wallpapersafari.com/62/83/v3qT9H.jpg"
                                        data-locale="auto"
                                        data-zip-code="false">
                                        </script>
                                    </form>
                                </div>
                            """)))}),format.raw/*121.30*/("""
                        """),format.raw/*122.25*/("""</div>
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
                  DATE: Tue Apr 18 15:24:28 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/cart.scala.html
                  HASH: b290b2fa659346dd86e964dfbe5c86333ce2bf3d
                  MATRIX: 775->1|1020->52|1050->164|1082->170|1154->217|1180->235|1219->237|1254->245|2010->974|2025->980|2071->1005|2534->1441|2571->1469|2611->1471|2665->1497|2773->1574|2825->1599|2862->1627|2902->1629|2960->1659|3075->1747|3134->1790|3174->1792|3236->1826|3437->2000|3541->2094|3582->2096|3652->2138|3741->2199|3800->2236|3861->2279|3874->2284|3913->2285|3983->2327|4138->2451|4204->2489|4373->2631|4383->2632|4437->2664|4532->2732|4542->2733|4587->2757|4990->3133|5038->3160|5067->3161|5428->3495|5438->3496|5473->3510|5547->3557|5599->3600|5639->3602|5717->3652|5754->3662|5769->3668|5822->3700|5967->3818|5982->3824|6032->3853|6167->3957|6241->4004|6294->4048|6334->4050|6412->4100|6449->4110|6464->4116|6517->4148|6869->4469|6945->4517|6982->4527|6997->4533|7055->4570|7344->4828|7400->4856|7775->5204|7790->5210|7838->5237|8147->5515|8201->5541|8480->5792|8548->5838|8657->5919|8704->5956|8745->5958|8808->5992|9247->6403|9261->6407|9308->6432|9523->6619|9537->6623|9570->6634|10057->7089|10112->7115
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|41->11|54->24|54->24|54->24|62->32|62->32|62->32|63->33|65->35|67->37|67->37|67->37|68->38|69->39|69->39|69->39|72->42|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|78->48|79->49|80->50|82->52|82->52|82->52|83->53|83->53|83->53|89->59|89->59|89->59|94->64|94->64|94->64|95->65|95->65|95->65|96->66|96->66|96->66|96->66|97->67|97->67|97->67|98->68|99->69|99->69|99->69|100->70|100->70|100->70|100->70|104->74|106->76|106->76|106->76|106->76|111->81|113->83|119->89|119->89|119->89|125->95|128->98|132->102|132->102|134->104|134->104|134->104|135->105|140->110|140->110|140->110|143->113|143->113|143->113|151->121|152->122
                  -- GENERATED --
              */
          