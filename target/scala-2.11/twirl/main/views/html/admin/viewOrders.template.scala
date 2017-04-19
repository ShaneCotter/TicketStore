
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
                                    <td>€"""),_display_(/*39.43*/("%.2f".format(o.getOrderTotal))),format.raw/*39.75*/("""</td>
                                    <td>Received</td>
                                    <td class="col-sm-1"><a href=""""),_display_(/*41.68*/routes/*41.74*/.HomeController.markAsProccessed(o.getId, true)),format.raw/*41.121*/("""" class="btn btn-danger btn-sm whitetext" id="user-delete-button">
                                        <span class="glyphicon glyphicon-ok"></span> Mark as processed
                                    </a></td>
                                </tr>
                                """),_display_(/*45.34*/for(i <- o.getItems) yield /*45.54*/ {_display_(Seq[Any](format.raw/*45.56*/("""
                                    """),format.raw/*46.37*/("""<tr>
                                        <td>Tickets : """),_display_(/*47.56*/i/*47.57*/.getQuantity),format.raw/*47.69*/(""" """),format.raw/*47.70*/("""x €"""),_display_(/*47.74*/("%.2f".format(i.getPrice))),format.raw/*47.101*/(""" """),_display_(/*47.103*/i/*47.104*/.getTicket.getEvent.getEventName),format.raw/*47.136*/(""" """),format.raw/*47.137*/("""- """),_display_(/*47.140*/i/*47.141*/.getTicket.getTicketType),format.raw/*47.165*/("""</td>
                                    </tr>
                                """)))}),format.raw/*49.34*/("""

                            """)))}),format.raw/*51.30*/("""
                            """),_display_(/*52.30*/if(o.isProccessed == true)/*52.56*/ {_display_(Seq[Any](format.raw/*52.58*/("""
                                """),format.raw/*53.33*/("""<tr class = "success">
                                    <td>#"""),_display_(/*54.43*/o/*54.44*/.getId),format.raw/*54.50*/("""</td>
                                    <td>"""),_display_(/*55.42*/o/*55.43*/.getOrderDate),format.raw/*55.56*/("""</td>
                                    <td>€"""),_display_(/*56.43*/("%.2f".format(o.getOrderTotal))),format.raw/*56.75*/("""</td>
                                    <td>Processed</td>
                                    <td class="col-sm-1"><a href=""""),_display_(/*58.68*/routes/*58.74*/.HomeController.markAsProccessed(o.getId, true)),format.raw/*58.121*/("""" class="btn btn-success btn-sm whitetext" id="user-delete-button">
                                        <span class="glyphicon glyphicon-ok"></span> Order Processed
                                    </a></td>
                                </tr>
                                """),_display_(/*62.34*/for(i <- o.getItems) yield /*62.54*/ {_display_(Seq[Any](format.raw/*62.56*/("""
                                    """),format.raw/*63.37*/("""<tr>
                                        <td>Tickets : """),_display_(/*64.56*/i/*64.57*/.getQuantity),format.raw/*64.69*/(""" """),format.raw/*64.70*/("""x €"""),_display_(/*64.74*/("%.2f".format(i.getPrice))),format.raw/*64.101*/(""" """),_display_(/*64.103*/i/*64.104*/.getTicket.getEvent.getEventName),format.raw/*64.136*/(""" """),format.raw/*64.137*/("""- """),_display_(/*64.140*/i/*64.141*/.getTicket.getTicketType),format.raw/*64.165*/("""</td>
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
                  DATE: Wed Apr 19 12:18:46 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/viewOrders.scala.html
                  HASH: fe5268779a4e8097723c035624e888a8c489c486
                  MATRIX: 804->1|965->67|993->70|1025->94|1064->96|1095->101|1759->738|1787->757|1826->758|1875->779|2286->1159|2335->1181|2364->1201|2404->1203|2458->1230|2490->1246|2530->1248|2587->1278|2623->1305|2663->1307|2724->1340|2815->1404|2825->1405|2852->1411|2926->1458|2936->1459|2970->1472|3045->1520|3098->1552|3252->1679|3267->1685|3336->1732|3650->2019|3686->2039|3726->2041|3791->2078|3878->2138|3888->2139|3921->2151|3950->2152|3981->2156|4030->2183|4060->2185|4071->2186|4125->2218|4155->2219|4186->2222|4197->2223|4243->2247|4355->2328|4417->2359|4474->2389|4509->2415|4549->2417|4610->2450|4702->2515|4712->2516|4739->2522|4813->2569|4823->2570|4857->2583|4932->2631|4985->2663|5140->2791|5155->2797|5224->2844|5537->3130|5573->3150|5613->3152|5678->3189|5765->3249|5775->3250|5808->3262|5837->3263|5868->3267|5917->3294|5947->3296|5958->3297|6012->3329|6042->3330|6073->3333|6084->3334|6130->3358|6242->3439|6304->3470|6361->3496|6414->3518|6459->3535
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|51->20|51->20|51->20|52->21|62->31|63->32|63->32|63->32|65->34|65->34|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|72->41|72->41|72->41|76->45|76->45|76->45|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|80->49|82->51|83->52|83->52|83->52|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|89->58|89->58|89->58|93->62|93->62|93->62|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|97->66|99->68|100->69|101->70|102->71
                  -- GENERATED --
              */
          