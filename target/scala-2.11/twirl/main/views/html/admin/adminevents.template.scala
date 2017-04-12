
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminevents_Scope0 {
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

class adminevents extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Event],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: List[models.Event], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.117*/("""

"""),_display_(/*3.2*/main("Events",user)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""


    """),format.raw/*6.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="eventContent">
        <div class="row">
            <div class="col-sm-3">
                <div class="sidebar-nav">
                    <div class="navbar navbar-default" role="navigation">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-navbar-collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <span class="visible-xs navbar-brand">Sidebar menu</span>
                        </div>
                        <div class="navbar-collapse collapse sidebar-navbar-collapse">
                            <ul class="nav navbar-nav">
                                <h3 class="greentext text-center">EVENT CATEGORIES</h3>
                                <div class="list-group">

                                    <a href=""""),_display_(/*26.47*/routes/*26.53*/.HomeController.adminevents(0)),format.raw/*26.83*/("""" class="list-group-item">All categories</a>

                                """),_display_(/*28.34*/for(c <- categories) yield /*28.54*/ {_display_(Seq[Any](format.raw/*28.56*/("""
                                   """),format.raw/*29.36*/("""<a href=""""),_display_(/*29.46*/routes/*29.52*/.HomeController.adminevents(c.getCatID)),format.raw/*29.91*/("""" class="list-group-item" id="categories">"""),_display_(/*29.134*/c/*29.135*/.getName),format.raw/*29.143*/("""
                                        """),format.raw/*30.41*/("""<span class="badge">"""),_display_(/*30.62*/c/*30.63*/.getEvents.size()),format.raw/*30.80*/("""</span>
                                   </a>
                                """)))}),format.raw/*32.34*/("""
                                """),format.raw/*33.33*/("""</div>
                            </ul>
                            <br>
                            <br>
                        </div><!--/.nav-collapse -->
                    </div>
                </div>
            </div>




                <!--Main content--->
            <br>
            <br>
            <br>
            <div class="col-sm-9">
                """),_display_(/*50.18*/if(flash.containsKey("success"))/*50.50*/{_display_(Seq[Any](format.raw/*50.51*/("""
                    """),format.raw/*51.21*/("""<div class="alert alert-success">
                    """),_display_(/*52.22*/flash/*52.27*/.get("success")),format.raw/*52.42*/("""
                    """),format.raw/*53.21*/("""</div>
                """)))}),format.raw/*54.18*/("""
                """),format.raw/*55.17*/("""<div class="row"><br>
                    <a href = """"),_display_(/*56.33*/routes/*56.39*/.HomeController.addEvent()),format.raw/*56.65*/("""" type="button" class="btn btn-success btn-md" >
                        <span class="glyphicon glyphicon-plus"></span>Add Event
                    </a>

                    <a href = """"),_display_(/*60.33*/routes/*60.39*/.HomeController.addTicket()),format.raw/*60.66*/("""" type="button" class="btn btn-success btn-md" >
                        <span class="glyphicon glyphicon-plus"></span>Add Ticket
                    </a>
                    <hr>
                    <strong>Display</strong>
                    <div class="btn-group">
                        <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
                        </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                    class="glyphicon glyphicon-th"></span>Grid</a>
                    </div>
                </div>
                <br>
                <div id="products" class="row list-group">
                        <!-- Start of for loop - Fo reach e in events add a row -->
                    """),_display_(/*74.22*/for(e <- events) yield /*74.38*/ {_display_(Seq[Any](format.raw/*74.40*/("""
                        """),format.raw/*75.25*/("""<a href=""""),_display_(/*75.35*/routes/*75.41*/.HomeController.admineventTicket(e.getId)),format.raw/*75.82*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">
                                    """),_display_(/*78.38*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*78.113*/ {_display_(Seq[Any](format.raw/*78.115*/("""
                                        """),format.raw/*79.41*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*79.102*/(e.getId + ".jpg")),format.raw/*79.120*/(""""/>
                                    """)))}/*80.39*/else/*80.44*/{_display_(Seq[Any](format.raw/*80.45*/("""
                                        """),format.raw/*81.41*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                                    """)))}),format.raw/*82.38*/("""
                                    """),format.raw/*83.37*/("""<div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*85.42*/e/*85.43*/.getTitle),format.raw/*85.52*/("""</h4>
                                            <h4>"""),_display_(/*86.50*/e/*86.51*/.getEventName),format.raw/*86.64*/("""</h4>

                                            <h4>"""),_display_(/*88.50*/e/*88.51*/.getLocation),format.raw/*88.63*/("""</h4>

                                            <h4>"""),_display_(/*90.50*/e/*90.51*/.getTime),format.raw/*90.59*/(""", """),_display_(/*90.62*/e/*90.63*/.getDate),format.raw/*90.71*/("""</h4>

                                            <h5>"""),_display_(/*92.50*/e/*92.51*/.calcLowestPrice),format.raw/*92.67*/("""</h5>

                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            """),_display_(/*96.46*/if(user.getRole.equals("admin"))/*96.78*/ {_display_(Seq[Any](format.raw/*96.80*/("""
                                                """),format.raw/*97.49*/("""<a href=""""),_display_(/*97.59*/routes/*97.65*/.HomeController.updateEvent(e.getId)),format.raw/*97.101*/("""" class="btn btn-danger">
                                                    <span class="glyphicon glyphicon-wrench"></span>
                                                </a>
                                                <a href=""""),_display_(/*100.59*/routes/*100.65*/.HomeController.deleteEvent(e.getId)),format.raw/*100.101*/("""" class = "btn btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            """)))}),format.raw/*104.46*/("""
                                            """),format.raw/*105.45*/("""</div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*114.22*/(""" """),format.raw/*114.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*129.42*/("""{"""),format.raw/*129.43*/("""
                """),format.raw/*130.17*/("""$('#list').click(function(event)"""),format.raw/*130.49*/("""{"""),format.raw/*130.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*130.122*/("""}"""),format.raw/*130.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*131.49*/("""{"""),format.raw/*131.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*131.174*/("""}"""),format.raw/*131.175*/(""");
            """),format.raw/*132.13*/("""}"""),format.raw/*132.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*136.30*/("""{"""),format.raw/*136.31*/("""
            """),format.raw/*137.13*/("""return confirm('Are you sure?');
        """),format.raw/*138.9*/("""}"""),format.raw/*138.10*/("""
    """),format.raw/*139.5*/("""</script>
""")))}))
      }
    }
  }

  def render(events:List[models.Event],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(events,categories,user,env)

  def f:((List[models.Event],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (events,categories,user,env) => apply(events,categories,user,env)

  def ref: this.type = this

}


}

/**/
object adminevents extends adminevents_Scope0.adminevents
              /*
                  -- GENERATED --
                  DATE: Wed Apr 12 14:13:01 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admin/adminevents.scala.html
                  HASH: e903ee32c368b103c3c8d88ef6797ebc69059cdb
                  MATRIX: 836->1|1047->116|1077->121|1104->140|1143->142|1179->152|2419->1365|2434->1371|2485->1401|2593->1482|2629->1502|2669->1504|2734->1541|2771->1551|2786->1557|2846->1596|2917->1639|2928->1640|2958->1648|3028->1690|3076->1711|3086->1712|3124->1729|3238->1812|3300->1846|3717->2236|3758->2268|3797->2269|3847->2291|3930->2347|3944->2352|3980->2367|4030->2389|4086->2414|4132->2432|4214->2487|4229->2493|4276->2519|4494->2710|4509->2716|4557->2743|5388->3547|5420->3563|5460->3565|5514->3591|5551->3601|5566->3607|5628->3648|5820->3813|5905->3888|5946->3890|6016->3932|6105->3993|6145->4011|6206->4054|6219->4059|6258->4060|6328->4102|6479->4222|6545->4260|6726->4414|6736->4415|6766->4424|6849->4480|6859->4481|6893->4494|6978->4552|6988->4553|7021->4565|7106->4623|7116->4624|7145->4632|7175->4635|7185->4636|7214->4644|7299->4702|7309->4703|7346->4719|7564->4910|7605->4942|7645->4944|7723->4994|7760->5004|7775->5010|7833->5046|8102->5287|8118->5293|8177->5329|8518->5638|8593->5684|8858->5917|8888->5918|9250->6251|9280->6252|9327->6270|9388->6302|9418->6303|9520->6375|9551->6376|9632->6428|9662->6429|9816->6553|9847->6554|9892->6570|9922->6571|10059->6679|10089->6680|10132->6694|10202->6736|10232->6737|10266->6743
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|81->50|81->50|81->50|82->51|83->52|83->52|83->52|84->53|85->54|86->55|87->56|87->56|87->56|91->60|91->60|91->60|105->74|105->74|105->74|106->75|106->75|106->75|106->75|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|113->82|114->83|116->85|116->85|116->85|117->86|117->86|117->86|119->88|119->88|119->88|121->90|121->90|121->90|121->90|121->90|121->90|123->92|123->92|123->92|127->96|127->96|127->96|128->97|128->97|128->97|128->97|131->100|131->100|131->100|135->104|136->105|145->114|145->114|160->129|160->129|161->130|161->130|161->130|161->130|161->130|162->131|162->131|162->131|162->131|163->132|163->132|167->136|167->136|168->137|169->138|169->138|170->139
                  -- GENERATED --
              */
          