
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
                  DATE: Tue Apr 11 13:34:25 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/listEvents.scala.html
                  HASH: 261bf0a1e5a09f45bf70b4a026628a9a159fd30b
                  MATRIX: 840->1|1080->145|1108->148|1140->172|1179->174|1212->181|2422->1364|2437->1370|2496->1408|2606->1491|2642->1511|2682->1513|2751->1554|2788->1564|2803->1570|2858->1604|2929->1647|2940->1648|2970->1656|3039->1697|3087->1718|3097->1719|3135->1736|3256->1826|3317->1859|3755->2270|3770->2276|3825->2310|4028->2486|4055->2492|4173->2659|4230->2688|4898->3329|4939->3361|4978->3362|5031->3387|5117->3446|5131->3451|5167->3466|5220->3491|5279->3519|5324->3536|5543->3728|5575->3744|5615->3746|5668->3771|5705->3781|5720->3787|5777->3823|5966->3985|6051->4060|6092->4062|6161->4103|6250->4164|6290->4182|6350->4224|6363->4229|6402->4230|6471->4271|6621->4390|6682->4423|6853->4567|6863->4568|6893->4577|6967->4624|6977->4625|7011->4638|7086->4686|7096->4687|7129->4699|7204->4747|7214->4748|7243->4756|7273->4759|7283->4760|7312->4768|7387->4816|7397->4817|7434->4833|7860->5227|7890->5228|8237->5546|8267->5547|8313->5564|8374->5596|8404->5597|8506->5669|8537->5670|8617->5721|8647->5722|8801->5846|8832->5847|8876->5862|8906->5863|9047->5975|9077->5976|9123->5993|9197->6038|9227->6039|9260->6044
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|58->27|58->27|58->27|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|64->33|65->34|80->49|80->49|80->49|82->51|82->51|83->52|84->53|95->64|95->64|95->64|96->65|97->66|97->66|97->66|98->67|99->68|100->69|104->73|104->73|104->73|105->74|105->74|105->74|105->74|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|111->80|112->81|113->82|115->84|115->84|115->84|116->85|116->85|116->85|118->87|118->87|118->87|120->89|120->89|120->89|120->89|120->89|120->89|122->91|122->91|122->91|135->104|135->104|150->119|150->119|151->120|151->120|151->120|151->120|151->120|152->121|152->121|152->121|152->121|153->122|153->122|157->126|157->126|158->127|159->128|159->128|160->129
                  -- GENERATED --
              */
          