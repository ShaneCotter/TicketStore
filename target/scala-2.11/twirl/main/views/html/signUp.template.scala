
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

"""),_display_(/*5.2*/main("Sign Up",user)/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""

    """),format.raw/*7.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="content">

        <div class="row">
            <h1 class="greentext">Sign up</h1>
            <div class="col-lg-12 well" id="signup">

            """),_display_(/*14.14*/form(action = routes.HomeController.signUpSubmit(), 'class -> "form-horizontal",'role->"form")/*14.108*/{_display_(Seq[Any](format.raw/*14.109*/("""
                """),_display_(/*15.18*/inputText(addUserForm("email"), '_label -> "Email", 'type -> "email", 'class -> "form-control")),format.raw/*15.113*/("""
                """),_display_(/*16.18*/inputText(addUserForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*16.93*/("""
                """),_display_(/*17.18*/inputPassword(addUserForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*17.105*/("""
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
                  DATE: Mon Apr 10 13:24:46 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/signUp.scala.html
                  HASH: 527c45551b11564b402113607f1c0c1e669cc168
                  MATRIX: 827->19|985->82|1013->85|1041->105|1080->107|1112->113|1346->320|1450->414|1490->415|1535->433|1652->528|1697->546|1793->621|1838->639|1947->726|1992->743|2163->883|2204->896
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|46->14|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|50->18|53->21|54->22
                  -- GENERATED --
              */
          