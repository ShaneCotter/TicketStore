
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String,user:models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.55*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE HTML>
<title>"""),_display_(/*10.9*/title),format.raw/*10.14*/("""</title>

<head>
    <!-- CSS link -->
    <link rel="stylesheet" href=""""),_display_(/*14.35*/routes/*14.41*/.Assets.versioned("stylesheets/style.css")),format.raw/*14.83*/("""">
    <!-- Bootstrap link -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Javascript link -->
    <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
<link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
    <div class="container-fluid" id="nav-top">
        <div class="row">
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                <a href=""""),_display_(/*29.27*/routes/*29.33*/.HomeController.index()),format.raw/*29.56*/(""""> <h1 id="logo">TC <span> Events</span></h1></a>
            </div>
            <div class="col-lg-8 col-md-8 col-sm-8 col-xs-8" id="">
                <div class="nav navbar-nav navbar-right" id="nav-buttons">
                    """),_display_(/*33.22*/if(user != null)/*33.38*/{_display_(Seq[Any](format.raw/*33.39*/("""
                        """),format.raw/*34.25*/("""<a href=""""),_display_(/*34.35*/routes/*34.41*/.EventController.listEvents()),format.raw/*34.70*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-search"></i></a>
                        <a href=""""),_display_(/*35.35*/routes/*35.41*/.HomeController.cart()),format.raw/*35.63*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-shopping-cart"></i></a>
                        <a href=""""),_display_(/*36.35*/routes/*36.41*/.LoginController.logout()),format.raw/*36.66*/("""" class="btn btn-success btn-circle btn-md"><span class="glyphicon glyphicon-off"></span>LOGOUT</a>
                        """),_display_(/*37.26*/if(user.getRole.equals("admin"))/*37.58*/ {_display_(Seq[Any](format.raw/*37.60*/("""
                            """),format.raw/*38.29*/("""<div class="dropdown" id="adminOptions">
                                <button class="btn btn-success btn-circle btn-md" data-toggle="dropdown"><i class="glyphicon glyphicon-cog"></i>Admin Options
                                    <span class="caret"></span></button>
                                <ul class="dropdown-menu">
                                    <li><a href=""""),_display_(/*42.51*/routes/*42.57*/.HomeController.addEvent()),format.raw/*42.83*/("""">Add event</a></li>
                                    <li><a href=""""),_display_(/*43.51*/routes/*43.57*/.HomeController.addTicket()),format.raw/*43.84*/("""">Add ticket</a></li>
                                    <li><a href=""""),_display_(/*44.51*/routes/*44.57*/.HomeController.adminevents(0)),format.raw/*44.87*/("""">Manage events</a></li>
                                    <li><a href=""""),_display_(/*45.51*/routes/*45.57*/.HomeController.viewContact()),format.raw/*45.86*/("""">View contacts</a></li>
                                </ul>
                            </div>
                        """)))}),format.raw/*48.26*/("""
                    """)))}/*49.22*/else/*49.26*/{_display_(Seq[Any](format.raw/*49.27*/("""
                        """),format.raw/*50.25*/("""<a href=""""),_display_(/*50.35*/routes/*50.41*/.EventController.listEvents()),format.raw/*50.70*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-search"></i></a>
                        <a href=""""),_display_(/*51.35*/routes/*51.41*/.LoginController.login()),format.raw/*51.65*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-user"></i>Login</a>
                        <a href=""""),_display_(/*52.35*/routes/*52.41*/.HomeController.signUp()),format.raw/*52.65*/("""" class="btn btn-success btn-circle btn-md"><span class="glyphcon glyphicon-pencil"></span>Sign up</a>
                    """)))}),format.raw/*53.22*/("""
                """),format.raw/*54.17*/("""</div>
            </div>
        </div>
        <div id="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="nav-bottom">
                    <a href=""""),_display_(/*60.31*/routes/*60.37*/.HomeController.index),format.raw/*60.58*/("""">HOME</a>
                    <a href=""""),_display_(/*61.31*/routes/*61.37*/.HomeController.events(0)),format.raw/*61.62*/("""">EVENTS</a>
                    <a href=""""),_display_(/*62.31*/routes/*62.37*/.HomeController.myAccount),format.raw/*62.62*/("""">MY ACCOUNT</a>
                    <a href=""""),_display_(/*63.31*/routes/*63.37*/.HomeController.contact),format.raw/*63.60*/("""">CONTACT US</a>
                </div>
            </div>
        </div>
    </div>

        """),_display_(/*69.10*/content),format.raw/*69.17*/("""

"""),format.raw/*71.1*/("""<div class="container" id = "footer">
        <div class="row">
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 pull-left">
                <a href=""""),_display_(/*74.27*/routes/*74.33*/.HomeController.index()),format.raw/*74.56*/(""""><h2>TC <span>EVENTS</h2></a>
            </div>
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6" id="icon div">
                <a href="#"><i class="fa fa-3x fa-fw fa-instagram text-inverse pull-right" id="icon"></i></a>
                <a href="#"><i class="fa fa-3x fa-fw fa-twitter text-inverse pull-right" id="icon"></i></a>
                <a href="#"><i class="fa fa-3x fa-fw fa-facebook text-inverse pull-right" id="icon"></i></a>
                <a href="http://github.com/ShaneCotter/TicketStore"><i class="fa fa-3x fa-fw fa-github text-inverse pull-right" id="icon"></i></a>
            </div>
        </div>
    </div>
</body>
  
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 14:54:57 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/main.scala.html
                  HASH: 6d38bde6b5b8f46cfab5cf6acbdc38965d4a3f03
                  MATRIX: 1025->266|1173->319|1203->323|1254->348|1280->353|1384->430|1399->436|1462->478|2597->1586|2612->1592|2656->1615|2920->1852|2945->1868|2984->1869|3038->1895|3075->1905|3090->1911|3140->1940|3293->2066|3308->2072|3351->2094|3511->2227|3526->2233|3572->2258|3725->2384|3766->2416|3806->2418|3864->2448|4276->2833|4291->2839|4338->2865|4437->2937|4452->2943|4500->2970|4600->3043|4615->3049|4666->3079|4769->3155|4784->3161|4834->3190|4991->3316|5033->3339|5046->3343|5085->3344|5139->3370|5176->3380|5191->3386|5241->3415|5394->3541|5409->3547|5454->3571|5610->3700|5625->3706|5670->3730|5826->3855|5872->3873|6121->4095|6136->4101|6178->4122|6247->4164|6262->4170|6308->4195|6379->4239|6394->4245|6440->4270|6515->4318|6530->4324|6574->4347|6702->4448|6730->4455|6761->4459|6953->4624|6968->4630|7012->4653
                  LINES: 32->7|37->7|39->9|40->10|40->10|44->14|44->14|44->14|59->29|59->29|59->29|63->33|63->33|63->33|64->34|64->34|64->34|64->34|65->35|65->35|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|72->42|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|78->48|79->49|79->49|79->49|80->50|80->50|80->50|80->50|81->51|81->51|81->51|82->52|82->52|82->52|83->53|84->54|90->60|90->60|90->60|91->61|91->61|91->61|92->62|92->62|92->62|93->63|93->63|93->63|99->69|99->69|101->71|104->74|104->74|104->74
                  -- GENERATED --
              */
          