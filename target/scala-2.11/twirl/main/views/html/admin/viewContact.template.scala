
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object viewContact_Scope0 {
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

class viewContact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Contact],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contacts: List[models.Contact], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/main("viewContact", user)/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
    """),format.raw/*4.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="content">
        <h2>Customer Contacts</h2>
        <div class="row omb_row-sm-offset-3">
            <table class="table table-responsive table-bordered">
                <thead>
                    <tr>
                        <th class="greentext">Firstname</th>
                        <th class="greentext">Lastname</th>
                        <th class="greentext">Email</th>
                        <th class="greentext">Phone</th>
                        <th class="greentext">Message</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*20.18*/for(c <- contacts) yield /*20.36*/ {_display_(Seq[Any](format.raw/*20.38*/("""
                    """),_display_(/*21.22*/if(c.isRead == false)/*21.43*/ {_display_(Seq[Any](format.raw/*21.45*/("""
                        """),format.raw/*22.25*/("""<tr class = "danger">
                            <td>"""),_display_(/*23.34*/c/*23.35*/.getFirstName),format.raw/*23.48*/("""</td>
                            <td>"""),_display_(/*24.34*/c/*24.35*/.getLastName),format.raw/*24.47*/("""</td>
                            <td>"""),_display_(/*25.34*/c/*25.35*/.getEmail),format.raw/*25.44*/("""</td>
                            <td>"""),_display_(/*26.34*/c/*26.35*/.getPhone),format.raw/*26.44*/("""</td>
                            <td>"""),_display_(/*27.34*/c/*27.35*/.getMessage),format.raw/*27.46*/("""</td>
                            <td class="col-sm-1"><a href=""""),_display_(/*28.60*/routes/*28.66*/.HomeController.markAsRead(c.getId,true)),format.raw/*28.106*/("""" class="btn btn-success btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-envelope"></span> Mark as read
                            </a></td>
                        </tr>
                    """)))}),format.raw/*32.22*/("""
                    """),_display_(/*33.22*/if(c.isRead == true)/*33.42*/{_display_(Seq[Any](format.raw/*33.43*/("""
                        """),format.raw/*34.25*/("""<tr class = "success">
                            <td>"""),_display_(/*35.34*/c/*35.35*/.getFirstName),format.raw/*35.48*/("""</td>
                            <td>"""),_display_(/*36.34*/c/*36.35*/.getLastName),format.raw/*36.47*/("""</td>
                            <td>"""),_display_(/*37.34*/c/*37.35*/.getEmail),format.raw/*37.44*/("""</td>
                            <td>"""),_display_(/*38.34*/c/*38.35*/.getPhone),format.raw/*38.44*/("""</td>
                            <td>"""),_display_(/*39.34*/c/*39.35*/.getMessage),format.raw/*39.46*/("""</td>
                            <td class="col-sm-1"><a href=""""),_display_(/*40.60*/routes/*40.66*/.HomeController.markAsRead(c.getId,false)),format.raw/*40.107*/("""" class="btn btn-success btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-envelope"></span> Mark as un-read
                            </a></td>
                        </tr>
                    """)))}),format.raw/*44.22*/("""
                """)))}),format.raw/*45.18*/("""
                """),format.raw/*46.17*/("""</tbody>
            </table>
            <br>
            <br>
        </div>


    </div>
        <!--END CONTENT-->

""")))}),format.raw/*56.2*/("""
"""))
      }
    }
  }

  def render(contacts:List[models.Contact],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(contacts,user)

  def f:((List[models.Contact],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (contacts,user) => apply(contacts,user)

  def ref: this.type = this

}


}

/**/
object viewContact extends viewContact_Scope0.viewContact
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 11:33:36 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admin/viewContact.scala.html
                  HASH: e12b22be828029c08ce0c06b9790248e2d48fcc5
                  MATRIX: 795->1|947->58|977->63|1010->88|1049->90|1081->96|1806->794|1840->812|1880->814|1930->837|1960->858|2000->860|2054->886|2137->942|2147->943|2181->956|2248->996|2258->997|2291->1009|2358->1049|2368->1050|2398->1059|2465->1099|2475->1100|2505->1109|2572->1149|2582->1150|2614->1161|2707->1227|2722->1233|2784->1273|3072->1530|3122->1553|3151->1573|3190->1574|3244->1600|3328->1657|3338->1658|3372->1671|3439->1711|3449->1712|3482->1724|3549->1764|3559->1765|3589->1774|3656->1814|3666->1815|3696->1824|3763->1864|3773->1865|3805->1876|3898->1942|3913->1948|3976->1989|4267->2249|4317->2268|4363->2286|4524->2417
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|51->20|51->20|51->20|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|63->32|64->33|64->33|64->33|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|75->44|76->45|77->46|87->56
                  -- GENERATED --
              */
          