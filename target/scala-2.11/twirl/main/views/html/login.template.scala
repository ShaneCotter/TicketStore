
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
  def apply/*1.2*/(loginForm: Form[models.Login],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),_display_(/*3.2*/main("Welcome to Play",user)/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
"""),format.raw/*4.1*/("""<!--..CONTENT..-->
<div class="container-fluid" id="content">
<h2>Login or <a href =""""),_display_(/*6.25*/routes/*6.31*/.HomeController.signUp()),format.raw/*6.55*/("""">Sign Up</a></h2>
<div class="row omb_row-sm-offset-3">
      <div class="col-xs-12 col-sm-6">

          <form class="omb_loginForm" action=""""),_display_(/*10.48*/routes/*10.54*/.LoginController.loginSubmit),format.raw/*10.82*/("""" name ="loginForm" method = "POST">
          <div class="input-group">
            <span class="input-group-addon"><i class="fa fa-user"></i></span>
            <input type="text" class="form-control" type="email" name="email" placeholder="Email Address">
          </div>
          <span class="help-block"></span>
                    
          <div class="input-group">
            <span class="input-group-addon"><i class="fa fa-lock"></i></span>
            <input  type="password" class="form-control" name="password" placeholder="Password">
          </div>
          <br>
          <button class="btn btn-lg btn-success btn-block" type="submit">Login        <i class="glyphicon glyphicon-thumbs-up"></i></button>
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

""")))}),format.raw/*36.2*/("""
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
                  DATE: Tue Apr 11 13:34:24 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/login.scala.html
                  HASH: 4c9fd784eda43d232d0241dce7c0946001123260
                  MATRIX: 775->1|925->56|953->59|989->87|1028->89|1055->90|1167->176|1181->182|1225->206|1396->350|1411->356|1460->384|2425->1319
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|41->10|41->10|41->10|67->36
                  -- GENERATED --
              */
          