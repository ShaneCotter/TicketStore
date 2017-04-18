
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
                    addTicketForm("event.id"), options(Event.options), '_label -> "Event", '_default -> ".. Choose an Event ..",
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
                  DATE: Tue Apr 18 13:50:32 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admin/addTicket.scala.html
                  HASH: 3b8fe9b58a4e505f0be959961a99642c96113750
                  MATRIX: 838->21|994->82|1024->87|1056->111|1095->113|1129->121|1296->261|1406->361|1447->363|1495->384|1746->614|1792->633|1924->743|1970->762|2104->874|2150->893|2334->1055|2380->1074|2568->1240|2614->1259|2707->1331|2753->1349|2919->1488|2934->1494|2985->1524|3129->1638
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|42->10|42->10|42->10|44->12|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|55->23|55->23|55->23|62->30
                  -- GENERATED --
              */
          