
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
                  DATE: Wed Apr 12 13:31:40 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/adminevents.scala.html
                  HASH: 1be9ffc4b577c6ed130126068a5b16db5e5cc217
                  MATRIX: 836->1|1047->116|1075->119|1102->138|1141->140|1174->147|2394->1340|2409->1346|2460->1376|2566->1455|2602->1475|2642->1477|2706->1513|2743->1523|2758->1529|2818->1568|2889->1611|2900->1612|2930->1620|2999->1661|3047->1682|3057->1683|3095->1700|3207->1781|3268->1814|3668->2187|3709->2219|3748->2220|3797->2241|3879->2296|3893->2301|3929->2316|3978->2337|4033->2361|4078->2378|4159->2432|4174->2438|4221->2464|4435->2651|4450->2657|4498->2684|5315->3474|5347->3490|5387->3492|5440->3517|5477->3527|5492->3533|5554->3574|5743->3736|5828->3811|5869->3813|5938->3854|6027->3915|6067->3933|6127->3975|6140->3980|6179->3981|6248->4022|6398->4141|6463->4178|6642->4330|6652->4331|6682->4340|6764->4395|6774->4396|6808->4409|6891->4465|6901->4466|6934->4478|7017->4534|7027->4535|7056->4543|7086->4546|7096->4547|7125->4555|7208->4611|7218->4612|7255->4628|7469->4815|7510->4847|7550->4849|7627->4898|7664->4908|7679->4914|7737->4950|8003->5188|8019->5194|8078->5230|8415->5535|8489->5580|8745->5804|8775->5805|9122->6123|9152->6124|9198->6141|9259->6173|9289->6174|9391->6246|9422->6247|9502->6298|9532->6299|9686->6423|9717->6424|9761->6439|9791->6440|9924->6544|9954->6545|9996->6558|10065->6599|10095->6600|10128->6605
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|81->50|81->50|81->50|82->51|83->52|83->52|83->52|84->53|85->54|86->55|87->56|87->56|87->56|91->60|91->60|91->60|105->74|105->74|105->74|106->75|106->75|106->75|106->75|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|113->82|114->83|116->85|116->85|116->85|117->86|117->86|117->86|119->88|119->88|119->88|121->90|121->90|121->90|121->90|121->90|121->90|123->92|123->92|123->92|127->96|127->96|127->96|128->97|128->97|128->97|128->97|131->100|131->100|131->100|135->104|136->105|145->114|145->114|160->129|160->129|161->130|161->130|161->130|161->130|161->130|162->131|162->131|162->131|162->131|163->132|163->132|167->136|167->136|168->137|169->138|169->138|170->139
                  -- GENERATED --
              */
          