
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
        """),format.raw/*8.9*/("""</div>
        """)))}),format.raw/*9.10*/("""
    """),format.raw/*10.5*/("""<div class="container-fluid" id="content">
        <h2>Login or <a href =""""),_display_(/*11.33*/routes/*11.39*/.HomeController.signUp()),format.raw/*11.63*/("""">Sign Up</a></h2>
        <div class="row omb_row-sm-offset-3">
            <div class="col-xs-12 col-sm-6">

                <form class="omb_loginForm" action=""""),_display_(/*15.54*/routes/*15.60*/.LoginController.loginSubmit),format.raw/*15.88*/("""" name ="loginForm" method = "POST">
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

""")))}),format.raw/*42.2*/("""
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
                  DATE: Wed Apr 19 10:22:26 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/login.scala.html
                  HASH: c05e04633877f9518a619a3f0218a2ff2268c690
                  MATRIX: 775->1|926->57|954->60|982->80|1021->82|1052->87|1101->111|1141->143|1180->145|1215->154|1284->197|1297->202|1332->217|1367->226|1413->242|1445->247|1547->322|1562->328|1607->352|1798->516|1813->522|1862->550|3003->1661
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|41->10|42->11|42->11|42->11|46->15|46->15|46->15|73->42
                  -- GENERATED --
              */
          