
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

class events extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Event],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: List[models.Event], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.90*/("""

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
                </div>
                <br>

                <div id="products" class="row list-group">
                        <!-- Start of for loop - Fo reach e in events add a row -->
                    """),_display_(/*60.22*/for(e <- events) yield /*60.38*/ {_display_(Seq[Any](format.raw/*60.40*/("""
                        """),format.raw/*61.25*/("""<a href=""""),_display_(/*61.35*/routes/*61.41*/.HomeController.eventTicket(e.getEventID)),format.raw/*61.82*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">

                                    <img class="group list-group-image" src="http://placehold.it/400x250/000/fff" alt="" >
                                    <div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*68.42*/e/*68.43*/.getTitle),format.raw/*68.52*/("""</h4>
                                        <p class="group inner list-group-item-text">
                                            """),_display_(/*70.46*/e/*70.47*/.getEventName),format.raw/*70.60*/("""
                                            """),format.raw/*71.45*/("""<br>
                                            """),_display_(/*72.46*/e/*72.47*/.getLocation),format.raw/*72.59*/("""
                                            """),format.raw/*73.45*/("""<br>
                                            """),_display_(/*74.46*/e/*74.47*/.getDate),format.raw/*74.55*/("""
                                            """),format.raw/*75.45*/("""<br>
                                            """),_display_(/*76.46*/e/*76.47*/.getCategory.getName),format.raw/*76.67*/("""
                                            """),format.raw/*77.45*/("""Starting from €
                                        </p>
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                                """),_display_(/*81.50*/if(user.getRole.equals("admin"))/*81.82*/ {_display_(Seq[Any](format.raw/*81.84*/("""
                                                    """),format.raw/*82.53*/("""<a href=""""),_display_(/*82.63*/routes/*82.69*/.HomeController.deleteEvent(e.getEventID)),format.raw/*82.110*/("""" class = "btn btn-danger"
                                                    onclick="return confirmDel();">
                                                        <span class="glyphicon glyphicon-trash"></span>
                                                    </a>
                                                """)))}),format.raw/*86.50*/("""
                                            """),format.raw/*87.45*/("""</div>


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

  def render(events:List[models.Event],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(events,categories,user)

  def f:((List[models.Event],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (events,categories,user) => apply(events,categories,user)

  def ref: this.type = this

}


}

/**/
object events extends events_Scope0.events
              /*
                  -- GENERATED --
                  DATE: Thu Apr 06 13:20:45 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/events.scala.html
                  HASH: 4b112c3a280fae780ca49635205f2eb527d6bf39
                  MATRIX: 799->1|982->89|1012->94|1039->113|1078->115|1114->125|2343->1327|2358->1333|2404->1358|2512->1439|2548->1459|2588->1461|2653->1498|2690->1508|2705->1514|2760->1548|2831->1591|2842->1592|2872->1600|2942->1642|2990->1663|3000->1664|3038->1681|3152->1764|3214->1798|4223->2780|4255->2796|4295->2798|4349->2824|4386->2834|4401->2840|4463->2881|4934->3325|4944->3326|4974->3335|5139->3473|5149->3474|5183->3487|5257->3533|5335->3584|5345->3585|5378->3597|5452->3643|5530->3694|5540->3695|5569->3703|5643->3749|5721->3800|5731->3801|5772->3821|5846->3867|6122->4116|6163->4148|6203->4150|6285->4204|6322->4214|6337->4220|6400->4261|6756->4586|6830->4632|7094->4865|7123->4866|7485->5199|7515->5200|7562->5218|7623->5250|7653->5251|7755->5323|7786->5324|7867->5376|7897->5377|8051->5501|8082->5502|8127->5518|8157->5519|8294->5627|8324->5628|8367->5642|8437->5684|8467->5685|8501->5691
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|91->60|91->60|91->60|92->61|92->61|92->61|92->61|99->68|99->68|99->68|101->70|101->70|101->70|102->71|103->72|103->72|103->72|104->73|105->74|105->74|105->74|106->75|107->76|107->76|107->76|108->77|112->81|112->81|112->81|113->82|113->82|113->82|113->82|117->86|118->87|127->96|127->96|142->111|142->111|143->112|143->112|143->112|143->112|143->112|144->113|144->113|144->113|144->113|145->114|145->114|149->118|149->118|150->119|151->120|151->120|152->121
                  -- GENERATED --
              */
          