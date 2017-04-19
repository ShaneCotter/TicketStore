
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
                  DATE: Wed Apr 19 12:40:01 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/listEvents.scala.html
                  HASH: 5055d77871cf96caf981e9a30a8640e94badb2b9
                  MATRIX: 840->1|1080->145|1108->148|1136->168|1175->170|1208->177|2429->1371|2444->1377|2490->1402|2641->1526|2677->1546|2717->1548|2786->1589|2823->1599|2838->1605|2893->1639|2964->1682|2975->1683|3005->1691|3074->1732|3122->1753|3132->1754|3170->1771|3291->1861|3352->1894|3788->2303|3803->2309|3858->2343|4061->2519|4088->2525|4206->2692|4263->2721|4931->3362|4972->3394|5012->3396|5065->3421|5151->3480|5165->3485|5201->3500|5254->3525|5313->3553|5358->3570|5577->3762|5609->3778|5649->3780|5702->3805|5739->3815|5754->3821|5811->3857|6000->4019|6085->4094|6126->4096|6195->4137|6284->4198|6324->4216|6384->4258|6397->4263|6436->4264|6505->4305|6655->4424|6716->4457|6887->4601|6897->4602|6927->4611|7001->4658|7011->4659|7045->4672|7120->4720|7130->4721|7163->4733|7238->4781|7248->4782|7277->4790|7307->4793|7317->4794|7346->4802|7421->4850|7431->4851|7468->4867|7893->5260|7923->5261|8271->5580|8301->5581|8347->5598|8410->5632|8440->5633|8490->5654|8629->5764|8659->5765|8741->5818|8771->5819|8821->5840|9033->6023|9063->6024|9107->6039|9137->6040|9279->6153|9309->6154|9355->6171|9429->6216|9459->6217|9492->6222
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|58->27|58->27|58->27|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|65->34|66->35|79->48|79->48|79->48|81->50|81->50|82->51|83->52|94->63|94->63|94->63|95->64|96->65|96->65|96->65|97->66|98->67|99->68|103->72|103->72|103->72|104->73|104->73|104->73|104->73|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|111->80|112->81|114->83|114->83|114->83|115->84|115->84|115->84|117->86|117->86|117->86|119->88|119->88|119->88|119->88|119->88|119->88|121->90|121->90|121->90|133->102|133->102|148->117|148->117|149->118|149->118|149->118|150->119|152->121|152->121|153->122|153->122|154->123|157->126|157->126|158->127|158->127|162->131|162->131|163->132|164->133|164->133|165->134
                  -- GENERATED --
              */
          