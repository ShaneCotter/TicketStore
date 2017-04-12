
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
  def apply/*7.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.57*/("""

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
                """),_display_(/*33.18*/if(user != null)/*33.34*/ {_display_(Seq[Any](format.raw/*33.36*/("""
                    """),format.raw/*34.21*/("""<a href=""""),_display_(/*34.31*/routes/*34.37*/.EventController.listEvents()),format.raw/*34.66*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-search"></i></a>
                    <a href=""""),_display_(/*35.31*/routes/*35.37*/.HomeController.cart()),format.raw/*35.59*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-shopping-cart"></i></a>
                    <a href=""""),_display_(/*36.31*/routes/*36.37*/.LoginController.logout()),format.raw/*36.62*/("""" class="btn btn-success btn-circle btn-md"><span class="glyphicon glyphicon-off"></span>
                        LOGOUT</a>
                    """),_display_(/*38.22*/if(user.getRole.equals("admin"))/*38.54*/ {_display_(Seq[Any](format.raw/*38.56*/("""
                        """),format.raw/*39.25*/("""<div class="dropdown" id="adminOptions">
                            <button class="btn btn-success btn-circle btn-md" data-toggle="dropdown"><i class="glyphicon glyphicon-cog"></i>
                                Admin Options
                                <span class="caret"></span></button>
                            <ul class="dropdown-menu">
                                <li><a href=""""),_display_(/*44.47*/routes/*44.53*/.HomeController.adminevents(0)),format.raw/*44.83*/("""">Manage Events</a></li>
                                <li><a href=""""),_display_(/*45.47*/routes/*45.53*/.HomeController.viewContact()),format.raw/*45.82*/("""">Manage Contacts</a></li>
                                <li><a href=""""),_display_(/*46.47*/routes/*46.53*/.HomeController.viewAccounts()),format.raw/*46.83*/("""">Manage Accounts</a></li>
                                <li><a href=""""),_display_(/*47.47*/routes/*47.53*/.HomeController.viewOrders()),format.raw/*47.81*/("""">Manage Orders</a></li>
                            </ul>
                        </div>
                    """)))}),format.raw/*50.22*/("""
                """)))}/*51.19*/else/*51.24*/{_display_(Seq[Any](format.raw/*51.25*/("""
                    """),format.raw/*52.21*/("""<a href=""""),_display_(/*52.31*/routes/*52.37*/.EventController.listEvents()),format.raw/*52.66*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-search"></i></a>
                    <a href=""""),_display_(/*53.31*/routes/*53.37*/.LoginController.login()),format.raw/*53.61*/("""" class="btn btn-success btn-circle btn-md"><i class="glyphicon glyphicon-user"></i>
                        Login</a>
                    <a href=""""),_display_(/*55.31*/routes/*55.37*/.HomeController.signUp()),format.raw/*55.61*/("""" class="btn btn-success btn-circle btn-md"><span class="glyphcon glyphicon-pencil"></span>
                        Sign up</a>
                """)))}),format.raw/*57.18*/("""
                """),format.raw/*58.17*/("""</div>
            </div>
        </div>
        <div id="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="nav-bottom">
                    <a href=""""),_display_(/*64.31*/routes/*64.37*/.HomeController.index),format.raw/*64.58*/("""">HOME</a>
                    <a href=""""),_display_(/*65.31*/routes/*65.37*/.HomeController.events(0)),format.raw/*65.62*/("""">EVENTS</a>
                    <a href=""""),_display_(/*66.31*/routes/*66.37*/.HomeController.myAccount),format.raw/*66.62*/("""">MY ACCOUNT</a>
                    <a href=""""),_display_(/*67.31*/routes/*67.37*/.HomeController.contact),format.raw/*67.60*/("""">CONTACT US</a>
                </div>
            </div>
        </div>
    </div>

    """),_display_(/*73.6*/content),format.raw/*73.13*/("""

    """),format.raw/*75.5*/("""<div class="container" id = "footer">
        <div class="row">
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 pull-left">
                <a href=""""),_display_(/*78.27*/routes/*78.33*/.HomeController.index()),format.raw/*78.56*/(""""><h2>TC <span>EVENTS</h2></a>
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
                  DATE: Wed Apr 12 14:13:01 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/main.scala.html
                  HASH: 1056b7ee43da367d45bd6e47d265b51033fcece8
                  MATRIX: 1020->261|1170->316|1200->320|1251->345|1277->350|1385->431|1400->437|1463->479|2621->1610|2636->1616|2680->1639|2940->1872|2965->1888|3005->1890|3055->1912|3092->1922|3107->1928|3157->1957|3306->2079|3321->2085|3364->2107|3520->2236|3535->2242|3581->2267|3756->2415|3797->2447|3837->2449|3891->2475|4321->2878|4336->2884|4387->2914|4486->2986|4501->2992|4551->3021|4652->3095|4667->3101|4718->3131|4819->3205|4834->3211|4883->3239|5028->3353|5066->3373|5079->3378|5118->3379|5168->3401|5205->3411|5220->3417|5270->3446|5419->3568|5434->3574|5479->3598|5657->3749|5672->3755|5717->3779|5895->3926|5941->3944|6190->4166|6205->4172|6247->4193|6316->4235|6331->4241|6377->4266|6448->4310|6463->4316|6509->4341|6584->4389|6599->4395|6643->4418|6766->4515|6794->4522|6829->4530|7021->4695|7036->4701|7080->4724
                  LINES: 32->7|37->7|39->9|40->10|40->10|44->14|44->14|44->14|59->29|59->29|59->29|63->33|63->33|63->33|64->34|64->34|64->34|64->34|65->35|65->35|65->35|66->36|66->36|66->36|68->38|68->38|68->38|69->39|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|80->50|81->51|81->51|81->51|82->52|82->52|82->52|82->52|83->53|83->53|83->53|85->55|85->55|85->55|87->57|88->58|94->64|94->64|94->64|95->65|95->65|95->65|96->66|96->66|96->66|97->67|97->67|97->67|103->73|103->73|105->75|108->78|108->78|108->78
                  -- GENERATED --
              */
          