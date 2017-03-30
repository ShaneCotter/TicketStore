
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

class aboutUs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("About Us",user)/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<!--..CONTENT..-->
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
        <br>
        <p>
            Ran by a team of three second year college students, TC EVENTS is dedicated to ensuring its customers are
            100% satisfied with their experience. <br>The website was created in 2017, using HTML, CSS, and Bootstrap.
        </p>
		<br>
		<img src=""""),_display_(/*20.14*/routes/*20.20*/.Assets.versioned("images/crowd1.jpg")),format.raw/*20.58*/("""" alt="crowd" width="90%" height="100%">
    </div>
</div>
</div>
</div>
<!--END CONTENT-->

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
object aboutUs extends aboutUs_Scope0.aboutUs
              /*
                  -- GENERATED --
                  DATE: Thu Mar 30 12:35:31 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/aboutUs.scala.html
                  HASH: 8324f4012aec6fdda1b89922bcc2f9036719ebfc
                  MATRIX: 760->1|880->26|907->28|936->49|975->51|1002->52|1886->909|1901->915|1960->953
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|51->20|51->20|51->20
                  -- GENERATED --
              */
          