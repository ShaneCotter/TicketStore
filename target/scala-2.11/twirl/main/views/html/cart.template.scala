
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
                  DATE: Wed Apr 19 10:22:26 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/cart.scala.html
                  HASH: d9571eee2b2f1c17ab76359ed2616fbbb48f2b2e
                  MATRIX: 775->1|1020->52|1048->158|1079->163|1150->209|1176->227|1215->229|1248->235|1991->951|2006->957|2052->982|2507->1410|2544->1438|2584->1440|2637->1465|2743->1540|2793->1563|2830->1591|2870->1593|2927->1622|3041->1709|3100->1752|3140->1754|3199->1785|3397->1956|3501->2050|3542->2052|3611->2093|3700->2154|3759->2191|3819->2233|3832->2238|3871->2239|3940->2280|4094->2403|4159->2440|4326->2580|4336->2581|4390->2613|4484->2680|4494->2681|4539->2705|4936->3075|4984->3102|5013->3103|5369->3432|5379->3433|5414->3447|5487->3493|5539->3536|5579->3538|5656->3587|5693->3597|5708->3603|5761->3635|5905->3752|5920->3758|5970->3787|6104->3890|6177->3936|6230->3980|6270->3982|6347->4031|6384->4041|6399->4047|6452->4079|6800->4396|6874->4442|6911->4452|6926->4458|6984->4495|7268->4748|7322->4774|7691->5116|7706->5122|7754->5149|8057->5421|8108->5444|8383->5691|8451->5737|8558->5816|8605->5853|8646->5855|8708->5888|9142->6294|9156->6298|9203->6323|9415->6507|9429->6511|9462->6522|9941->6969|9995->6994
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|41->11|54->24|54->24|54->24|62->32|62->32|62->32|63->33|65->35|67->37|67->37|67->37|68->38|69->39|69->39|69->39|72->42|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|78->48|79->49|80->50|82->52|82->52|82->52|83->53|83->53|83->53|89->59|89->59|89->59|94->64|94->64|94->64|95->65|95->65|95->65|96->66|96->66|96->66|96->66|97->67|97->67|97->67|98->68|99->69|99->69|99->69|100->70|100->70|100->70|100->70|104->74|106->76|106->76|106->76|106->76|111->81|113->83|119->89|119->89|119->89|125->95|128->98|132->102|132->102|134->104|134->104|134->104|135->105|140->110|140->110|140->110|143->113|143->113|143->113|151->121|152->122
                  -- GENERATED --
              */
          