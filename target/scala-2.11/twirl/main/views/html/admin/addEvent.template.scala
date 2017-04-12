
package views.html.admin

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
  def apply/*3.2*/(addEventForm: Form[models.Event], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.61*/("""

"""),_display_(/*5.2*/main("Add Event", user)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
    """),format.raw/*6.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="content">

        <div class="row">
            <div class="col-lg-12 well" id="addEvent">
                    <!-- Start of add event up form-->
                """),_display_(/*12.18*/form(action = routes.HomeController.addEventSubmit(), 'class -> "form=horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*12.152*/ {_display_(Seq[Any](format.raw/*12.154*/("""
                    """),_display_(/*13.22*/select(addEventForm("category.catID"), options(Category.options), '_label -> "Category", '_default -> "Choose a category",
                        '_showConstraints -> false, 'class -> "form-control")),format.raw/*14.78*/("""
                    """),_display_(/*15.22*/inputText(addEventForm("eventName"), '_label -> "Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*15.123*/("""
                    """),_display_(/*16.22*/inputText(addEventForm("title"), '_label -> "Title", 'class -> "form-control", 'maxlength -> "30")),format.raw/*16.120*/("""
                    """),_display_(/*17.22*/inputText(addEventForm("location"), '_label -> "Location", 'class -> "form-control", 'maxlength -> "30")),format.raw/*17.126*/("""
                    """),_display_(/*18.22*/inputText(addEventForm("date"), '_label -> "Date", 'class -> "form-control", 'maxlength -> "30")),format.raw/*18.118*/("""
                    """),_display_(/*19.22*/inputText(addEventForm("time"), '_label -> "Time", 'class -> "form-control", 'maxlength -> "30")),format.raw/*19.118*/(""" 
                <label>Event Image</label>
                <input type="file" name="upload">
                <br>
                """),_display_(/*23.18*/inputText(addEventForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*23.83*/("""
                """),format.raw/*24.17*/("""<div class="actions">
                    <input type="submit" value="Add Event" class="btn btn-success">
                    <a href=""""),_display_(/*26.31*/routes/*26.37*/.HomeController.events()),format.raw/*26.61*/("""" class="btn btn-danger">Cancel</a>
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
                  DATE: Wed Apr 12 14:13:01 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admin/addEvent.scala.html
                  HASH: f8c987e989010ea6ecdd9df9ed956a2b19fd5370
                  MATRIX: 834->21|988->80|1018->85|1049->108|1088->110|1120->116|1373->342|1517->476|1558->478|1608->501|1830->702|1880->725|2003->826|2053->849|2173->947|2223->970|2349->1074|2399->1097|2517->1193|2567->1216|2685->1312|2849->1449|2935->1514|2981->1532|3146->1670|3161->1676|3206->1700|3376->1840
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|44->12|44->12|44->12|45->13|46->14|47->15|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|55->23|55->23|56->24|58->26|58->26|58->26|65->33
                  -- GENERATED --
              */
          