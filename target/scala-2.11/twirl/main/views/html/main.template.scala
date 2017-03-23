
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

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
                    <a href=""""),_display_(/*45.31*/routes/*45.37*/.HomeController.cart()),format.raw/*45.59*/("""" class="btn btn-success btn-circle btn-lg"><i class="glyphicon glyphicon-shopping-cart"></i></a>
                    <a href=""""),_display_(/*46.31*/routes/*46.37*/.HomeController.login()),format.raw/*46.60*/("""" class="btn btn-success btn-lg round"><span class="glyphicon glyphicon-user"></span>Login</a>
                    <a href=""""),_display_(/*47.31*/routes/*47.37*/.HomeController.signUp()),format.raw/*47.61*/("""" class="btn btn-success btn-lg round"><span class="glyphcon glyphicon-pencil"></span>Sign up</a>
                </div>
            </div>
        </div>
        <div id="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="nav-bottom">
                    <a href=""""),_display_(/*54.31*/routes/*54.37*/.HomeController.index),format.raw/*54.58*/("""">HOME</a>
                    <a href=""""),_display_(/*55.31*/routes/*55.37*/.HomeController.events),format.raw/*55.59*/("""">EVENTS</a>
                    <a href=""""),_display_(/*56.31*/routes/*56.37*/.HomeController.aboutUs),format.raw/*56.60*/("""">ABOUT US</a>
                    <a href=""""),_display_(/*57.31*/routes/*57.37*/.HomeController.contact),format.raw/*57.60*/("""">CONTACT US</a>
                </div>
            </div>
        </div>
    </div>

        """),_display_(/*63.10*/content),format.raw/*63.17*/("""

"""),format.raw/*65.1*/("""<div class="container" id = "footer">
        <div class="row">
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 pull-left">
                <a href=""""),_display_(/*68.27*/routes/*68.33*/.HomeController.index()),format.raw/*68.56*/(""""><h2>TC <span>EVENTS</h2></a>
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

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

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
                  DATE: Thu Mar 23 18:27:16 GMT 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/main.scala.html
                  HASH: 1454cd6f22e8f53bf70a7a8688e3e29d1d6974cc
                  MATRIX: 1007->266|1132->296|1162->300|1213->325|1239->330|1343->407|1358->413|1421->455|2556->1563|2571->1569|2615->1592|3578->2528|3593->2534|3636->2556|3792->2685|3807->2691|3851->2714|4004->2840|4019->2846|4064->2870|4428->3207|4443->3213|4485->3234|4554->3276|4569->3282|4612->3304|4683->3348|4698->3354|4742->3377|4815->3423|4830->3429|4874->3452|5002->3553|5030->3560|5061->3564|5253->3729|5268->3735|5312->3758
                  LINES: 32->7|37->7|39->9|40->10|40->10|44->14|44->14|44->14|59->29|59->29|59->29|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|84->54|84->54|84->54|85->55|85->55|85->55|86->56|86->56|86->56|87->57|87->57|87->57|93->63|93->63|95->65|98->68|98->68|98->68
                  -- GENERATED --
              */
          