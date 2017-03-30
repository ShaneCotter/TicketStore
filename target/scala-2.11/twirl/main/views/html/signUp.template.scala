
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

class signUp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Welcome to Play",user)/*2.30*/ {_display_(Seq[Any](format.raw/*2.32*/("""

    """),format.raw/*4.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="content">
        <div class="row">
            <div class="col-lg-12 well" id="signup">
                <form action="#">
                            <div class="col-sm-6 form-group">
                                <label>First Name</label>
                                <input type="text" placeholder="Enter First Name Here.." class="form-control">
                            </div>
                            <div class="col-sm-6 form-group">
                                <label>Last Name</label>
                                <input type="text" placeholder="Enter Last Name Here.." class="form-control">
                            </div>
                        
                      
                        <div class="form-group">
                            <label>Address</label>
                            <input type="text" placeholder="Address Line 1" class="form-control">
                            <br>
                            <input type="text" placeholder="Address Line 2" class="form-control">
                            <br>
                            <input type="text" placeholder="Address Line 3" class="form-control">
                            <br>
                        </div>
                        <div class="row">
                            <div class="col-sm-4 form-group">
                                <label>City</label>
                                <input type="text" placeholder="Enter City Name Here.." class="form-control">
                            </div>
                            <div class="col-sm-4 form-group">
                                <label>County</label>
                                <input type="text" placeholder="Enter County Name Here.." class="form-control">
                            </div>
                            <div class="col-sm-4 form-group">
                                <label>Phone Number</label>
                                <input type="text" placeholder="Enter Phone Number Here..." class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Account Security Question : What is your mother's maiden name ? </label>
                            <input type="text" placeholder="Enter Security question answer Here.." class="form-control">
                        </div>
						<div class="form-group">
                            <label>Email Address </label>
                            <input type="text" placeholder="Enter email here.." class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input type="text" placeholder="Enter Password.." class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input type="text" placeholder="Re-Enter Password.." class="form-control">
                        </div>
                        <button type="button" class="btn btn-lg btn-success">Submit</button>
						 </form>
                    </div>
            </div>
			</div>
    
   """)))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object signUp extends signUp_Scope0.signUp
              /*
                  -- GENERATED --
                  DATE: Thu Mar 30 11:34:08 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/signUp.scala.html
                  HASH: 082b479cdab7c3b8380448fdf18af3723ff3340a
                  MATRIX: 758->1|878->26|905->28|941->56|980->58|1012->64
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4
                  -- GENERATED --
              */
          