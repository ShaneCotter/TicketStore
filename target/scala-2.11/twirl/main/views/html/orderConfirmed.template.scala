
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

    """),format.raw/*11.5*/("""<div class = "container" id ="content">
        <div class="row">
            """),_display_(/*13.14*/if(flash.containsKey("success"))/*13.46*/ {_display_(Seq[Any](format.raw/*13.48*/("""
                """),format.raw/*14.17*/("""<div class="alert alert-success">
                """),_display_(/*15.18*/flash/*15.23*/.get("success")),format.raw/*15.38*/("""
                """),format.raw/*16.17*/("""</div>
            """)))}),format.raw/*17.14*/("""

            """),_display_(/*19.14*/if(order != null)/*19.31*/ {_display_(Seq[Any](format.raw/*19.33*/("""
                """),format.raw/*20.17*/("""<div class="col-md-12">
                    <h3 class = "text-center">"""),_display_(/*21.48*/user/*21.52*/.getName),format.raw/*21.60*/("""
                        """),format.raw/*22.25*/("""thank you for choosing TC Events. Your order #"""),_display_(/*22.72*/order/*22.77*/.getId),format.raw/*22.83*/(""" """),format.raw/*22.84*/("""has been successful.</h3>
                    <h4 class = "text-center">Your e-tickets will be emailed to """),_display_(/*23.82*/user/*23.86*/.getEmail),format.raw/*23.95*/(""" """),format.raw/*23.96*/("""shortly !</h4>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="text-center whitetext"><strong>Order summary</strong></h3>
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

                                                    <!-- Start of For loop - For each p in products add a row -->
                                                """),_display_(/*44.50*/for(i <- order.getItems) yield /*44.74*/ {_display_(Seq[Any](format.raw/*44.76*/("""
                                                    """),format.raw/*45.53*/("""<tr>
                                                        <td>"""),_display_(/*46.62*/i/*46.63*/.getTicket.getEvent.getEventName),format.raw/*46.95*/("""
                                                            """),format.raw/*47.61*/("""- """),_display_(/*47.64*/i/*47.65*/.getTicket.getTicketType),format.raw/*47.89*/("""</td>
                                                        <td class="text-center">&euro;
                                                            """),_display_(/*49.62*/("%.2f".format(i.getPrice))),format.raw/*49.89*/("""</td>
                                                        <td class="text-center">"""),_display_(/*50.82*/i/*50.83*/.getQuantity()),format.raw/*50.97*/("""</td>
                                                        <td class="text-right">&euro;
                                                            """),_display_(/*52.62*/("%.2f".format(i.getItemTotal))),format.raw/*52.93*/("""</td>
                                                    </tr>
                                                """)))})))}),format.raw/*54.51*/("""
            """),format.raw/*55.13*/("""<tr>
                <td class="highrow"></td>
                <td class="highrow"></td>
                <td class="highrow text-center"><strong>Order Total</strong></td>
                <td class="highrow text-right">&euro; """),_display_(/*59.56*/("%.2f".format(order.getOrderTotal))),format.raw/*59.92*/("""</td>
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
                  DATE: Tue Apr 18 14:04:49 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/orderConfirmed.scala.html
                  HASH: 668327079d43ec28054289a050d6bfbef46c7c5f
                  MATRIX: 800->1|1053->60|1083->172|1115->178|1187->225|1227->257|1266->259|1301->267|1409->348|1450->380|1490->382|1536->400|1615->452|1629->457|1665->472|1711->490|1763->511|1807->528|1833->545|1873->547|1919->565|2018->637|2031->641|2060->649|2114->675|2188->722|2202->727|2229->733|2258->734|2393->842|2406->846|2436->855|2465->856|3924->2288|3964->2312|4004->2314|4086->2368|4180->2435|4190->2436|4243->2468|4333->2530|4363->2533|4373->2534|4418->2558|4601->2714|4649->2741|4764->2829|4774->2830|4809->2844|4991->2999|5043->3030|5193->3146|5235->3160|5492->3390|5549->3426
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|41->11|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|47->17|49->19|49->19|49->19|50->20|51->21|51->21|51->21|52->22|52->22|52->22|52->22|52->22|53->23|53->23|53->23|53->23|74->44|74->44|74->44|75->45|76->46|76->46|76->46|77->47|77->47|77->47|77->47|79->49|79->49|80->50|80->50|80->50|82->52|82->52|84->54|85->55|89->59|89->59
                  -- GENERATED --
              */
          