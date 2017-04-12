
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
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*17.18*/for(u <- u) yield /*17.29*/ {_display_(Seq[Any](format.raw/*17.31*/("""
                    """),format.raw/*18.21*/("""<tr>
                        <td>"""),_display_(/*19.30*/u/*19.31*/.getEmail),format.raw/*19.40*/("""</td>
                        <td>"""),_display_(/*20.30*/u/*20.31*/.getName),format.raw/*20.39*/("""</td>
                        <td type="password">"""),_display_(/*21.46*/u/*21.47*/.getPassword),format.raw/*21.59*/("""</td>
                        """),_display_(/*22.26*/if(u.getEmail != user.getEmail)/*22.57*/ {_display_(Seq[Any](format.raw/*22.59*/("""
                            """),format.raw/*23.29*/("""<td><a href=""""),_display_(/*23.43*/routes/*23.49*/.HomeController.deleteUser(u.getEmail)),format.raw/*23.87*/("""" class="btn btn-danger btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-trash"></span> Delete account
                            </a></td>
                        """)))}/*26.26*/else/*26.30*/{_display_(Seq[Any](format.raw/*26.31*/("""
                            """),format.raw/*27.29*/("""<td><button class="btn btn-success btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-thumbs-up"></span> Logged In
                            </button></td>
                        """)))}),format.raw/*30.26*/("""
                    """),format.raw/*31.21*/("""</tr>
                """)))}),format.raw/*32.18*/("""
                """),format.raw/*33.17*/("""</tbody>
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
                  DATE: Wed Apr 12 11:59:51 IST 2017
                  SOURCE: /home/wdd/webapps/projectBackup/app/views/admin/viewAccount.scala.html
                  HASH: 8fb2522cb74dc082c7167922e39d11a8d5838a73
                  MATRIX: 798->1|946->54|974->57|1004->79|1043->81|1074->86|1627->612|1654->623|1694->625|1743->646|1804->680|1814->681|1844->690|1906->725|1916->726|1945->734|2023->785|2033->786|2066->798|2124->829|2164->860|2204->862|2261->891|2302->905|2317->911|2376->949|2620->1174|2633->1178|2672->1179|2729->1208|3000->1448|3049->1469|3103->1492|3148->1509
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|57->26|57->26|57->26|58->27|61->30|62->31|63->32|64->33
                  -- GENERATED --
              */
          