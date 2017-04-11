
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
                <!--Search bar-->
                <div class="nav navbar-nav navbar-center" id="search">
                    <form class="navbar-form" role="search">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
                            <div class="input-group-btn">
                                <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                            </div>
                        </div>
                    </form>
                </div>
                <!--/Search Bar-->
                <div class="nav navbar-nav navbar-right" id="nav-buttons">
                    """),_display_(/*45.22*/if(user != null)/*45.38*/{_display_(Seq[Any](format.raw/*45.39*/("""
                        """),format.raw/*46.25*/("""<a href=""""),_display_(/*46.35*/routes/*46.41*/.HomeController.cart()),format.raw/*46.63*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-shopping-cart"></i></a>
                        <a href=""""),_display_(/*47.35*/routes/*47.41*/.LoginController.logout()),format.raw/*47.66*/("""" class="btn btn-success btn-circle btn-md"><span class="glyphicon glyphicon-off"></span>LOGOUT</a>
                        """),_display_(/*48.26*/if(user.getRole.equals("admin"))/*48.58*/ {_display_(Seq[Any](format.raw/*48.60*/("""
                            """),format.raw/*49.29*/("""<div class="dropdown" id="adminOptions">
                                <button class="btn btn-success btn-circle btn-md" data-toggle="dropdown"><i class="glyphicon glyphicon-cog"></i>Admin Options
                                    <span class="caret"></span></button>
                                <ul class="dropdown-menu">
                                    <li><a href=""""),_display_(/*53.51*/routes/*53.57*/.HomeController.addEvent()),format.raw/*53.83*/("""">Add event</a></li>
                                    <li><a href=""""),_display_(/*54.51*/routes/*54.57*/.HomeController.addTicket()),format.raw/*54.84*/("""">Add ticket</a></li>
                                    <li><a href=""""),_display_(/*55.51*/routes/*55.57*/.HomeController.adminevents(0)),format.raw/*55.87*/("""">Manage events</a></li>
                                    <li><a href=""""),_display_(/*56.51*/routes/*56.57*/.HomeController.viewContact()),format.raw/*56.86*/("""">View contacts</a></li>
                                </ul>
                            </div>
                        """)))}),format.raw/*59.26*/("""
                    """)))}/*60.22*/else/*60.26*/{_display_(Seq[Any](format.raw/*60.27*/("""
                        """),format.raw/*61.25*/("""<a href=""""),_display_(/*61.35*/routes/*61.41*/.LoginController.login()),format.raw/*61.65*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-user"></i>Login</a>
                        <a href=""""),_display_(/*62.35*/routes/*62.41*/.HomeController.signUp()),format.raw/*62.65*/("""" class="btn btn-success btn-circle btn-md"><span class="glyphcon glyphicon-pencil"></span>Sign up</a>
                    """)))}),format.raw/*63.22*/("""
                """),format.raw/*64.17*/("""</div>
            </div>
        </div>
        <div id="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="nav-bottom">
                    <a href=""""),_display_(/*70.31*/routes/*70.37*/.HomeController.index),format.raw/*70.58*/("""">HOME</a>
                    <a href=""""),_display_(/*71.31*/routes/*71.37*/.HomeController.events(0)),format.raw/*71.62*/("""">EVENTS</a>
                    <a href=""""),_display_(/*72.31*/routes/*72.37*/.HomeController.myAccount),format.raw/*72.62*/("""">MY ACCOUNT</a>
                    <a href=""""),_display_(/*73.31*/routes/*73.37*/.HomeController.contact),format.raw/*73.60*/("""">CONTACT US</a>
                </div>
            </div>
        </div>
    </div>

        """),_display_(/*79.10*/content),format.raw/*79.17*/("""

"""),format.raw/*81.1*/("""<div class="container" id = "footer">
        <div class="row">
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 pull-left">
                <a href=""""),_display_(/*84.27*/routes/*84.33*/.HomeController.index()),format.raw/*84.56*/(""""><h2>TC <span>EVENTS</h2></a>
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
                  DATE: Tue Apr 11 12:42:34 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/main.scala.html
                  HASH: 5c63902cccd52825697c9b6324b8ef9c5b2b7c54
                  MATRIX: 1025->266|1173->319|1203->323|1254->348|1280->353|1384->430|1399->436|1462->478|2597->1586|2612->1592|2656->1615|3610->2542|3635->2558|3674->2559|3728->2585|3765->2595|3780->2601|3823->2623|3983->2756|3998->2762|4044->2787|4197->2913|4238->2945|4278->2947|4336->2977|4748->3362|4763->3368|4810->3394|4909->3466|4924->3472|4972->3499|5072->3572|5087->3578|5138->3608|5241->3684|5256->3690|5306->3719|5463->3845|5505->3868|5518->3872|5557->3873|5611->3899|5648->3909|5663->3915|5708->3939|5864->4068|5879->4074|5924->4098|6080->4223|6126->4241|6375->4463|6390->4469|6432->4490|6501->4532|6516->4538|6562->4563|6633->4607|6648->4613|6694->4638|6769->4686|6784->4692|6828->4715|6956->4816|6984->4823|7015->4827|7207->4992|7222->4998|7266->5021
                  LINES: 32->7|37->7|39->9|40->10|40->10|44->14|44->14|44->14|59->29|59->29|59->29|75->45|75->45|75->45|76->46|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48|78->48|79->49|83->53|83->53|83->53|84->54|84->54|84->54|85->55|85->55|85->55|86->56|86->56|86->56|89->59|90->60|90->60|90->60|91->61|91->61|91->61|91->61|92->62|92->62|92->62|93->63|94->64|100->70|100->70|100->70|101->71|101->71|101->71|102->72|102->72|102->72|103->73|103->73|103->73|109->79|109->79|111->81|114->84|114->84|114->84
                  -- GENERATED --
              */
          