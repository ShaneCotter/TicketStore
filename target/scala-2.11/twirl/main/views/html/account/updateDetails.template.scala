
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


    """),format.raw/*7.5*/("""<div class="container text-center" id="content">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="user-order-display">
            <div class="row">
                <h1>My Account</h1>
                <a href = """"),_display_(/*11.29*/routes/*11.35*/.HomeController.myOrders()),format.raw/*11.61*/("""" class="btn btn-success btn-lg" id="user-order-button">
                    <span class="glyphicon glyphicon-calendar"></span>My Orders
                </a>

                <button type="button" class="btn btn-success btn-lg" id="user-account-button">
                    <span class="glyphicon glyphicon-user"></span>Change Password
                </button>


                <a href = """"),_display_(/*20.29*/routes/*20.35*/.LoginController.deleteAccountPage()),format.raw/*20.71*/("""" type="button" class="btn btn-success btn-lg" id="user-delete-button">
                    <span class="glyphicon glyphicon-trash"></span>Delete Account
                </a>

                <a href = """"),_display_(/*24.29*/routes/*24.35*/.HomeController.reportProblem()),format.raw/*24.66*/("""" type="button" class="btn btn-success btn-lg" id="user-problem-button">
                    <span class="glyphicon glyphicon-envelope"></span>Report problem
                </a>

                <hr>
            </div>

            """),_display_(/*31.14*/form(action = routes.HomeController.updateDetailsSubmit(), 'method -> "POST", 'class -> "form-horizontal", 'role -> "form")/*31.137*/ {_display_(Seq[Any](format.raw/*31.139*/("""
                """),_display_(/*32.18*/inputText(accountForm("email"), '_label -> "Email", 'class -> "form-control", 'maxlength -> "30", 'readonly -> "readonly")),format.raw/*32.140*/("""
                """),_display_(/*33.18*/inputText(accountForm("name"), '_label -> "Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*33.113*/("""
                """),_display_(/*34.18*/inputText(accountForm("password"), '_label -> "Email", 'type -> "password", 'class -> "form-control")),format.raw/*34.119*/("""
                """),_display_(/*35.18*/inputText(accountForm("role"), '_label -> "", 'hidden -> "hidden")),format.raw/*35.84*/("""

                """),format.raw/*37.17*/("""<div class="actions">
                    <input type="submit" value="Submit" class="btn btn-success">
                    <a href=""""),_display_(/*39.31*/routes/*39.37*/.HomeController.contact()),format.raw/*39.62*/("""" class="btn btn-danger">Cancel</a>

                </div>
            """)))}),format.raw/*42.14*/("""

        """),format.raw/*44.9*/("""</div>
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
                  DATE: Tue Apr 11 23:49:30 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/account/updateDetails.scala.html
                  HASH: e239985a05a28d930cfc120155edee9f94228caa
                  MATRIX: 856->21|1013->83|1041->86|1077->114|1116->116|1152->126|1412->359|1427->365|1474->391|1902->792|1917->798|1974->834|2209->1042|2224->1048|2276->1079|2544->1320|2677->1443|2718->1445|2764->1464|2908->1586|2954->1605|3071->1700|3117->1719|3240->1820|3286->1839|3373->1905|3421->1925|3583->2060|3598->2066|3644->2091|3751->2167|3790->2179
                  LINES: 30->3|35->3|36->4|36->4|36->4|39->7|43->11|43->11|43->11|52->20|52->20|52->20|56->24|56->24|56->24|63->31|63->31|63->31|64->32|64->32|65->33|65->33|66->34|66->34|67->35|67->35|69->37|71->39|71->39|71->39|74->42|76->44
                  -- GENERATED --
              */
          