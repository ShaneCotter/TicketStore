
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
                        <hr>
                        """),_display_(/*55.26*/if(flash.containsKey("success"))/*55.58*/ {_display_(Seq[Any](format.raw/*55.60*/("""
                            """),format.raw/*56.29*/("""<div class="alert alert-success text-center">
                            """),_display_(/*57.30*/flash/*57.35*/.get("success")),format.raw/*57.50*/("""
                            """),format.raw/*58.29*/("""</div>
                        """)))}),format.raw/*59.26*/("""
                    """),format.raw/*60.21*/("""</div>
                    <br>

                    <div id="products" class="row list-group">
                            <!-- Start of for loop - Fo reach e in events add a row -->
                        """),_display_(/*65.26*/for(e <- events) yield /*65.42*/ {_display_(Seq[Any](format.raw/*65.44*/("""
                            """),format.raw/*66.29*/("""<a href=""""),_display_(/*66.39*/routes/*66.45*/.HomeController.eventTicket(e.getId)),format.raw/*66.81*/("""">
                                <div class="item  col-xs-4 col-lg-4">
                                    <div class="thumbnail">
                                        """),_display_(/*69.42*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*69.117*/ {_display_(Seq[Any](format.raw/*69.119*/("""
                                            """),format.raw/*70.45*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*70.106*/(e.getId + ".jpg")),format.raw/*70.124*/(""""/>
                                        """)))}/*71.43*/else/*71.48*/{_display_(Seq[Any](format.raw/*71.49*/("""
                                            """),format.raw/*72.45*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                                        """)))}),format.raw/*73.42*/("""
                                    """),format.raw/*74.37*/("""<div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*76.42*/e/*76.43*/.getTitle),format.raw/*76.52*/("""</h4>
                                        <h4>"""),_display_(/*77.46*/e/*77.47*/.getEventName),format.raw/*77.60*/("""</h4>

                                        <h4>"""),_display_(/*79.46*/e/*79.47*/.getLocation),format.raw/*79.59*/("""</h4>

                                        <h4>"""),_display_(/*81.46*/e/*81.47*/.getTime),format.raw/*81.55*/(""", """),_display_(/*81.58*/e/*81.59*/.getDate),format.raw/*81.67*/("""</h4>

                                        <h5>"""),_display_(/*83.46*/e/*83.47*/.calcLowestPrice),format.raw/*83.63*/("""</h5>

                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            </div>

                                        </div>
                                    </div>
                                    </div>
                                </div>
                            </a>

                        """)))}),format.raw/*95.26*/(""" """),format.raw/*95.27*/("""<!-- End of for loop -->


                        <div class="col-xs-12 col-md-6">

                        </div>
                    </div>
                </div>
            </div>
        </div>

            <!--END CONTENT-->

            <!--Script for displaying products in grid/list-->
        <script>
                $(document).ready(function () """),format.raw/*110.47*/("""{"""),format.raw/*110.48*/("""
                    """),format.raw/*111.21*/("""$('#list').click(function (event) """),format.raw/*111.55*/("""{"""),format.raw/*111.56*/("""
                        """),format.raw/*112.25*/("""event.preventDefault();
                        $('#products .item').addClass('list-group-item');
                    """),format.raw/*114.21*/("""}"""),format.raw/*114.22*/(""");
                    $('#grid').click(function (event) """),format.raw/*115.55*/("""{"""),format.raw/*115.56*/("""
                        """),format.raw/*116.25*/("""event.preventDefault();
                        $('#products .item').removeClass('list-group-item');
                        $('#products .item').addClass('grid-group-item');
                    """),format.raw/*119.21*/("""}"""),format.raw/*119.22*/(""");
                """),format.raw/*120.17*/("""}"""),format.raw/*120.18*/(""");</script>

            <!--Script for confirming delete of event-->
        <script>
                function confirmDel() """),format.raw/*124.39*/("""{"""),format.raw/*124.40*/("""
                    """),format.raw/*125.21*/("""return confirm('Are you sure?');
                """),format.raw/*126.17*/("""}"""),format.raw/*126.18*/("""
        """),format.raw/*127.9*/("""</script>
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
                  DATE: Thu Apr 20 11:05:30 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/events.scala.html
                  HASH: e2dd9b932a1e0900332edf5681ae98e6b03739ce
                  MATRIX: 820->1|1031->116|1063->123|1091->143|1130->145|1167->156|2463->1425|2478->1431|2524->1456|2684->1589|2720->1609|2760->1611|2833->1656|2870->1666|2885->1672|2940->1706|3011->1749|3022->1750|3052->1758|3125->1803|3173->1824|3183->1825|3221->1842|3350->1940|3415->1977|4304->2839|4345->2871|4385->2873|4442->2902|4544->2977|4558->2982|4594->2997|4651->3026|4714->3058|4763->3079|4999->3288|5031->3304|5071->3306|5128->3335|5165->3345|5180->3351|5237->3387|5438->3561|5523->3636|5564->3638|5637->3683|5726->3744|5766->3762|5830->3808|5843->3813|5882->3814|5955->3859|6109->3982|6174->4019|6353->4171|6363->4172|6393->4181|6471->4232|6481->4233|6515->4246|6594->4298|6604->4299|6637->4311|6716->4363|6726->4364|6755->4372|6785->4375|6795->4376|6824->4384|6903->4436|6913->4437|6950->4453|7406->4878|7435->4879|7823->5238|7853->5239|7903->5260|7966->5294|7996->5295|8050->5320|8197->5438|8227->5439|8313->5496|8343->5497|8397->5522|8621->5717|8651->5718|8699->5737|8729->5738|8883->5863|8913->5864|8963->5885|9041->5934|9071->5935|9108->5944
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|64->33|65->34|86->55|86->55|86->55|87->56|88->57|88->57|88->57|89->58|90->59|91->60|96->65|96->65|96->65|97->66|97->66|97->66|97->66|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|103->72|104->73|105->74|107->76|107->76|107->76|108->77|108->77|108->77|110->79|110->79|110->79|112->81|112->81|112->81|112->81|112->81|112->81|114->83|114->83|114->83|126->95|126->95|141->110|141->110|142->111|142->111|142->111|143->112|145->114|145->114|146->115|146->115|147->116|150->119|150->119|151->120|151->120|155->124|155->124|156->125|157->126|157->126|158->127
                  -- GENERATED --
              */
          