
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
                    <span class="glyphicon glyphicon-user"></span>Update Details
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
                  DATE: Wed Apr 19 12:40:01 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/account/myaccount.scala.html
                  HASH: 98ed7ce2819b898294ec9060be0c7e0a53387e32
                  MATRIX: 793->1|940->53|967->55|999->79|1038->81|1071->88|1349->339|1364->345|1411->371|1625->558|1640->564|1692->595|1910->786|1925->792|1982->828|2213->1032|2228->1038|2280->1069|2574->1336|2660->1413|2701->1415|2754->1440|2849->1508|2895->1532|2939->1558|2952->1563|2991->1564|3044->1589|3185->1699|3234->1720|3323->1782|3336->1786|3365->1794|3481->1883|3494->1887|3524->1896|3639->1984|3652->1988|3681->1996
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|41->10|41->10|41->10|45->14|45->14|45->14|50->19|50->19|50->19|54->23|54->23|54->23|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|65->34|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37
                  -- GENERATED --
              */
          