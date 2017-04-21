
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
                  DATE: Fri Apr 21 12:03:38 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/addEvent.scala.html
                  HASH: 82b3264eeccc1d1521e849df9f92091f9514c119
                  MATRIX: 834->19|988->78|1016->81|1047->104|1086->106|1117->111|1364->331|1508->465|1549->467|1598->489|1819->689|1868->711|1991->812|2040->834|2160->932|2209->954|2335->1058|2384->1080|2502->1176|2551->1198|2669->1294|2829->1427|2915->1492|2960->1509|3123->1645|3138->1651|3183->1675|3346->1808
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|44->12|44->12|44->12|45->13|46->14|47->15|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|55->23|55->23|56->24|58->26|58->26|58->26|65->33
                  -- GENERATED --
              */
          