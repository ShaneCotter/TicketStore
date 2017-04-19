
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object viewAccount_Scope0 {
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

class viewAccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(u: List[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""

"""),_display_(/*3.2*/main("Accounts", user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
    """),format.raw/*4.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="content">
        <h2>Registered Users</h2>
        <div class="row omb_row-sm-offset-3">
            <table class="table table-responsive table-bordered">
                <thead>
                    <tr>
                        <th class="greentext">Email</th>
                        <th class="greentext">Name</th>
                        <th class="greentext">Password</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*18.18*/for(u <- u) yield /*18.29*/ {_display_(Seq[Any](format.raw/*18.31*/("""
                    """),format.raw/*19.21*/("""<tr>
                        <td>"""),_display_(/*20.30*/u/*20.31*/.getEmail),format.raw/*20.40*/("""</td>
                        <td>"""),_display_(/*21.30*/u/*21.31*/.getName),format.raw/*21.39*/("""</td>
                        <td type="password">"""),_display_(/*22.46*/u/*22.47*/.getPassword),format.raw/*22.59*/("""</td>
                        """),_display_(/*23.26*/if(u.getEmail != user.getEmail)/*23.57*/ {_display_(Seq[Any](format.raw/*23.59*/("""
                            """),format.raw/*24.29*/("""<td><a href=""""),_display_(/*24.43*/routes/*24.49*/.HomeController.deleteUser(u.getEmail)),format.raw/*24.87*/("""" class="btn btn-danger btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-trash"></span> Delete account
                            </a></td>
                        """)))}/*27.26*/else/*27.30*/{_display_(Seq[Any](format.raw/*27.31*/("""
                            """),format.raw/*28.29*/("""<td><button class="btn btn-success btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-thumbs-up"></span> Logged In
                            </button></td>
                        """)))}),format.raw/*31.26*/("""
                    """),format.raw/*32.21*/("""</tr>
                """)))}),format.raw/*33.18*/("""
                """),format.raw/*34.17*/("""</tbody>
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

  def render(u:List[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(u,user)

  def f:((List[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (u,user) => apply(u,user)

  def ref: this.type = this

}


}

/**/
object viewAccount extends viewAccount_Scope0.viewAccount
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 10:22:27 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/viewAccount.scala.html
                  HASH: 3425b634817d8d4f2ff9f155e201a7c47406a81f
                  MATRIX: 798->1|946->54|974->57|1004->79|1043->81|1074->86|1661->646|1688->657|1728->659|1777->680|1838->714|1848->715|1878->724|1940->759|1950->760|1979->768|2057->819|2067->820|2100->832|2158->863|2198->894|2238->896|2295->925|2336->939|2351->945|2410->983|2654->1208|2667->1212|2706->1213|2763->1242|3034->1482|3083->1503|3137->1526|3182->1543
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|55->24|58->27|58->27|58->27|59->28|62->31|63->32|64->33|65->34
                  -- GENERATED --
              */
          