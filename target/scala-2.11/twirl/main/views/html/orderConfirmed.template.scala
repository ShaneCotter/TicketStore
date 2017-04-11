
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orderConfirmed_Scope0 {
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

class orderConfirmed extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models._

Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*7.1*/("""
    """),format.raw/*8.5*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Order Confirmation", user)/*9.34*/ {_display_(Seq[Any](format.raw/*9.36*/("""

"""),format.raw/*11.1*/("""<div class = "container" id ="content">
    <div class="row">

        <div class="col-md-12">
            """),_display_(/*15.14*/if(flash.containsKey("success"))/*15.46*/ {_display_(Seq[Any](format.raw/*15.48*/("""
                """),format.raw/*16.17*/("""<div class="alert alert-success">
                """),_display_(/*17.18*/flash/*17.23*/.get("success")),format.raw/*17.38*/("""
                """),format.raw/*18.17*/("""</div>
            """)))}),format.raw/*19.14*/("""

            """),format.raw/*21.13*/("""<div class="row">
                <div class="col-md-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="text-center"><strong>Order summary</strong></h3>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-condensed">
                                    <thead>
                                        <tr>
                                            <td><strong>Ticket</strong></td>
                                            <td class="text-center"><strong>Ticket Price</strong></td>
                                            <td class="text-center"><strong>Ticket Quantity</strong></td>
                                            <td class="text-right"><strong>Total</strong></td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    """),_display_(/*39.38*/if(order != null)/*39.55*/ {_display_(Seq[Any](format.raw/*39.57*/("""
                                            """),format.raw/*40.45*/("""<!-- Start of For loop - For each p in products add a row -->
                                        """),_display_(/*41.42*/for(i <- order.getItems) yield /*41.66*/ {_display_(Seq[Any](format.raw/*41.68*/("""
                                        """),format.raw/*42.41*/("""<tr>
                                            <td>"""),_display_(/*43.50*/i/*43.51*/.getTicket.getEvent.getEventName),format.raw/*43.83*/(""" """),format.raw/*43.84*/("""- """),_display_(/*43.87*/i/*43.88*/.getTicket.getTicketType),format.raw/*43.112*/("""</td>
                                            <td class="text-center">&euro; """),_display_(/*44.77*/("%.2f".format(i.getPrice))),format.raw/*44.104*/("""</td>
                                            <td class="text-center">"""),_display_(/*45.70*/i/*45.71*/.getQuantity()),format.raw/*45.85*/("""</td>
                                            <td class="text-right">&euro; """),_display_(/*46.76*/("%.2f".format(i.getItemTotal))),format.raw/*46.107*/("""</td>
                                        </tr>""")))})))}),format.raw/*47.48*/("""
                                        """),format.raw/*48.41*/("""<tr>
                                            <td class="highrow"></td>
                                            <td class="highrow"></td>
                                            <td class="highrow text-center"><strong>Order Total</strong></td>
                                            <td class="highrow text-right">&euro; """),_display_(/*52.84*/("%.2f".format(order.getOrderTotal))),format.raw/*52.120*/("""</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(user:models.users.User,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(user,order)

  def f:((models.users.User,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (user,order) => apply(user,order)

  def ref: this.type = this

}


}

/**/
object orderConfirmed extends orderConfirmed_Scope0.orderConfirmed
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 14:52:22 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/orderConfirmed.scala.html
                  HASH: 7f11af065177aba561ee17d45c491504e1d6a1f9
                  MATRIX: 800->1|1053->60|1083->172|1115->178|1187->225|1227->257|1266->259|1297->263|1436->375|1477->407|1517->409|1563->427|1642->479|1656->484|1692->499|1738->517|1790->538|1834->554|2982->1675|3008->1692|3048->1694|3122->1740|3253->1844|3293->1868|3333->1870|3403->1912|3485->1967|3495->1968|3548->2000|3577->2001|3607->2004|3617->2005|3663->2029|3773->2112|3822->2139|3925->2215|3935->2216|3970->2230|4079->2312|4132->2343|4220->2397|4290->2439|4659->2781|4717->2817
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|41->11|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|51->21|69->39|69->39|69->39|70->40|71->41|71->41|71->41|72->42|73->43|73->43|73->43|73->43|73->43|73->43|73->43|74->44|74->44|75->45|75->45|75->45|76->46|76->46|77->47|78->48|82->52|82->52
                  -- GENERATED --
              */
          