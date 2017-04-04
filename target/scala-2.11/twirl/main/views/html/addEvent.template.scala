
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addEvent_Scope0 {
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

     object addEvent_Scope1 {
import helper._

class addEvent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Event],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(addEventForm: Form[models.Event],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.60*/("""

"""),_display_(/*5.2*/main("Add Event",user)/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
"""),format.raw/*6.1*/("""<!--..CONTENT..-->
<div class="container-fluid" id="content">
<h1>Add Event Page</h1>


<div class="row">
<div class="col-lg-12 well" id="addEvent">
<!-- Start of add event up form-->
		"""),_display_(/*14.4*/form(action = routes.HomeController.addEventSubmit(), 'class -> "form=horizontal", 'role->"form")/*14.101*/{_display_(Seq[Any](format.raw/*14.102*/("""

				"""),_display_(/*16.6*/inputText(addEventForm("eventName"), '_label -> "Name", 'class -> "form-control")),format.raw/*16.87*/("""
				"""),_display_(/*17.6*/inputText(addEventForm("time"), '_label -> "Time", 'class -> "form-control")),format.raw/*17.82*/("""
				"""),_display_(/*18.6*/inputText(addEventForm("location"), '_label -> "Location", 'class -> "form-control")),format.raw/*18.90*/("""
				"""),_display_(/*19.6*/inputText(addEventForm("date"), '_label -> "Date", 'class -> "form-control")),format.raw/*19.82*/("""
				"""),_display_(/*20.6*/inputText(addEventForm("title"), '_label -> "Title", 'class -> "form-control")),format.raw/*20.84*/("""
				"""),format.raw/*21.5*/("""<label>Event Image</label>
				<input class="btn btn-success" type="file" name="upload">
				"""),_display_(/*23.6*/inputText(addEventForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*23.71*/("""

				"""),format.raw/*25.5*/("""<br>

				<div class="actions">
					<input type="submit" value="Add Product" class="btn btn-success">


					"""),format.raw/*31.112*/("""
					"""),format.raw/*32.6*/("""<a href=""""),_display_(/*32.16*/routes/*32.22*/.HomeController.events()),format.raw/*32.46*/("""" class="btn btn-warning">Cancel</a>


				</div>
			</div>
		</div>
<!--END CONTENT-->

""")))}),format.raw/*40.2*/("""
""")))}))
      }
    }
  }

  def render(addEventForm:Form[models.Event],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addEventForm,user)

  def f:((Form[models.Event],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addEventForm,user) => apply(addEventForm,user)

  def ref: this.type = this

}


}
}

/**/
object addEvent extends addEvent_Scope0.addEvent_Scope1.addEvent
              /*
                  -- GENERATED --
                  DATE: Tue Apr 04 11:58:17 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/addEvent.scala.html
                  HASH: b2f4a60745f0279dc9d7554582e3c4052dcc08cf
                  MATRIX: 828->19|981->77|1009->80|1039->102|1078->104|1105->105|1318->292|1425->389|1465->390|1498->397|1600->478|1632->484|1729->560|1761->566|1866->650|1898->656|1995->732|2027->738|2126->816|2158->821|2278->915|2364->980|2397->986|2536->1202|2569->1208|2606->1218|2621->1224|2666->1248|2786->1338
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|46->14|46->14|46->14|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|55->23|55->23|57->25|63->31|64->32|64->32|64->32|64->32|72->40
                  -- GENERATED --
              */
          