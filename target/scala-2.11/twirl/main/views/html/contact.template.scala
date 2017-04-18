
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contact_Scope0 {
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

     object contact_Scope1 {
import helper._

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Contact],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(contactForm: Form[models.Contact], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.62*/("""

"""),_display_(/*5.2*/main("Contact", user)/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
    """),format.raw/*6.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="content">
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-1">
                    """),_display_(/*11.22*/if(flash.containsKey("success"))/*11.54*/ {_display_(Seq[Any](format.raw/*11.56*/("""
                        """),format.raw/*12.25*/("""<div class="alert alert-success">
                        """),_display_(/*13.26*/flash/*13.31*/.get("success")),format.raw/*13.46*/("""
                        """),format.raw/*14.25*/("""</div>
                    """)))}),format.raw/*15.22*/("""
                    """),format.raw/*16.21*/("""<h1 class = "greentext">Contact Us</h1>
                    """),_display_(/*17.22*/form(action = routes.HomeController.addContactSubmit(), 'method -> "POST", 'class -> "form-horizontal", 'role -> "form")/*17.142*/ {_display_(Seq[Any](format.raw/*17.144*/("""
                        """),_display_(/*18.26*/inputText(contactForm("firstName"), '_label -> "First Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*18.132*/("""
                        """),_display_(/*19.26*/inputText(contactForm("lastName"), '_label -> "Last Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*19.130*/("""
                        """),_display_(/*20.26*/inputText(contactForm("email"), '_label -> "Email", 'type -> "email", 'class -> "form-control")),format.raw/*20.121*/("""
                        """),_display_(/*21.26*/inputText(contactForm("phone"), '_label -> "Phone", 'type -> "text", 'class -> "form-control")),format.raw/*21.120*/("""
                        """),_display_(/*22.26*/inputText(contactForm("message"), '_label -> "Message", 'type -> "textarea", 'class -> "form-control", 'maxlength -> "140")),format.raw/*22.149*/("""


                        """),format.raw/*25.25*/("""<div class="actions">
                            <input type="submit" value="Submit" class="btn btn-success">
                            <a href=""""),_display_(/*27.39*/routes/*27.45*/.HomeController.contact()),format.raw/*27.70*/("""" class="btn btn-danger">Cancel</a>

                        </div>
                    </div>
            </div>

        </div>
        """)))}),format.raw/*34.10*/("""

        """),format.raw/*36.9*/("""<div class="row">
            <div class="col-md-12 text-center">
                <h4>See below for Social Sites</h4>
            </div>
        </div>

    </div>

    </div>

    </div>
    </div>
        <!--END CONTENT-->

""")))}))
      }
    }
  }

  def render(contactForm:Form[models.Contact],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(contactForm,user)

  def f:((Form[models.Contact],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (contactForm,user) => apply(contactForm,user)

  def ref: this.type = this

}


}
}

/**/
object contact extends contact_Scope0.contact_Scope1.contact
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 11:45:57 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/contact.scala.html
                  HASH: 757f19d121e20ea48e6577767e5db6ab2f6a7985
                  MATRIX: 827->19|982->79|1010->82|1039->103|1078->105|1109->110|1340->314|1381->346|1421->348|1474->373|1560->432|1574->437|1610->452|1663->477|1722->505|1771->526|1859->587|1989->707|2030->709|2083->735|2211->841|2264->867|2390->971|2443->997|2560->1092|2613->1118|2729->1212|2782->1238|2927->1361|2982->1388|3158->1537|3173->1543|3219->1568|3389->1707|3426->1717
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|49->17|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|53->21|54->22|54->22|57->25|59->27|59->27|59->27|66->34|68->36
                  -- GENERATED --
              */
          