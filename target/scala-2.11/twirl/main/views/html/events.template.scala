
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

class events extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Event],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: List[models.Event], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.117*/("""

    """),_display_(/*3.6*/main("Events", user)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""


        """),format.raw/*6.9*/("""<!--..CONTENT..-->
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

                                        <a href=""""),_display_(/*26.51*/routes/*26.57*/.HomeController.events(0)),format.raw/*26.82*/("""" class="list-group-item ">
                                            All categories</a>

                                        """),_display_(/*29.42*/for(c <- categories) yield /*29.62*/ {_display_(Seq[Any](format.raw/*29.64*/("""
                                            """),format.raw/*30.45*/("""<a href=""""),_display_(/*30.55*/routes/*30.61*/.HomeController.events(c.getCatID)),format.raw/*30.95*/("""" class="list-group-item" id="categories">"""),_display_(/*30.138*/c/*30.139*/.getName),format.raw/*30.147*/("""
                                            """),format.raw/*31.45*/("""<span class="badge">"""),_display_(/*31.66*/c/*31.67*/.getEvents.size()),format.raw/*31.84*/("""</span>
                                            </a>
                                        """)))}),format.raw/*33.42*/("""
                                    """),format.raw/*34.37*/("""</div>
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
                        """),_display_(/*54.26*/if(flash.containsKey("success"))/*54.58*/ {_display_(Seq[Any](format.raw/*54.60*/("""
                            """),format.raw/*55.29*/("""<div class="alert alert-success">
                            """),_display_(/*56.30*/flash/*56.35*/.get("success")),format.raw/*56.50*/("""
                            """),format.raw/*57.29*/("""</div>
                        """)))}),format.raw/*58.26*/("""
                    """),format.raw/*59.21*/("""</div>
                    <br>

                    <div id="products" class="row list-group">
                            <!-- Start of for loop - Fo reach e in events add a row -->
                        """),_display_(/*64.26*/for(e <- events) yield /*64.42*/ {_display_(Seq[Any](format.raw/*64.44*/("""
                            """),format.raw/*65.29*/("""<a href=""""),_display_(/*65.39*/routes/*65.45*/.HomeController.eventTicket(e.getId)),format.raw/*65.81*/("""">
                                <div class="item  col-xs-4 col-lg-4">
                                    <div class="thumbnail">
                                        """),_display_(/*68.42*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*68.117*/ {_display_(Seq[Any](format.raw/*68.119*/("""
                                            """),format.raw/*69.45*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*69.106*/(e.getId + ".jpg")),format.raw/*69.124*/(""""/>
                                        """)))}/*70.43*/else/*70.48*/{_display_(Seq[Any](format.raw/*70.49*/("""
                                            """),format.raw/*71.45*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                                        """)))}),format.raw/*72.42*/("""
                                    """),format.raw/*73.37*/("""<div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*75.42*/e/*75.43*/.getTitle),format.raw/*75.52*/("""</h4>
                                        <h4>"""),_display_(/*76.46*/e/*76.47*/.getEventName),format.raw/*76.60*/("""</h4>

                                        <h4>"""),_display_(/*78.46*/e/*78.47*/.getLocation),format.raw/*78.59*/("""</h4>

                                        <h4>"""),_display_(/*80.46*/e/*80.47*/.getTime),format.raw/*80.55*/(""", """),_display_(/*80.58*/e/*80.59*/.getDate),format.raw/*80.67*/("""</h4>

                                        <h5>"""),_display_(/*82.46*/e/*82.47*/.calcLowestPrice),format.raw/*82.63*/("""</h5>

                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            </div>

                                        </div>
                                    </div>
                                    </div>
                                </div>
                            </a>

                        """)))}),format.raw/*94.26*/(""" """),format.raw/*94.27*/("""<!-- End of for loop -->


                        <div class="col-xs-12 col-md-6">

                        </div>
                    </div>
                </div>
            </div>
        </div>

            <!--END CONTENT-->

            <!--Script for displaying products in grid/list-->
        <script>
                $(document).ready(function () """),format.raw/*109.47*/("""{"""),format.raw/*109.48*/("""
                    """),format.raw/*110.21*/("""$('#list').click(function (event) """),format.raw/*110.55*/("""{"""),format.raw/*110.56*/("""
                        """),format.raw/*111.25*/("""event.preventDefault();
                        $('#products .item').addClass('list-group-item');
                    """),format.raw/*113.21*/("""}"""),format.raw/*113.22*/(""");
                    $('#grid').click(function (event) """),format.raw/*114.55*/("""{"""),format.raw/*114.56*/("""
                        """),format.raw/*115.25*/("""event.preventDefault();
                        $('#products .item').removeClass('list-group-item');
                        $('#products .item').addClass('grid-group-item');
                    """),format.raw/*118.21*/("""}"""),format.raw/*118.22*/(""");
                """),format.raw/*119.17*/("""}"""),format.raw/*119.18*/(""");</script>

            <!--Script for confirming delete of event-->
        <script>
                function confirmDel() """),format.raw/*123.39*/("""{"""),format.raw/*123.40*/("""
                    """),format.raw/*124.21*/("""return confirm('Are you sure?');
                """),format.raw/*125.17*/("""}"""),format.raw/*125.18*/("""
        """),format.raw/*126.9*/("""</script>
    """)))}))
      }
    }
  }

  def render(events:List[models.Event],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(events,categories,user,env)

  def f:((List[models.Event],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (events,categories,user,env) => apply(events,categories,user,env)

  def ref: this.type = this

}


}

/**/
object events extends events_Scope0.events
              /*
                  -- GENERATED --
                  DATE: Wed Apr 12 12:49:25 IST 2017
                  SOURCE: /home/wdd/webapps/projectBackup/app/views/events.scala.html
                  HASH: bc80f811c318cb4173f20e18c16a253f95de5ca0
                  MATRIX: 820->1|1031->116|1063->123|1091->143|1130->145|1167->156|2463->1425|2478->1431|2524->1456|2684->1589|2720->1609|2760->1611|2833->1656|2870->1666|2885->1672|2940->1706|3011->1749|3022->1750|3052->1758|3125->1803|3173->1824|3183->1825|3221->1842|3350->1940|3415->1977|4275->2810|4316->2842|4356->2844|4413->2873|4503->2936|4517->2941|4553->2956|4610->2985|4673->3017|4722->3038|4958->3247|4990->3263|5030->3265|5087->3294|5124->3304|5139->3310|5196->3346|5397->3520|5482->3595|5523->3597|5596->3642|5685->3703|5725->3721|5789->3767|5802->3772|5841->3773|5914->3818|6068->3941|6133->3978|6312->4130|6322->4131|6352->4140|6430->4191|6440->4192|6474->4205|6553->4257|6563->4258|6596->4270|6675->4322|6685->4323|6714->4331|6744->4334|6754->4335|6783->4343|6862->4395|6872->4396|6909->4412|7365->4837|7394->4838|7782->5197|7812->5198|7862->5219|7925->5253|7955->5254|8009->5279|8156->5397|8186->5398|8272->5455|8302->5456|8356->5481|8580->5676|8610->5677|8658->5696|8688->5697|8842->5822|8872->5823|8922->5844|9000->5893|9030->5894|9067->5903
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|64->33|65->34|85->54|85->54|85->54|86->55|87->56|87->56|87->56|88->57|89->58|90->59|95->64|95->64|95->64|96->65|96->65|96->65|96->65|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|102->71|103->72|104->73|106->75|106->75|106->75|107->76|107->76|107->76|109->78|109->78|109->78|111->80|111->80|111->80|111->80|111->80|111->80|113->82|113->82|113->82|125->94|125->94|140->109|140->109|141->110|141->110|141->110|142->111|144->113|144->113|145->114|145->114|146->115|149->118|149->118|150->119|150->119|154->123|154->123|155->124|156->125|156->125|157->126
                  -- GENERATED --
              */
          