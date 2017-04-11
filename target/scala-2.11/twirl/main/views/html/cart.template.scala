
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cart_Scope0 {
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

class cart extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models._

Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*7.1*/("""
	"""),format.raw/*8.2*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Cart", user)/*9.20*/ {_display_(Seq[Any](format.raw/*9.22*/("""

"""),format.raw/*11.1*/("""<!--..CONTENT..-->
<div class="container-fluid" id="cartContent">
	<div class="row">
		<div class="col-lg-8 col-lg-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">
						<div class="row">
							<div class="col-xs-6">
								<h5 id = iconCart><span class="glyphicon glyphicon-shopping-cart" id="iconCart"></span> Shopping Cart</h5>
							</div>
							<div class="col-xs-6">
								<a href=""""),_display_(/*23.19*/routes/*23.25*/.HomeController.events(0)),format.raw/*23.50*/("""">
								<button type="button" class="btn btn-success btn-sm btn-block">
										<span class="glyphicon glyphicon-share-alt"></span> Continue shopping
								</button></a>
							</div>
						</div>
					</div>
				</div>
				"""),_display_(/*31.6*/if(user.getBasket() == null)/*31.34*/ {_display_(Seq[Any](format.raw/*31.36*/("""
					"""),format.raw/*32.6*/("""<br>
					<h3>Cart is empty !</h3>
				""")))}),format.raw/*34.6*/("""

				"""),_display_(/*36.6*/if(user.getBasket() != null)/*36.34*/ {_display_(Seq[Any](format.raw/*36.36*/("""
					"""),format.raw/*37.6*/("""<!-- Start of For loop - For each p in products add a row -->
				"""),_display_(/*38.6*/for(i <- user.getBasket().getBasketItems()) yield /*38.49*/ {_display_(Seq[Any](format.raw/*38.51*/("""


				"""),format.raw/*41.5*/("""<div class="panel-body">
					<div class="row">
						<div class="col-xs-2"><img class="img-responsive" src="http://placehold.it/100x70">
						</div>
						<div class="col-xs-4">
							<h4 class="product-name"><strong>"""),_display_(/*46.42*/i/*46.43*/.getTicket.getEvent.getEventName),format.raw/*46.75*/("""</strong></h4><h4><small>"""),_display_(/*46.101*/i/*46.102*/.getTicket.getTicketType),format.raw/*46.126*/("""</small></h4>
						</div>
						<div class="col-xs-6">
							<div class="col-xs-6 text-right">
								<h6><strong>&euro; """),_display_(/*50.29*/("%.2f".format(i.getPrice))),format.raw/*50.56*/(""" """),format.raw/*50.57*/("""<span class="text-muted">x</span></strong></h6>
							</div>
							<div class="col-xs-4">
								"""),_display_(/*53.10*/i/*53.11*/.getQuantity()),format.raw/*53.25*/("""
								"""),format.raw/*54.9*/("""<a href=""""),_display_(/*54.19*/routes/*54.25*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*54.57*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a>
								<a href=""""),_display_(/*55.19*/routes/*55.25*/.ShoppingCtrl.addOne(i.getId)),format.raw/*55.54*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a>
							</div>
							<div class="col-xs-2">
								<button type="button" class="btn btn-link btn-xs">
									<span class="glyphicon glyphicon-trash"> </span>
								</button>
							</div>
						</div>
					</div>
					<hr>

					<hr>
					""")))}),format.raw/*67.7*/("""

					"""),format.raw/*69.6*/("""<div class="row">
						<div class="text-center">
							<div class="col-xs-9">
								<h6 class="text-right">Empty cart</h6>
							</div>
							<div class="col-xs-3">
								<a href=""""),_display_(/*75.19*/routes/*75.25*/.ShoppingCtrl.emptyBasket()),format.raw/*75.52*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">Empty Cart</a>
							</div>
						</div>
					</div>
				</div>
				""")))}),format.raw/*80.6*/("""


				"""),format.raw/*83.5*/("""<div class="panel-footer">
					<div class="row text-center">
						<div class="col-xs-9">
							<h4 class="text-right"><strong>Total: &euro; """),_display_(/*86.54*/("%.2f".format(user.getBasket.getBasketTotal))),format.raw/*86.100*/("""</strong></h4>
						</div>
						<div class="col-xs-3">
							<a href=""""),_display_(/*89.18*/routes/*89.24*/.ShoppingCtrl.placeOrder()),format.raw/*89.50*/("""" class="btn btn-success btn-sm">
								<span class="glyphicon glyphicon-euro"></span> Place Order</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<!--END CONTENT-->

""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object cart extends cart_Scope0.cart
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 12:48:34 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/cart.scala.html
                  HASH: f22a874be5431f9c8dbda1c47166e9971b45b505
                  MATRIX: 754->1|973->26|1003->138|1032->141|1104->188|1130->206|1169->208|1200->212|1693->678|1708->684|1754->709|2020->949|2057->977|2097->979|2131->986|2203->1028|2238->1037|2275->1065|2315->1067|2349->1074|2443->1142|2502->1185|2542->1187|2579->1197|2832->1423|2842->1424|2895->1456|2949->1482|2960->1483|3006->1507|3162->1636|3210->1663|3239->1664|3370->1768|3380->1769|3415->1783|3452->1793|3489->1803|3504->1809|3557->1841|3662->1919|3677->1925|3727->1954|4072->2269|4108->2278|4330->2473|4345->2479|4393->2506|4561->2644|4598->2654|4772->2801|4840->2847|4944->2924|4959->2930|5006->2956
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|41->11|53->23|53->23|53->23|61->31|61->31|61->31|62->32|64->34|66->36|66->36|66->36|67->37|68->38|68->38|68->38|71->41|76->46|76->46|76->46|76->46|76->46|76->46|80->50|80->50|80->50|83->53|83->53|83->53|84->54|84->54|84->54|84->54|85->55|85->55|85->55|97->67|99->69|105->75|105->75|105->75|110->80|113->83|116->86|116->86|119->89|119->89|119->89
                  -- GENERATED --
              */
          