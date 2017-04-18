
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
                """),_display_(/*16.18*/inputText(addTicketForm("ticketType"), '_label -> "TicketType", 'class -> "form-control", 'maxlength -> "30")),format.raw/*16.127*/("""
                """),_display_(/*17.18*/inputText(addTicketForm("quantity"), '_label -> "Quantity", 'class -> "form-control", 'type -> "number", 'min -> "1", 'step -> "1", 'max -> "1000", 'value -> "0")),format.raw/*17.180*/("""
                """),_display_(/*18.18*/inputText(addTicketForm("price"), '_label -> "Price", 'class -> "form-control", 'type -> "number", 'min -> "0.01", 'step -> "0.01", 'max -> "1000", 'value -> "00.00")),format.raw/*18.184*/("""
                """),_display_(/*19.18*/inputText(addTicketForm("ticketID"), '_label -> "", 'hidden -> "hidden")),format.raw/*19.90*/("""
                """),format.raw/*20.17*/("""<div class="actions">
                    <input type="submit" value="Add Ticket" class="btn btn-success">
                    <a href=""""),_display_(/*22.31*/routes/*22.37*/.HomeController.adminevents(0)),format.raw/*22.67*/("""" class="btn btn-danger">Cancel</a>

                </div>
            </div>
        </div>

    </div>
""")))}),format.raw/*29.2*/("""
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
                  DATE: Tue Apr 18 11:45:57 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/addTicket.scala.html
                  HASH: f0fbb49bfe6de90e6930eab7166b20509b819c11
                  MATRIX: 838->19|994->80|1022->83|1054->107|1093->109|1125->115|1289->252|1399->352|1440->354|1486->373|1734->600|1779->618|1910->727|1955->745|2139->907|2184->925|2372->1091|2417->1109|2510->1181|2555->1198|2719->1335|2734->1341|2785->1371|2922->1478
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|42->10|42->10|42->10|44->12|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|52->20|54->22|54->22|54->22|61->29
                  -- GENERATED --
              */
          