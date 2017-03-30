
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
                        """),format.raw/*46.25*/("""<a href=""""),_display_(/*46.35*/routes/*46.41*/.HomeController.cart()),format.raw/*46.63*/("""" class="btn btn-success btn-circle btn-lg"><i class="glyphicon glyphicon-shopping-cart"></i></a>
                        <a href=""""),_display_(/*47.35*/routes/*47.41*/.LoginController.logout()),format.raw/*47.66*/("""" class="btn btn-success btn-lg round"><span class="glyphcon glyphicon-pencil"></span>LOGOUT</a>
                        """),_display_(/*48.26*/if(user.getRole.equals("admin"))/*48.58*/ {_display_(Seq[Any](format.raw/*48.60*/("""
                            """),format.raw/*49.29*/("""<a href=""""),_display_(/*49.39*/routes/*49.45*/.HomeController.addEvent()),format.raw/*49.71*/("""" class="btn btn-success btn-lg round">Add event</a>
                        """)))}),format.raw/*50.26*/("""
                    """)))}/*51.22*/else/*51.26*/{_display_(Seq[Any](format.raw/*51.27*/("""
                        """),format.raw/*52.25*/("""<a href=""""),_display_(/*52.35*/routes/*52.41*/.LoginController.login()),format.raw/*52.65*/("""" class="btn btn-success btn-circle btn-lg"><i class="glyphicon glyphicon-shopping-cart"></i>Login</a>
                        <a href=""""),_display_(/*53.35*/routes/*53.41*/.HomeController.signUp()),format.raw/*53.65*/("""" class="btn btn-success btn-lg round"><span class="glyphcon glyphicon-pencil"></span>Sign up</a>
                    """)))}),format.raw/*54.22*/("""
                """),format.raw/*55.17*/("""</div>
            </div>
        </div>
        <div id="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="nav-bottom">
                    <a href=""""),_display_(/*61.31*/routes/*61.37*/.HomeController.index),format.raw/*61.58*/("""">HOME</a>
                    <a href=""""),_display_(/*62.31*/routes/*62.37*/.HomeController.events),format.raw/*62.59*/("""">EVENTS</a>
                    <a href=""""),_display_(/*63.31*/routes/*63.37*/.HomeController.aboutUs),format.raw/*63.60*/("""">ABOUT US</a>
                    <a href=""""),_display_(/*64.31*/routes/*64.37*/.HomeController.contact),format.raw/*64.60*/("""">CONTACT US</a>
                </div>
            </div>
        </div>
    </div>

        """),_display_(/*70.10*/content),format.raw/*70.17*/("""

"""),format.raw/*72.1*/("""<div class="container" id = "footer">
        <div class="row">
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 pull-left">
                <a href=""""),_display_(/*75.27*/routes/*75.33*/.HomeController.index()),format.raw/*75.56*/(""""><h2>TC <span>EVENTS</h2></a>
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
                  DATE: Thu Mar 30 12:51:55 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/main.scala.html
                  HASH: e3e4283897ace059a857d681ee0007cf2c7aca40
                  MATRIX: 1020->260|1168->313|1196->315|1246->339|1272->344|1372->417|1387->423|1450->465|2570->1558|2585->1564|2629->1587|3567->2498|3592->2514|3631->2515|3684->2540|3721->2550|3736->2556|3779->2578|3938->2710|3953->2716|3999->2741|4148->2863|4189->2895|4229->2897|4286->2926|4323->2936|4338->2942|4385->2968|4494->3046|4535->3068|4548->3072|4587->3073|4640->3098|4677->3108|4692->3114|4737->3138|4901->3275|4916->3281|4961->3305|5111->3424|5156->3441|5399->3657|5414->3663|5456->3684|5524->3725|5539->3731|5582->3753|5652->3796|5667->3802|5711->3825|5783->3870|5798->3876|5842->3899|5964->3994|5992->4001|6021->4003|6210->4165|6225->4171|6269->4194
                  LINES: 32->7|37->7|39->9|40->10|40->10|44->14|44->14|44->14|59->29|59->29|59->29|75->45|75->45|75->45|76->46|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48|78->48|79->49|79->49|79->49|79->49|80->50|81->51|81->51|81->51|82->52|82->52|82->52|82->52|83->53|83->53|83->53|84->54|85->55|91->61|91->61|91->61|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|100->70|100->70|102->72|105->75|105->75|105->75
                  -- GENERATED --
              */
          