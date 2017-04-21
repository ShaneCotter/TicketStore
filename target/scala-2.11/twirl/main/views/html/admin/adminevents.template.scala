
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
                                <h3 class="greentext text-center">EVENT CATEGORIES</h3>
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
                <div class="row">
                """),_display_(/*51.18*/if(flash.containsKey("success"))/*51.50*/{_display_(Seq[Any](format.raw/*51.51*/("""
                    """),format.raw/*52.21*/("""<div class="alert alert-success text-center">
                    """),_display_(/*53.22*/flash/*53.27*/.get("success")),format.raw/*53.42*/("""
                    """),format.raw/*54.21*/("""</div>
                """)))}),format.raw/*55.18*/("""
                """),format.raw/*56.17*/("""<br>
                    <a href = """"),_display_(/*57.33*/routes/*57.39*/.HomeController.addEvent()),format.raw/*57.65*/("""" type="button" class="btn btn-success btn-md" >
                        <span class="glyphicon glyphicon-plus"></span>Add Event
                    </a>

                    <a href = """"),_display_(/*61.33*/routes/*61.39*/.HomeController.addTicket()),format.raw/*61.66*/("""" type="button" class="btn btn-success btn-md" >
                        <span class="glyphicon glyphicon-plus"></span>Add Ticket
                    </a>
                    <hr>
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
                    """),_display_(/*75.22*/for(e <- events) yield /*75.38*/ {_display_(Seq[Any](format.raw/*75.40*/("""
                        """),format.raw/*76.25*/("""<a href=""""),_display_(/*76.35*/routes/*76.41*/.HomeController.admineventTicket(e.getId)),format.raw/*76.82*/("""">
                            <div class="item  col-xs-8 col-lg-4">
                                <div class="thumbnail">
                                    """),_display_(/*79.38*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*79.113*/ {_display_(Seq[Any](format.raw/*79.115*/("""
                                        """),format.raw/*80.41*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*80.102*/(e.getId + ".jpg")),format.raw/*80.120*/(""""/>
                                    """)))}/*81.39*/else/*81.44*/{_display_(Seq[Any](format.raw/*81.45*/("""
                                        """),format.raw/*82.41*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                                    """)))}),format.raw/*83.38*/("""
                                    """),format.raw/*84.37*/("""<div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*86.42*/e/*86.43*/.getTitle),format.raw/*86.52*/("""</h4>
                                            <h4>"""),_display_(/*87.50*/e/*87.51*/.getEventName),format.raw/*87.64*/("""</h4>

                                            <h4>"""),_display_(/*89.50*/e/*89.51*/.getLocation),format.raw/*89.63*/("""</h4>

                                            <h4>"""),_display_(/*91.50*/e/*91.51*/.getTime),format.raw/*91.59*/(""", """),_display_(/*91.62*/e/*91.63*/.getDate),format.raw/*91.71*/("""</h4>

                                            <h5>"""),_display_(/*93.50*/e/*93.51*/.calcLowestPrice),format.raw/*93.67*/("""</h5>

                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            """),_display_(/*97.46*/if(user.getRole.equals("admin"))/*97.78*/ {_display_(Seq[Any](format.raw/*97.80*/("""
                                                """),format.raw/*98.49*/("""<a href=""""),_display_(/*98.59*/routes/*98.65*/.HomeController.updateEvent(e.getId)),format.raw/*98.101*/("""" class="btn btn-danger">
                                                    <span class="glyphicon glyphicon-wrench"></span>
                                                </a>
                                                <a href=""""),_display_(/*101.59*/routes/*101.65*/.HomeController.deleteEvent(e.getId)),format.raw/*101.101*/("""" class = "btn btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            """)))}),format.raw/*105.46*/("""
                                            """),format.raw/*106.45*/("""</div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*115.22*/(""" """),format.raw/*115.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*130.42*/("""{"""),format.raw/*130.43*/("""
                """),format.raw/*131.17*/("""$('#list').click(function(event)"""),format.raw/*131.49*/("""{"""),format.raw/*131.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*131.122*/("""}"""),format.raw/*131.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*132.49*/("""{"""),format.raw/*132.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*132.174*/("""}"""),format.raw/*132.175*/(""");
            """),format.raw/*133.13*/("""}"""),format.raw/*133.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*137.30*/("""{"""),format.raw/*137.31*/("""
            """),format.raw/*138.13*/("""return confirm('Are you sure you want to delete this event?');
        """),format.raw/*139.9*/("""}"""),format.raw/*139.10*/("""
    """),format.raw/*140.5*/("""</script>
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
                  DATE: Fri Apr 21 12:27:19 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/adminevents.scala.html
                  HASH: e6074c86bcfcc16539ee25d6ad7f1792c134c975
                  MATRIX: 836->1|1047->116|1075->119|1102->138|1141->140|1174->147|2394->1340|2409->1346|2460->1376|2566->1455|2602->1475|2642->1477|2706->1513|2743->1523|2758->1529|2818->1568|2889->1611|2900->1612|2930->1620|2999->1661|3047->1682|3057->1683|3095->1700|3207->1781|3268->1814|3702->2221|3743->2253|3782->2254|3831->2275|3925->2342|3939->2347|3975->2362|4024->2383|4079->2407|4124->2424|4188->2461|4203->2467|4250->2493|4464->2680|4479->2686|4527->2713|5344->3503|5376->3519|5416->3521|5469->3546|5506->3556|5521->3562|5583->3603|5772->3765|5857->3840|5898->3842|5967->3883|6056->3944|6096->3962|6156->4004|6169->4009|6208->4010|6277->4051|6427->4170|6492->4207|6671->4359|6681->4360|6711->4369|6793->4424|6803->4425|6837->4438|6920->4494|6930->4495|6963->4507|7046->4563|7056->4564|7085->4572|7115->4575|7125->4576|7154->4584|7237->4640|7247->4641|7284->4657|7498->4844|7539->4876|7579->4878|7656->4927|7693->4937|7708->4943|7766->4979|8032->5217|8048->5223|8107->5259|8444->5564|8518->5609|8774->5833|8804->5834|9151->6152|9181->6153|9227->6170|9288->6202|9318->6203|9420->6275|9451->6276|9531->6327|9561->6328|9715->6452|9746->6453|9790->6468|9820->6469|9953->6573|9983->6574|10025->6587|10124->6658|10154->6659|10187->6664
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|82->51|82->51|82->51|83->52|84->53|84->53|84->53|85->54|86->55|87->56|88->57|88->57|88->57|92->61|92->61|92->61|106->75|106->75|106->75|107->76|107->76|107->76|107->76|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|114->83|115->84|117->86|117->86|117->86|118->87|118->87|118->87|120->89|120->89|120->89|122->91|122->91|122->91|122->91|122->91|122->91|124->93|124->93|124->93|128->97|128->97|128->97|129->98|129->98|129->98|129->98|132->101|132->101|132->101|136->105|137->106|146->115|146->115|161->130|161->130|162->131|162->131|162->131|162->131|162->131|163->132|163->132|163->132|163->132|164->133|164->133|168->137|168->137|169->138|170->139|170->139|171->140
                  -- GENERATED --
              */
          