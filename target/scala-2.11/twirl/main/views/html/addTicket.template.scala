
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
                  DATE: Tue Apr 04 11:02:53 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/addTicket.scala.html
                  HASH: b217179dca803ba4af40ff9de21a096dd6b6527f
                  MATRIX: 832->19|987->79|1015->82|1046->105|1085->107|1114->110|1247->216|1354->313|1394->314|1440->333|1551->422|1596->440|1703->525|1748->543|1848->622|1894->640|2083->802|2098->808|2142->831|2267->926
                  LINES: 30->3|35->3|37->5|37->5|37->5|40->8|43->11|43->11|43->11|45->13|45->13|46->14|46->14|47->15|47->15|49->17|52->20|52->20|52->20|59->27
                  -- GENERATED --
              */
          