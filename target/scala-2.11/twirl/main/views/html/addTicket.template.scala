
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


"""),format.raw/*8.1*/("""<div class="row">
<div class="col-lg-12 well" id="addEvent">
         <h4>Add Tickets</h4>
              """),_display_(/*11.16*/form(action = routes.HomeController.addTicketSubmit(), 'class -> "form-horizontal",'role->"form")/*11.113*/{_display_(Seq[Any](format.raw/*11.114*/("""

                """),_display_(/*13.18*/inputText(addTicketForm("ticketType"), '_label -> "TicketType", 'class -> "form-control")),format.raw/*13.107*/("""
                """),_display_(/*14.18*/inputText(addTicketForm("quantity"), '_label -> "Quantity", 'class -> "form-control")),format.raw/*14.103*/("""
                """),_display_(/*15.18*/inputText(addTicketForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*15.97*/("""

                """),format.raw/*17.17*/("""<div class="actions">
                    <input type="submit" value="add ticket" class="btn btn-primary">
                    
                        <a href=""""),_display_(/*20.35*/routes/*20.41*/.HomeController.index()),format.raw/*20.64*/("""" <button class="btn btn-warning">Cancel</button></a>

                </div>
</div>
</div>


""")))}),format.raw/*27.2*/("""
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
                  DATE: Mon Apr 03 12:34:01 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/addTicket.scala.html
                  HASH: 8211a5dbc24bd58c263a1999bae7fc613d88ec97
                  MATRIX: 832->21|987->81|1017->86|1048->109|1087->111|1119->117|1255->226|1362->323|1402->324|1450->345|1561->434|1607->453|1714->538|1760->557|1860->636|1908->656|2100->821|2115->827|2159->850|2291->952
                  LINES: 30->3|35->3|37->5|37->5|37->5|40->8|43->11|43->11|43->11|45->13|45->13|46->14|46->14|47->15|47->15|49->17|52->20|52->20|52->20|59->27
                  -- GENERATED --
              */
          