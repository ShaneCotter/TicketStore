
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
                            <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                        </div>
                    </form>
                </div>
                <div class="row"><r>
                    <strong>Display</strong>
                    <div class="btn-group">
                        <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
                        </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                    class="glyphicon glyphicon-th"></span>Grid</a>
                    </div>
                    """),_display_(/*62.22*/if(flash.containsKey("success"))/*62.54*/ {_display_(Seq[Any](format.raw/*62.56*/("""
                        """),format.raw/*63.25*/("""<div class="alert alert-success text-center">
                        """),_display_(/*64.26*/flash/*64.31*/.get("success")),format.raw/*64.46*/("""
                        """),format.raw/*65.25*/("""</div>
                    """)))}),format.raw/*66.22*/("""
                """),format.raw/*67.17*/("""</div>
                <br>
                <div id="products" class="row list-group">
                        <!-- Start of for loop - For each e in events add a row -->
                    """),_display_(/*71.22*/for(e <- events) yield /*71.38*/ {_display_(Seq[Any](format.raw/*71.40*/("""
                        """),format.raw/*72.25*/("""<a href=""""),_display_(/*72.35*/routes/*72.41*/.HomeController.eventTicket(e.getId)),format.raw/*72.77*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">
                                    """),_display_(/*75.38*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*75.113*/ {_display_(Seq[Any](format.raw/*75.115*/("""
                                        """),format.raw/*76.41*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*76.102*/(e.getId + ".jpg")),format.raw/*76.120*/(""""/>
                                    """)))}/*77.39*/else/*77.44*/{_display_(Seq[Any](format.raw/*77.45*/("""
                                        """),format.raw/*78.41*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                                    """)))}),format.raw/*79.38*/("""
                                """),format.raw/*80.33*/("""<div class="caption">
                                    <h4 class="group inner list-group-item-heading">
                                    """),_display_(/*82.38*/e/*82.39*/.getTitle),format.raw/*82.48*/("""</h4>
                                    <h4>"""),_display_(/*83.42*/e/*83.43*/.getEventName),format.raw/*83.56*/("""</h4>

                                    <h4>"""),_display_(/*85.42*/e/*85.43*/.getLocation),format.raw/*85.55*/("""</h4>

                                    <h4>"""),_display_(/*87.42*/e/*87.43*/.getTime),format.raw/*87.51*/(""", """),_display_(/*87.54*/e/*87.55*/.getDate),format.raw/*87.63*/("""</h4>

                                    <h5>"""),_display_(/*89.42*/e/*89.43*/.calcLowestPrice),format.raw/*89.59*/("""</h5>

                                    <div class="row">
                                        <div class="col-xs-12 col-md-6">
                                            </div>

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
            $(document).ready(function () """),format.raw/*116.43*/("""{"""),format.raw/*116.44*/("""
                """),format.raw/*117.17*/("""$('#list').click(function (event) """),format.raw/*117.51*/("""{"""),format.raw/*117.52*/("""
                    """),format.raw/*118.21*/("""event.preventDefault();
                    $('#products .item').addClass('list-group-item');
                """),format.raw/*120.17*/("""}"""),format.raw/*120.18*/(""");
                $('#grid').click(function (event) """),format.raw/*121.51*/("""{"""),format.raw/*121.52*/("""
                    """),format.raw/*122.21*/("""event.preventDefault();
                    $('#products .item').removeClass('list-group-item');
                    $('#products .item').addClass('grid-group-item');
                """),format.raw/*125.17*/("""}"""),format.raw/*125.18*/(""");
            """),format.raw/*126.13*/("""}"""),format.raw/*126.14*/(""");</script>

        <!--Script for confirming delete of event-->
    <script>
            function confirmDel() """),format.raw/*130.35*/("""{"""),format.raw/*130.36*/("""
                """),format.raw/*131.17*/("""return confirm('Are you sure?');
            """),format.raw/*132.13*/("""}"""),format.raw/*132.14*/("""
    """),format.raw/*133.5*/("""</script>
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
                  DATE: Thu Apr 20 11:19:04 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/listEvents.scala.html
                  HASH: e2f38893acd84d37981d4f2a077f2d85a54f7dc8
                  MATRIX: 840->1|1080->145|1108->148|1136->168|1175->170|1208->177|2429->1371|2444->1377|2490->1402|2641->1526|2677->1546|2717->1548|2786->1589|2823->1599|2838->1605|2893->1639|2964->1682|2975->1683|3005->1691|3074->1732|3122->1753|3132->1754|3170->1771|3291->1861|3352->1894|3788->2303|3803->2309|3858->2343|4061->2519|4088->2525|4844->3254|4885->3286|4925->3288|4978->3313|5076->3384|5090->3389|5126->3404|5179->3429|5238->3457|5283->3474|5502->3666|5534->3682|5574->3684|5627->3709|5664->3719|5679->3725|5736->3761|5925->3923|6010->3998|6051->4000|6120->4041|6209->4102|6249->4120|6309->4162|6322->4167|6361->4168|6430->4209|6580->4328|6641->4361|6812->4505|6822->4506|6852->4515|6926->4562|6936->4563|6970->4576|7045->4624|7055->4625|7088->4637|7163->4685|7173->4686|7202->4694|7232->4697|7242->4698|7271->4706|7346->4754|7356->4755|7393->4771|7818->5164|7848->5165|8196->5484|8226->5485|8272->5502|8335->5536|8365->5537|8415->5558|8554->5668|8584->5669|8666->5722|8696->5723|8746->5744|8958->5927|8988->5928|9032->5943|9062->5944|9204->6057|9234->6058|9280->6075|9354->6120|9384->6121|9417->6126
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|58->27|58->27|58->27|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|65->34|66->35|79->48|79->48|79->48|81->50|81->50|93->62|93->62|93->62|94->63|95->64|95->64|95->64|96->65|97->66|98->67|102->71|102->71|102->71|103->72|103->72|103->72|103->72|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|110->79|111->80|113->82|113->82|113->82|114->83|114->83|114->83|116->85|116->85|116->85|118->87|118->87|118->87|118->87|118->87|118->87|120->89|120->89|120->89|132->101|132->101|147->116|147->116|148->117|148->117|148->117|149->118|151->120|151->120|152->121|152->121|153->122|156->125|156->125|157->126|157->126|161->130|161->130|162->131|163->132|163->132|164->133
                  -- GENERATED --
              */
          