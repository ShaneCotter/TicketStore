
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
                  DATE: Tue Apr 11 13:34:24 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/orderConfirmed.scala.html
                  HASH: 213ef9a374f192b8dbf9cb8ebeeb32463a894ecd
                  MATRIX: 800->1|1053->60|1081->166|1112->171|1183->217|1223->249|1262->251|1296->258|1387->322|1428->354|1468->356|1513->373|1591->424|1605->429|1641->444|1686->461|1737->481|1779->495|2267->956|2293->973|2333->975|2386->1000|2496->1083|2536->1107|2576->1109|2629->1134|2694->1172|2704->1173|2757->1205|2823->1244|2833->1245|2878->1269|2951->1315|2999->1342|3065->1381|3075->1382|3110->1396|3183->1442|3235->1473|3323->1530|3396->1572|3441->1589|3639->1760|3697->1796
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|42->12|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|51->21|63->33|63->33|63->33|64->34|65->35|65->35|65->35|66->36|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|70->40|70->40|70->40|71->41|71->41|73->43|74->44|75->45|79->49|79->49
                  -- GENERATED --
              */
          