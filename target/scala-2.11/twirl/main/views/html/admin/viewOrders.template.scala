
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
                        <th class="greentext">Date</th>
                        <th class="greentext">Total</th>
                        <th class="greentext">Status</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*20.18*/if(orders.size < 1)/*20.37*/{_display_(Seq[Any](format.raw/*20.38*/("""
                    """),format.raw/*21.21*/("""<tr class = "danger">
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td class="col-sm-1"></td>
                    </tr>
                </tbody>
            </table>
                    <h3 class="text-center"> No orders have been placed yet.</h3>
                """)))}),format.raw/*31.18*/("""
                    """),_display_(/*32.22*/if(orders.size >= 1)/*32.42*/ {_display_(Seq[Any](format.raw/*32.44*/("""

                        """),_display_(/*34.26*/for(o <- orders) yield /*34.42*/ {_display_(Seq[Any](format.raw/*34.44*/("""
                            """),_display_(/*35.30*/if(o.isProccessed == false)/*35.57*/ {_display_(Seq[Any](format.raw/*35.59*/("""
                                """),format.raw/*36.33*/("""<tr class = "danger">
                                    <td>#"""),_display_(/*37.43*/o/*37.44*/.getId),format.raw/*37.50*/("""</td>
                                    <td>"""),_display_(/*38.42*/o/*38.43*/.getOrderDate),format.raw/*38.56*/("""</td>
                                    <td>"""),_display_(/*39.42*/o/*39.43*/.getOrderTotal),format.raw/*39.57*/("""</td>
                                    <td>Received</td>
                                    <td class="col-sm-1"><a href=""""),_display_(/*41.68*/routes/*41.74*/.HomeController.markAsProccessed(o.getId, true)),format.raw/*41.121*/("""" class="btn btn-danger btn-sm whitetext" id="user-delete-button">
                                        <span class="glyphicon glyphicon-ok"></span> Mark as proccessed
                                    </a></td>
                                </tr>
                                """),_display_(/*45.34*/for(i <- o.getItems) yield /*45.54*/ {_display_(Seq[Any](format.raw/*45.56*/("""
                                    """),format.raw/*46.37*/("""<tr>
                                        <td>Tickets : """),_display_(/*47.56*/i/*47.57*/.getQuantity),format.raw/*47.69*/(""" """),format.raw/*47.70*/("""x €"""),_display_(/*47.74*/i/*47.75*/.getPrice),format.raw/*47.84*/(""" """),_display_(/*47.86*/i/*47.87*/.getTicket.getEvent.getEventName),format.raw/*47.119*/(""" """),format.raw/*47.120*/("""- """),_display_(/*47.123*/i/*47.124*/.getTicket.getTicketType),format.raw/*47.148*/("""</td>
                                    </tr>
                                """)))}),format.raw/*49.34*/("""

                            """)))}),format.raw/*51.30*/("""
                            """),_display_(/*52.30*/if(o.isProccessed == true)/*52.56*/ {_display_(Seq[Any](format.raw/*52.58*/("""
                                """),format.raw/*53.33*/("""<tr class = "success">
                                    <td>#"""),_display_(/*54.43*/o/*54.44*/.getId),format.raw/*54.50*/("""</td>
                                    <td>"""),_display_(/*55.42*/o/*55.43*/.getOrderDate),format.raw/*55.56*/("""</td>
                                    <td>"""),_display_(/*56.42*/o/*56.43*/.getOrderTotal),format.raw/*56.57*/("""</td>
                                    <td>Proccessed</td>
                                    <td class="col-sm-1"><a href=""""),_display_(/*58.68*/routes/*58.74*/.HomeController.markAsProccessed(o.getId, true)),format.raw/*58.121*/("""" class="btn btn-success btn-sm whitetext" id="user-delete-button">
                                        <span class="glyphicon glyphicon-ok"></span> Order Proccessed
                                    </a></td>
                                </tr>
                                """),_display_(/*62.34*/for(i <- o.getItems) yield /*62.54*/ {_display_(Seq[Any](format.raw/*62.56*/("""
                                    """),format.raw/*63.37*/("""<tr>
                                        <td>Tickets : """),_display_(/*64.56*/i/*64.57*/.getQuantity),format.raw/*64.69*/(""" """),format.raw/*64.70*/("""x €"""),_display_(/*64.74*/i/*64.75*/.getPrice),format.raw/*64.84*/(""" """),_display_(/*64.86*/i/*64.87*/.getTicket.getEvent.getEventName),format.raw/*64.119*/(""" """),format.raw/*64.120*/("""- """),_display_(/*64.123*/i/*64.124*/.getTicket.getTicketType),format.raw/*64.148*/("""</td>
                                    </tr>
                                """)))}),format.raw/*66.34*/("""

                            """)))}),format.raw/*68.30*/("""
                        """)))}),format.raw/*69.26*/("""
                    """)))}),format.raw/*70.22*/("""
                """),format.raw/*71.17*/("""</tbody>
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
                  DATE: Tue Apr 18 16:14:13 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admin/viewOrders.scala.html
                  HASH: c31add5d8491b8e6653902d7bf0d91c6e07ef090
                  MATRIX: 804->1|965->67|995->72|1027->96|1066->98|1098->104|1778->757|1806->776|1845->777|1895->799|2316->1189|2366->1212|2395->1232|2435->1234|2491->1263|2523->1279|2563->1281|2621->1312|2657->1339|2697->1341|2759->1375|2851->1440|2861->1441|2888->1447|2963->1495|2973->1496|3007->1509|3082->1557|3092->1558|3127->1572|3283->1701|3298->1707|3367->1754|3686->2046|3722->2066|3762->2068|3828->2106|3916->2167|3926->2168|3959->2180|3988->2181|4019->2185|4029->2186|4059->2195|4088->2197|4098->2198|4152->2230|4182->2231|4213->2234|4224->2235|4270->2259|4384->2342|4448->2375|4506->2406|4541->2432|4581->2434|4643->2468|4736->2534|4746->2535|4773->2541|4848->2589|4858->2590|4892->2603|4967->2651|4977->2652|5012->2666|5170->2797|5185->2803|5254->2850|5572->3141|5608->3161|5648->3163|5714->3201|5802->3262|5812->3263|5845->3275|5874->3276|5905->3280|5915->3281|5945->3290|5974->3292|5984->3293|6038->3325|6068->3326|6099->3329|6110->3330|6156->3354|6270->3437|6334->3470|6392->3497|6446->3520|6492->3538
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|51->20|51->20|51->20|52->21|62->31|63->32|63->32|63->32|65->34|65->34|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|72->41|72->41|72->41|76->45|76->45|76->45|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|80->49|82->51|83->52|83->52|83->52|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|89->58|89->58|89->58|93->62|93->62|93->62|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|97->66|99->68|100->69|101->70|102->71
                  -- GENERATED --
              */
          