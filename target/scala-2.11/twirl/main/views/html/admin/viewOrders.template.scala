
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
        <h2 class = "greentext">Customer Orders</h2>
        <div class="row omb_row-sm-offset-3">

            <table class="table table-responsive table-bordered">
                <thead>
                    <tr>
                        <th class="greentext">Order #</th>
                        <th class="greentext">User</th>
                        <th class="greentext">Date</th>
                        <th class="greentext">Total</th>
                        <th class="greentext">Status</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*21.18*/if(orders.size < 1)/*21.37*/{_display_(Seq[Any](format.raw/*21.38*/("""
                    """),format.raw/*22.21*/("""<tr class = "danger">
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td class="col-sm-1"></td>
                    </tr>
                </tbody>
            </table>
                    <h3 class="text-center"> No orders have been placed yet.</h3>
                """)))}),format.raw/*32.18*/("""
                    """),_display_(/*33.22*/if(orders.size >= 1)/*33.42*/ {_display_(Seq[Any](format.raw/*33.44*/("""

                        """),_display_(/*35.26*/for(o <- orders) yield /*35.42*/ {_display_(Seq[Any](format.raw/*35.44*/("""
                            """),_display_(/*36.30*/if(o.isProccessed == false)/*36.57*/ {_display_(Seq[Any](format.raw/*36.59*/("""
                                """),format.raw/*37.33*/("""<tr class = "danger">
                                    <td>#"""),_display_(/*38.43*/o/*38.44*/.getId),format.raw/*38.50*/("""</td>
                                    <td>"""),_display_(/*39.42*/o/*39.43*/.getUser.getEmail),format.raw/*39.60*/("""</td>
                                    <td>"""),_display_(/*40.42*/o/*40.43*/.getOrderDate),format.raw/*40.56*/("""</td>
                                    <td>€"""),_display_(/*41.43*/("%.2f".format(o.getOrderTotal))),format.raw/*41.75*/("""</td>
                                    <td>Received</td>
                                    <td class="col-sm-1"><a href=""""),_display_(/*43.68*/routes/*43.74*/.HomeController.markAsProccessed(o.getId, true)),format.raw/*43.121*/("""" class="btn btn-danger btn-sm whitetext" id="user-delete-button">
                                        <span class="glyphicon glyphicon-ok"></span> Mark as processed
                                    </a></td>
                                </tr>
                                """),_display_(/*47.34*/for(i <- o.getItems) yield /*47.54*/ {_display_(Seq[Any](format.raw/*47.56*/("""
                                    """),format.raw/*48.37*/("""<tr>
                                        <td>Tickets : """),_display_(/*49.56*/i/*49.57*/.getQuantity),format.raw/*49.69*/(""" """),format.raw/*49.70*/("""x €"""),_display_(/*49.74*/("%.2f".format(i.getPrice))),format.raw/*49.101*/(""" """),_display_(/*49.103*/i/*49.104*/.getTicket.getEvent.getEventName),format.raw/*49.136*/(""" """),format.raw/*49.137*/("""- """),_display_(/*49.140*/i/*49.141*/.getTicket.getTicketType),format.raw/*49.165*/("""</td>
                                    </tr>
                                """)))}),format.raw/*51.34*/("""

                            """)))}),format.raw/*53.30*/("""
                            """),_display_(/*54.30*/if(o.isProccessed == true)/*54.56*/ {_display_(Seq[Any](format.raw/*54.58*/("""
                                """),format.raw/*55.33*/("""<tr class = "success">
                                    <td>#"""),_display_(/*56.43*/o/*56.44*/.getId),format.raw/*56.50*/("""</td>
                                    <td>"""),_display_(/*57.42*/o/*57.43*/.getUser.getEmail),format.raw/*57.60*/("""</td>
                                    <td>"""),_display_(/*58.42*/o/*58.43*/.getOrderDate),format.raw/*58.56*/("""</td>
                                    <td>€"""),_display_(/*59.43*/("%.2f".format(o.getOrderTotal))),format.raw/*59.75*/("""</td>
                                    <td>Processed</td>
                                    <td class="col-sm-1"><a href=""""),_display_(/*61.68*/routes/*61.74*/.HomeController.markAsProccessed(o.getId, true)),format.raw/*61.121*/("""" class="btn btn-success btn-sm whitetext" id="user-delete-button">
                                        <span class="glyphicon glyphicon-ok"></span> Order Processed
                                    </a></td>
                                </tr>
                                """),_display_(/*65.34*/for(i <- o.getItems) yield /*65.54*/ {_display_(Seq[Any](format.raw/*65.56*/("""
                                    """),format.raw/*66.37*/("""<tr>
                                        <td>Tickets : """),_display_(/*67.56*/i/*67.57*/.getQuantity),format.raw/*67.69*/(""" """),format.raw/*67.70*/("""x €"""),_display_(/*67.74*/("%.2f".format(i.getPrice))),format.raw/*67.101*/(""" """),_display_(/*67.103*/i/*67.104*/.getTicket.getEvent.getEventName),format.raw/*67.136*/(""" """),format.raw/*67.137*/("""- """),_display_(/*67.140*/i/*67.141*/.getTicket.getTicketType),format.raw/*67.165*/("""</td>
                                    </tr>
                                """)))}),format.raw/*69.34*/("""

                            """)))}),format.raw/*71.30*/("""
                        """)))}),format.raw/*72.26*/("""
                    """)))}),format.raw/*73.22*/("""
                """),format.raw/*74.17*/("""</tbody>
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
                  DATE: Fri Apr 21 12:03:38 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/viewOrders.scala.html
                  HASH: 8c9346ae2057bb597e5b4acfa9abce7186a41314
                  MATRIX: 804->1|965->67|993->70|1025->94|1064->96|1095->101|1815->794|1843->813|1882->814|1931->835|2342->1215|2391->1237|2420->1257|2460->1259|2514->1286|2546->1302|2586->1304|2643->1334|2679->1361|2719->1363|2780->1396|2871->1460|2881->1461|2908->1467|2982->1514|2992->1515|3030->1532|3104->1579|3114->1580|3148->1593|3223->1641|3276->1673|3430->1800|3445->1806|3514->1853|3828->2140|3864->2160|3904->2162|3969->2199|4056->2259|4066->2260|4099->2272|4128->2273|4159->2277|4208->2304|4238->2306|4249->2307|4303->2339|4333->2340|4364->2343|4375->2344|4421->2368|4533->2449|4595->2480|4652->2510|4687->2536|4727->2538|4788->2571|4880->2636|4890->2637|4917->2643|4991->2690|5001->2691|5039->2708|5113->2755|5123->2756|5157->2769|5232->2817|5285->2849|5440->2977|5455->2983|5524->3030|5837->3316|5873->3336|5913->3338|5978->3375|6065->3435|6075->3436|6108->3448|6137->3449|6168->3453|6217->3480|6247->3482|6258->3483|6312->3515|6342->3516|6373->3519|6384->3520|6430->3544|6542->3625|6604->3656|6661->3682|6714->3704|6759->3721
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|52->21|52->21|52->21|53->22|63->32|64->33|64->33|64->33|66->35|66->35|66->35|67->36|67->36|67->36|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|74->43|74->43|74->43|78->47|78->47|78->47|79->48|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|82->51|84->53|85->54|85->54|85->54|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|92->61|92->61|92->61|96->65|96->65|96->65|97->66|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|100->69|102->71|103->72|104->73|105->74
                  -- GENERATED --
              */
          