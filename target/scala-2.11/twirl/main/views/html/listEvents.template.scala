
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listEvents_Scope0 {
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

class listEvents extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[List[models.Event],List[models.Category],models.users.User,play.api.Environment,Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: List[models.Event], categories: List[models.Category], user: models.users.User, env: play.api.Environment, catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.146*/("""

"""),_display_(/*3.2*/main("Events List",user)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""


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

                                    <a href=""""),_display_(/*27.47*/routes/*27.53*/.EventController.listEvents(0, filter)),format.raw/*27.91*/("""" class="list-group-item">All categories</a>

                                    """),_display_(/*29.38*/for(c <- categories) yield /*29.58*/ {_display_(Seq[Any](format.raw/*29.60*/("""
                                        """),format.raw/*30.41*/("""<a href=""""),_display_(/*30.51*/routes/*30.57*/.HomeController.events(c.getCatID)),format.raw/*30.91*/("""" class="list-group-item" id="categories">"""),_display_(/*30.134*/c/*30.135*/.getName),format.raw/*30.143*/("""
                                        """),format.raw/*31.41*/("""<span class="badge">"""),_display_(/*31.62*/c/*31.63*/.getEvents.size()),format.raw/*31.80*/("""</span>
                                        </a>
                                    """)))}),format.raw/*33.38*/("""
                                """),format.raw/*34.33*/("""</div>
                            </ul>
                            <br>
                            <br>
                        </div><!--/.nav-collapse -->
                    </div>
                </div>
            </div>




                <!--Main content--->
            <div class="col-sm-9">
                <div class="nav navbar-nav navbar-center" id="search">
                    <form action=""""),_display_(/*49.36*/routes/*49.42*/.EventController.listEvents(catId)),format.raw/*49.76*/("""" method="GET" class="navbar-form" role="search">
                        <div class="input-group">
                            <input type="text" class="form-control" value=""""),_display_(/*51.77*/filter),format.raw/*51.83*/("""" placeholder="Filter by name" name="filter" id="srch-term">
                            """),format.raw/*52.107*/("""
                            """),format.raw/*53.29*/("""<button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                        </div>
                    </form>
                </div>
                <div class="row"><br>
                    <strong>Display</strong>
                    <div class="btn-group">
                        <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
                        </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                    class="glyphicon glyphicon-th"></span>Grid</a>
                    </div>
                    """),_display_(/*64.22*/if(flash.containsKey("success"))/*64.54*/{_display_(Seq[Any](format.raw/*64.55*/("""
                        """),format.raw/*65.25*/("""<div class="alert alert-success">
                        """),_display_(/*66.26*/flash/*66.31*/.get("success")),format.raw/*66.46*/("""
                        """),format.raw/*67.25*/("""</div>
                    """)))}),format.raw/*68.22*/("""
                """),format.raw/*69.17*/("""</div>
                <br>
                <div id="products" class="row list-group">
                        <!-- Start of for loop - For each e in events add a row -->
                    """),_display_(/*73.22*/for(e <- events) yield /*73.38*/ {_display_(Seq[Any](format.raw/*73.40*/("""
                        """),format.raw/*74.25*/("""<a href=""""),_display_(/*74.35*/routes/*74.41*/.HomeController.eventTicket(e.getId)),format.raw/*74.77*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">
                                    """),_display_(/*77.38*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*77.113*/ {_display_(Seq[Any](format.raw/*77.115*/("""
                                        """),format.raw/*78.41*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*78.102*/(e.getId + ".jpg")),format.raw/*78.120*/(""""/>
                                    """)))}/*79.39*/else/*79.44*/{_display_(Seq[Any](format.raw/*79.45*/("""
                                        """),format.raw/*80.41*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                                    """)))}),format.raw/*81.38*/("""
                                """),format.raw/*82.33*/("""<div class="caption">
                                    <h4 class="group inner list-group-item-heading">
                                    """),_display_(/*84.38*/e/*84.39*/.getTitle),format.raw/*84.48*/("""</h4>
                                    <h4>"""),_display_(/*85.42*/e/*85.43*/.getEventName),format.raw/*85.56*/("""</h4>

                                    <h4>"""),_display_(/*87.42*/e/*87.43*/.getLocation),format.raw/*87.55*/("""</h4>

                                    <h4>"""),_display_(/*89.42*/e/*89.43*/.getTime),format.raw/*89.51*/(""", """),_display_(/*89.54*/e/*89.55*/.getDate),format.raw/*89.63*/("""</h4>

                                    <h5>"""),_display_(/*91.42*/e/*91.43*/.calcLowestPrice),format.raw/*91.59*/("""</h5>

                                    <div class="row">
                                        <div class="col-xs-12 col-md-6">
                                            </div>


                                    </div>
                                </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*104.22*/(""" """),format.raw/*104.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*119.42*/("""{"""),format.raw/*119.43*/("""
                """),format.raw/*120.17*/("""$('#list').click(function(event)"""),format.raw/*120.49*/("""{"""),format.raw/*120.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*120.122*/("""}"""),format.raw/*120.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*121.49*/("""{"""),format.raw/*121.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*121.174*/("""}"""),format.raw/*121.175*/(""");
            """),format.raw/*122.13*/("""}"""),format.raw/*122.14*/(""");</script>

        <!--Script for confirming delete of event-->
    <script>
            function confirmDel()"""),format.raw/*126.34*/("""{"""),format.raw/*126.35*/("""
                """),format.raw/*127.17*/("""return confirm('Are you sure?');
            """),format.raw/*128.13*/("""}"""),format.raw/*128.14*/("""
    """),format.raw/*129.5*/("""</script>
""")))}))
      }
    }
  }

  def render(events:List[models.Event],categories:List[models.Category],user:models.users.User,env:play.api.Environment,catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(events,categories,user,env,catId,filter)

  def f:((List[models.Event],List[models.Category],models.users.User,play.api.Environment,Long,String) => play.twirl.api.HtmlFormat.Appendable) = (events,categories,user,env,catId,filter) => apply(events,categories,user,env,catId,filter)

  def ref: this.type = this

}


}

/**/
object listEvents extends listEvents_Scope0.listEvents
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 14:15:12 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/listEvents.scala.html
                  HASH: 431f008969038f43da1786340b417a0a7efff7bb
                  MATRIX: 840->1|1080->145|1110->150|1142->174|1181->176|1217->186|2448->1390|2463->1396|2522->1434|2634->1519|2670->1539|2710->1541|2780->1583|2817->1593|2832->1599|2887->1633|2958->1676|2969->1677|2999->1685|3069->1727|3117->1748|3127->1749|3165->1766|3288->1858|3350->1892|3803->2318|3818->2324|3873->2358|4078->2536|4105->2542|4224->2710|4282->2740|4961->3392|5002->3424|5041->3425|5095->3451|5182->3511|5196->3516|5232->3531|5286->3557|5346->3586|5392->3604|5615->3800|5647->3816|5687->3818|5741->3844|5778->3854|5793->3860|5850->3896|6042->4061|6127->4136|6168->4138|6238->4180|6327->4241|6367->4259|6428->4302|6441->4307|6480->4308|6550->4350|6701->4470|6763->4504|6936->4650|6946->4651|6976->4660|7051->4708|7061->4709|7095->4722|7172->4772|7182->4773|7215->4785|7292->4835|7302->4836|7331->4844|7361->4847|7371->4848|7400->4856|7477->4906|7487->4907|7524->4923|7963->5330|7993->5331|8355->5664|8385->5665|8432->5683|8493->5715|8523->5716|8625->5788|8656->5789|8737->5841|8767->5842|8921->5966|8952->5967|8997->5983|9027->5984|9172->6100|9202->6101|9249->6119|9324->6165|9354->6166|9388->6172
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|58->27|58->27|58->27|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|64->33|65->34|80->49|80->49|80->49|82->51|82->51|83->52|84->53|95->64|95->64|95->64|96->65|97->66|97->66|97->66|98->67|99->68|100->69|104->73|104->73|104->73|105->74|105->74|105->74|105->74|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|111->80|112->81|113->82|115->84|115->84|115->84|116->85|116->85|116->85|118->87|118->87|118->87|120->89|120->89|120->89|120->89|120->89|120->89|122->91|122->91|122->91|135->104|135->104|150->119|150->119|151->120|151->120|151->120|151->120|151->120|152->121|152->121|152->121|152->121|153->122|153->122|157->126|157->126|158->127|159->128|159->128|160->129
                  -- GENERATED --
              */
          