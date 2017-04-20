
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object myOrders_Scope0 {
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

class myOrders extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.shopping.ShopOrder],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(orders: List[models.shopping.ShopOrder], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.68*/("""
"""),_display_(/*2.2*/main("My Orders", user)/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""


    """),format.raw/*5.5*/("""<div class="container " id="content">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center" id="user-order-display">
            <div class="row">
                <a href = """"),_display_(/*8.29*/routes/*8.35*/.HomeController.myOrders()),format.raw/*8.61*/("""" class="btn btn-success btn-lg" id="user-order-button">
                    <span class="glyphicon glyphicon-calendar"></span>My Orders
                </a>

                <a href = """"),_display_(/*12.29*/routes/*12.35*/.HomeController.updateDetails()),format.raw/*12.66*/("""" class="btn btn-success btn-lg" id="user-account-button">
                    <span class="glyphicon glyphicon-user"></span>Update Details
                </a>


                <a href = """"),_display_(/*17.29*/routes/*17.35*/.LoginController.deleteAccountPage()),format.raw/*17.71*/("""" type="button" class="btn btn-success btn-lg" id="user-delete-button">
                    <span class="glyphicon glyphicon-trash"></span>Delete Account
                </a>

                <a href = """"),_display_(/*21.29*/routes/*21.35*/.HomeController.reportProblem()),format.raw/*21.66*/("""" type="button" class="btn btn-success btn-lg" id="user-problem-button">
                    <span class="glyphicon glyphicon-envelope"></span>Report problem
                </a>

                <hr>
            </div>
        </div>
        <hr>

        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="user-order-display">
            <div class="row">
        <h2 class="greentext text-center">Order History</h2>
        """),_display_(/*33.10*/if(orders.size < 1)/*33.29*/ {_display_(Seq[Any](format.raw/*33.31*/("""
            """),format.raw/*34.13*/("""<h3 class="text-center"> No orders have been placed on this account yet.</h3>
        """)))}),format.raw/*35.10*/("""
        """),_display_(/*36.10*/if(orders.size > 0)/*36.29*/ {_display_(Seq[Any](format.raw/*36.31*/("""
            """),format.raw/*37.13*/("""<table class="table table-repsonsive table-bordered">
                <thead>
                    <tr>
                        <th class="greentext">Order #</th>
                        <th class="greentext">Date</th>
                        <th class="greentext">Total</th>
                        <th class="greentext">Order Status</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*47.18*/for(o <- orders) yield /*47.34*/ {_display_(Seq[Any](format.raw/*47.36*/("""
                    """),format.raw/*48.21*/("""<tr>
                        <td>"""),_display_(/*49.30*/o/*49.31*/.getId),format.raw/*49.37*/("""</td>
                        <td>"""),_display_(/*50.30*/o/*50.31*/.getOrderDate),format.raw/*50.44*/("""</td>
                        <td>€"""),_display_(/*51.31*/("%.2f".format(o.getOrderTotal))),format.raw/*51.63*/("""</td>
                        """),_display_(/*52.26*/if(o.isProccessed == true)/*52.52*/{_display_(Seq[Any](format.raw/*52.53*/("""
                            """),format.raw/*53.29*/("""<td>Your order has been <strong>Processed <span class="glyphicon glyphicon-thumbs-up"></span></strong></td>
                        """)))}),format.raw/*54.26*/("""
                        """),_display_(/*55.26*/if(o.isProccessed == false)/*55.53*/{_display_(Seq[Any](format.raw/*55.54*/("""
                            """),format.raw/*56.29*/("""<td>Order has been <strong>received</strong> and will be processed soon <span class="glyphicon glyphicon-hourglass"></span></td>
                        """)))}),format.raw/*57.26*/("""
                    """),format.raw/*58.21*/("""</tr>

                    """),_display_(/*60.22*/for(i <- o.getItems) yield /*60.42*/ {_display_(Seq[Any](format.raw/*60.44*/("""
                        """),format.raw/*61.25*/("""<td>Tickets : """),_display_(/*61.40*/i/*61.41*/.getQuantity),format.raw/*61.53*/(""" """),format.raw/*61.54*/("""x €"""),_display_(/*61.58*/("%.2f".format(i.getPrice))),format.raw/*61.85*/(""" """),_display_(/*61.87*/i/*61.88*/.getTicket.getEvent.getEventName),format.raw/*61.120*/(""" """),format.raw/*61.121*/("""- """),_display_(/*61.124*/i/*61.125*/.getTicket.getTicketType),format.raw/*61.149*/("""</td>

                    """)))}),format.raw/*63.22*/("""

                """),format.raw/*65.17*/("""</tbody>
                """)))}),format.raw/*66.18*/("""
            """),format.raw/*67.13*/("""</table>
        """)))}),format.raw/*68.10*/("""
          """),format.raw/*69.11*/("""</div>
    </div>

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
object myOrders extends myOrders_Scope0.myOrders
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 14:13:33 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/account/myOrders.scala.html
                  HASH: 38a5917f7e01ec54e00eb6513bf5cac6e4c2ccdd
                  MATRIX: 802->1|963->67|991->70|1022->93|1061->95|1097->105|1320->302|1334->308|1380->334|1598->525|1613->531|1665->562|1888->758|1903->764|1960->800|2195->1008|2210->1014|2262->1045|2736->1492|2764->1511|2804->1513|2846->1527|2965->1615|3003->1626|3031->1645|3071->1647|3113->1661|3581->2102|3613->2118|3653->2120|3703->2142|3765->2177|3775->2178|3802->2184|3865->2220|3875->2221|3909->2234|3973->2271|4026->2303|4085->2335|4120->2361|4159->2362|4217->2392|4382->2526|4436->2553|4472->2580|4511->2581|4569->2611|4755->2766|4805->2788|4862->2818|4898->2838|4938->2840|4992->2866|5034->2881|5044->2882|5077->2894|5106->2895|5137->2899|5185->2926|5214->2928|5224->2929|5278->2961|5308->2962|5339->2965|5350->2966|5396->2990|5457->3020|5505->3040|5563->3067|5605->3081|5655->3100|5695->3112
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|52->21|52->21|52->21|64->33|64->33|64->33|65->34|66->35|67->36|67->36|67->36|68->37|78->47|78->47|78->47|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|83->52|83->52|83->52|84->53|85->54|86->55|86->55|86->55|87->56|88->57|89->58|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|94->63|96->65|97->66|98->67|99->68|100->69
                  -- GENERATED --
              */
          