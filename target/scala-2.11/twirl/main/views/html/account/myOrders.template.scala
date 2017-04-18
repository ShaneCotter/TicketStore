
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
                        <th class="greentext">Order Status</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*47.18*/for(o <- orders) yield /*47.34*/ {_display_(Seq[Any](format.raw/*47.36*/("""
                    """),format.raw/*48.21*/("""<tr>
                        <td>"""),_display_(/*49.30*/o/*49.31*/.getId),format.raw/*49.37*/("""</td>
                        <td>"""),_display_(/*50.30*/o/*50.31*/.getOrderDate),format.raw/*50.44*/("""</td>
                        <td>"""),_display_(/*51.30*/o/*51.31*/.getOrderTotal),format.raw/*51.45*/("""</td>
                        """),_display_(/*52.26*/if(o.isProccessed == true)/*52.52*/{_display_(Seq[Any](format.raw/*52.53*/("""
                            """),format.raw/*53.29*/("""<td>Your order has been <strong>Proccessed</strong></td>
                        """)))}),format.raw/*54.26*/("""
                        """),_display_(/*55.26*/if(o.isProccessed == false)/*55.53*/{_display_(Seq[Any](format.raw/*55.54*/("""
                            """),format.raw/*56.29*/("""<td>Order has been <strong>received</strong> and will be proccessed soon !</td>
                        """)))}),format.raw/*57.26*/("""
                    """),format.raw/*58.21*/("""</tr>

                    """),_display_(/*60.22*/for(i <- o.getItems) yield /*60.42*/ {_display_(Seq[Any](format.raw/*60.44*/("""
                        """),format.raw/*61.25*/("""<td>Tickets : """),_display_(/*61.40*/i/*61.41*/.getQuantity),format.raw/*61.53*/(""" """),format.raw/*61.54*/("""x €"""),_display_(/*61.58*/i/*61.59*/.getPrice),format.raw/*61.68*/(""" """),_display_(/*61.70*/i/*61.71*/.getTicket.getEvent.getEventName),format.raw/*61.103*/(""" """),format.raw/*61.104*/("""- """),_display_(/*61.107*/i/*61.108*/.getTicket.getTicketType),format.raw/*61.132*/("""</td>

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
                  DATE: Tue Apr 18 11:45:57 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/account/myOrders.scala.html
                  HASH: d863c91e72dbb1f899d0bed15c6d7653d43656e2
                  MATRIX: 802->1|963->67|990->69|1021->92|1060->94|1093->101|1313->295|1327->301|1373->327|1587->514|1602->520|1654->551|1873->743|1888->749|1945->785|2176->989|2191->995|2243->1026|2705->1461|2733->1480|2773->1482|2814->1495|2932->1582|2969->1592|2997->1611|3037->1613|3078->1626|3536->2057|3568->2073|3608->2075|3657->2096|3718->2130|3728->2131|3755->2137|3817->2172|3827->2173|3861->2186|3923->2221|3933->2222|3968->2236|4026->2267|4061->2293|4100->2294|4157->2323|4270->2405|4323->2431|4359->2458|4398->2459|4455->2488|4591->2593|4640->2614|4695->2642|4731->2662|4771->2664|4824->2689|4866->2704|4876->2705|4909->2717|4938->2718|4969->2722|4979->2723|5009->2732|5038->2734|5048->2735|5102->2767|5132->2768|5163->2771|5174->2772|5220->2796|5279->2824|5325->2842|5382->2868|5423->2881|5472->2899|5511->2910
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|52->21|52->21|52->21|64->33|64->33|64->33|65->34|66->35|67->36|67->36|67->36|68->37|78->47|78->47|78->47|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|84->53|85->54|86->55|86->55|86->55|87->56|88->57|89->58|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|94->63|96->65|97->66|98->67|99->68|100->69
                  -- GENERATED --
              */
          