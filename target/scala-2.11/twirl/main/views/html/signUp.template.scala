
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
                <form action=""""),_display_(/*12.32*/routes/*12.38*/.HomeController.signUpSubmit()),format.raw/*12.68*/("""" name = "addUserForm">
                    <input type="text" name = "email" placeholder="Email">
                    <input type="text" name = "name" placeholder="Name">
                    <input type="password" name = "password" placeholder="Password">
                    <div class="actions">
                        <input type="submit" value="Sign Up" class="btn btn-success">
                    </div>
                </form>
            </div>
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
                  DATE: Thu Apr 06 13:09:04 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/signUp.scala.html
                  HASH: e68964ecc0f7f625ca6609f0e7c8d70c6a961698
                  MATRIX: 827->21|985->84|1015->89|1043->109|1082->111|1116->119|1325->301|1340->307|1391->337
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|44->12|44->12|44->12
                  -- GENERATED --
              */
          