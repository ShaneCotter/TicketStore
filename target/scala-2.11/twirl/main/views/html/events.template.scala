
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

class events extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Event],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: List[models.Event],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""

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
                                <li class="active"><a href="#"><h3>EVENT CATEGORIES</h3></a></li>
                                <li><a href="#"><h4>Music</h4></a></li>
                                <li><a href="#"><h4>Sports</h4></a></li>
                                <li><a href="#"><h4>Comedy</h4></a></li>
                                <li><a href="#"><h4>Theatre</h4></a></li>
                                <li><a href="#"><h4>Racing</h4></a></li>
                                <li class="active"><a href="#"><h3>BY COUNTRY</h3></a></li>
                                <li><a href="#"><h4>Ireland</h4></a></li>
                                <li><a href="#"><h4>UK</h4></a></li>

                                <li class="active"><a href="#"><h3>BY MONTH</h3></a></li>

                                <li><a href="#"><h4>January</h4></a></li>
                                <li><a href="#"><h4>February</h4></a></li>
                                <li><a href="#"><h4>March</h4></a></li>
                                <li><a href="#"><h4>April</h4></a></li>
                                <li><a href="#"><h4>May</h4></a></li>
                                <li><a href="#"><h4>June</h4></a></li>
                                <li><a href="#"><h4>July</h4></a></li>
                                <li><a href="#"><h4>August</h4></a></li>
                                <li><a href="#"><h4>September</h4></a></li>
                                <li><a href="#"><h4>October</h4></a></li>
                                <li><a href="#"><h4>November</h4></a></li>
                                <li><a href="#"><h4>December</h4></a></li>
                            </ul>
                            <br>
                            <br>
                        </div><!--/.nav-collapse -->
                    </div>
                </div>
            </div>


                <!--Main content--->
            <div class="col-sm-9">
                <div class="row">
                    <h1> Events </h1>
                    <a href=""""),_display_(/*60.31*/routes/*60.37*/.HomeController.addEvent()),format.raw/*60.63*/("""" class="btn btn-success btn-lg round">Add event</a>
                    <br>
                    <br>
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
                    """),_display_(/*75.22*/for(e <- events) yield /*75.38*/ {_display_(Seq[Any](format.raw/*75.40*/("""
                        """),format.raw/*76.25*/("""<a href=""""),_display_(/*76.35*/routes/*76.41*/.HomeController.eventTicket()),format.raw/*76.70*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">

                                    <img class="group list-group-image" src="http://placehold.it/400x250/000/fff" alt="" >
                                    <div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*83.42*/e/*83.43*/.getTitle),format.raw/*83.52*/("""</h4>
                                        <p class="group inner list-group-item-text">
                                            """),_display_(/*85.46*/e/*85.47*/.getEventName),format.raw/*85.60*/("""
                                            """),_display_(/*86.46*/e/*86.47*/.getLocation),format.raw/*86.59*/("""
                                            """),_display_(/*87.46*/e/*87.47*/.getDate),format.raw/*87.55*/("""
                                        """),format.raw/*88.41*/("""</p>
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                                <p class="lead">
                                Starting from €95.00</p>

                                                <a href=""""),_display_(/*94.59*/routes/*94.65*/.HomeController.deleteEvent(e.getEventID)),format.raw/*94.106*/("""" class = "btn-xs btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            </div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>
                    """)))}),format.raw/*106.22*/(""" """),format.raw/*106.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*121.42*/("""{"""),format.raw/*121.43*/("""
                """),format.raw/*122.17*/("""$('#list').click(function(event)"""),format.raw/*122.49*/("""{"""),format.raw/*122.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*122.122*/("""}"""),format.raw/*122.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*123.49*/("""{"""),format.raw/*123.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*123.174*/("""}"""),format.raw/*123.175*/(""");
            """),format.raw/*124.13*/("""}"""),format.raw/*124.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*128.30*/("""{"""),format.raw/*128.31*/("""
            """),format.raw/*129.13*/("""return confirm('Are you sure?');
        """),format.raw/*130.9*/("""}"""),format.raw/*130.10*/("""
    """),format.raw/*131.5*/("""</script>
""")))}))
      }
    }
  }

  def render(events:List[models.Event],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(events,user)

  def f:((List[models.Event],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (events,user) => apply(events,user)

  def ref: this.type = this

}


}

/**/
object events extends events_Scope0.events
              /*
                  -- GENERATED --
                  DATE: Thu Mar 30 11:34:08 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/events.scala.html
                  HASH: b755187c1be760589dc1631ee9e46f64da41b7e3
                  MATRIX: 777->1|924->53|952->56|979->75|1018->77|1051->84|4145->3151|4160->3157|4207->3183|4949->3898|4981->3914|5021->3916|5074->3941|5111->3951|5126->3957|5176->3986|5640->4423|5650->4424|5680->4433|5843->4569|5853->4570|5887->4583|5960->4629|5970->4630|6003->4642|6076->4688|6086->4689|6115->4697|6184->4738|6532->5059|6547->5065|6610->5106|7172->5636|7202->5637|7549->5955|7579->5956|7625->5973|7686->6005|7716->6006|7818->6078|7849->6079|7929->6130|7959->6131|8113->6255|8144->6256|8188->6271|8218->6272|8351->6376|8381->6377|8423->6390|8492->6431|8522->6432|8555->6437
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|91->60|91->60|91->60|106->75|106->75|106->75|107->76|107->76|107->76|107->76|114->83|114->83|114->83|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|125->94|125->94|125->94|137->106|137->106|152->121|152->121|153->122|153->122|153->122|153->122|153->122|154->123|154->123|154->123|154->123|155->124|155->124|159->128|159->128|160->129|161->130|161->130|162->131
                  -- GENERATED --
              */
          