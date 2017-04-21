
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
        """),_display_(/*6.10*/if(flash.containsKey("success"))/*6.42*/ {_display_(Seq[Any](format.raw/*6.44*/("""
            """),format.raw/*7.13*/("""<div class="alert alert-success text-center">
            """),_display_(/*8.14*/flash/*8.19*/.get("success")),format.raw/*8.34*/("""
            """),format.raw/*9.13*/("""</div>
        """)))}),format.raw/*10.10*/("""
        """),_display_(/*11.10*/if(flash.containsKey("danger"))/*11.41*/ {_display_(Seq[Any](format.raw/*11.43*/("""
            """),format.raw/*12.13*/("""<div class="alert alert-danger text-center">
            """),_display_(/*13.14*/flash/*13.19*/.get("danger")),format.raw/*13.33*/("""
            """),format.raw/*14.13*/("""</div>
        """)))}),format.raw/*15.10*/("""
        """),format.raw/*16.9*/("""<h2>Registered Users</h2>
        <div class="row omb_row-sm-offset-3">
            <table class="table table-responsive table-bordered">
                <thead>
                    <tr>

                        <th class="greentext">Email</th>
                        <th class="greentext">Name</th>
                        <th class="greentext">Role</th>
                        <th class="greentext">Password</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*30.18*/for(u <- u) yield /*30.29*/ {_display_(Seq[Any](format.raw/*30.31*/("""
                    """),format.raw/*31.21*/("""<tr>
                        <td>"""),_display_(/*32.30*/u/*32.31*/.getEmail),format.raw/*32.40*/("""</td>
                        <td>"""),_display_(/*33.30*/u/*33.31*/.getName),format.raw/*33.39*/("""</td>
                        <td>"""),_display_(/*34.30*/u/*34.31*/.getRole),format.raw/*34.39*/("""</td>
                        <td type="password">"""),_display_(/*35.46*/u/*35.47*/.getPassword),format.raw/*35.59*/("""</td>
                        """),_display_(/*36.26*/if(u.getEmail != user.getEmail)/*36.57*/ {_display_(Seq[Any](format.raw/*36.59*/("""
                            """),format.raw/*37.29*/("""<td><a href=""""),_display_(/*37.43*/routes/*37.49*/.HomeController.deleteUser(u.getEmail)),format.raw/*37.87*/("""" class="btn btn-danger btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-trash"></span> Delete account
                            </a></td>
                        """)))}/*40.26*/else/*40.30*/{_display_(Seq[Any](format.raw/*40.31*/("""
                            """),format.raw/*41.29*/("""<td><button class="btn btn-success btn-sm whitetext" id="user-delete-button">
                                <span class="glyphicon glyphicon-thumbs-up"></span> Logged In
                            </button></td>
                        """)))}),format.raw/*44.26*/("""
                    """),format.raw/*45.21*/("""</tr>
                """)))}),format.raw/*46.18*/("""
                """),format.raw/*47.17*/("""</tbody>
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
                  DATE: Fri Apr 21 12:03:38 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/viewAccount.scala.html
                  HASH: 7db3a8562ce23d07d9736b4708d1e34c01dac2b5
                  MATRIX: 798->1|946->54|974->57|1004->79|1043->81|1074->86|1175->161|1215->193|1254->195|1294->208|1379->267|1392->272|1427->287|1467->300|1514->316|1551->326|1591->357|1631->359|1672->372|1757->430|1771->435|1806->449|1847->462|1894->478|1930->487|2500->1030|2527->1041|2567->1043|2616->1064|2677->1098|2687->1099|2717->1108|2779->1143|2789->1144|2818->1152|2880->1187|2890->1188|2919->1196|2997->1247|3007->1248|3040->1260|3098->1291|3138->1322|3178->1324|3235->1353|3276->1367|3291->1373|3350->1411|3594->1636|3607->1640|3646->1641|3703->1670|3974->1910|4023->1931|4077->1954|4122->1971
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|46->15|47->16|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|71->40|71->40|71->40|72->41|75->44|76->45|77->46|78->47
                  -- GENERATED --
              */
          