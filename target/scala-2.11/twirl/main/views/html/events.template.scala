
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
                  DATE: Fri Apr 07 13:23:12 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/events.scala.html
                  HASH: f1d96c104ba9831b2fec394b1e9cd478cb195f20
                  MATRIX: 799->1|982->89|1010->92|1037->111|1076->113|1109->120|2318->1302|2333->1308|2379->1333|2485->1412|2521->1432|2561->1434|2625->1470|2662->1480|2677->1486|2732->1520|2803->1563|2814->1564|2844->1572|2913->1613|2961->1634|2971->1635|3009->1652|3121->1733|3182->1766|4163->2720|4195->2736|4235->2738|4288->2763|4325->2773|4340->2779|4402->2820|4866->3257|4876->3258|4906->3267|4984->3318|4994->3319|5028->3332|5101->3377|5178->3427|5188->3428|5221->3440|5294->3485|5371->3535|5381->3536|5410->3544|5439->3545|5469->3548|5479->3549|5508->3557|5581->3602|5898->3892|5939->3924|5979->3926|6056->3975|6093->3985|6108->3991|6171->4032|6436->4270|6451->4276|6514->4317|6850->4622|6923->4667|7178->4891|7207->4892|7554->5210|7584->5211|7630->5228|7691->5260|7721->5261|7823->5333|7854->5334|7934->5385|7964->5386|8118->5510|8149->5511|8193->5526|8223->5527|8356->5631|8386->5632|8428->5645|8497->5686|8527->5687|8560->5692
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|90->59|90->59|90->59|91->60|91->60|91->60|91->60|98->67|98->67|98->67|99->68|99->68|99->68|100->69|101->70|101->70|101->70|102->71|103->72|103->72|103->72|103->72|103->72|103->72|103->72|104->73|109->78|109->78|109->78|110->79|110->79|110->79|110->79|113->82|113->82|113->82|117->86|118->87|127->96|127->96|142->111|142->111|143->112|143->112|143->112|143->112|143->112|144->113|144->113|144->113|144->113|145->114|145->114|149->118|149->118|150->119|151->120|151->120|152->121
                  -- GENERATED --
              */
          