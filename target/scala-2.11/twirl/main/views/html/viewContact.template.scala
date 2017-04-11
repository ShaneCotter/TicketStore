
package views.html

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

"""),_display_(/*3.2*/main("viewContact",user)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
"""),format.raw/*4.1*/("""<!--..CONTENT..-->
<div class="container-fluid" id="content">
<h2>Customer Contacts</h2>
<div class="row omb_row-sm-offset-3">
              <table class="table">
                  <thead>
                      <tr>
                          <th class="greentext">Firstname</th>
                          <th class="greentext">Lastname</th>
                          <th class="greentext">Email</th>
                          <th class="greentext">Phone</th>
                          <th class="greentext">Message</th>
                      </tr>
                  </thead>
                  <tbody>
                      """),_display_(/*19.24*/for(c <- contacts) yield /*19.42*/{_display_(Seq[Any](format.raw/*19.43*/("""
                      """),format.raw/*20.23*/("""<tr>
                          <td>"""),_display_(/*21.32*/c/*21.33*/.getFirstName),format.raw/*21.46*/("""</td>
                          <td>"""),_display_(/*22.32*/c/*22.33*/.getLastName),format.raw/*22.45*/("""</td>
                          <td>"""),_display_(/*23.32*/c/*23.33*/.getEmail),format.raw/*23.42*/("""</td>
                          <td>"""),_display_(/*24.32*/c/*24.33*/.getPhone),format.raw/*24.42*/("""</td>
                          <td>"""),_display_(/*25.32*/c/*25.33*/.getMessage),format.raw/*25.44*/("""</td>
                      </tr>
                        """)))}),format.raw/*27.26*/("""
                  """),format.raw/*28.19*/("""</tbody>
              </table>
    <br>
    <br>
          </div>


      </div>
<!--END CONTENT-->

""")))}),format.raw/*38.2*/("""
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
                  DATE: Tue Apr 11 13:34:24 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/viewContact.scala.html
                  HASH: 395c4faa7b97b5f91541829831155db41f030616
                  MATRIX: 789->1|941->58|969->61|1001->85|1040->87|1067->88|1718->712|1752->730|1791->731|1842->754|1905->790|1915->791|1949->804|2013->841|2023->842|2056->854|2120->891|2130->892|2160->901|2224->938|2234->939|2264->948|2328->985|2338->986|2370->997|2460->1056|2507->1075|2640->1178
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|58->27|59->28|69->38
                  -- GENERATED --
              */
          