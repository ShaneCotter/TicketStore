
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
        """),_display_(/*9.10*/if(flash.containsKey("success"))/*9.42*/ {_display_(Seq[Any](format.raw/*9.44*/("""
            """),format.raw/*10.13*/("""<div class="alert alert-success text-center">
            """),_display_(/*11.14*/flash/*11.19*/.get("success")),format.raw/*11.34*/("""
            """),format.raw/*12.13*/("""</div>
        """)))}),format.raw/*13.10*/("""
        """),_display_(/*14.10*/if(flash.containsKey("danger"))/*14.41*/ {_display_(Seq[Any](format.raw/*14.43*/("""
            """),format.raw/*15.13*/("""<div class="alert alert-danger text-center">
            """),_display_(/*16.14*/flash/*16.19*/.get("danger")),format.raw/*16.33*/("""
            """),format.raw/*17.13*/("""</div>
        """)))}),format.raw/*18.10*/("""

        """),format.raw/*20.9*/("""<div class="row">
            <h1 class="greentext">Sign up</h1>
            <div class="col-lg-12 well" id="signup">

            """),_display_(/*24.14*/form(action = routes.HomeController.signUpSubmit(), 'class -> "form-horizontal", 'role -> "form")/*24.111*/ {_display_(Seq[Any](format.raw/*24.113*/("""
                """),_display_(/*25.18*/inputText(addUserForm("email"), '_label -> "Email", 'type -> "email", 'class -> "form-control")),format.raw/*25.113*/("""
                """),_display_(/*26.18*/inputText(addUserForm("name"), '_label -> "Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*26.113*/("""
                """),_display_(/*27.18*/inputPassword(addUserForm("password"), '_label -> "Password", 'class -> "form-control", 'maxlength -> "30")),format.raw/*27.125*/("""
                """),format.raw/*28.17*/("""<div class="actions">
                    <input type="submit" value="Sign Up" class="btn btn-success">
                </div>
            """)))}),format.raw/*31.14*/("""
            """),format.raw/*32.13*/("""</div>
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
                  DATE: Thu Apr 20 16:05:39 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/signUp.scala.html
                  HASH: a7321d0c23f267edd8ad9b898e8756ba818a5710
                  MATRIX: 827->21|985->84|1015->89|1044->110|1083->112|1117->120|1220->197|1260->229|1299->231|1341->245|1428->305|1442->310|1478->325|1520->339|1568->356|1606->367|1646->398|1686->400|1728->414|1814->473|1828->478|1863->492|1905->506|1953->523|1992->535|2155->671|2262->768|2303->770|2349->789|2466->884|2512->903|2629->998|2675->1017|2804->1124|2850->1142|3024->1285|3066->1299
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|52->20|56->24|56->24|56->24|57->25|57->25|58->26|58->26|59->27|59->27|60->28|63->31|64->32
                  -- GENERATED --
              */
          