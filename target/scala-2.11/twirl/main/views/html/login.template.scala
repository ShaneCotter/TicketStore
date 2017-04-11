
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
                  DATE: Tue Apr 11 14:15:12 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/login.scala.html
                  HASH: 3b748b59e7bae2158c19243fba84a8c2fa5bb7bf
                  MATRIX: 775->1|925->56|955->61|991->89|1030->91|1058->93|1172->181|1186->187|1230->211|1405->359|1420->365|1469->393|2460->1354
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|41->10|41->10|41->10|67->36
                  -- GENERATED --
              */
          