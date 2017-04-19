
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signUp_Scope0 {
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

     object signUp_Scope1 {
import helper._

class signUp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(addUserForm: Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.65*/("""

"""),_display_(/*5.2*/main("Sign Up", user)/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""

    """),format.raw/*7.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="content">

        <div class="row">
            <h1 class="greentext">Sign up</h1>
            <div class="col-lg-12 well" id="signup">

            """),_display_(/*14.14*/form(action = routes.HomeController.signUpSubmit(), 'class -> "form-horizontal", 'role -> "form")/*14.111*/ {_display_(Seq[Any](format.raw/*14.113*/("""
                """),_display_(/*15.18*/inputText(addUserForm("email"), '_label -> "Email", 'type -> "email", 'class -> "form-control")),format.raw/*15.113*/("""
                """),_display_(/*16.18*/inputText(addUserForm("name"), '_label -> "Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*16.113*/("""
                """),_display_(/*17.18*/inputPassword(addUserForm("password"), '_label -> "Password", 'class -> "form-control", 'maxlength -> "30")),format.raw/*17.125*/("""
                """),format.raw/*18.17*/("""<div class="actions">
                    <input type="submit" value="Sign Up" class="btn btn-success">
                </div>
            """)))}),format.raw/*21.14*/("""
            """),format.raw/*22.13*/("""</div>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(addUserForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addUserForm,user)

  def f:((Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addUserForm,user) => apply(addUserForm,user)

  def ref: this.type = this

}


}
}

/**/
object signUp extends signUp_Scope0.signUp_Scope1.signUp
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 12:18:45 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/signUp.scala.html
                  HASH: 1adcdde86746199a182d3102b4f145d91e8f5ffa
                  MATRIX: 827->19|985->82|1013->85|1042->106|1081->108|1113->114|1347->321|1454->418|1495->420|1540->438|1657->533|1702->551|1819->646|1864->664|1993->771|2038->788|2209->928|2250->941
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|46->14|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|50->18|53->21|54->22
                  -- GENERATED --
              */
          