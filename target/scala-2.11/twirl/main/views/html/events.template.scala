
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
                    """),_display_(/*59.22*/for(e <- events) yield /*59.38*/ {_display_(Seq[Any](format.raw/*59.40*/("""
                        """),format.raw/*60.25*/("""<a href=""""),_display_(/*60.35*/routes/*60.41*/.HomeController.eventTicket(e.getEventID)),format.raw/*60.82*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">

                                    <img class="group list-group-image" src="http://placehold.it/400x250/000/fff" alt="" >
                                    <div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*67.42*/e/*67.43*/.getTitle),format.raw/*67.52*/("""</h4>
                                            """),_display_(/*68.46*/e/*68.47*/.getEventName),format.raw/*68.60*/("""
                                            """),format.raw/*69.45*/("""<br>
                                            """),_display_(/*70.46*/e/*70.47*/.getLocation),format.raw/*70.59*/("""
                                            """),format.raw/*71.45*/("""<br>
                                            """),_display_(/*72.46*/e/*72.47*/.getTime),format.raw/*72.55*/(""" """),format.raw/*72.56*/(""", """),_display_(/*72.59*/e/*72.60*/.getDate),format.raw/*72.68*/("""
                                            """),format.raw/*73.45*/("""<br>
                                            Starting from €
                                        </p>
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            """),_display_(/*78.46*/if(user.getRole.equals("admin"))/*78.78*/ {_display_(Seq[Any](format.raw/*78.80*/("""
                                                """),format.raw/*79.49*/("""<a href=""""),_display_(/*79.59*/routes/*79.65*/.HomeController.updateEvent(e.getEventID)),format.raw/*79.106*/("""" class="btn btn-danger">
                                                    <span class="glyphicon glyphicon-wrench"></span>
                                                </a>
                                                <a href=""""),_display_(/*82.59*/routes/*82.65*/.HomeController.deleteEvent(e.getEventID)),format.raw/*82.106*/("""" class = "btn btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            """)))}),format.raw/*86.46*/("""
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
                  DATE: Fri Apr 07 11:55:23 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/events.scala.html
                  HASH: 26b57565e83209c6d9838223d28bdc3aad3a5034
                  MATRIX: 799->1|982->89|1012->94|1039->113|1078->115|1114->125|2343->1327|2358->1333|2404->1358|2512->1439|2548->1459|2588->1461|2653->1498|2690->1508|2705->1514|2760->1548|2831->1591|2842->1592|2872->1600|2942->1642|2990->1663|3000->1664|3038->1681|3152->1764|3214->1798|4221->2778|4253->2794|4293->2796|4347->2822|4384->2832|4399->2838|4461->2879|4932->3323|4942->3324|4972->3333|5051->3385|5061->3386|5095->3399|5169->3445|5247->3496|5257->3497|5290->3509|5364->3555|5442->3606|5452->3607|5481->3615|5510->3616|5540->3619|5550->3620|5579->3628|5653->3674|5975->3969|6016->4001|6056->4003|6134->4053|6171->4063|6186->4069|6249->4110|6517->4351|6532->4357|6595->4398|6935->4707|7009->4753|7273->4986|7302->4987|7664->5320|7694->5321|7741->5339|7802->5371|7832->5372|7934->5444|7965->5445|8046->5497|8076->5498|8230->5622|8261->5623|8306->5639|8336->5640|8473->5748|8503->5749|8546->5763|8616->5805|8646->5806|8680->5812
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|90->59|90->59|90->59|91->60|91->60|91->60|91->60|98->67|98->67|98->67|99->68|99->68|99->68|100->69|101->70|101->70|101->70|102->71|103->72|103->72|103->72|103->72|103->72|103->72|103->72|104->73|109->78|109->78|109->78|110->79|110->79|110->79|110->79|113->82|113->82|113->82|117->86|118->87|127->96|127->96|142->111|142->111|143->112|143->112|143->112|143->112|143->112|144->113|144->113|144->113|144->113|145->114|145->114|149->118|149->118|150->119|151->120|151->120|152->121
                  -- GENERATED --
              */
          