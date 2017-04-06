
package views.html

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
  def apply/*3.2*/(addTicketForm: Form[models.Ticket],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.62*/("""

"""),_display_(/*5.2*/main("Add Ticket",user)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""

"""),format.raw/*7.1*/("""<div class="container-fluid" id="content">
<div class="row">
<div class="col-lg-12 well" id="addEvent">
         <h4>Add Tickets</h4>
              """),_display_(/*11.16*/form(action = routes.HomeController.addTicketSubmit(), 'class -> "form-horizontal",'role->"form")/*11.113*/{_display_(Seq[Any](format.raw/*11.114*/("""

                """),_display_(/*13.18*/select(
                    addTicketForm("event.eventID"),options(Event.options),'_label -> "Event", '_default -> ".. Choose an Event ..",
                    '_showConstraints -> false, 'class -> "form-control"
                )),format.raw/*16.18*/("""
                """),_display_(/*17.18*/inputText(addTicketForm("ticketType"), '_label -> "TicketType", 'class -> "form-control")),format.raw/*17.107*/("""
                """),_display_(/*18.18*/inputText(addTicketForm("quantity"), '_label -> "Quantity", 'class -> "form-control")),format.raw/*18.103*/("""
                """),_display_(/*19.18*/inputText(addTicketForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*19.97*/("""

                """),format.raw/*21.17*/("""<div class="actions">
                    <input type="submit" value="Add Ticket" class="btn btn-success">
                        <a href=""""),_display_(/*23.35*/routes/*23.41*/.HomeController.index()),format.raw/*23.64*/("""" class="btn btn-danger">Cancel</a>

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
                  DATE: Thu Apr 06 14:42:48 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/addTicket.scala.html
                  HASH: a7be74ad92e21efbe5963a42374b9e230e1e7f67
                  MATRIX: 832->19|987->79|1015->82|1046->105|1085->107|1113->109|1289->258|1396->355|1436->356|1482->375|1733->605|1778->623|1889->712|1934->730|2041->815|2086->833|2186->912|2232->930|2400->1071|2415->1077|2459->1100|2572->1183
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|43->11|43->11|43->11|45->13|48->16|49->17|49->17|50->18|50->18|51->19|51->19|53->21|55->23|55->23|55->23|62->30
                  -- GENERATED --
              */
          