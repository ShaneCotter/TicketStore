
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),_display_(/*3.2*/main("Log in", user)/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<!--..CONTENT..-->
    """),_display_(/*5.6*/if(flash.containsKey("success"))/*5.38*/ {_display_(Seq[Any](format.raw/*5.40*/("""
        """),format.raw/*6.9*/("""<div class="alert alert-success">
        """),_display_(/*7.10*/flash/*7.15*/.get("success")),format.raw/*7.30*/("""
        """)))}),format.raw/*8.10*/("""
    """),format.raw/*9.5*/("""<div class="container-fluid" id="content">
        <h2>Login or <a href =""""),_display_(/*10.33*/routes/*10.39*/.HomeController.signUp()),format.raw/*10.63*/("""">Sign Up</a></h2>
        <div class="row omb_row-sm-offset-3">
            <div class="col-xs-12 col-sm-6">

                <form class="omb_loginForm" action=""""),_display_(/*14.54*/routes/*14.60*/.LoginController.loginSubmit),format.raw/*14.88*/("""" name ="loginForm" method = "POST">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-user"></i></span>
                        <input type="text" class="form-control" type="email" name="email" placeholder="Email Address">
                    </div>
                    <span class="help-block"></span>

                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                        <input type="password" class="form-control" name="password" placeholder="Password">
                    </div>
                    <br>
                    <button class="btn btn-lg btn-success btn-block" type="submit">
                        Login        <i class="glyphicon glyphicon-thumbs-up"></i></button>
                </form>

            </div>
        </div>
        <div class="row omb_row-sm-offset-3">
            <div class="col-xs-12 col-sm-3">
                <br>
                <br>
            </div>
        </div>
    </div>
        <!--END CONTENT-->

""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[models.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Fri Apr 14 10:44:00 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/login.scala.html
                  HASH: 9cae75f7492de09c25fdc62fa79b0478ae0803d3
                  MATRIX: 775->1|926->57|956->62|984->82|1023->84|1055->90|1105->115|1145->147|1184->149|1220->159|1290->203|1303->208|1338->223|1379->234|1411->240|1514->316|1529->322|1574->346|1769->514|1784->520|1833->548|3001->1686
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|41->10|41->10|41->10|45->14|45->14|45->14|72->41
                  -- GENERATED --
              */
          