
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
                <div class="col-md-8 col-xs-12 col-md-offset-1">
                    """),_display_(/*11.22*/if(flash.containsKey("success"))/*11.54*/ {_display_(Seq[Any](format.raw/*11.56*/("""
                        """),format.raw/*12.25*/("""<div class="alert alert-success text-center">
                        """),_display_(/*13.26*/flash/*13.31*/.get("success")),format.raw/*13.46*/("""
                        """),format.raw/*14.25*/("""</div>
                    """)))}),format.raw/*15.22*/("""
                    """),format.raw/*16.21*/("""<div class="col-lg-12 col-xs-8 col-xs-offset-1" id="contactForm">
                        <h1 class = "text-center">Contact Us</h1>
                        <h5 class="text-center">Please fill out this form to report any problems or make an enquiry. <br>
                            If you wish to know how to use something on our website please refer to the
                            <a href="https://drive.google.com/open?id=0B2ddyi0zuA95TU5yX3dSYkdlZkE" class="greentext">User manual</a>
                        </h5>
                    """),_display_(/*22.22*/form(action = routes.HomeController.addContactSubmit(), 'method -> "POST", 'class -> "form-horizontal", 'role -> "form")/*22.142*/ {_display_(Seq[Any](format.raw/*22.144*/("""
                        """),_display_(/*23.26*/inputText(contactForm("firstName"), '_label -> "First Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*23.132*/("""
                        """),_display_(/*24.26*/inputText(contactForm("lastName"), '_label -> "Last Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*24.130*/("""
                        """),_display_(/*25.26*/inputText(contactForm("email"), '_label -> "Email", 'type -> "email", 'class -> "form-control")),format.raw/*25.121*/("""
                        """),_display_(/*26.26*/inputText(contactForm("phone"), '_label -> "Phone", 'type -> "tel", 'pattern -> "[0-9]{10}", 'title -> "10 digit mobile number",
                            'class -> "form-control")),format.raw/*27.54*/("""
                        """),_display_(/*28.26*/inputText(contactForm("message"), '_label -> "Message", 'type -> "text", 'class -> "form-control", 'maxlength -> "140")),format.raw/*28.145*/("""

                        """),format.raw/*30.25*/("""<div class="actions">
                            <input type="submit" value="Submit" class="btn btn-success">
                            <a href=""""),_display_(/*32.39*/routes/*32.45*/.HomeController.contact()),format.raw/*32.70*/("""" class="btn btn-danger">Cancel</a>
                        </div>
                """)))}),format.raw/*34.18*/("""
                    """),format.raw/*35.21*/("""</div>
            </div>

        </div>


        <div class="row">
            <div class="col-md-12 text-center">
                <hr>
                <h4 class="text-center">See below for Social Sites</h4>
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
                  DATE: Fri Apr 21 12:22:28 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/contact.scala.html
                  HASH: acc7bc285013dfe7d3d978930823f9d937fb5085
                  MATRIX: 827->19|982->79|1010->82|1039->103|1078->105|1109->110|1350->324|1391->356|1431->358|1484->383|1582->454|1596->459|1632->474|1685->499|1744->527|1793->548|2363->1091|2493->1211|2534->1213|2587->1239|2715->1345|2768->1371|2894->1475|2947->1501|3064->1596|3117->1622|3320->1804|3373->1830|3514->1949|3568->1975|3744->2124|3759->2130|3805->2155|3920->2239|3969->2260
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|54->22|54->22|54->22|55->23|55->23|56->24|56->24|57->25|57->25|58->26|59->27|60->28|60->28|62->30|64->32|64->32|64->32|66->34|67->35
                  -- GENERATED --
              */
          