
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
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*18.18*/for(o <- orders) yield /*18.34*/ {_display_(Seq[Any](format.raw/*18.36*/("""
                    """),_display_(/*19.22*/if(o.isProccessed == false)/*19.49*/ {_display_(Seq[Any](format.raw/*19.51*/("""
                        """),format.raw/*20.25*/("""<tr class = "danger">
                            <td>#"""),_display_(/*21.35*/o/*21.36*/.getId),format.raw/*21.42*/("""</td>
                            <td>"""),_display_(/*22.34*/o/*22.35*/.getOrderDate),format.raw/*22.48*/("""</td>
                            <td>"""),_display_(/*23.34*/o/*23.35*/.getOrderTotal),format.raw/*23.49*/("""</td>
                            <td class="col-sm-1"><a href=""""),_display_(/*24.60*/routes/*24.66*/.HomeController.markAsProccessed(o.getId,true)),format.raw/*24.112*/("""" class="btn btn-danger btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-ok"></span> Mark as proccessed
                            </a></td>
                            </tr>
                            """),_display_(/*28.30*/for(i <- o.getItems) yield /*28.50*/ {_display_(Seq[Any](format.raw/*28.52*/("""
                                """),format.raw/*29.33*/("""<tr>
                                <td>Tickets : """),_display_(/*30.48*/i/*30.49*/.getQuantity),format.raw/*30.61*/(""" """),format.raw/*30.62*/("""x €"""),_display_(/*30.66*/i/*30.67*/.getPrice),format.raw/*30.76*/(""" """),_display_(/*30.78*/i/*30.79*/.getTicket.getEvent.getEventName),format.raw/*30.111*/(""" """),format.raw/*30.112*/("""- """),_display_(/*30.115*/i/*30.116*/.getTicket.getTicketType),format.raw/*30.140*/("""</td>
                                </tr>
                            """)))}),format.raw/*32.30*/("""

                    """)))}),format.raw/*34.22*/("""
                    """),_display_(/*35.22*/if(o.isProccessed == true)/*35.48*/{_display_(Seq[Any](format.raw/*35.49*/("""
                        """),format.raw/*36.25*/("""<tr class = "success">
                            <td>#"""),_display_(/*37.35*/o/*37.36*/.getId),format.raw/*37.42*/("""</td>
                            <td>"""),_display_(/*38.34*/o/*38.35*/.getOrderDate),format.raw/*38.48*/("""</td>
                            <td>"""),_display_(/*39.34*/o/*39.35*/.getOrderTotal),format.raw/*39.49*/("""</td>
                            <td class="col-sm-1"><a href=""""),_display_(/*40.60*/routes/*40.66*/.HomeController.markAsProccessed(o.getId,true)),format.raw/*40.112*/("""" class="btn btn-success btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-ok"></span> Order is proccessed
                            </a></td>
                        </tr>
                            """),_display_(/*44.30*/for(i <- o.getItems) yield /*44.50*/ {_display_(Seq[Any](format.raw/*44.52*/("""
                                """),format.raw/*45.33*/("""<tr>
                                <td>Tickets : """),_display_(/*46.48*/i/*46.49*/.getQuantity),format.raw/*46.61*/(""" """),format.raw/*46.62*/("""x €"""),_display_(/*46.66*/i/*46.67*/.getPrice),format.raw/*46.76*/(""" """),_display_(/*46.78*/i/*46.79*/.getTicket.getEvent.getEventName),format.raw/*46.111*/(""" """),format.raw/*46.112*/("""- """),_display_(/*46.115*/i/*46.116*/.getTicket.getTicketType),format.raw/*46.140*/("""</td>
                                </tr>
                            """)))}),format.raw/*48.30*/("""

                    """)))}),format.raw/*50.22*/("""
                """)))}),format.raw/*51.18*/("""
                """),format.raw/*52.17*/("""</tbody>
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
                  DATE: Wed Apr 12 13:58:04 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/viewOrders.scala.html
                  HASH: 582da8d5e630f6fc7f3452972e222f8921cbba2b
                  MATRIX: 804->1|965->67|993->70|1025->94|1064->96|1095->101|1647->626|1679->642|1719->644|1768->666|1804->693|1844->695|1897->720|1980->776|1990->777|2017->783|2083->822|2093->823|2127->836|2193->875|2203->876|2238->890|2330->955|2345->961|2413->1007|2704->1271|2740->1291|2780->1293|2841->1326|2920->1378|2930->1379|2963->1391|2992->1392|3023->1396|3033->1397|3063->1406|3092->1408|3102->1409|3156->1441|3186->1442|3217->1445|3228->1446|3274->1470|3378->1543|3432->1566|3481->1588|3516->1614|3555->1615|3608->1640|3692->1697|3702->1698|3729->1704|3795->1743|3805->1744|3839->1757|3905->1796|3915->1797|3950->1811|4042->1876|4057->1882|4125->1928|4414->2190|4450->2210|4490->2212|4551->2245|4630->2297|4640->2298|4673->2310|4702->2311|4733->2315|4743->2316|4773->2325|4802->2327|4812->2328|4866->2360|4896->2361|4927->2364|4938->2365|4984->2389|5088->2462|5142->2485|5191->2503|5236->2520
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|49->18|49->18|49->18|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|59->28|59->28|59->28|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|63->32|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|75->44|75->44|75->44|76->45|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|79->48|81->50|82->51|83->52
                  -- GENERATED --
              */
          