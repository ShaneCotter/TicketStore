
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
                    <span class="glyphicon glyphicon-user"></span>Change Password
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
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*46.18*/for(o <- orders) yield /*46.34*/ {_display_(Seq[Any](format.raw/*46.36*/("""
                    """),format.raw/*47.21*/("""<tr>
                        <td>#"""),_display_(/*48.31*/o/*48.32*/.getId),format.raw/*48.38*/("""</td>
                        <td>"""),_display_(/*49.30*/o/*49.31*/.getOrderDate),format.raw/*49.44*/("""</td>
                        <td>"""),_display_(/*50.30*/o/*50.31*/.getOrderTotal),format.raw/*50.45*/("""</td>
                    </tr>

                    """),_display_(/*53.22*/for(i <- o.getItems) yield /*53.42*/ {_display_(Seq[Any](format.raw/*53.44*/("""
                        """),format.raw/*54.25*/("""<td>Tickets : """),_display_(/*54.40*/i/*54.41*/.getQuantity),format.raw/*54.53*/(""" """),format.raw/*54.54*/("""x €"""),_display_(/*54.58*/i/*54.59*/.getPrice),format.raw/*54.68*/(""" """),_display_(/*54.70*/i/*54.71*/.getTicket.getEvent.getEventName),format.raw/*54.103*/(""" """),format.raw/*54.104*/("""- """),_display_(/*54.107*/i/*54.108*/.getTicket.getTicketType),format.raw/*54.132*/("""</td>

                    """)))}),format.raw/*56.22*/("""

                """),format.raw/*58.17*/("""</tbody>
                """)))}),format.raw/*59.18*/("""
            """),format.raw/*60.13*/("""</table>
        """)))}),format.raw/*61.10*/("""
          """),format.raw/*62.11*/("""</div>
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
                  DATE: Wed Apr 12 12:44:05 IST 2017
                  SOURCE: /home/wdd/webapps/projectBackup/app/views/account/myOrders.scala.html
                  HASH: 16c90c0408d30ae6b30f0c3bd81fd90ec228f9a1
                  MATRIX: 802->1|963->67|990->69|1021->92|1060->94|1093->101|1313->295|1327->301|1373->327|1587->514|1602->520|1654->551|1873->743|1888->749|1945->785|2176->989|2191->995|2243->1026|2705->1461|2733->1480|2773->1482|2814->1495|2932->1582|2969->1592|2997->1611|3037->1613|3078->1626|3472->1993|3504->2009|3544->2011|3593->2032|3655->2067|3665->2068|3692->2074|3754->2109|3764->2110|3798->2123|3860->2158|3870->2159|3905->2173|3986->2227|4022->2247|4062->2249|4115->2274|4157->2289|4167->2290|4200->2302|4229->2303|4260->2307|4270->2308|4300->2317|4329->2319|4339->2320|4393->2352|4423->2353|4454->2356|4465->2357|4511->2381|4570->2409|4616->2427|4673->2453|4714->2466|4763->2484|4802->2495
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|52->21|52->21|52->21|64->33|64->33|64->33|65->34|66->35|67->36|67->36|67->36|68->37|77->46|77->46|77->46|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|87->56|89->58|90->59|91->60|92->61|93->62
                  -- GENERATED --
              */
          