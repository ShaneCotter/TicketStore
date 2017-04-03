
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
                    """),_display_(/*76.22*/for(e <- events) yield /*76.38*/ {_display_(Seq[Any](format.raw/*76.40*/("""
                        """),format.raw/*77.25*/("""<a href=""""),_display_(/*77.35*/routes/*77.41*/.HomeController.eventTicket()),format.raw/*77.70*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">

                                    <img class="group list-group-image" src="http://placehold.it/400x250/000/fff" alt="" >
                                    <div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*84.42*/e/*84.43*/.getTitle),format.raw/*84.52*/("""</h4>
                                        <p class="group inner list-group-item-text">
                                            """),_display_(/*86.46*/e/*86.47*/.getEventName),format.raw/*86.60*/("""
                                            """),_display_(/*87.46*/e/*87.47*/.getLocation),format.raw/*87.59*/("""
                                            """),_display_(/*88.46*/e/*88.47*/.getDate),format.raw/*88.55*/("""
                                        """),format.raw/*89.41*/("""</p>
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                                <p class="lead">
                                Starting from €95.00</p>

                                                <a href=""""),_display_(/*95.59*/routes/*95.65*/.HomeController.deleteEvent(e.getEventID)),format.raw/*95.106*/("""" class = "btn-xs btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            </div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>
                    """)))}),format.raw/*107.22*/(""" """),format.raw/*107.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*122.42*/("""{"""),format.raw/*122.43*/("""
                """),format.raw/*123.17*/("""$('#list').click(function(event)"""),format.raw/*123.49*/("""{"""),format.raw/*123.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*123.122*/("""}"""),format.raw/*123.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*124.49*/("""{"""),format.raw/*124.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*124.174*/("""}"""),format.raw/*124.175*/(""");
            """),format.raw/*125.13*/("""}"""),format.raw/*125.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*129.30*/("""{"""),format.raw/*129.31*/("""
            """),format.raw/*130.13*/("""return confirm('Are you sure?');
        """),format.raw/*131.9*/("""}"""),format.raw/*131.10*/("""
    """),format.raw/*132.5*/("""</script>
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
                  DATE: Mon Apr 03 12:13:42 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/events.scala.html
                  HASH: f6d0142b62cd424a71ffb5dd9f3e0994229b8dd3
                  MATRIX: 777->1|924->53|954->58|981->77|1020->79|1056->89|4854->3860|4886->3876|4926->3878|4980->3904|5017->3914|5032->3920|5082->3949|5553->4393|5563->4394|5593->4403|5758->4541|5768->4542|5802->4555|5876->4602|5886->4603|5919->4615|5993->4662|6003->4663|6032->4671|6102->4713|6456->5040|6471->5046|6534->5087|7108->5629|7138->5630|7500->5963|7530->5964|7577->5982|7638->6014|7668->6015|7770->6087|7801->6088|7882->6140|7912->6141|8066->6265|8097->6266|8142->6282|8172->6283|8309->6391|8339->6392|8382->6406|8452->6448|8482->6449|8516->6455
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|107->76|107->76|107->76|108->77|108->77|108->77|108->77|115->84|115->84|115->84|117->86|117->86|117->86|118->87|118->87|118->87|119->88|119->88|119->88|120->89|126->95|126->95|126->95|138->107|138->107|153->122|153->122|154->123|154->123|154->123|154->123|154->123|155->124|155->124|155->124|155->124|156->125|156->125|160->129|160->129|161->130|162->131|162->131|163->132
                  -- GENERATED --
              */
          