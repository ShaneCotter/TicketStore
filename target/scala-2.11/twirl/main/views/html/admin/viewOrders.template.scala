
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
                  DATE: Tue Apr 18 11:45:57 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/viewOrders.scala.html
                  HASH: 253ddf60ebe206987b7084d3df34ce6f1c743753
                  MATRIX: 804->1|965->67|993->70|1025->94|1064->96|1095->101|1739->718|1771->734|1811->736|1860->758|1896->785|1936->787|1989->812|2072->868|2082->869|2109->875|2175->914|2185->915|2219->928|2285->967|2295->968|2330->982|2468->1093|2483->1099|2551->1145|2842->1409|2878->1429|2918->1431|2979->1464|3058->1516|3068->1517|3101->1529|3130->1530|3161->1534|3171->1535|3201->1544|3230->1546|3240->1547|3294->1579|3324->1580|3355->1583|3366->1584|3412->1608|3516->1681|3570->1704|3619->1726|3654->1752|3693->1753|3746->1778|3830->1835|3840->1836|3867->1842|3933->1881|3943->1882|3977->1895|4043->1934|4053->1935|4088->1949|4228->2062|4243->2068|4311->2114|4597->2373|4633->2393|4673->2395|4734->2428|4813->2480|4823->2481|4856->2493|4885->2494|4916->2498|4926->2499|4956->2508|4985->2510|4995->2511|5049->2543|5079->2544|5110->2547|5121->2548|5167->2572|5271->2645|5325->2668|5374->2686|5419->2703
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|51->20|51->20|51->20|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|58->27|58->27|58->27|62->31|62->31|62->31|63->32|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|64->33|66->35|68->37|69->38|69->38|69->38|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|75->44|75->44|75->44|79->48|79->48|79->48|80->49|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|83->52|85->54|86->55|87->56
                  -- GENERATED --
              */
          