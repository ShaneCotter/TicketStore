
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


    """),format.raw/*12.5*/("""<div class="row">

        <div class="col-md-12">
            """),_display_(/*15.14*/if(flash.containsKey("success"))/*15.46*/ {_display_(Seq[Any](format.raw/*15.48*/("""
                """),format.raw/*16.17*/("""<div class="alert alert-success">
                """),_display_(/*17.18*/flash/*17.23*/.get("success")),format.raw/*17.38*/("""
                """),format.raw/*18.17*/("""</div>
            """)))}),format.raw/*19.14*/("""

            """),format.raw/*21.13*/("""<table class="table table-bordered table-hover table-condensed">
                <thead>
                        <!-- The header row-->
                    <tr>
                        <th>Name</th>
                        <th>Ticket Type</th>
                        <th>Item Price</th>
                        <th>Quantity</th>
                        <th>Total</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*33.18*/if(order != null)/*33.35*/ {_display_(Seq[Any](format.raw/*33.37*/("""
                        """),format.raw/*34.25*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*35.22*/for(i <- order.getItems) yield /*35.46*/ {_display_(Seq[Any](format.raw/*35.48*/("""
                        """),format.raw/*36.25*/("""<tr>
                            <td>"""),_display_(/*37.34*/i/*37.35*/.getTicket.getEvent.getEventName),format.raw/*37.67*/("""</td>
                            <td>"""),_display_(/*38.34*/i/*38.35*/.getTicket.getTicketType),format.raw/*38.59*/("""</td>
                            <td>&euro; """),_display_(/*39.41*/("%.2f".format(i.getPrice))),format.raw/*39.68*/("""</td>
                            <td>"""),_display_(/*40.34*/i/*40.35*/.getQuantity()),format.raw/*40.49*/("""</td>
                            <td>&euro; """),_display_(/*41.41*/("%.2f".format(i.getItemTotal))),format.raw/*41.72*/("""</td>
                        </tr>
                    """)))}),format.raw/*43.22*/("""<!-- End of For loop -->
                """)))}),format.raw/*44.18*/("""
                """),format.raw/*45.17*/("""</tbody>
            </table>
            <div class="row">
                <div class="col-md-12">
                    <p class="text-right"><strong>Order Total: &euro; """),_display_(/*49.72*/("%.2f".format(order.getOrderTotal))),format.raw/*49.108*/("""</strong></p>
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
                  DATE: Tue Apr 11 12:42:34 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/orderConfirmed.scala.html
                  HASH: 7706a97e1ceca2cde59f0ff9727e9b7d420e6635
                  MATRIX: 800->1|1053->60|1083->172|1115->178|1187->225|1227->257|1266->259|1303->269|1397->336|1438->368|1478->370|1524->388|1603->440|1617->445|1653->460|1699->478|1751->499|1795->515|2295->988|2321->1005|2361->1007|2415->1033|2526->1117|2566->1141|2606->1143|2660->1169|2726->1208|2736->1209|2789->1241|2856->1281|2866->1282|2911->1306|2985->1353|3033->1380|3100->1420|3110->1421|3145->1435|3219->1482|3271->1513|3361->1572|3435->1615|3481->1633|3683->1808|3741->1844
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|42->12|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|51->21|63->33|63->33|63->33|64->34|65->35|65->35|65->35|66->36|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|70->40|70->40|70->40|71->41|71->41|73->43|74->44|75->45|79->49|79->49
                  -- GENERATED --
              */
          