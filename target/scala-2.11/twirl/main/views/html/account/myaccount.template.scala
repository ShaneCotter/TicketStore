
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object myaccount_Scope0 {
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

class myaccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""
"""),_display_(/*2.2*/main("My Account", user)/*2.26*/ {_display_(Seq[Any](format.raw/*2.28*/("""


    """),format.raw/*5.5*/("""<div class="container " id="content">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center" id="user-order-display">
            <div class="row">
                """),_display_(/*8.18*/if(flash.containsKey("success"))/*8.50*/ {_display_(Seq[Any](format.raw/*8.52*/("""
                    """),format.raw/*9.21*/("""<div class="alert alert-success text-center">
                    """),_display_(/*10.22*/flash/*10.27*/.get("success")),format.raw/*10.42*/("""
                    """),format.raw/*11.21*/("""</div>
                """)))}),format.raw/*12.18*/("""
                """),_display_(/*13.18*/if(flash.containsKey("danger"))/*13.49*/ {_display_(Seq[Any](format.raw/*13.51*/("""
                    """),format.raw/*14.21*/("""<div class="alert alert-danger text-center">
                    """),_display_(/*15.22*/flash/*15.27*/.get("danger")),format.raw/*15.41*/("""
                    """),format.raw/*16.21*/("""</div>
                """)))}),format.raw/*17.18*/("""
                """),format.raw/*18.17*/("""<h1>My Account</h1>
                <hr>
                <a href = """"),_display_(/*20.29*/routes/*20.35*/.HomeController.myOrders()),format.raw/*20.61*/("""" class="btn btn-success btn-lg" id="user-order-button">
                    <span class="glyphicon glyphicon-calendar"></span>My Orders
                </a>

                <a href = """"),_display_(/*24.29*/routes/*24.35*/.HomeController.updateDetails()),format.raw/*24.66*/("""" class="btn btn-success btn-lg" id="user-account-button">
                    <span class="glyphicon glyphicon-user"></span>Update Details
                </a>


                <a href = """"),_display_(/*29.29*/routes/*29.35*/.LoginController.deleteAccountPage()),format.raw/*29.71*/("""" type="button" class="btn btn-success btn-lg" id="user-delete-button">
                    <span class="glyphicon glyphicon-trash"></span>Delete Account
                </a>

                <a href = """"),_display_(/*33.29*/routes/*33.35*/.HomeController.reportProblem()),format.raw/*33.66*/("""" type="button" class="btn btn-success btn-lg" id="user-problem-button">
                    <span class="glyphicon glyphicon-envelope"></span>Report problem
                </a>

                <hr>

                    <div class="thumbnail">
                    """),_display_(/*40.22*/if(env.resource("public/images/profile/" + user.getEmail + ".jpg").isDefined)/*40.99*/ {_display_(Seq[Any](format.raw/*40.101*/("""
                        """),format.raw/*41.25*/("""<img class="img-circle img-responsive" src="/assets/images/profile/"""),_display_(/*41.93*/(user.getEmail + ".jpg")),format.raw/*41.117*/(""""/>
                    """)))}/*42.23*/else/*42.28*/{_display_(Seq[Any](format.raw/*42.29*/("""
                        """),format.raw/*43.25*/("""<img class="img-circle img-responsive" src="/assets/images/profile/noImage.png" alt="" >
                    """)))}),format.raw/*44.22*/("""
                    """),format.raw/*45.21*/("""<h3 class="text-center"><span class="greentext">Name: </span>"""),_display_(/*45.83*/user/*45.87*/.getName),format.raw/*45.95*/("""</h3>
                    <h3 class="text-center"><span class="greentext">Email: </span>"""),_display_(/*46.84*/user/*46.88*/.getEmail),format.raw/*46.97*/("""</h3>
                    <h3 class="text-center"><span class="greentext">Role:</span> """),_display_(/*47.83*/user/*47.87*/.getRole),format.raw/*47.95*/("""</h3>
                    </div>
                </div>
            </div>
        </div>


""")))}))
      }
    }
  }

  def render(user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,env)

  def f:((models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,env) => apply(user,env)

  def ref: this.type = this

}


}

/**/
object myaccount extends myaccount_Scope0.myaccount
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 16:08:15 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/account/myaccount.scala.html
                  HASH: 7e34c3db06b1b9bd8bdd7e9e64909b10528fdabf
                  MATRIX: 793->1|940->53|968->56|1000->80|1039->82|1075->92|1287->278|1327->310|1366->312|1415->334|1510->402|1524->407|1560->422|1610->444|1666->469|1712->488|1752->519|1792->521|1842->543|1936->610|1950->615|1985->629|2035->651|2091->676|2137->694|2235->765|2250->771|2297->797|2515->988|2530->994|2582->1025|2805->1221|2820->1227|2877->1263|3112->1471|3127->1477|3179->1508|3480->1782|3566->1859|3607->1861|3661->1887|3756->1955|3802->1979|3847->2006|3860->2011|3899->2012|3953->2038|4095->2149|4145->2171|4234->2233|4247->2237|4276->2245|4393->2335|4406->2339|4436->2348|4552->2437|4565->2441|4594->2449
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18|51->20|51->20|51->20|55->24|55->24|55->24|60->29|60->29|60->29|64->33|64->33|64->33|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|75->44|76->45|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47
                  -- GENERATED --
              */
          