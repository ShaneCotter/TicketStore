
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
            <div class="col-sm-9">
                <div class="row">
                """),_display_(/*50.18*/if(flash.containsKey("success"))/*50.50*/{_display_(Seq[Any](format.raw/*50.51*/("""
                    """),format.raw/*51.21*/("""<div class="alert alert-success text-center">
                    """),_display_(/*52.22*/flash/*52.27*/.get("success")),format.raw/*52.42*/("""
                    """),format.raw/*53.21*/("""</div>
                """)))}),format.raw/*54.18*/("""
                """),format.raw/*55.17*/("""<br>
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
            """),format.raw/*137.13*/("""return confirm('Are you sure you want to delete this event?');
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
                  DATE: Thu Apr 20 11:11:18 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/adminevents.scala.html
                  HASH: 51d387b296d2a30c14b34d26309994e37d8bc9b5
                  MATRIX: 836->1|1047->116|1075->119|1102->138|1141->140|1174->147|2394->1340|2409->1346|2460->1376|2566->1455|2602->1475|2642->1477|2706->1513|2743->1523|2758->1529|2818->1568|2889->1611|2900->1612|2930->1620|2999->1661|3047->1682|3057->1683|3095->1700|3207->1781|3268->1814|3685->2204|3726->2236|3765->2237|3814->2258|3908->2325|3922->2330|3958->2345|4007->2366|4062->2390|4107->2407|4171->2444|4186->2450|4233->2476|4447->2663|4462->2669|4510->2696|5327->3486|5359->3502|5399->3504|5452->3529|5489->3539|5504->3545|5566->3586|5755->3748|5840->3823|5881->3825|5950->3866|6039->3927|6079->3945|6139->3987|6152->3992|6191->3993|6260->4034|6410->4153|6475->4190|6654->4342|6664->4343|6694->4352|6776->4407|6786->4408|6820->4421|6903->4477|6913->4478|6946->4490|7029->4546|7039->4547|7068->4555|7098->4558|7108->4559|7137->4567|7220->4623|7230->4624|7267->4640|7481->4827|7522->4859|7562->4861|7639->4910|7676->4920|7691->4926|7749->4962|8015->5200|8031->5206|8090->5242|8427->5547|8501->5592|8757->5816|8787->5817|9134->6135|9164->6136|9210->6153|9271->6185|9301->6186|9403->6258|9434->6259|9514->6310|9544->6311|9698->6435|9729->6436|9773->6451|9803->6452|9936->6556|9966->6557|10008->6570|10107->6641|10137->6642|10170->6647
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|81->50|81->50|81->50|82->51|83->52|83->52|83->52|84->53|85->54|86->55|87->56|87->56|87->56|91->60|91->60|91->60|105->74|105->74|105->74|106->75|106->75|106->75|106->75|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|113->82|114->83|116->85|116->85|116->85|117->86|117->86|117->86|119->88|119->88|119->88|121->90|121->90|121->90|121->90|121->90|121->90|123->92|123->92|123->92|127->96|127->96|127->96|128->97|128->97|128->97|128->97|131->100|131->100|131->100|135->104|136->105|145->114|145->114|160->129|160->129|161->130|161->130|161->130|161->130|161->130|162->131|162->131|162->131|162->131|163->132|163->132|167->136|167->136|168->137|169->138|169->138|170->139
                  -- GENERATED --
              */
          