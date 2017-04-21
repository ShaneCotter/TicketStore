
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
                  DATE: Fri Apr 21 12:03:38 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/account/myOrders.scala.html
                  HASH: 678718e3a0cf7828076d9cb207238a28cd906c75
                  MATRIX: 802->1|963->67|990->69|1021->92|1060->94|1093->101|1313->295|1327->301|1373->327|1587->514|1602->520|1654->551|1872->742|1887->748|1944->784|2175->988|2190->994|2242->1025|2704->1460|2732->1479|2772->1481|2813->1494|2931->1581|2968->1591|2996->1610|3036->1612|3077->1625|3535->2056|3567->2072|3607->2074|3656->2095|3717->2129|3727->2130|3754->2136|3816->2171|3826->2172|3860->2185|3923->2221|3976->2253|4034->2284|4069->2310|4108->2311|4165->2340|4329->2473|4382->2499|4418->2526|4457->2527|4514->2556|4699->2710|4748->2731|4803->2759|4839->2779|4879->2781|4932->2806|4974->2821|4984->2822|5017->2834|5046->2835|5077->2839|5125->2866|5154->2868|5164->2869|5218->2901|5248->2902|5279->2905|5290->2906|5336->2930|5395->2958|5441->2976|5498->3002|5539->3015|5588->3033|5627->3044
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|52->21|52->21|52->21|64->33|64->33|64->33|65->34|66->35|67->36|67->36|67->36|68->37|78->47|78->47|78->47|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|83->52|83->52|83->52|84->53|85->54|86->55|86->55|86->55|87->56|88->57|89->58|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|94->63|96->65|97->66|98->67|99->68|100->69
                  -- GENERATED --
              */
          