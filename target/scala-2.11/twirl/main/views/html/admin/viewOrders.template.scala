
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
                  DATE: Thu Apr 20 15:05:27 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admin/viewOrders.scala.html
                  HASH: acc2668b48622ce6a56ac76748b429d1fb581bfb
                  MATRIX: 804->1|965->67|995->72|1027->96|1066->98|1098->104|1835->814|1863->833|1902->834|1952->856|2373->1246|2423->1269|2452->1289|2492->1291|2548->1320|2580->1336|2620->1338|2678->1369|2714->1396|2754->1398|2816->1432|2908->1497|2918->1498|2945->1504|3020->1552|3030->1553|3068->1570|3143->1618|3153->1619|3187->1632|3263->1681|3316->1713|3472->1842|3487->1848|3556->1895|3874->2186|3910->2206|3950->2208|4016->2246|4104->2307|4114->2308|4147->2320|4176->2321|4207->2325|4256->2352|4286->2354|4297->2355|4351->2387|4381->2388|4412->2391|4423->2392|4469->2416|4583->2499|4647->2532|4705->2563|4740->2589|4780->2591|4842->2625|4935->2691|4945->2692|4972->2698|5047->2746|5057->2747|5095->2764|5170->2812|5180->2813|5214->2826|5290->2875|5343->2907|5500->3037|5515->3043|5584->3090|5901->3380|5937->3400|5977->3402|6043->3440|6131->3501|6141->3502|6174->3514|6203->3515|6234->3519|6283->3546|6313->3548|6324->3549|6378->3581|6408->3582|6439->3585|6450->3586|6496->3610|6610->3693|6674->3726|6732->3753|6786->3776|6832->3794
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|52->21|52->21|52->21|53->22|63->32|64->33|64->33|64->33|66->35|66->35|66->35|67->36|67->36|67->36|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|74->43|74->43|74->43|78->47|78->47|78->47|79->48|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|82->51|84->53|85->54|85->54|85->54|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|92->61|92->61|92->61|96->65|96->65|96->65|97->66|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|100->69|102->71|103->72|104->73|105->74
                  -- GENERATED --
              */
          