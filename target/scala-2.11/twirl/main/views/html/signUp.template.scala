
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
            <div class="col-lg-12 well" id="signup">

            """),_display_(/*13.14*/form(action = routes.HomeController.signUpSubmit(), 'class -> "form-horizontal",'role->"form")/*13.108*/{_display_(Seq[Any](format.raw/*13.109*/("""
                """),_display_(/*14.18*/inputText(addUserForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*14.95*/("""
                """),_display_(/*15.18*/inputText(addUserForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*15.93*/("""
                """),_display_(/*16.18*/inputPassword(addUserForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*16.105*/("""
                """),format.raw/*17.17*/("""<div class="actions">
                    <input type="submit" value="Sign Up" class="btn btn-success">
                </div>
            """)))}),format.raw/*20.14*/("""
            """),format.raw/*21.13*/("""</div>
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
                  DATE: Thu Apr 06 16:01:40 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/signUp.scala.html
                  HASH: 1071e4de70cca58e907a151d692803ab73f51620
                  MATRIX: 827->19|985->82|1013->85|1041->105|1080->107|1112->113|1299->273|1403->367|1443->368|1488->386|1586->463|1631->481|1727->556|1772->574|1881->661|1926->678|2097->818|2138->831
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|45->13|45->13|45->13|46->14|46->14|47->15|47->15|48->16|48->16|49->17|52->20|53->21
                  -- GENERATED --
              */
          