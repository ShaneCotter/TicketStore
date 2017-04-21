
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
                  DATE: Fri Apr 21 12:03:38 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/account/updateDetails.scala.html
                  HASH: 74b00a2d2cb81d69d34136a5003e2e11dbd6619c
                  MATRIX: 856->19|1013->81|1040->83|1076->111|1115->113|1148->120|1369->314|1384->320|1431->346|1645->533|1660->539|1712->570|1930->761|1945->767|2002->803|2233->1007|2248->1013|2300->1044|2697->1414|2865->1572|2906->1574|2951->1592|3095->1714|3140->1732|3257->1827|3302->1845|3425->1946|3470->1963|3615->2081|3702->2147|3748->2165|3908->2298|3923->2304|3969->2329|4073->2402|4110->2412
                  LINES: 30->3|35->3|36->4|36->4|36->4|39->7|42->10|42->10|42->10|46->14|46->14|46->14|51->19|51->19|51->19|55->23|55->23|55->23|66->34|66->34|66->34|67->35|67->35|68->36|68->36|69->37|69->37|70->38|73->41|73->41|75->43|77->45|77->45|77->45|80->48|82->50
                  -- GENERATED --
              */
          