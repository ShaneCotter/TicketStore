
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminevents_Scope0 {
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

class adminevents extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Event],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

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

                                    <a href=""""),_display_(/*26.47*/routes/*26.53*/.HomeController.adminevents(0)),format.raw/*26.83*/("""" class="list-group-item">All categories</a>

                                """),_display_(/*28.34*/for(c <- categories) yield /*28.54*/ {_display_(Seq[Any](format.raw/*28.56*/("""
                                   """),format.raw/*29.36*/("""<a href=""""),_display_(/*29.46*/routes/*29.52*/.HomeController.adminevents(c.getCatID)),format.raw/*29.91*/("""" class="list-group-item" id="categories">"""),_display_(/*29.134*/c/*29.135*/.getName),format.raw/*29.143*/("""
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
                """),_display_(/*47.18*/if(flash.containsKey("success"))/*47.50*/{_display_(Seq[Any](format.raw/*47.51*/("""
                    """),format.raw/*48.21*/("""<div class="alert alert-success">
                    """),_display_(/*49.22*/flash/*49.27*/.get("success")),format.raw/*49.42*/("""
                    """),format.raw/*50.21*/("""</div>
                """)))}),format.raw/*51.18*/("""
                """),format.raw/*52.17*/("""<div class="row"><br>
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
                    """),_display_(/*64.22*/for(e <- events) yield /*64.38*/ {_display_(Seq[Any](format.raw/*64.40*/("""
                        """),format.raw/*65.25*/("""<a href=""""),_display_(/*65.35*/routes/*65.41*/.HomeController.admineventTicket(e.getEventID)),format.raw/*65.87*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">

                                    <img class="group list-group-image" src="http://placehold.it/400x250/000/fff" alt="" >
                                    <div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*72.42*/e/*72.43*/.getTitle),format.raw/*72.52*/("""</h4>
                                            """),_display_(/*73.46*/e/*73.47*/.getEventName),format.raw/*73.60*/("""
                                            """),format.raw/*74.45*/("""<br>
                                            """),_display_(/*75.46*/e/*75.47*/.getLocation),format.raw/*75.59*/("""
                                            """),format.raw/*76.45*/("""<br>
                                            """),_display_(/*77.46*/e/*77.47*/.getTime),format.raw/*77.55*/(""" """),format.raw/*77.56*/(""", """),_display_(/*77.59*/e/*77.60*/.getDate),format.raw/*77.68*/("""
                                            """),format.raw/*78.45*/("""<br>
                                            Starting from €
                                        </p>
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            """),_display_(/*83.46*/if(user.getRole.equals("admin"))/*83.78*/ {_display_(Seq[Any](format.raw/*83.80*/("""
                                                """),format.raw/*84.49*/("""<a href=""""),_display_(/*84.59*/routes/*84.65*/.HomeController.updateEvent(e.getEventID)),format.raw/*84.106*/("""" class="btn btn-danger">
                                                    <span class="glyphicon glyphicon-wrench"></span>
                                                </a>
                                                <a href=""""),_display_(/*87.59*/routes/*87.65*/.HomeController.deleteEvent(e.getEventID)),format.raw/*87.106*/("""" class = "btn btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            """)))}),format.raw/*91.46*/("""
                                            """),format.raw/*92.45*/("""</div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*101.22*/(""" """),format.raw/*101.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*116.42*/("""{"""),format.raw/*116.43*/("""
                """),format.raw/*117.17*/("""$('#list').click(function(event)"""),format.raw/*117.49*/("""{"""),format.raw/*117.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*117.122*/("""}"""),format.raw/*117.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*118.49*/("""{"""),format.raw/*118.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*118.174*/("""}"""),format.raw/*118.175*/(""");
            """),format.raw/*119.13*/("""}"""),format.raw/*119.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*123.30*/("""{"""),format.raw/*123.31*/("""
            """),format.raw/*124.13*/("""return confirm('Are you sure?');
        """),format.raw/*125.9*/("""}"""),format.raw/*125.10*/("""
    """),format.raw/*126.5*/("""</script>
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
object adminevents extends adminevents_Scope0.adminevents
              /*
                  -- GENERATED --
                  DATE: Sun Apr 09 23:00:09 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/adminevents.scala.html
                  HASH: 2c1a20718dcf2c07a42a3c73e4631f212fa86eeb
                  MATRIX: 809->1|992->89|1022->94|1049->113|1088->115|1124->125|2353->1327|2368->1333|2419->1363|2527->1444|2563->1464|2603->1466|2668->1503|2705->1513|2720->1519|2780->1558|2851->1601|2862->1602|2892->1610|2962->1652|3010->1673|3020->1674|3058->1691|3172->1774|3234->1808|3597->2144|3638->2176|3677->2177|3727->2199|3810->2255|3824->2260|3860->2275|3910->2297|3966->2322|4012->2340|4684->2985|4716->3001|4756->3003|4810->3029|4847->3039|4862->3045|4929->3091|5400->3535|5410->3536|5440->3545|5519->3597|5529->3598|5563->3611|5637->3657|5715->3708|5725->3709|5758->3721|5832->3767|5910->3818|5920->3819|5949->3827|5978->3828|6008->3831|6018->3832|6047->3840|6121->3886|6443->4181|6484->4213|6524->4215|6602->4265|6639->4275|6654->4281|6717->4322|6985->4563|7000->4569|7063->4610|7403->4919|7477->4965|7742->5198|7772->5199|8134->5532|8164->5533|8211->5551|8272->5583|8302->5584|8404->5656|8435->5657|8516->5709|8546->5710|8700->5834|8731->5835|8776->5851|8806->5852|8943->5960|8973->5961|9016->5975|9086->6017|9116->6018|9150->6024
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|78->47|78->47|78->47|79->48|80->49|80->49|80->49|81->50|82->51|83->52|95->64|95->64|95->64|96->65|96->65|96->65|96->65|103->72|103->72|103->72|104->73|104->73|104->73|105->74|106->75|106->75|106->75|107->76|108->77|108->77|108->77|108->77|108->77|108->77|108->77|109->78|114->83|114->83|114->83|115->84|115->84|115->84|115->84|118->87|118->87|118->87|122->91|123->92|132->101|132->101|147->116|147->116|148->117|148->117|148->117|148->117|148->117|149->118|149->118|149->118|149->118|150->119|150->119|154->123|154->123|155->124|156->125|156->125|157->126
                  -- GENERATED --
              */
          