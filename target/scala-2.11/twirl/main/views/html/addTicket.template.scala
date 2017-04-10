
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
              """),_display_(/*10.16*/form(action = routes.HomeController.addTicketSubmit(), 'class -> "form-horizontal",'role->"form")/*10.113*/{_display_(Seq[Any](format.raw/*10.114*/("""

                """),_display_(/*12.18*/select(
                    addTicketForm("event.id"),options(Event.options),'_label -> "Event", '_default -> ".. Choose an Event ..",
                    '_showConstraints -> false, 'class -> "form-control"
                )),format.raw/*15.18*/("""
                """),_display_(/*16.18*/inputText(addTicketForm("ticketType"), '_label -> "TicketType", 'class -> "form-control", 'maxlength -> "30")),format.raw/*16.127*/("""
                """),_display_(/*17.18*/inputText(addTicketForm("quantity"), '_label -> "Quantity", 'class -> "form-control", 'type -> "number", 'min -> "1", 'step -> "1", 'max -> "1000", 'value -> "0")),format.raw/*17.180*/("""
                """),_display_(/*18.18*/inputText(addTicketForm("price"), '_label -> "Price", 'class -> "form-control", 'type -> "number", 'min -> "0.01", 'step -> "0.01", 'max -> "1000", 'value -> "00.00")),format.raw/*18.184*/("""
                """),_display_(/*19.18*/inputText(addTicketForm("ticketID"), '_label -> "", 'hidden -> "hidden")),format.raw/*19.90*/("""
                """),format.raw/*20.17*/("""<div class="actions">
                    <input type="submit" value="Add Ticket" class="btn btn-success">
                        <a href=""""),_display_(/*22.35*/routes/*22.41*/.HomeController.index()),format.raw/*22.64*/("""" class="btn btn-danger">Cancel</a>

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
                  DATE: Mon Apr 10 13:57:25 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/addTicket.scala.html
                  HASH: e26b07e6ed9d682eb89dd81c2d3a0c2edddffcd5
                  MATRIX: 832->21|987->81|1017->86|1048->109|1087->111|1117->115|1266->237|1373->334|1413->335|1461->356|1710->584|1756->603|1887->712|1933->731|2117->893|2163->912|2351->1078|2397->1097|2490->1169|2536->1187|2706->1330|2721->1336|2765->1359|2885->1449
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|42->10|42->10|42->10|44->12|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|52->20|54->22|54->22|54->22|61->29
                  -- GENERATED --
              */
          