
package views.html.admin

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
            <br>
            <br>
            <br>
            <div class="col-sm-9">
                """),_display_(/*50.18*/if(flash.containsKey("success"))/*50.50*/{_display_(Seq[Any](format.raw/*50.51*/("""
                    """),format.raw/*51.21*/("""<div class="alert alert-success">
                    """),_display_(/*52.22*/flash/*52.27*/.get("success")),format.raw/*52.42*/("""
                    """),format.raw/*53.21*/("""</div>
                """)))}),format.raw/*54.18*/("""
                """),format.raw/*55.17*/("""<div class="row"><br>
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
                    """),_display_(/*66.22*/for(e <- events) yield /*66.38*/ {_display_(Seq[Any](format.raw/*66.40*/("""
                        """),format.raw/*67.25*/("""<a href=""""),_display_(/*67.35*/routes/*67.41*/.HomeController.admineventTicket(e.getId)),format.raw/*67.82*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">
                                    """),_display_(/*70.38*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*70.113*/ {_display_(Seq[Any](format.raw/*70.115*/("""
                                        """),format.raw/*71.41*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*71.102*/(e.getId + ".jpg")),format.raw/*71.120*/(""""/>
                                    """)))}/*72.39*/else/*72.44*/{_display_(Seq[Any](format.raw/*72.45*/("""
                                        """),format.raw/*73.41*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                                    """)))}),format.raw/*74.38*/("""
                                    """),format.raw/*75.37*/("""<div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*77.42*/e/*77.43*/.getTitle),format.raw/*77.52*/("""</h4>
                                            <h4>"""),_display_(/*78.50*/e/*78.51*/.getEventName),format.raw/*78.64*/("""</h4>

                                            <h4>"""),_display_(/*80.50*/e/*80.51*/.getLocation),format.raw/*80.63*/("""</h4>

                                            <h4>"""),_display_(/*82.50*/e/*82.51*/.getTime),format.raw/*82.59*/(""", """),_display_(/*82.62*/e/*82.63*/.getDate),format.raw/*82.71*/("""</h4>

                                            <h5>"""),_display_(/*84.50*/e/*84.51*/.calcLowestPrice),format.raw/*84.67*/("""</h5>

                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            """),_display_(/*88.46*/if(user.getRole.equals("admin"))/*88.78*/ {_display_(Seq[Any](format.raw/*88.80*/("""
                                                """),format.raw/*89.49*/("""<a href=""""),_display_(/*89.59*/routes/*89.65*/.HomeController.updateEvent(e.getId)),format.raw/*89.101*/("""" class="btn btn-danger">
                                                    <span class="glyphicon glyphicon-wrench"></span>
                                                </a>
                                                <a href=""""),_display_(/*92.59*/routes/*92.65*/.HomeController.deleteEvent(e.getId)),format.raw/*92.101*/("""" class = "btn btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            """)))}),format.raw/*96.46*/("""
                                            """),format.raw/*97.45*/("""</div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*106.22*/(""" """),format.raw/*106.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*121.42*/("""{"""),format.raw/*121.43*/("""
                """),format.raw/*122.17*/("""$('#list').click(function(event)"""),format.raw/*122.49*/("""{"""),format.raw/*122.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*122.122*/("""}"""),format.raw/*122.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*123.49*/("""{"""),format.raw/*123.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*123.174*/("""}"""),format.raw/*123.175*/(""");
            """),format.raw/*124.13*/("""}"""),format.raw/*124.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*128.30*/("""{"""),format.raw/*128.31*/("""
            """),format.raw/*129.13*/("""return confirm('Are you sure?');
        """),format.raw/*130.9*/("""}"""),format.raw/*130.10*/("""
    """),format.raw/*131.5*/("""</script>
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
                  DATE: Tue Apr 11 23:43:50 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admin/adminevents.scala.html
                  HASH: 4f08bb0d461585cdba061db04c420cf416481bc6
                  MATRIX: 836->1|1047->116|1077->121|1104->140|1143->142|1179->152|2408->1354|2423->1360|2474->1390|2582->1471|2618->1491|2658->1493|2723->1530|2760->1540|2775->1546|2835->1585|2906->1628|2917->1629|2947->1637|3017->1679|3065->1700|3075->1701|3113->1718|3227->1801|3289->1835|3706->2225|3747->2257|3786->2258|3836->2280|3919->2336|3933->2341|3969->2356|4019->2378|4075->2403|4121->2421|4791->3064|4823->3080|4863->3082|4917->3108|4954->3118|4969->3124|5031->3165|5223->3330|5308->3405|5349->3407|5419->3449|5508->3510|5548->3528|5609->3571|5622->3576|5661->3577|5731->3619|5882->3739|5948->3777|6129->3931|6139->3932|6169->3941|6252->3997|6262->3998|6296->4011|6381->4069|6391->4070|6424->4082|6509->4140|6519->4141|6548->4149|6578->4152|6588->4153|6617->4161|6702->4219|6712->4220|6749->4236|6967->4427|7008->4459|7048->4461|7126->4511|7163->4521|7178->4527|7236->4563|7504->4804|7519->4810|7577->4846|7917->5155|7991->5201|8256->5434|8286->5435|8648->5768|8678->5769|8725->5787|8786->5819|8816->5820|8918->5892|8949->5893|9030->5945|9060->5946|9214->6070|9245->6071|9290->6087|9320->6088|9457->6196|9487->6197|9530->6211|9600->6253|9630->6254|9664->6260
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|81->50|81->50|81->50|82->51|83->52|83->52|83->52|84->53|85->54|86->55|97->66|97->66|97->66|98->67|98->67|98->67|98->67|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|104->73|105->74|106->75|108->77|108->77|108->77|109->78|109->78|109->78|111->80|111->80|111->80|113->82|113->82|113->82|113->82|113->82|113->82|115->84|115->84|115->84|119->88|119->88|119->88|120->89|120->89|120->89|120->89|123->92|123->92|123->92|127->96|128->97|137->106|137->106|152->121|152->121|153->122|153->122|153->122|153->122|153->122|154->123|154->123|154->123|154->123|155->124|155->124|159->128|159->128|160->129|161->130|161->130|162->131
                  -- GENERATED --
              */
          