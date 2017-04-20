
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateDetails_Scope0 {
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

     object updateDetails_Scope1 {
import helper._

class updateDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(accountForm: Form[models.users.User],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.64*/("""
"""),_display_(/*4.2*/main("Update Account", user)/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""


    """),format.raw/*7.5*/("""<div class="container " id="content">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center" id="user-order-display">
            <div class="row">
                <a href = """"),_display_(/*10.29*/routes/*10.35*/.HomeController.myOrders()),format.raw/*10.61*/("""" class="btn btn-success btn-lg" id="user-order-button">
                    <span class="glyphicon glyphicon-calendar"></span>My Orders
                </a>

                <a href = """"),_display_(/*14.29*/routes/*14.35*/.HomeController.updateDetails()),format.raw/*14.66*/("""" class="btn btn-success btn-lg" id="user-account-button">
                    <span class="glyphicon glyphicon-user"></span>Update Details
                </a>


                <a href = """"),_display_(/*19.29*/routes/*19.35*/.LoginController.deleteAccountPage()),format.raw/*19.71*/("""" type="button" class="btn btn-success btn-lg" id="user-delete-button">
                    <span class="glyphicon glyphicon-trash"></span>Delete Account
                </a>

                <a href = """"),_display_(/*23.29*/routes/*23.35*/.HomeController.reportProblem()),format.raw/*23.66*/("""" type="button" class="btn btn-success btn-lg" id="user-problem-button">
                    <span class="glyphicon glyphicon-envelope"></span>Report problem
                </a>

                <hr>
            </div>
            </div>

        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="user-order-display">
            <div class="row">

            """),_display_(/*34.14*/form(action = routes.HomeController.updateDetailsSubmit(), 'method -> "POST", 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*34.172*/ {_display_(Seq[Any](format.raw/*34.174*/("""
                """),_display_(/*35.18*/inputText(accountForm("email"), '_label -> "Email", 'class -> "form-control", 'maxlength -> "30", 'readonly -> "readonly")),format.raw/*35.140*/("""
                """),_display_(/*36.18*/inputText(accountForm("name"), '_label -> "Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*36.113*/("""
                """),_display_(/*37.18*/inputText(accountForm("password"), '_label -> "Email", 'type -> "password", 'class -> "form-control")),format.raw/*37.119*/("""
                """),format.raw/*38.17*/("""<label>Profile Image</label>
                <input type="file" name="upload1">
                <br>
                """),_display_(/*41.18*/inputText(accountForm("role"), '_label -> "", 'hidden -> "hidden")),format.raw/*41.84*/("""

                """),format.raw/*43.17*/("""<div class="actions">
                    <input type="submit" value="Submit" class="btn btn-success">
                    <a href=""""),_display_(/*45.31*/routes/*45.37*/.HomeController.contact()),format.raw/*45.62*/("""" class="btn btn-danger">Cancel</a>

                </div>
            """)))}),format.raw/*48.14*/("""

        """),format.raw/*50.9*/("""</div>
    </div>
    </div>

""")))}))
      }
    }
  }

  def render(accountForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(accountForm,user)

  def f:((Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (accountForm,user) => apply(accountForm,user)

  def ref: this.type = this

}


}
}

/**/
object updateDetails extends updateDetails_Scope0.updateDetails_Scope1.updateDetails
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 14:13:33 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/account/updateDetails.scala.html
                  HASH: 63067993fadef9980dc4a7d5f5fff4a2f284b11e
                  MATRIX: 856->21|1013->83|1041->86|1077->114|1116->116|1152->126|1376->323|1391->329|1438->355|1656->546|1671->552|1723->583|1946->779|1961->785|2018->821|2253->1029|2268->1035|2320->1066|2728->1447|2896->1605|2937->1607|2983->1626|3127->1748|3173->1767|3290->1862|3336->1881|3459->1982|3505->2000|3653->2121|3740->2187|3788->2207|3950->2342|3965->2348|4011->2373|4118->2449|4157->2461
                  LINES: 30->3|35->3|36->4|36->4|36->4|39->7|42->10|42->10|42->10|46->14|46->14|46->14|51->19|51->19|51->19|55->23|55->23|55->23|66->34|66->34|66->34|67->35|67->35|68->36|68->36|69->37|69->37|70->38|73->41|73->41|75->43|77->45|77->45|77->45|80->48|82->50
                  -- GENERATED --
              */
          