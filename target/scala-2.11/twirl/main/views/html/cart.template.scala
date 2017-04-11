
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
                  DATE: Tue Apr 11 13:34:24 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/cart.scala.html
                  HASH: c8a6db2894fc151b8ba9432cea1514284517d1ef
                  MATRIX: 754->1|973->26|1001->132|1029->134|1100->180|1126->198|1165->200|1194->202|1675->656|1690->662|1736->687|1994->919|2031->947|2071->949|2104->955|2174->995|2207->1002|2244->1030|2284->1032|2317->1038|2410->1105|2469->1148|2509->1150|2543->1157|2791->1378|2801->1379|2854->1411|2908->1437|2919->1438|2965->1462|3117->1587|3165->1614|3194->1615|3322->1716|3332->1717|3367->1731|3403->1740|3440->1750|3455->1756|3508->1788|3612->1865|3627->1871|3677->1900|4010->2203|4044->2210|4260->2399|4275->2405|4323->2432|4486->2565|4520->2572|4691->2716|4759->2762|4860->2836|4875->2842|4922->2868
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|41->11|53->23|53->23|53->23|61->31|61->31|61->31|62->32|64->34|66->36|66->36|66->36|67->37|68->38|68->38|68->38|71->41|76->46|76->46|76->46|76->46|76->46|76->46|80->50|80->50|80->50|83->53|83->53|83->53|84->54|84->54|84->54|84->54|85->55|85->55|85->55|97->67|99->69|105->75|105->75|105->75|110->80|113->83|116->86|116->86|119->89|119->89|119->89
                  -- GENERATED --
              */
          