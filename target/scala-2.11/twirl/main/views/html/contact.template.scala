
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
                        """),format.raw/*12.25*/("""<div class="alert alert-success text-center">
                        """),_display_(/*13.26*/flash/*13.31*/.get("success")),format.raw/*13.46*/("""
                        """),format.raw/*14.25*/("""</div>
                    """)))}),format.raw/*15.22*/("""
                    """),format.raw/*16.21*/("""<div class="col-lg-12" id="contactForm">
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
                  DATE: Thu Apr 20 15:50:05 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/contact.scala.html
                  HASH: 7505145380e384072d82f9f1e55e058cf31386d0
                  MATRIX: 827->21|982->81|1012->86|1041->107|1080->109|1112->115|1348->324|1389->356|1429->358|1483->384|1582->456|1596->461|1632->476|1686->502|1746->531|1796->553|2347->1077|2477->1197|2518->1199|2572->1226|2700->1332|2754->1359|2880->1463|2934->1490|3051->1585|3105->1612|3309->1795|3363->1822|3504->1941|3560->1969|3738->2120|3753->2126|3799->2151|3916->2237|3966->2259
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|54->22|54->22|54->22|55->23|55->23|56->24|56->24|57->25|57->25|58->26|59->27|60->28|60->28|62->30|64->32|64->32|64->32|66->34|67->35
                  -- GENERATED --
              */
          