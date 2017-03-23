
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Welcome to Play")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
"""),format.raw/*3.1*/("""<!--..CONTENT..-->
<div class="container-fluid" id="content">
<h2>Login or <a href ="signUp.scala.html">Sign Up</a></h2>
<div class="row omb_row-sm-offset-3">
      <div class="col-xs-12 col-sm-6">  
          <form class="omb_loginForm">
          <div class="input-group">
            <span class="input-group-addon"><i class="fa fa-user"></i></span>
            <input type="text" class="form-control" name="username" placeholder="email address">
          </div>
          <span class="help-block"></span>
                    
          <div class="input-group">
            <span class="input-group-addon"><i class="fa fa-lock"></i></span>
            <input  type="password" class="form-control" name="password" placeholder="Password">
          </div>
          <br>
        
          <button class="btn btn-lg btn-success btn-block" type="submit">Login</button>
        </form>
      </div>
      </div>
    <div class="row omb_row-sm-offset-3">
      <div class="col-xs-12 col-sm-3">
        <br>
        <br>
      </div>
      <div class="col-xs-12 col-sm-3">
        <p class="omb_forgotPwd">
          <a href="#">Forgot password?</a>
        </p>
      </div>
    </div>        
  </div>
<!--END CONTENT-->

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Thu Mar 23 18:27:16 GMT 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/login.scala.html
                  HASH: 7f755b46dab77622ee0b559a84b03ba98e46fb50
                  MATRIX: 827->3|858->26|897->28|925->30
                  LINES: 32->2|32->2|32->2|33->3
                  -- GENERATED --
              */
          