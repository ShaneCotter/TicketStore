
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object viewOrders_Scope0 {
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

class viewOrders extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.shopping.ShopOrder],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(orders: List[models.shopping.ShopOrder], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.68*/("""

"""),_display_(/*3.2*/main("viewOrders", user)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
    """),format.raw/*4.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="content">
        <h2>Customer Orders</h2>
        <div class="row omb_row-sm-offset-3">

            <table class="table table-responsive table-bordered">
                <thead>
                    <tr>
                        <th class="greentext">Order #</th>
                        <th class="greentext">Date</th>
                        <th class="greentext">Total</th>
                        <th class="greentext">Status</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*20.18*/for(o <- orders) yield /*20.34*/ {_display_(Seq[Any](format.raw/*20.36*/("""
                    """),_display_(/*21.22*/if(o.isProccessed == false)/*21.49*/ {_display_(Seq[Any](format.raw/*21.51*/("""
                        """),format.raw/*22.25*/("""<tr class = "danger">
                            <td>#"""),_display_(/*23.35*/o/*23.36*/.getId),format.raw/*23.42*/("""</td>
                            <td>"""),_display_(/*24.34*/o/*24.35*/.getOrderDate),format.raw/*24.48*/("""</td>
                            <td>"""),_display_(/*25.34*/o/*25.35*/.getOrderTotal),format.raw/*25.49*/("""</td>
                            <td>Received</td>
                            <td class="col-sm-1"><a href=""""),_display_(/*27.60*/routes/*27.66*/.HomeController.markAsProccessed(o.getId,true)),format.raw/*27.112*/("""" class="btn btn-danger btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-ok"></span> Mark as proccessed
                            </a></td>
                            </tr>
                            """),_display_(/*31.30*/for(i <- o.getItems) yield /*31.50*/ {_display_(Seq[Any](format.raw/*31.52*/("""
                                """),format.raw/*32.33*/("""<tr>
                                <td>Tickets : """),_display_(/*33.48*/i/*33.49*/.getQuantity),format.raw/*33.61*/(""" """),format.raw/*33.62*/("""x €"""),_display_(/*33.66*/i/*33.67*/.getPrice),format.raw/*33.76*/(""" """),_display_(/*33.78*/i/*33.79*/.getTicket.getEvent.getEventName),format.raw/*33.111*/(""" """),format.raw/*33.112*/("""- """),_display_(/*33.115*/i/*33.116*/.getTicket.getTicketType),format.raw/*33.140*/("""</td>
                                </tr>
                            """)))}),format.raw/*35.30*/("""

                    """)))}),format.raw/*37.22*/("""
                    """),_display_(/*38.22*/if(o.isProccessed == true)/*38.48*/{_display_(Seq[Any](format.raw/*38.49*/("""
                        """),format.raw/*39.25*/("""<tr class = "success">
                            <td>#"""),_display_(/*40.35*/o/*40.36*/.getId),format.raw/*40.42*/("""</td>
                            <td>"""),_display_(/*41.34*/o/*41.35*/.getOrderDate),format.raw/*41.48*/("""</td>
                            <td>"""),_display_(/*42.34*/o/*42.35*/.getOrderTotal),format.raw/*42.49*/("""</td>
                            <td>Proccessed</td>
                            <td class="col-sm-1"><a href=""""),_display_(/*44.60*/routes/*44.66*/.HomeController.markAsProccessed(o.getId,true)),format.raw/*44.112*/("""" class="btn btn-success btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-ok"></span> Order Proccessed
                            </a></td>
                        </tr>
                            """),_display_(/*48.30*/for(i <- o.getItems) yield /*48.50*/ {_display_(Seq[Any](format.raw/*48.52*/("""
                                """),format.raw/*49.33*/("""<tr>
                                <td>Tickets : """),_display_(/*50.48*/i/*50.49*/.getQuantity),format.raw/*50.61*/(""" """),format.raw/*50.62*/("""x €"""),_display_(/*50.66*/i/*50.67*/.getPrice),format.raw/*50.76*/(""" """),_display_(/*50.78*/i/*50.79*/.getTicket.getEvent.getEventName),format.raw/*50.111*/(""" """),format.raw/*50.112*/("""- """),_display_(/*50.115*/i/*50.116*/.getTicket.getTicketType),format.raw/*50.140*/("""</td>
                                </tr>
                            """)))}),format.raw/*52.30*/("""

                    """)))}),format.raw/*54.22*/("""
                """)))}),format.raw/*55.18*/("""
                """),format.raw/*56.17*/("""</tbody>
            </table>
            <br>
            <br>
        </div>


    </div>
        <!--END CONTENT-->

""")))}))
      }
    }
  }

  def render(orders:List[models.shopping.ShopOrder],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(orders,user)

  def f:((List[models.shopping.ShopOrder],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (orders,user) => apply(orders,user)

  def ref: this.type = this

}


}

/**/
object viewOrders extends viewOrders_Scope0.viewOrders
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 13:50:32 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admin/viewOrders.scala.html
                  HASH: 190bda6ef8a3a8f24052d5d806adf6c813e20906
                  MATRIX: 804->1|965->67|995->72|1027->96|1066->98|1098->104|1758->737|1790->753|1830->755|1880->778|1916->805|1956->807|2010->833|2094->890|2104->891|2131->897|2198->937|2208->938|2242->951|2309->991|2319->992|2354->1006|2494->1119|2509->1125|2577->1171|2872->1439|2908->1459|2948->1461|3010->1495|3090->1548|3100->1549|3133->1561|3162->1562|3193->1566|3203->1567|3233->1576|3262->1578|3272->1579|3326->1611|3356->1612|3387->1615|3398->1616|3444->1640|3550->1715|3606->1740|3656->1763|3691->1789|3730->1790|3784->1816|3869->1874|3879->1875|3906->1881|3973->1921|3983->1922|4017->1935|4084->1975|4094->1976|4129->1990|4271->2105|4286->2111|4354->2157|4644->2420|4680->2440|4720->2442|4782->2476|4862->2529|4872->2530|4905->2542|4934->2543|4965->2547|4975->2548|5005->2557|5034->2559|5044->2560|5098->2592|5128->2593|5159->2596|5170->2597|5216->2621|5322->2696|5378->2721|5428->2740|5474->2758
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|51->20|51->20|51->20|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|58->27|58->27|58->27|62->31|62->31|62->31|63->32|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|66->35|68->37|69->38|69->38|69->38|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|75->44|75->44|75->44|79->48|79->48|79->48|80->49|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|83->52|85->54|86->55|87->56
                  -- GENERATED --
              */
          