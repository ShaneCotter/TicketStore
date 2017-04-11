
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object deleteAccount_Scope0 {
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

class deleteAccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Delete Account", user)/*2.30*/ {_display_(Seq[Any](format.raw/*2.32*/("""


    """),format.raw/*5.5*/("""<div class="container text-center" id="content">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="user-order-display">
            <div class="row">
                <h1>My Account</h1>

                <a href = """"),_display_(/*10.29*/routes/*10.35*/.HomeController.myOrders()),format.raw/*10.61*/("""" class="btn btn-success btn-lg" id="user-order-button">
                    <span class="glyphicon glyphicon-calendar"></span>My Orders
                </a>

                <button type="button" class="btn btn-success btn-lg" id="user-account-button">
                    <span class="glyphicon glyphicon-user"></span>Change Password
                </button>


                <a href = """"),_display_(/*19.29*/routes/*19.35*/.LoginController.deleteAccountPage()),format.raw/*19.71*/("""" type="button" class="btn btn-success btn-lg" id="user-delete-button">
                    <span class="glyphicon glyphicon-trash"></span>Delete Account
                </a>

                <a href = """"),_display_(/*23.29*/routes/*23.35*/.HomeController.reportProblem()),format.raw/*23.66*/("""" type="button" class="btn btn-success btn-lg" id="user-problem-button">
                    <span class="glyphicon glyphicon-envelope"></span>Report problem
                </a>

<hr>

        <h2>Are you sure you want to delete your account ?</h2>
                <a href=""""),_display_(/*30.27*/routes/*30.33*/.LoginController.deleteMyAccount()),format.raw/*30.67*/("""" class="btn btn-danger btn-lg whitetext" id="user-delete-button">
                    <span class="glyphicon glyphicon-trash"></span> Delete my account
                </a>

                <a href=""""),_display_(/*34.27*/routes/*34.33*/.HomeController.myAccount()),format.raw/*34.60*/("""" class="btn btn-success btn-lg" id="user-delete-button">
                     Cancel
                </a>

</div>
</div>
</div>
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object deleteAccount extends deleteAccount_Scope0.deleteAccount
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 23:43:49 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/account/deleteAccount.scala.html
                  HASH: 1b2f37dfd3856effd874e78d5d04582efce1af14
                  MATRIX: 780->1|900->26|928->29|964->57|1003->59|1039->69|1301->304|1316->310|1363->336|1791->737|1806->743|1863->779|2098->987|2113->993|2165->1024|2475->1307|2490->1313|2545->1347|2777->1552|2792->1558|2840->1585|3007->1722
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|41->10|41->10|41->10|50->19|50->19|50->19|54->23|54->23|54->23|61->30|61->30|61->30|65->34|65->34|65->34|72->41
                  -- GENERATED --
              */
          