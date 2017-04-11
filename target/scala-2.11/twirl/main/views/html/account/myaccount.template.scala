
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object myaccount_Scope0 {
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

class myaccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("My Orders", user)/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""


    """),format.raw/*5.5*/("""<div class="container text-center" id="content">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="user-order-display">
            <div class="row">
                <h1>My Account</h1>
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
            </div>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object myaccount extends myaccount_Scope0.myaccount
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 23:43:49 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/account/myaccount.scala.html
                  HASH: 4e64e6c9bac93e8cf757335bc6ffe545c536a6b3
                  MATRIX: 772->1|892->26|920->29|951->52|990->54|1026->64|1285->297|1299->303|1345->329|1563->520|1578->526|1630->557|1854->754|1869->760|1926->796|2161->1004|2176->1010|2228->1041
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|40->9|40->9|40->9|44->13|44->13|44->13|49->18|49->18|49->18|53->22|53->22|53->22
                  -- GENERATED --
              */
          