
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
                  DATE: Wed Apr 12 14:13:01 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/contact.scala.html
                  HASH: 967683ec289081704ff5b59593fa21af6b3e4cc1
                  MATRIX: 827->21|982->81|1012->86|1041->107|1080->109|1112->115|1348->324|1389->356|1429->358|1483->384|1570->444|1584->449|1620->464|1674->490|1734->519|1784->541|1873->603|2003->723|2044->725|2098->752|2226->858|2280->885|2406->989|2460->1016|2577->1111|2631->1138|2747->1232|2801->1259|2946->1382|3004->1412|3182->1563|3197->1569|3243->1594|3420->1740|3459->1752
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|49->17|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|53->21|54->22|54->22|57->25|59->27|59->27|59->27|66->34|68->36
                  -- GENERATED --
              */
          