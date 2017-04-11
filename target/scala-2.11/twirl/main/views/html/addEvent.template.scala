
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
		"""),_display_(/*12.4*/form(action = routes.HomeController.addEventSubmit(), 'class -> "form=horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*12.136*/{_display_(Seq[Any](format.raw/*12.137*/("""
				"""),_display_(/*13.6*/select(addEventForm("category.catID"), options(Category.options), '_label -> "Category", '_default -> "Choose a category",
				'_showConstraints -> false, 'class -> "form-control")),format.raw/*14.58*/("""
				"""),_display_(/*15.6*/inputText(addEventForm("eventName"), '_label -> "Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*15.107*/("""
			    """),_display_(/*16.9*/inputText(addEventForm("title"), '_label -> "Title", 'class -> "form-control", 'maxlength -> "30")),format.raw/*16.107*/("""
			    """),_display_(/*17.9*/inputText(addEventForm("location"), '_label -> "Location", 'class -> "form-control", 'maxlength -> "30")),format.raw/*17.113*/("""
			    """),_display_(/*18.9*/inputText(addEventForm("date"), '_label -> "Date", 'class -> "form-control" , 'maxlength -> "30")),format.raw/*18.106*/("""
			    """),_display_(/*19.9*/inputText(addEventForm("time"), '_label -> "Time", 'class -> "form-control" , 'maxlength -> "30")),format.raw/*19.106*/(""" 
				<label>Event Image</label>
				<input type="file" name="upload">
	            <br>
				"""),_display_(/*23.6*/inputText(addEventForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*23.71*/("""
				"""),format.raw/*24.5*/("""<div class="actions">
					<input type="submit" value="Add Event" class="btn btn-success">
					<a href=""""),_display_(/*26.16*/routes/*26.22*/.HomeController.events()),format.raw/*26.46*/("""" class="btn btn-danger">Cancel</a>
				</div>
			</div>
		</div>
	</div>
<!--END CONTENT-->

""")))}),format.raw/*33.2*/("""
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
                  DATE: Tue Apr 11 14:07:37 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/addEvent.scala.html
                  HASH: 0219b0d8ee323c601b0361023fca766d6bddf34d
                  MATRIX: 828->21|981->79|1011->84|1041->106|1080->108|1108->110|1302->278|1444->410|1484->411|1517->418|1719->599|1752->606|1875->707|1911->717|2031->815|2067->825|2193->929|2229->939|2348->1036|2384->1046|2503->1143|2627->1241|2713->1306|2746->1312|2881->1420|2896->1426|2941->1450|3073->1552
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|44->12|44->12|44->12|45->13|46->14|47->15|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|55->23|55->23|56->24|58->26|58->26|58->26|65->33
                  -- GENERATED --
              */
          