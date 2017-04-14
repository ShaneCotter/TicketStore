
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

"""),_display_(/*3.2*/main("Events", user)/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""


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
                                <h3 class="greentext text-center">EVENT CATEGORIES</h3>
                                <div class="list-group">

                                    <a href=""""),_display_(/*27.47*/routes/*27.53*/.HomeController.events(0)),format.raw/*27.78*/("""" class="list-group-item">
                                        All categories</a>

                                    """),_display_(/*30.38*/for(c <- categories) yield /*30.58*/ {_display_(Seq[Any](format.raw/*30.60*/("""
                                        """),format.raw/*31.41*/("""<a href=""""),_display_(/*31.51*/routes/*31.57*/.HomeController.events(c.getCatID)),format.raw/*31.91*/("""" class="list-group-item" id="categories">"""),_display_(/*31.134*/c/*31.135*/.getName),format.raw/*31.143*/("""
                                        """),format.raw/*32.41*/("""<span class="badge">"""),_display_(/*32.62*/c/*32.63*/.getEvents.size()),format.raw/*32.80*/("""</span>
                                        </a>
                                    """)))}),format.raw/*34.38*/("""
                                """),format.raw/*35.33*/("""</div>
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
                    <form action=""""),_display_(/*48.36*/routes/*48.42*/.EventController.listEvents(catId)),format.raw/*48.76*/("""" method="GET" class="navbar-form" role="search">
                        <div class="input-group">
                            <input type="text" class="form-control" value=""""),_display_(/*50.77*/filter),format.raw/*50.83*/("""" placeholder="Filter by name" name="filter" id="srch-term">
                            """),format.raw/*51.107*/("""
                            """),format.raw/*52.29*/("""<button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
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
                    """),_display_(/*63.22*/if(flash.containsKey("success"))/*63.54*/ {_display_(Seq[Any](format.raw/*63.56*/("""
                        """),format.raw/*64.25*/("""<div class="alert alert-success">
                        """),_display_(/*65.26*/flash/*65.31*/.get("success")),format.raw/*65.46*/("""
                        """),format.raw/*66.25*/("""</div>
                    """)))}),format.raw/*67.22*/("""
                """),format.raw/*68.17*/("""</div>
                <br>
                <div id="products" class="row list-group">
                        <!-- Start of for loop - For each e in events add a row -->
                    """),_display_(/*72.22*/for(e <- events) yield /*72.38*/ {_display_(Seq[Any](format.raw/*72.40*/("""
                        """),format.raw/*73.25*/("""<a href=""""),_display_(/*73.35*/routes/*73.41*/.HomeController.eventTicket(e.getId)),format.raw/*73.77*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">
                                    """),_display_(/*76.38*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*76.113*/ {_display_(Seq[Any](format.raw/*76.115*/("""
                                        """),format.raw/*77.41*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*77.102*/(e.getId + ".jpg")),format.raw/*77.120*/(""""/>
                                    """)))}/*78.39*/else/*78.44*/{_display_(Seq[Any](format.raw/*78.45*/("""
                                        """),format.raw/*79.41*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                                    """)))}),format.raw/*80.38*/("""
                                """),format.raw/*81.33*/("""<div class="caption">
                                    <h4 class="group inner list-group-item-heading">
                                    """),_display_(/*83.38*/e/*83.39*/.getTitle),format.raw/*83.48*/("""</h4>
                                    <h4>"""),_display_(/*84.42*/e/*84.43*/.getEventName),format.raw/*84.56*/("""</h4>

                                    <h4>"""),_display_(/*86.42*/e/*86.43*/.getLocation),format.raw/*86.55*/("""</h4>

                                    <h4>"""),_display_(/*88.42*/e/*88.43*/.getTime),format.raw/*88.51*/(""", """),_display_(/*88.54*/e/*88.55*/.getDate),format.raw/*88.63*/("""</h4>

                                    <h5>"""),_display_(/*90.42*/e/*90.43*/.calcLowestPrice),format.raw/*90.59*/("""</h5>

                                    <div class="row">
                                        <div class="col-xs-12 col-md-6">
                                            </div>

                                    </div>
                                </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*102.22*/(""" """),format.raw/*102.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function () """),format.raw/*117.43*/("""{"""),format.raw/*117.44*/("""
                """),format.raw/*118.17*/("""$('#list').click(function (event) """),format.raw/*118.51*/("""{"""),format.raw/*118.52*/("""
                    """),format.raw/*119.21*/("""event.preventDefault();
                    $('#products .item').addClass('list-group-item');
                """),format.raw/*121.17*/("""}"""),format.raw/*121.18*/(""");
                $('#grid').click(function (event) """),format.raw/*122.51*/("""{"""),format.raw/*122.52*/("""
                    """),format.raw/*123.21*/("""event.preventDefault();
                    $('#products .item').removeClass('list-group-item');
                    $('#products .item').addClass('grid-group-item');
                """),format.raw/*126.17*/("""}"""),format.raw/*126.18*/(""");
            """),format.raw/*127.13*/("""}"""),format.raw/*127.14*/(""");</script>

        <!--Script for confirming delete of event-->
    <script>
            function confirmDel() """),format.raw/*131.35*/("""{"""),format.raw/*131.36*/("""
                """),format.raw/*132.17*/("""return confirm('Are you sure?');
            """),format.raw/*133.13*/("""}"""),format.raw/*133.14*/("""
    """),format.raw/*134.5*/("""</script>
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
                  DATE: Fri Apr 14 10:44:00 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/listEvents.scala.html
                  HASH: c2e5ecbc1ad04142f80bc857465d9889d3a478d5
                  MATRIX: 840->1|1080->145|1110->150|1138->170|1177->172|1213->182|2455->1397|2470->1403|2516->1428|2670->1555|2706->1575|2746->1577|2816->1619|2853->1629|2868->1635|2923->1669|2994->1712|3005->1713|3035->1721|3105->1763|3153->1784|3163->1785|3201->1802|3324->1894|3386->1928|3835->2350|3850->2356|3905->2390|4110->2568|4137->2574|4256->2742|4314->2772|4993->3424|5034->3456|5074->3458|5128->3484|5215->3544|5229->3549|5265->3564|5319->3590|5379->3619|5425->3637|5648->3833|5680->3849|5720->3851|5774->3877|5811->3887|5826->3893|5883->3929|6075->4094|6160->4169|6201->4171|6271->4213|6360->4274|6400->4292|6461->4335|6474->4340|6513->4341|6583->4383|6734->4503|6796->4537|6969->4683|6979->4684|7009->4693|7084->4741|7094->4742|7128->4755|7205->4805|7215->4806|7248->4818|7325->4868|7335->4869|7364->4877|7394->4880|7404->4881|7433->4889|7510->4939|7520->4940|7557->4956|7994->5361|8024->5362|8387->5696|8417->5697|8464->5715|8527->5749|8557->5750|8608->5772|8749->5884|8779->5885|8862->5939|8892->5940|8943->5962|9158->6148|9188->6149|9233->6165|9263->6166|9409->6283|9439->6284|9486->6302|9561->6348|9591->6349|9625->6355
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|58->27|58->27|58->27|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|65->34|66->35|79->48|79->48|79->48|81->50|81->50|82->51|83->52|94->63|94->63|94->63|95->64|96->65|96->65|96->65|97->66|98->67|99->68|103->72|103->72|103->72|104->73|104->73|104->73|104->73|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|111->80|112->81|114->83|114->83|114->83|115->84|115->84|115->84|117->86|117->86|117->86|119->88|119->88|119->88|119->88|119->88|119->88|121->90|121->90|121->90|133->102|133->102|148->117|148->117|149->118|149->118|149->118|150->119|152->121|152->121|153->122|153->122|154->123|157->126|157->126|158->127|158->127|162->131|162->131|163->132|164->133|164->133|165->134
                  -- GENERATED --
              */
          