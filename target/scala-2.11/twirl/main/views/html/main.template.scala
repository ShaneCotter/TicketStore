
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
                                </ul>
                            </div>
                        """)))}),format.raw/*57.26*/("""
                    """)))}/*58.22*/else/*58.26*/{_display_(Seq[Any](format.raw/*58.27*/("""
                        """),format.raw/*59.25*/("""<a href=""""),_display_(/*59.35*/routes/*59.41*/.LoginController.login()),format.raw/*59.65*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-user"></i>Login</a>
                        <a href=""""),_display_(/*60.35*/routes/*60.41*/.HomeController.signUp()),format.raw/*60.65*/("""" class="btn btn-success btn-circle btn-md"><span class="glyphcon glyphicon-pencil"></span>Sign up</a>
                    """)))}),format.raw/*61.22*/("""
                """),format.raw/*62.17*/("""</div>
            </div>
        </div>
        <div id="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="nav-bottom">
                    <a href=""""),_display_(/*68.31*/routes/*68.37*/.HomeController.index),format.raw/*68.58*/("""">HOME</a>
                    <a href=""""),_display_(/*69.31*/routes/*69.37*/.HomeController.events(0)),format.raw/*69.62*/("""">EVENTS</a>
                    <a href=""""),_display_(/*70.31*/routes/*70.37*/.HomeController.aboutUs),format.raw/*70.60*/("""">ABOUT US</a>
                    <a href=""""),_display_(/*71.31*/routes/*71.37*/.HomeController.contact),format.raw/*71.60*/("""">CONTACT US</a>
                </div>
            </div>
        </div>
    </div>

        """),_display_(/*77.10*/content),format.raw/*77.17*/("""

"""),format.raw/*79.1*/("""<div class="container" id = "footer">
        <div class="row">
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 pull-left">
                <a href=""""),_display_(/*82.27*/routes/*82.33*/.HomeController.index()),format.raw/*82.56*/(""""><h2>TC <span>EVENTS</h2></a>
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
                  DATE: Fri Apr 07 13:23:12 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/main.scala.html
                  HASH: 55de4b22af2536d10761566c534ef5fb0c128d95
                  MATRIX: 1020->260|1168->313|1196->315|1246->339|1272->344|1372->417|1387->423|1450->465|2570->1558|2585->1564|2629->1587|3567->2498|3592->2514|3631->2515|3684->2540|3721->2550|3736->2556|3779->2578|3938->2710|3953->2716|3999->2741|4151->2866|4192->2898|4232->2900|4289->2929|4697->3310|4712->3316|4759->3342|4857->3413|4872->3419|4920->3446|5071->3566|5112->3588|5125->3592|5164->3593|5217->3618|5254->3628|5269->3634|5314->3658|5469->3786|5484->3792|5529->3816|5684->3940|5729->3957|5972->4173|5987->4179|6029->4200|6097->4241|6112->4247|6158->4272|6228->4315|6243->4321|6287->4344|6359->4389|6374->4395|6418->4418|6540->4513|6568->4520|6597->4522|6786->4684|6801->4690|6845->4713
                  LINES: 32->7|37->7|39->9|40->10|40->10|44->14|44->14|44->14|59->29|59->29|59->29|75->45|75->45|75->45|76->46|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48|78->48|79->49|83->53|83->53|83->53|84->54|84->54|84->54|87->57|88->58|88->58|88->58|89->59|89->59|89->59|89->59|90->60|90->60|90->60|91->61|92->62|98->68|98->68|98->68|99->69|99->69|99->69|100->70|100->70|100->70|101->71|101->71|101->71|107->77|107->77|109->79|112->82|112->82|112->82
                  -- GENERATED --
              */
          