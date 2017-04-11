
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object events_Scope0 {
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

class events extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Event],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

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
                                <h3 class="greentext ">EVENT CATEGORIES</h3>
                                <div class="list-group">

                                    <a href=""""),_display_(/*26.47*/routes/*26.53*/.HomeController.events(0)),format.raw/*26.78*/("""" class="list-group-item">All categories</a>

                                """),_display_(/*28.34*/for(c <- categories) yield /*28.54*/ {_display_(Seq[Any](format.raw/*28.56*/("""
                                   """),format.raw/*29.36*/("""<a href=""""),_display_(/*29.46*/routes/*29.52*/.HomeController.events(c.getCatID)),format.raw/*29.86*/("""" class="list-group-item" id="categories">"""),_display_(/*29.129*/c/*29.130*/.getName),format.raw/*29.138*/("""
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
            <div class="col-sm-9">

                <div class="row"><br>
                    <strong>Display</strong>
                    <div class="btn-group">
                        <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
                        </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                    class="glyphicon glyphicon-th"></span>Grid</a>
                    </div>
                    """),_display_(/*55.22*/if(flash.containsKey("success"))/*55.54*/{_display_(Seq[Any](format.raw/*55.55*/("""
                        """),format.raw/*56.25*/("""<div class="alert alert-success">
                        """),_display_(/*57.26*/flash/*57.31*/.get("success")),format.raw/*57.46*/("""
                        """),format.raw/*58.25*/("""</div>
                    """)))}),format.raw/*59.22*/("""
                """),format.raw/*60.17*/("""</div>
                <br>

                <div id="products" class="row list-group">
                        <!-- Start of for loop - Fo reach e in events add a row -->
                    """),_display_(/*65.22*/for(e <- events) yield /*65.38*/ {_display_(Seq[Any](format.raw/*65.40*/("""
                        """),format.raw/*66.25*/("""<a href=""""),_display_(/*66.35*/routes/*66.41*/.HomeController.eventTicket(e.getId)),format.raw/*66.77*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">
                                    """),_display_(/*69.38*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*69.113*/ {_display_(Seq[Any](format.raw/*69.115*/("""
                                        """),format.raw/*70.41*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*70.102*/(e.getId + ".jpg")),format.raw/*70.120*/(""""/>
                                    """)))}/*71.39*/else/*71.44*/{_display_(Seq[Any](format.raw/*71.45*/("""
                                        """),format.raw/*72.41*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                                        """)))}),format.raw/*73.42*/("""
                                    """),format.raw/*74.37*/("""<div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*76.42*/e/*76.43*/.getTitle),format.raw/*76.52*/("""</h4>
                                        <h4>"""),_display_(/*77.46*/e/*77.47*/.getEventName),format.raw/*77.60*/("""</h4>

                                        <h4>Location : """),_display_(/*79.57*/e/*79.58*/.getLocation),format.raw/*79.70*/("""</h4>

                                        <h4>"""),_display_(/*81.46*/e/*81.47*/.getTime),format.raw/*81.55*/(""" """),format.raw/*81.56*/(""", """),_display_(/*81.59*/e/*81.60*/.getDate),format.raw/*81.68*/("""</h4>

                                        <h5>"""),_display_(/*83.46*/e/*83.47*/.calcLowestPrice),format.raw/*83.63*/("""</h5>

                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            </div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*96.22*/(""" """),format.raw/*96.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*111.42*/("""{"""),format.raw/*111.43*/("""
                """),format.raw/*112.17*/("""$('#list').click(function(event)"""),format.raw/*112.49*/("""{"""),format.raw/*112.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*112.122*/("""}"""),format.raw/*112.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*113.49*/("""{"""),format.raw/*113.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*113.174*/("""}"""),format.raw/*113.175*/(""");
            """),format.raw/*114.13*/("""}"""),format.raw/*114.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*118.30*/("""{"""),format.raw/*118.31*/("""
            """),format.raw/*119.13*/("""return confirm('Are you sure?');
        """),format.raw/*120.9*/("""}"""),format.raw/*120.10*/("""
    """),format.raw/*121.5*/("""</script>
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
object events extends events_Scope0.events
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 13:34:24 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/events.scala.html
                  HASH: d71ea7f9d0636f04bf3f8cf7cd97b5d78644374b
                  MATRIX: 820->1|1031->116|1059->119|1086->138|1125->140|1158->147|2367->1329|2382->1335|2428->1360|2534->1439|2570->1459|2610->1461|2674->1497|2711->1507|2726->1513|2781->1547|2852->1590|2863->1591|2893->1599|2962->1640|3010->1661|3020->1662|3058->1679|3170->1760|3231->1793|4025->2560|4066->2592|4105->2593|4158->2618|4244->2677|4258->2682|4294->2697|4347->2722|4406->2750|4451->2767|4671->2960|4703->2976|4743->2978|4796->3003|4833->3013|4848->3019|4905->3055|5094->3217|5179->3292|5220->3294|5289->3335|5378->3396|5418->3414|5478->3456|5491->3461|5530->3462|5599->3503|5753->3626|5818->3663|5997->3815|6007->3816|6037->3825|6115->3876|6125->3877|6159->3890|6249->3953|6259->3954|6292->3966|6371->4018|6381->4019|6410->4027|6439->4028|6469->4031|6479->4032|6508->4040|6587->4092|6597->4093|6634->4109|7075->4519|7104->4520|7451->4838|7481->4839|7527->4856|7588->4888|7618->4889|7720->4961|7751->4962|7831->5013|7861->5014|8015->5138|8046->5139|8090->5154|8120->5155|8253->5259|8283->5260|8325->5273|8394->5314|8424->5315|8457->5320
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|86->55|86->55|86->55|87->56|88->57|88->57|88->57|89->58|90->59|91->60|96->65|96->65|96->65|97->66|97->66|97->66|97->66|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|103->72|104->73|105->74|107->76|107->76|107->76|108->77|108->77|108->77|110->79|110->79|110->79|112->81|112->81|112->81|112->81|112->81|112->81|112->81|114->83|114->83|114->83|127->96|127->96|142->111|142->111|143->112|143->112|143->112|143->112|143->112|144->113|144->113|144->113|144->113|145->114|145->114|149->118|149->118|150->119|151->120|151->120|152->121
                  -- GENERATED --
              */
          