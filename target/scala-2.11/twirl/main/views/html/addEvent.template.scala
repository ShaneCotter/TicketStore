
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

<div class="row">
<div class="col-lg-12 well" id="addEvent">
<!-- Start of add event up form-->
		"""),_display_(/*12.4*/form(action = routes.HomeController.addEventSubmit(), 'class -> "form=horizontal", 'role->"form", 'enctype -> "mulitpart/form-data")/*12.136*/{_display_(Seq[Any](format.raw/*12.137*/("""
				"""),_display_(/*13.6*/select(addEventForm("category.catID"), options(Category.options), '_label -> "Category", '_default -> "Choose a category",
				'_showConstraints -> false, 'class -> "form-control")),format.raw/*14.58*/("""
				"""),_display_(/*15.6*/inputText(addEventForm("eventName"), '_label -> "Name", 'class -> "form-control")),format.raw/*15.87*/("""
				"""),_display_(/*16.6*/inputText(addEventForm("time"), '_label -> "Time", 'class -> "form-control")),format.raw/*16.82*/("""
				"""),_display_(/*17.6*/inputText(addEventForm("location"), '_label -> "Location", 'class -> "form-control")),format.raw/*17.90*/("""
				"""),_display_(/*18.6*/inputText(addEventForm("date"), '_label -> "Date", 'class -> "form-control")),format.raw/*18.82*/("""
				"""),_display_(/*19.6*/inputText(addEventForm("title"), '_label -> "Title", 'class -> "form-control")),format.raw/*19.84*/("""
				"""),format.raw/*20.5*/("""<label>Event Image</label>
				<input class="btn btn-success btn-circle btn-md" type="file" name="upload">
				<br><br>
				"""),_display_(/*23.6*/inputText(addEventForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*23.71*/("""

				"""),format.raw/*25.5*/("""<br>

				<div class="actions">
					<input type="submit" value="Add Event" class="btn btn-success">
					<a href=""""),_display_(/*29.16*/routes/*29.22*/.HomeController.events()),format.raw/*29.46*/("""" class="btn btn-danger">Cancel</a>
				</div>
			</div>
		</div>
	</div>
<!--END CONTENT-->

""")))}),format.raw/*36.2*/("""
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
                  DATE: Mon Apr 10 10:40:19 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/addEvent.scala.html
                  HASH: aa3b4a69bd1188e9df564949fe8d84c2a9005233
                  MATRIX: 828->21|981->79|1011->84|1041->106|1080->108|1108->110|1302->278|1444->410|1484->411|1517->418|1719->599|1752->606|1854->687|1887->694|1984->770|2017->777|2122->861|2155->868|2252->944|2285->951|2384->1029|2417->1035|2571->1163|2657->1228|2692->1236|2839->1356|2854->1362|2899->1386|3031->1488
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|44->12|44->12|44->12|45->13|46->14|47->15|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|52->20|55->23|55->23|57->25|61->29|61->29|61->29|68->36
                  -- GENERATED --
              */
          