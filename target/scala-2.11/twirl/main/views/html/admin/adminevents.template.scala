
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
                    """),format.raw/*52.21*/("""<div class="alert alert-success">
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
                            <div class="item  col-xs-4 col-lg-4">
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
            """),format.raw/*138.13*/("""return confirm('Are you sure?');
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
                  DATE: Fri Apr 14 10:44:00 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admin/adminevents.scala.html
                  HASH: 908b732647d31f9f083dcadacec84fce1c4bdd6d
                  MATRIX: 836->1|1047->116|1077->121|1104->140|1143->142|1179->152|2419->1365|2434->1371|2485->1401|2593->1482|2629->1502|2669->1504|2734->1541|2771->1551|2786->1557|2846->1596|2917->1639|2928->1640|2958->1648|3028->1690|3076->1711|3086->1712|3124->1729|3238->1812|3300->1846|3752->2271|3793->2303|3832->2304|3882->2326|3965->2382|3979->2387|4015->2402|4065->2424|4121->2449|4167->2467|4232->2505|4247->2511|4294->2537|4512->2728|4527->2734|4575->2761|5406->3565|5438->3581|5478->3583|5532->3609|5569->3619|5584->3625|5646->3666|5838->3831|5923->3906|5964->3908|6034->3950|6123->4011|6163->4029|6224->4072|6237->4077|6276->4078|6346->4120|6497->4240|6563->4278|6744->4432|6754->4433|6784->4442|6867->4498|6877->4499|6911->4512|6996->4570|7006->4571|7039->4583|7124->4641|7134->4642|7163->4650|7193->4653|7203->4654|7232->4662|7317->4720|7327->4721|7364->4737|7582->4928|7623->4960|7663->4962|7741->5012|7778->5022|7793->5028|7851->5064|8120->5305|8136->5311|8195->5347|8536->5656|8611->5702|8876->5935|8906->5936|9268->6269|9298->6270|9345->6288|9406->6320|9436->6321|9538->6393|9569->6394|9650->6446|9680->6447|9834->6571|9865->6572|9910->6588|9940->6589|10077->6697|10107->6698|10150->6712|10220->6754|10250->6755|10284->6761
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|82->51|82->51|82->51|83->52|84->53|84->53|84->53|85->54|86->55|87->56|88->57|88->57|88->57|92->61|92->61|92->61|106->75|106->75|106->75|107->76|107->76|107->76|107->76|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|114->83|115->84|117->86|117->86|117->86|118->87|118->87|118->87|120->89|120->89|120->89|122->91|122->91|122->91|122->91|122->91|122->91|124->93|124->93|124->93|128->97|128->97|128->97|129->98|129->98|129->98|129->98|132->101|132->101|132->101|136->105|137->106|146->115|146->115|161->130|161->130|162->131|162->131|162->131|162->131|162->131|163->132|163->132|163->132|163->132|164->133|164->133|168->137|168->137|169->138|170->139|170->139|171->140
                  -- GENERATED --
              */
          