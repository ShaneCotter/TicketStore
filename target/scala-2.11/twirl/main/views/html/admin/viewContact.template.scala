
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
                """),_display_(/*19.18*/for(c <- contacts) yield /*19.36*/ {_display_(Seq[Any](format.raw/*19.38*/("""
                    """),format.raw/*20.21*/("""<tr>
                        <td>"""),_display_(/*21.30*/c/*21.31*/.getFirstName),format.raw/*21.44*/("""</td>
                        <td>"""),_display_(/*22.30*/c/*22.31*/.getLastName),format.raw/*22.43*/("""</td>
                        <td>"""),_display_(/*23.30*/c/*23.31*/.getEmail),format.raw/*23.40*/("""</td>
                        <td>"""),_display_(/*24.30*/c/*24.31*/.getPhone),format.raw/*24.40*/("""</td>
                        <td>"""),_display_(/*25.30*/c/*25.31*/.getMessage),format.raw/*25.42*/("""</td>
                    </tr>
                """)))}),format.raw/*27.18*/("""
                """),format.raw/*28.17*/("""</tbody>
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
                  DATE: Tue Apr 11 23:43:50 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admin/viewContact.scala.html
                  HASH: b40f5b52bb7557bd2c9dfbdf431f4c44a1140426
                  MATRIX: 795->1|947->58|977->63|1010->88|1049->90|1081->96|1739->727|1773->745|1813->747|1863->769|1925->804|1935->805|1969->818|2032->854|2042->855|2075->867|2138->903|2148->904|2178->913|2241->949|2251->950|2281->959|2344->995|2354->996|2386->1007|2468->1058|2514->1076|2675->1207
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|58->27|59->28|69->38
                  -- GENERATED --
              */
          