
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


    """),format.raw/*5.5*/("""<div class="container" id="content">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center" id="user-order-display">
            <div class="row">

                <a href = """"),_display_(/*9.29*/routes/*9.35*/.HomeController.myOrders()),format.raw/*9.61*/("""" class="btn btn-success btn-lg" id="user-order-button">
                    <span class="glyphicon glyphicon-calendar"></span>My Orders
                </a>

                <a href = """"),_display_(/*13.29*/routes/*13.35*/.HomeController.updateDetails()),format.raw/*13.66*/("""" class="btn btn-success btn-lg" id="user-account-button">
                    <span class="glyphicon glyphicon-user"></span>Change Password
                </a>


                <a href = """"),_display_(/*18.29*/routes/*18.35*/.LoginController.deleteAccountPage()),format.raw/*18.71*/("""" type="button" class="btn btn-success btn-lg" id="user-delete-button">
                    <span class="glyphicon glyphicon-trash"></span>Delete Account
                </a>

                <a href = """"),_display_(/*22.29*/routes/*22.35*/.HomeController.reportProblem()),format.raw/*22.66*/("""" type="button" class="btn btn-success btn-lg" id="user-problem-button">
                    <span class="glyphicon glyphicon-envelope"></span>Report problem
                </a>

<hr>

        <h2>Are you sure you want to delete your account ?</h2>
                <a href=""""),_display_(/*29.27*/routes/*29.33*/.LoginController.deleteMyAccount()),format.raw/*29.67*/("""" class="btn btn-danger btn-lg whitetext" id="user-delete-button">
                    <span class="glyphicon glyphicon-trash"></span> Delete my account
                </a>

                <a href=""""),_display_(/*33.27*/routes/*33.33*/.HomeController.myAccount()),format.raw/*33.60*/("""" class="btn btn-success btn-lg" id="user-delete-button">
                     Cancel
                </a>

</div>
</div>
</div>
""")))}),format.raw/*40.2*/("""
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
                  DATE: Tue Apr 18 13:50:32 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/account/deleteAccount.scala.html
                  HASH: e7f94829adc18dc1092f765e25378277b641d3de
                  MATRIX: 780->1|900->26|928->29|964->57|1003->59|1039->69|1263->267|1277->273|1323->299|1541->490|1556->496|1608->527|1832->724|1847->730|1904->766|2139->974|2154->980|2206->1011|2516->1294|2531->1300|2586->1334|2818->1539|2833->1545|2881->1572|3048->1709
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|40->9|40->9|40->9|44->13|44->13|44->13|49->18|49->18|49->18|53->22|53->22|53->22|60->29|60->29|60->29|64->33|64->33|64->33|71->40
                  -- GENERATED --
              */
          