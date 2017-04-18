
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

class myaccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""
"""),_display_(/*2.2*/main("My Account", user)/*2.26*/ {_display_(Seq[Any](format.raw/*2.28*/("""


    """),format.raw/*5.5*/("""<div class="container " id="content">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center" id="user-order-display">
            <div class="row">
                <h1>My Account</h1>
                <hr>
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

                    <div class="thumbnail">
                    """),_display_(/*30.22*/if(env.resource("public/images/profile/" + user.getEmail + ".jpg").isDefined)/*30.99*/ {_display_(Seq[Any](format.raw/*30.101*/("""
                        """),format.raw/*31.25*/("""<img class="img-circle img-responsive" src="/assets/images/profile/"""),_display_(/*31.93*/(user.getEmail + ".jpg")),format.raw/*31.117*/(""""/>
                    """)))}/*32.23*/else/*32.28*/{_display_(Seq[Any](format.raw/*32.29*/("""
                        """),format.raw/*33.25*/("""<img class="img-circle img-responsive" src="/assets/images/profile/noImage.png" alt="" >
                    """)))}),format.raw/*34.22*/("""
                    """),format.raw/*35.21*/("""<h3 class="text-center"><span class="greentext">Name: </span>"""),_display_(/*35.83*/user/*35.87*/.getName),format.raw/*35.95*/("""</h3>
                    <h3 class="text-center"><span class="greentext">Email: </span>"""),_display_(/*36.84*/user/*36.88*/.getEmail),format.raw/*36.97*/("""</h3>
                    <h3 class="text-center"><span class="greentext">Role:</span> """),_display_(/*37.83*/user/*37.87*/.getRole),format.raw/*37.95*/("""</h3>
                    </div>
                </div>
            </div>
        </div>


""")))}))
      }
    }
  }

  def render(user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,env)

  def f:((models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,env) => apply(user,env)

  def ref: this.type = this

}


}

/**/
object myaccount extends myaccount_Scope0.myaccount
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 13:29:57 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/account/myaccount.scala.html
                  HASH: 57d8af551130ed728ee7a3c63e9240bb2b2e272d
                  MATRIX: 793->1|940->53|967->55|999->79|1038->81|1071->88|1349->339|1364->345|1411->371|1625->558|1640->564|1692->595|1911->787|1926->793|1983->829|2214->1033|2229->1039|2281->1070|2575->1337|2661->1414|2702->1416|2755->1441|2850->1509|2896->1533|2940->1559|2953->1564|2992->1565|3045->1590|3186->1700|3235->1721|3324->1783|3337->1787|3366->1795|3482->1884|3495->1888|3525->1897|3640->1985|3653->1989|3682->1997
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|41->10|41->10|41->10|45->14|45->14|45->14|50->19|50->19|50->19|54->23|54->23|54->23|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|65->34|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37
                  -- GENERATED --
              */
          