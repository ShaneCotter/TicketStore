
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


    """),format.raw/*5.5*/("""<div class="container" id="content">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="user-order-display">
            <div class="row">
                <a href = """"),_display_(/*8.29*/routes/*8.35*/.HomeController.myOrders()),format.raw/*8.61*/("""" class="btn btn-success btn-lg" id="user-order-button">
                    <span class="glyphicon glyphicon-calendar"></span>My Orders
                </a>

                <button type="button" class="btn btn-success btn-lg" id="user-account-button">
                    <span class="glyphicon glyphicon-user"></span>Change Password
                </button>


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

        <h2 class="greentext text-center">Order History</h2>
        """),_display_(/*31.10*/if(orders.size < 1)/*31.29*/ {_display_(Seq[Any](format.raw/*31.31*/("""
            """),format.raw/*32.13*/("""<h3 class="text-center"> No orders have been placed on this account yet.</h3>
        """)))}),format.raw/*33.10*/("""
        """),_display_(/*34.10*/if(orders.size > 0)/*34.29*/ {_display_(Seq[Any](format.raw/*34.31*/("""
            """),format.raw/*35.13*/("""<table class="table table-condensed">
                <thead>
                    <tr>
                        <th>Order #</th>
                        <th>Date</th>
                        <th>Total</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*44.18*/for(o <- orders) yield /*44.34*/ {_display_(Seq[Any](format.raw/*44.36*/("""
                    """),format.raw/*45.21*/("""<tr>
                        <td>#"""),_display_(/*46.31*/o/*46.32*/.getId),format.raw/*46.38*/("""</td>
                        <td>"""),_display_(/*47.30*/o/*47.31*/.getOrderDate),format.raw/*47.44*/("""</td>
                        <td>"""),_display_(/*48.30*/o/*48.31*/.getOrderTotal),format.raw/*48.45*/("""</td>
                    </tr>

                    """),_display_(/*51.22*/for(i <- o.getItems) yield /*51.42*/ {_display_(Seq[Any](format.raw/*51.44*/("""
                        """),format.raw/*52.25*/("""<td>Tickets : """),_display_(/*52.40*/i/*52.41*/.getQuantity),format.raw/*52.53*/(""" """),format.raw/*52.54*/("""x €"""),_display_(/*52.58*/i/*52.59*/.getPrice),format.raw/*52.68*/(""" """),_display_(/*52.70*/i/*52.71*/.getTicket.getEvent.getEventName),format.raw/*52.103*/(""" """),format.raw/*52.104*/("""- """),_display_(/*52.107*/i/*52.108*/.getTicket.getTicketType),format.raw/*52.132*/("""</td>

                    """)))}),format.raw/*54.22*/("""

                """),format.raw/*56.17*/("""</tbody>
                """)))}),format.raw/*57.18*/("""
            """),format.raw/*58.13*/("""</table>
        """)))}),format.raw/*59.10*/("""
    """),format.raw/*60.5*/("""</div>

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
                  DATE: Tue Apr 11 23:43:49 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/account/myOrders.scala.html
                  HASH: aa30c51a28d0756ac728586d964501bce3437d0a
                  MATRIX: 802->1|963->67|991->70|1022->93|1061->95|1097->105|1307->289|1321->295|1367->321|1795->722|1810->728|1867->764|2102->972|2117->978|2169->1009|2525->1338|2553->1357|2593->1359|2635->1373|2754->1461|2792->1472|2820->1491|2860->1493|2902->1507|3235->1813|3267->1829|3307->1831|3357->1853|3420->1889|3430->1890|3457->1896|3520->1932|3530->1933|3564->1946|3627->1982|3637->1983|3672->1997|3756->2054|3792->2074|3832->2076|3886->2102|3928->2117|3938->2118|3971->2130|4000->2131|4031->2135|4041->2136|4071->2145|4100->2147|4110->2148|4164->2180|4194->2181|4225->2184|4236->2185|4282->2209|4343->2239|4391->2259|4449->2286|4491->2300|4541->2319|4574->2325
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|39->8|39->8|39->8|48->17|48->17|48->17|52->21|52->21|52->21|62->31|62->31|62->31|63->32|64->33|65->34|65->34|65->34|66->35|75->44|75->44|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|85->54|87->56|88->57|89->58|90->59|91->60
                  -- GENERATED --
              */
          