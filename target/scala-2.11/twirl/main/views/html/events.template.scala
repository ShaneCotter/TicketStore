
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
                  DATE: Tue Apr 04 11:02:53 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/events.scala.html
                  HASH: 1a374fd45787437c668b35484e7b78d1623269a1
                  MATRIX: 777->1|924->53|952->56|979->75|1018->77|1051->84|4779->3785|4811->3801|4851->3803|4904->3828|4941->3838|4956->3844|5006->3873|5470->4310|5480->4311|5510->4320|5673->4456|5683->4457|5717->4470|5790->4516|5800->4517|5833->4529|5906->4575|5916->4576|5945->4584|6014->4625|6362->4946|6377->4952|6440->4993|7002->5523|7032->5524|7379->5842|7409->5843|7455->5860|7516->5892|7546->5893|7648->5965|7679->5966|7759->6017|7789->6018|7943->6142|7974->6143|8018->6158|8048->6159|8181->6263|8211->6264|8253->6277|8322->6318|8352->6319|8385->6324
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|107->76|107->76|107->76|108->77|108->77|108->77|108->77|115->84|115->84|115->84|117->86|117->86|117->86|118->87|118->87|118->87|119->88|119->88|119->88|120->89|126->95|126->95|126->95|138->107|138->107|153->122|153->122|154->123|154->123|154->123|154->123|154->123|155->124|155->124|155->124|155->124|156->125|156->125|160->129|160->129|161->130|162->131|162->131|163->132
                  -- GENERATED --
              */
          