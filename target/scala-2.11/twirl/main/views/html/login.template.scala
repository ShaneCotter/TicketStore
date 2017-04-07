
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
"""),_display_(/*2.2*/main("Welcome to Play",user)/*2.30*/ {_display_(Seq[Any](format.raw/*2.32*/("""
"""),format.raw/*3.1*/("""<!--..CONTENT..-->
<div class="container-fluid" id="content">
<h2>Login or <a href =""""),_display_(/*5.25*/routes/*5.31*/.HomeController.signUp()),format.raw/*5.55*/("""">Sign Up</a></h2>
<div class="row omb_row-sm-offset-3">
      <div class="col-xs-12 col-sm-6">  
          <form class="omb_loginForm" action=""""),_display_(/*8.48*/routes/*8.54*/.LoginController.loginSubmit),format.raw/*8.82*/("""" name ="loginForm" method = "POST">
          <div class="input-group">
            <span class="input-group-addon"><i class="fa fa-user"></i></span>
            <input type="text" class="form-control" name="email" placeholder="email address">
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

""")))}),format.raw/*33.2*/("""
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
                  DATE: Fri Apr 07 10:35:21 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/login.scala.html
                  HASH: 50881f3336beaa59a7943becd1f99557a6795bb4
                  MATRIX: 775->1|925->56|953->59|989->87|1028->89|1056->91|1170->179|1184->185|1228->209|1402->357|1416->363|1464->391|2440->1337
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|39->8|39->8|39->8|64->33
                  -- GENERATED --
              */
          