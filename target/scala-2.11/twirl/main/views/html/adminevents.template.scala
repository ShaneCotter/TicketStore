
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

class adminevents extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Event],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: List[models.Event], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.117*/("""

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
                    <a href=""""),_display_(/*63.31*/routes/*63.37*/.HomeController.addTicket()),format.raw/*63.64*/("""" class="btn btn-success">
                        <span class="glyphicon glyphicon-plus"></span>Add tickets
                    </a>
                    <br>
                    <br>
                        <!-- Start of for loop - Fo reach e in events add a row -->
                    """),_display_(/*69.22*/for(e <- events) yield /*69.38*/ {_display_(Seq[Any](format.raw/*69.40*/("""
                        """),format.raw/*70.25*/("""<a href=""""),_display_(/*70.35*/routes/*70.41*/.HomeController.admineventTicket(e.getId)),format.raw/*70.82*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">
                                    """),_display_(/*73.38*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*73.113*/ {_display_(Seq[Any](format.raw/*73.115*/("""
                                        """),format.raw/*74.41*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*74.102*/(e.getId + ".jpg")),format.raw/*74.120*/(""""/>
                                    """)))}/*75.39*/else/*75.44*/{_display_(Seq[Any](format.raw/*75.45*/("""
                                        """),format.raw/*76.41*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                                    """)))}),format.raw/*77.38*/("""
                                    """),format.raw/*78.37*/("""<div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*80.42*/e/*80.43*/.getTitle),format.raw/*80.52*/("""</h4>
                                            """),_display_(/*81.46*/e/*81.47*/.getEventName),format.raw/*81.60*/("""
                                            """),format.raw/*82.45*/("""<br>
                                            """),_display_(/*83.46*/e/*83.47*/.getLocation),format.raw/*83.59*/("""
                                            """),format.raw/*84.45*/("""<br>
                                            """),_display_(/*85.46*/e/*85.47*/.getTime),format.raw/*85.55*/(""" """),format.raw/*85.56*/(""", """),_display_(/*85.59*/e/*85.60*/.getDate),format.raw/*85.68*/("""
                                            """),format.raw/*86.45*/("""<br>
                                            Starting from €
                                        </p>
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            """),_display_(/*91.46*/if(user.getRole.equals("admin"))/*91.78*/ {_display_(Seq[Any](format.raw/*91.80*/("""
                                                """),format.raw/*92.49*/("""<a href=""""),_display_(/*92.59*/routes/*92.65*/.HomeController.updateEvent(e.getId)),format.raw/*92.101*/("""" class="btn btn-danger">
                                                    <span class="glyphicon glyphicon-wrench"></span>
                                                </a>
                                                <a href=""""),_display_(/*95.59*/routes/*95.65*/.HomeController.deleteEvent(e.getId)),format.raw/*95.101*/("""" class = "btn btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            """)))}),format.raw/*99.46*/("""
                                            """),format.raw/*100.45*/("""</div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*109.22*/(""" """),format.raw/*109.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*124.42*/("""{"""),format.raw/*124.43*/("""
                """),format.raw/*125.17*/("""$('#list').click(function(event)"""),format.raw/*125.49*/("""{"""),format.raw/*125.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*125.122*/("""}"""),format.raw/*125.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*126.49*/("""{"""),format.raw/*126.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*126.174*/("""}"""),format.raw/*126.175*/(""");
            """),format.raw/*127.13*/("""}"""),format.raw/*127.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*131.30*/("""{"""),format.raw/*131.31*/("""
            """),format.raw/*132.13*/("""return confirm('Are you sure?');
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/("""
    """),format.raw/*134.5*/("""</script>
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
object adminevents extends adminevents_Scope0.adminevents
              /*
                  -- GENERATED --
                  DATE: Mon Apr 10 12:22:46 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/adminevents.scala.html
                  HASH: fc123305116ae416c0f8094e7b1888914930df4c
                  MATRIX: 830->1|1041->116|1069->119|1096->138|1135->140|1168->147|2377->1329|2392->1335|2443->1365|2549->1444|2585->1464|2625->1466|2689->1502|2726->1512|2741->1518|2801->1557|2872->1600|2883->1601|2913->1609|2982->1650|3030->1671|3040->1672|3078->1689|3190->1770|3251->1803|3600->2125|3641->2157|3680->2158|3729->2179|3811->2234|3825->2239|3861->2254|3910->2275|3965->2299|4010->2316|4595->2874|4610->2880|4658->2907|4974->3196|5006->3212|5046->3214|5099->3239|5136->3249|5151->3255|5213->3296|5402->3458|5487->3533|5528->3535|5597->3576|5686->3637|5726->3655|5786->3697|5799->3702|5838->3703|5907->3744|6057->3863|6122->3900|6301->4052|6311->4053|6341->4062|6419->4113|6429->4114|6463->4127|6536->4172|6613->4222|6623->4223|6656->4235|6729->4280|6806->4330|6816->4331|6845->4339|6874->4340|6904->4343|6914->4344|6943->4352|7016->4397|7333->4687|7374->4719|7414->4721|7491->4770|7528->4780|7543->4786|7601->4822|7866->5060|7881->5066|7939->5102|8275->5407|8349->5452|8605->5676|8635->5677|8982->5995|9012->5996|9058->6013|9119->6045|9149->6046|9251->6118|9282->6119|9362->6170|9392->6171|9546->6295|9577->6296|9621->6311|9651->6312|9784->6416|9814->6417|9856->6430|9925->6471|9955->6472|9988->6477
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|78->47|78->47|78->47|79->48|80->49|80->49|80->49|81->50|82->51|83->52|94->63|94->63|94->63|100->69|100->69|100->69|101->70|101->70|101->70|101->70|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|108->77|109->78|111->80|111->80|111->80|112->81|112->81|112->81|113->82|114->83|114->83|114->83|115->84|116->85|116->85|116->85|116->85|116->85|116->85|116->85|117->86|122->91|122->91|122->91|123->92|123->92|123->92|123->92|126->95|126->95|126->95|130->99|131->100|140->109|140->109|155->124|155->124|156->125|156->125|156->125|156->125|156->125|157->126|157->126|157->126|157->126|158->127|158->127|162->131|162->131|163->132|164->133|164->133|165->134
                  -- GENERATED --
              */
          