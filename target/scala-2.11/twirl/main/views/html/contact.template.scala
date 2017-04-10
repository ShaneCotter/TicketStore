
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
  def apply/*3.2*/(contactForm: Form[models.Contact],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.61*/("""

"""),_display_(/*5.2*/main("Contact",user)/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
"""),format.raw/*6.1*/("""<!--..CONTENT..-->
<div class="container-fluid" id="content">
	<div class="container">
    <div class="row">
        <div class="col-md-8 col-md-offset-1">
            """),_display_(/*11.14*/if(flash.containsKey("success"))/*11.46*/{_display_(Seq[Any](format.raw/*11.47*/("""
                """),format.raw/*12.17*/("""<div class="alert alert-success">
                """),_display_(/*13.18*/flash/*13.23*/.get("success")),format.raw/*13.38*/("""
            """),format.raw/*14.13*/("""</div>
            """)))}),format.raw/*15.14*/("""
                """),format.raw/*16.17*/("""<h1 class = "greentext">Contact Us</h1>
            """),_display_(/*17.14*/form(action = routes.HomeController.addContactSubmit(),'method -> "POST", 'class -> "form-horizontal",'role->"form")/*17.130*/{_display_(Seq[Any](format.raw/*17.131*/("""
                """),_display_(/*18.18*/inputText(contactForm("firstName"), '_label -> "First Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*18.124*/("""
                """),_display_(/*19.18*/inputText(contactForm("lastName"), '_label -> "Last Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*19.122*/("""
                """),_display_(/*20.18*/inputText(contactForm("email"), '_label -> "Email", 'type -> "email", 'class -> "form-control")),format.raw/*20.113*/("""
                """),_display_(/*21.18*/inputText(contactForm("phone"), '_label -> "Phone", 'type -> "text", 'class -> "form-control")),format.raw/*21.112*/("""
                """),_display_(/*22.18*/inputText(contactForm("message"), '_label -> "Message", 'type -> "textarea", 'class -> "form-control", 'maxlength -> "140")),format.raw/*22.141*/("""

                """),format.raw/*24.17*/("""<div class="actions">
                    <input type="submit" value="Submit" class="btn btn-success">
                    <a href=""""),_display_(/*26.31*/routes/*26.37*/.HomeController.contact()),format.raw/*26.62*/("""" class="btn btn-danger">Cancel</a>

                </div>
            </div>
    </div>

    </div>
    """)))}),format.raw/*33.6*/("""
			  
			"""),format.raw/*35.4*/("""<div class="row">
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
                  DATE: Mon Apr 10 13:57:25 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/contact.scala.html
                  HASH: faff8dde913475646c7a40124a48586ff34f2d17
                  MATRIX: 827->21|981->80|1011->85|1039->105|1078->107|1106->109|1307->283|1348->315|1387->316|1433->334|1512->386|1526->391|1562->406|1604->420|1656->441|1702->459|1783->513|1909->629|1949->630|1995->649|2123->755|2169->774|2295->878|2341->897|2458->992|2504->1011|2620->1105|2666->1124|2811->1247|2859->1267|3021->1402|3036->1408|3082->1433|3226->1547|3265->1559
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|49->17|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|53->21|53->21|54->22|54->22|56->24|58->26|58->26|58->26|65->33|67->35
                  -- GENERATED --
              */
          