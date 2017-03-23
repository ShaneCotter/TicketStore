
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Welcome to Play")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""

    """),format.raw/*4.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="indexContent">
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
                <li data-target="#myCarousel" data-slide-to="3"></li>
            </ol>

                <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src=""""),_display_(/*18.32*/routes/*18.38*/.Assets.versioned("images/crowd1.jpg")),format.raw/*18.76*/("""" alt="Ed ">
                    <div class="carousel-caption">
                        <a href=""""),_display_(/*20.35*/routes/*20.41*/.HomeController.events()),format.raw/*20.65*/(""""><h1>Concerts</h1></a>
                        <h2>TC Events have the biggest events at the best prices</h2>
                    </div>
                </div>

                <div class="item" >
                    <img src=""""),_display_(/*26.32*/routes/*26.38*/.Assets.versioned("images/crowd2.jpg")),format.raw/*26.76*/("""" alt="">
                    <div class="carousel-caption">
                        <a href = """"),_display_(/*28.37*/routes/*28.43*/.HomeController.events()),format.raw/*28.67*/(""""><h1>Sports</h1></a>
                    </div>
                </div>

                <div class="item" >
                    <img src=""""),_display_(/*33.32*/routes/*33.38*/.Assets.versioned("images/crowd3.jpg")),format.raw/*33.76*/("""" alt="">
                    <div class="carousel-caption">
                        <a href = """"),_display_(/*35.37*/routes/*35.43*/.HomeController.events()),format.raw/*35.67*/(""""><h1>Race Days</h1></a>
                    </div>
                </div>

                <div class="item">
                    <img src=""""),_display_(/*40.32*/routes/*40.38*/.Assets.versioned("images/crowd4.jpg")),format.raw/*40.76*/("""" alt="">
                    <div class="carousel-caption">
                        <a href = """"),_display_(/*42.37*/routes/*42.43*/.HomeController.events()),format.raw/*42.67*/(""""><h1>Theatre</h1></a>
                    </div>
                </div>
            </div>

                <!-- Left and right controls -->
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>

    </div>
        <!--END CONTENT-->

""")))}),format.raw/*61.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Mar 23 18:27:16 GMT 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/index.scala.html
                  HASH: 5eacf1af1ff695c80cc2e3f55a220119eca0a909
                  MATRIX: 827->3|858->26|897->28|931->36|1685->763|1700->769|1759->807|1886->907|1901->913|1946->937|2207->1171|2222->1177|2281->1215|2407->1314|2422->1320|2467->1344|2639->1489|2654->1495|2713->1533|2839->1632|2854->1638|2899->1662|3073->1809|3088->1815|3147->1853|3273->1952|3288->1958|3333->1982|4094->2713
                  LINES: 32->2|32->2|32->2|34->4|48->18|48->18|48->18|50->20|50->20|50->20|56->26|56->26|56->26|58->28|58->28|58->28|63->33|63->33|63->33|65->35|65->35|65->35|70->40|70->40|70->40|72->42|72->42|72->42|91->61
                  -- GENERATED --
              */
          