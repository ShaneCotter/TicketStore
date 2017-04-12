
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
                    <span class="glyphicon glyphicon-user"></span>Change Password
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

            """),_display_(/*34.14*/form(action = routes.HomeController.updateDetailsSubmit(), 'method -> "POST", 'class -> "form-horizontal", 'role -> "form")/*34.137*/ {_display_(Seq[Any](format.raw/*34.139*/("""
                """),_display_(/*35.18*/inputText(accountForm("email"), '_label -> "Email", 'class -> "form-control", 'maxlength -> "30", 'readonly -> "readonly")),format.raw/*35.140*/("""
                """),_display_(/*36.18*/inputText(accountForm("name"), '_label -> "Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*36.113*/("""
                """),_display_(/*37.18*/inputText(accountForm("password"), '_label -> "Email", 'type -> "password", 'class -> "form-control")),format.raw/*37.119*/("""
                """),_display_(/*38.18*/inputText(accountForm("role"), '_label -> "", 'hidden -> "hidden")),format.raw/*38.84*/("""

                """),format.raw/*40.17*/("""<div class="actions">
                    <input type="submit" value="Submit" class="btn btn-success">
                    <a href=""""),_display_(/*42.31*/routes/*42.37*/.HomeController.contact()),format.raw/*42.62*/("""" class="btn btn-danger">Cancel</a>

                </div>
            """)))}),format.raw/*45.14*/("""

        """),format.raw/*47.9*/("""</div>
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
                  DATE: Wed Apr 12 12:46:45 IST 2017
                  SOURCE: /home/wdd/webapps/projectBackup/app/views/account/updateDetails.scala.html
                  HASH: c815d8782fe79e7973f96b5e085d5d3a30da3de4
                  MATRIX: 856->19|1013->81|1040->83|1076->111|1115->113|1148->120|1369->314|1384->320|1431->346|1645->533|1660->539|1712->570|1931->762|1946->768|2003->804|2234->1008|2249->1014|2301->1045|2698->1415|2831->1538|2872->1540|2917->1558|3061->1680|3106->1698|3223->1793|3268->1811|3391->1912|3436->1930|3523->1996|3569->2014|3729->2147|3744->2153|3790->2178|3894->2251|3931->2261
                  LINES: 30->3|35->3|36->4|36->4|36->4|39->7|42->10|42->10|42->10|46->14|46->14|46->14|51->19|51->19|51->19|55->23|55->23|55->23|66->34|66->34|66->34|67->35|67->35|68->36|68->36|69->37|69->37|70->38|70->38|72->40|74->42|74->42|74->42|77->45|79->47
                  -- GENERATED --
              */
          