
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
                    <span class="glyphicon glyphicon-user"></span>Update Details
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
                  DATE: Fri Apr 21 12:03:38 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/account/deleteAccount.scala.html
                  HASH: 9665af9f02885f5bedd7d87800ada3355dd0c7cd
                  MATRIX: 780->1|900->26|927->28|963->56|1002->58|1035->65|1255->259|1269->265|1315->291|1529->478|1544->484|1596->515|1814->706|1829->712|1886->748|2117->952|2132->958|2184->989|2487->1265|2502->1271|2557->1305|2785->1506|2800->1512|2848->1539|3008->1669
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|40->9|40->9|40->9|44->13|44->13|44->13|49->18|49->18|49->18|53->22|53->22|53->22|60->29|60->29|60->29|64->33|64->33|64->33|71->40
                  -- GENERATED --
              */
          