
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
                  DATE: Fri Apr 21 12:03:38 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/viewContact.scala.html
                  HASH: a3e0be7772ce689e4f89d13759825ebe07c387ce
                  MATRIX: 795->1|947->58|975->61|1008->86|1047->88|1078->93|1787->775|1821->793|1861->795|1910->817|1940->838|1980->840|2033->865|2115->920|2125->921|2159->934|2225->973|2235->974|2268->986|2334->1025|2344->1026|2374->1035|2440->1074|2450->1075|2480->1084|2546->1123|2556->1124|2588->1135|2680->1200|2695->1206|2757->1246|3041->1499|3090->1521|3119->1541|3158->1542|3211->1567|3294->1623|3304->1624|3338->1637|3404->1676|3414->1677|3447->1689|3513->1728|3523->1729|3553->1738|3619->1777|3629->1778|3659->1787|3725->1826|3735->1827|3767->1838|3859->1903|3874->1909|3937->1950|4224->2206|4273->2224|4318->2241|4469->2362
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|51->20|51->20|51->20|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|63->32|64->33|64->33|64->33|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|75->44|76->45|77->46|87->56
                  -- GENERATED --
              */
          