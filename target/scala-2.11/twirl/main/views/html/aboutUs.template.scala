
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object aboutUs_Scope0 {
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

class aboutUs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Welcome to Play")/*1.25*/ {_display_(Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<!--..CONTENT..-->
<div class="container-fluid" id="content">
    <div class="container" id="aboutUs">
	  <div class="row">
	    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <h2>About Us</h2>
        <p>
           We are TC EVENTS. We are a small company dedicated to providing a user friendly experience.
           We specialise in events, bringing a competitive service to view. Our goal is to provide a ticket booking
           site where tickets can be bought close to face value, even if the event has sold out countrywide.
        </p>
<<<<<<< HEAD
        <p>
=======
        <img src="assets/img/crowd.png" alt="crowd" width="100%" height="100%">
        <br><p>
>>>>>>> c6362be255bfe8a5e154edd8ff6f63bcd60dd8bd
            Ran by a team of three second year college students, TC EVENTS is dedicated to ensuring its customers are
            100% satisfied with their experience. <br>The website was created in 2017, using HTML, CSS, and Bootstrap.
        </p>
		<br>
		<img src="assets/img/crowd.png" alt="crowd" width="100%" height="100%">
    </div>
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
object aboutUs extends aboutUs_Scope0.aboutUs
              /*
                  -- GENERATED --
                  DATE: Thu Mar 23 18:27:15 GMT 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/aboutUs.scala.html
                  HASH: 6a535017ec4c5bd3d99ba9a2c50fa347bba6caef
                  MATRIX: 831->1|862->24|901->26|929->28
                  LINES: 32->1|32->1|32->1|33->2
                  -- GENERATED --
              */
          