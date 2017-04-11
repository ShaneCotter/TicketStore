
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
                        """),format.raw/*46.25*/("""<a href=""""),_display_(/*46.35*/routes/*46.41*/.EventController.listEvents()),format.raw/*46.70*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-search"></i></a>
                        <a href=""""),_display_(/*47.35*/routes/*47.41*/.HomeController.cart()),format.raw/*47.63*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-shopping-cart"></i></a>
                        <a href=""""),_display_(/*48.35*/routes/*48.41*/.LoginController.logout()),format.raw/*48.66*/("""" class="btn btn-success btn-circle btn-md"><span class="glyphicon glyphicon-off"></span>LOGOUT</a>
                        """),_display_(/*49.26*/if(user.getRole.equals("admin"))/*49.58*/ {_display_(Seq[Any](format.raw/*49.60*/("""
                            """),format.raw/*50.29*/("""<div class="dropdown" id="adminOptions">
                                <button class="btn btn-success btn-circle btn-md" data-toggle="dropdown"><i class="glyphicon glyphicon-cog"></i>Admin Options
                                    <span class="caret"></span></button>
                                <ul class="dropdown-menu">
                                    <li><a href=""""),_display_(/*54.51*/routes/*54.57*/.HomeController.addEvent()),format.raw/*54.83*/("""">Add event</a></li>
                                    <li><a href=""""),_display_(/*55.51*/routes/*55.57*/.HomeController.addTicket()),format.raw/*55.84*/("""">Add ticket</a></li>
                                    <li><a href=""""),_display_(/*56.51*/routes/*56.57*/.HomeController.adminevents(0)),format.raw/*56.87*/("""">Manage events</a></li>
                                    <li><a href=""""),_display_(/*57.51*/routes/*57.57*/.HomeController.viewContact()),format.raw/*57.86*/("""">View contacts</a></li>
                                </ul>
                            </div>
                        """)))}),format.raw/*60.26*/("""
                    """)))}/*61.22*/else/*61.26*/{_display_(Seq[Any](format.raw/*61.27*/("""
                        """),format.raw/*62.25*/("""<a href=""""),_display_(/*62.35*/routes/*62.41*/.EventController.listEvents()),format.raw/*62.70*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-search"></i></a>
                        <a href=""""),_display_(/*63.35*/routes/*63.41*/.LoginController.login()),format.raw/*63.65*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-user"></i>Login</a>
                        <a href=""""),_display_(/*64.35*/routes/*64.41*/.HomeController.signUp()),format.raw/*64.65*/("""" class="btn btn-success btn-circle btn-md"><span class="glyphcon glyphicon-pencil"></span>Sign up</a>
                    """)))}),format.raw/*65.22*/("""
                """),format.raw/*66.17*/("""</div>
            </div>
        </div>
        <div id="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="nav-bottom">
                    <a href=""""),_display_(/*72.31*/routes/*72.37*/.HomeController.index),format.raw/*72.58*/("""">HOME</a>
                    <a href=""""),_display_(/*73.31*/routes/*73.37*/.HomeController.events(0)),format.raw/*73.62*/("""">EVENTS</a>
                    <a href=""""),_display_(/*74.31*/routes/*74.37*/.HomeController.myAccount),format.raw/*74.62*/("""">MY ACCOUNT</a>
                    <a href=""""),_display_(/*75.31*/routes/*75.37*/.HomeController.contact),format.raw/*75.60*/("""">CONTACT US</a>
                </div>
            </div>
        </div>
    </div>

        """),_display_(/*81.10*/content),format.raw/*81.17*/("""

"""),format.raw/*83.1*/("""<div class="container" id = "footer">
        <div class="row">
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 pull-left">
                <a href=""""),_display_(/*86.27*/routes/*86.33*/.HomeController.index()),format.raw/*86.56*/(""""><h2>TC <span>EVENTS</h2></a>
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
                  DATE: Tue Apr 11 13:36:24 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/main.scala.html
                  HASH: b25ad886ff4894ba62e0dbdc1c67634689cdec17
                  MATRIX: 1020->260|1168->313|1196->315|1246->339|1272->344|1372->417|1387->423|1450->465|2570->1558|2585->1564|2629->1587|3567->2498|3592->2514|3631->2515|3684->2540|3721->2550|3736->2556|3786->2585|3938->2710|3953->2716|3996->2738|4155->2870|4170->2876|4216->2901|4368->3026|4409->3058|4449->3060|4506->3089|4914->3470|4929->3476|4976->3502|5074->3573|5089->3579|5137->3606|5236->3678|5251->3684|5302->3714|5404->3789|5419->3795|5469->3824|5623->3947|5664->3969|5677->3973|5716->3974|5769->3999|5806->4009|5821->4015|5871->4044|6023->4169|6038->4175|6083->4199|6238->4327|6253->4333|6298->4357|6453->4481|6498->4498|6741->4714|6756->4720|6798->4741|6866->4782|6881->4788|6927->4813|6997->4856|7012->4862|7058->4887|7132->4934|7147->4940|7191->4963|7313->5058|7341->5065|7370->5067|7559->5229|7574->5235|7618->5258
                  LINES: 32->7|37->7|39->9|40->10|40->10|44->14|44->14|44->14|59->29|59->29|59->29|75->45|75->45|75->45|76->46|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48|78->48|79->49|79->49|79->49|80->50|84->54|84->54|84->54|85->55|85->55|85->55|86->56|86->56|86->56|87->57|87->57|87->57|90->60|91->61|91->61|91->61|92->62|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|95->65|96->66|102->72|102->72|102->72|103->73|103->73|103->73|104->74|104->74|104->74|105->75|105->75|105->75|111->81|111->81|113->83|116->86|116->86|116->86
                  -- GENERATED --
              */
          