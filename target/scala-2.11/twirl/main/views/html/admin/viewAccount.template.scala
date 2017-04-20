
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
        """),_display_(/*6.10*/if(flash.containsKey("warning"))/*6.42*/ {_display_(Seq[Any](format.raw/*6.44*/("""
            """),format.raw/*7.13*/("""<div class="alert alert-warning text-center">
            """),_display_(/*8.14*/flash/*8.19*/.get("warning")),format.raw/*8.34*/("""
            """),format.raw/*9.13*/("""</div>
        """)))}),format.raw/*10.10*/("""
        """),format.raw/*11.9*/("""<h2>Registered Users</h2>
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
                """),_display_(/*23.18*/for(u <- u) yield /*23.29*/ {_display_(Seq[Any](format.raw/*23.31*/("""
                    """),format.raw/*24.21*/("""<tr>
                        <td>"""),_display_(/*25.30*/u/*25.31*/.getEmail),format.raw/*25.40*/("""</td>
                        <td>"""),_display_(/*26.30*/u/*26.31*/.getName),format.raw/*26.39*/("""</td>
                        <td type="password">"""),_display_(/*27.46*/u/*27.47*/.getPassword),format.raw/*27.59*/("""</td>
                        """),_display_(/*28.26*/if(u.getEmail != user.getEmail)/*28.57*/ {_display_(Seq[Any](format.raw/*28.59*/("""
                            """),format.raw/*29.29*/("""<td><a href=""""),_display_(/*29.43*/routes/*29.49*/.HomeController.deleteUser(u.getEmail)),format.raw/*29.87*/("""" class="btn btn-danger btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-trash"></span> Delete account
                            </a></td>
                        """)))}/*32.26*/else/*32.30*/{_display_(Seq[Any](format.raw/*32.31*/("""
                            """),format.raw/*33.29*/("""<td><button class="btn btn-success btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-thumbs-up"></span> Logged In
                            </button></td>
                        """)))}),format.raw/*36.26*/("""
                    """),format.raw/*37.21*/("""</tr>
                """)))}),format.raw/*38.18*/("""
                """),format.raw/*39.17*/("""</tbody>
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
                  DATE: Thu Apr 20 11:32:04 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/viewAccount.scala.html
                  HASH: a17ecd5505e40f68525b46a43da1f31b4c455752
                  MATRIX: 798->1|946->54|974->57|1004->79|1043->81|1074->86|1175->161|1215->193|1254->195|1294->208|1379->267|1392->272|1427->287|1467->300|1514->316|1550->325|2063->811|2090->822|2130->824|2179->845|2240->879|2250->880|2280->889|2342->924|2352->925|2381->933|2459->984|2469->985|2502->997|2560->1028|2600->1059|2640->1061|2697->1090|2738->1104|2753->1110|2812->1148|3056->1373|3069->1377|3108->1378|3165->1407|3436->1647|3485->1668|3539->1691|3584->1708
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|42->11|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|60->29|63->32|63->32|63->32|64->33|67->36|68->37|69->38|70->39
                  -- GENERATED --
              */
          