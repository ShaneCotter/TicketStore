
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Home",user)/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""

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
                        <h2>TC Events - The Biggest Events at the Best Prices</h2>
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

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Apr 10 13:40:44 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/index.scala.html
                  HASH: 706431069af9f2cb55d2062eb730553854f804fe
                  MATRIX: 756->1|876->26|904->29|929->46|968->48|1002->56|1756->783|1771->789|1830->827|1957->927|1972->933|2017->957|2275->1188|2290->1194|2349->1232|2475->1331|2490->1337|2535->1361|2707->1506|2722->1512|2781->1550|2907->1649|2922->1655|2967->1679|3141->1826|3156->1832|3215->1870|3341->1969|3356->1975|3401->1999|4162->2730
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|49->18|49->18|49->18|51->20|51->20|51->20|57->26|57->26|57->26|59->28|59->28|59->28|64->33|64->33|64->33|66->35|66->35|66->35|71->40|71->40|71->40|73->42|73->42|73->42|92->61
                  -- GENERATED --
              */
          