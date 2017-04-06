
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
                                        <p class="group inner list-group-item-text">
                                            """),_display_(/*69.46*/e/*69.47*/.getEventName),format.raw/*69.60*/("""
                                            """),format.raw/*70.45*/("""<br>
                                            """),_display_(/*71.46*/e/*71.47*/.getLocation),format.raw/*71.59*/("""
                                            """),format.raw/*72.45*/("""<br>
                                            """),_display_(/*73.46*/e/*73.47*/.getDate),format.raw/*73.55*/("""
                                            """),format.raw/*74.45*/("""<br>
                                            """),_display_(/*75.46*/e/*75.47*/.getCategory.getName),format.raw/*75.67*/("""
                                            """),format.raw/*76.45*/("""Starting from €
                                        </p>
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            """),_display_(/*80.46*/if(user.getRole.equals("admin"))/*80.78*/ {_display_(Seq[Any](format.raw/*80.80*/("""
                                                """),format.raw/*81.49*/("""<a href=""""),_display_(/*81.59*/routes/*81.65*/.HomeController.updateEvent(e.getEventID)),format.raw/*81.106*/("""" class="btn btn-danger">
                                                    <span class="glyphicon glyphicon-wrench"></span>
                                                </a>
                                                <a href=""""),_display_(/*84.59*/routes/*84.65*/.HomeController.deleteEvent(e.getEventID)),format.raw/*84.106*/("""" class = "btn btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            """)))}),format.raw/*88.46*/("""
                                            """),format.raw/*89.45*/("""</div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*98.22*/(""" """),format.raw/*98.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*113.42*/("""{"""),format.raw/*113.43*/("""
                """),format.raw/*114.17*/("""$('#list').click(function(event)"""),format.raw/*114.49*/("""{"""),format.raw/*114.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*114.122*/("""}"""),format.raw/*114.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*115.49*/("""{"""),format.raw/*115.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*115.174*/("""}"""),format.raw/*115.175*/(""");
            """),format.raw/*116.13*/("""}"""),format.raw/*116.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*120.30*/("""{"""),format.raw/*120.31*/("""
            """),format.raw/*121.13*/("""return confirm('Are you sure?');
        """),format.raw/*122.9*/("""}"""),format.raw/*122.10*/("""
    """),format.raw/*123.5*/("""</script>
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
                  DATE: Thu Apr 06 16:01:40 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/events.scala.html
                  HASH: 49cfbee376469e496e05374a282eb473eeecd0af
                  MATRIX: 799->1|982->89|1010->92|1037->111|1076->113|1109->120|2318->1302|2333->1308|2379->1333|2485->1412|2521->1432|2561->1434|2625->1470|2662->1480|2677->1486|2732->1520|2803->1563|2814->1564|2844->1572|2913->1613|2961->1634|2971->1635|3009->1652|3121->1733|3182->1766|4163->2720|4195->2736|4235->2738|4288->2763|4325->2773|4340->2779|4402->2820|4866->3257|4876->3258|4906->3267|5069->3403|5079->3404|5113->3417|5186->3462|5263->3512|5273->3513|5306->3525|5379->3570|5456->3620|5466->3621|5495->3629|5568->3674|5645->3724|5655->3725|5696->3745|5769->3790|6037->4031|6078->4063|6118->4065|6195->4114|6232->4124|6247->4130|6310->4171|6575->4409|6590->4415|6653->4456|6989->4761|7062->4806|7317->5030|7346->5031|7693->5349|7723->5350|7769->5367|7830->5399|7860->5400|7962->5472|7993->5473|8073->5524|8103->5525|8257->5649|8288->5650|8332->5665|8362->5666|8495->5770|8525->5771|8567->5784|8636->5825|8666->5826|8699->5831
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|90->59|90->59|90->59|91->60|91->60|91->60|91->60|98->67|98->67|98->67|100->69|100->69|100->69|101->70|102->71|102->71|102->71|103->72|104->73|104->73|104->73|105->74|106->75|106->75|106->75|107->76|111->80|111->80|111->80|112->81|112->81|112->81|112->81|115->84|115->84|115->84|119->88|120->89|129->98|129->98|144->113|144->113|145->114|145->114|145->114|145->114|145->114|146->115|146->115|146->115|146->115|147->116|147->116|151->120|151->120|152->121|153->122|153->122|154->123
                  -- GENERATED --
              */
          