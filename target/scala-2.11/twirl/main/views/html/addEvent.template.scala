
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

				"""),_display_(/*22.6*/inputText(addEventForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*22.71*/("""

				"""),format.raw/*24.5*/("""<br>

				<div class="actions">
					<input type="submit" value="Add Product" class="btn btn-success">


					"""),format.raw/*30.112*/("""
					"""),format.raw/*31.6*/("""<a href=""""),_display_(/*31.16*/routes/*31.22*/.HomeController.events()),format.raw/*31.46*/("""" class="btn btn-warning">Cancel</a>


				</div>
			</div>
		</div>
<!--END CONTENT-->

""")))}),format.raw/*39.2*/("""
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
                  DATE: Mon Apr 03 12:13:42 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/addEvent.scala.html
                  HASH: d6bcda000ed3ddd5ac22a0af220fdc18ab0f3e10
                  MATRIX: 828->21|981->79|1011->84|1041->106|1080->108|1108->110|1329->305|1436->402|1476->403|1511->412|1613->493|1646->500|1743->576|1776->583|1881->667|1914->674|2011->750|2044->757|2143->835|2178->844|2264->909|2299->917|2444->1139|2478->1146|2515->1156|2530->1162|2575->1186|2703->1284
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|46->14|46->14|46->14|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|54->22|54->22|56->24|62->30|63->31|63->31|63->31|63->31|71->39
                  -- GENERATED --
              */
          