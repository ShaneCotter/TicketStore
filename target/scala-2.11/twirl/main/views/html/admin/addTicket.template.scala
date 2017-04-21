
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addTicket_Scope0 {
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

     object addTicket_Scope1 {
import helper._

class addTicket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Ticket],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(addTicketForm: Form[models.Ticket], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.63*/("""

"""),_display_(/*5.2*/main("Add Ticket", user)/*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/("""

    """),format.raw/*7.5*/("""<div class="container-fluid" id="content">
        <div class="row">
            <div class="col-lg-12 well" id="addEvent">
            """),_display_(/*10.14*/form(action = routes.HomeController.addTicketSubmit(), 'class -> "form-horizontal", 'role -> "form")/*10.114*/ {_display_(Seq[Any](format.raw/*10.116*/("""

                """),_display_(/*12.18*/select(
                    addTicketForm("event.id"), options(Event.options), '_label -> "Event", '_default -> "Choose an Event",
                    '_showConstraints -> false, 'class -> "form-control"
                )),format.raw/*15.18*/("""
                """),_display_(/*16.18*/inputText(addTicketForm("ticketType"), '_label -> "Ticket Type", 'class -> "form-control", 'maxlength -> "30")),format.raw/*16.128*/("""
                """),_display_(/*17.18*/inputText(addTicketForm("description"), '_label -> "Description ", 'class -> "form-control", 'maxlength -> "30")),format.raw/*17.130*/("""
                """),_display_(/*18.18*/inputText(addTicketForm("quantity"), '_label -> "Quantity", 'class -> "form-control", 'type -> "number", 'min -> "1", 'step -> "1", 'max -> "1000", 'value -> "0")),format.raw/*18.180*/("""
                """),_display_(/*19.18*/inputText(addTicketForm("price"), '_label -> "Price", 'class -> "form-control", 'type -> "number", 'min -> "0.01", 'step -> "0.01", 'max -> "1000", 'value -> "00.00")),format.raw/*19.184*/("""
                """),_display_(/*20.18*/inputText(addTicketForm("ticketID"), '_label -> "", 'hidden -> "hidden")),format.raw/*20.90*/("""
                """),format.raw/*21.17*/("""<div class="actions">
                    <input type="submit" value="Add Ticket" class="btn btn-success">
                    <a href=""""),_display_(/*23.31*/routes/*23.37*/.HomeController.adminevents(0)),format.raw/*23.67*/("""" class="btn btn-danger">Cancel</a>

                </div>
            </div>
        </div>

    </div>
""")))}),format.raw/*30.2*/("""
""")))}))
      }
    }
  }

  def render(addTicketForm:Form[models.Ticket],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addTicketForm,user)

  def f:((Form[models.Ticket],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addTicketForm,user) => apply(addTicketForm,user)

  def ref: this.type = this

}


}
}

/**/
object addTicket extends addTicket_Scope0.addTicket_Scope1.addTicket
              /*
                  -- GENERATED --
                  DATE: Fri Apr 21 12:03:38 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/addTicket.scala.html
                  HASH: 9e90df83f7f2f716833615f7e15d4e3a4f5d5312
                  MATRIX: 838->19|994->80|1022->83|1054->107|1093->109|1125->115|1289->252|1399->352|1440->354|1486->373|1728->594|1773->612|1905->722|1950->740|2084->852|2129->870|2313->1032|2358->1050|2546->1216|2591->1234|2684->1306|2729->1323|2893->1460|2908->1466|2959->1496|3096->1603
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|42->10|42->10|42->10|44->12|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|55->23|55->23|55->23|62->30
                  -- GENERATED --
              */
          