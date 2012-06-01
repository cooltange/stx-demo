jQuery(function(){
jQuery(".item-input input").focus(function(){
jQuery(this).css("background","#030302");
if(jQuery(this).val()==""||jQuery(this).val()==jQuery(this).siblings("label").text()){
jQuery(this).siblings("label").css("visibility","hidden");
}
}).blur(function(){
jQuery(this).css("background","rgba(25, 35, 25, 0.75)");
if(jQuery(this).val()==""||jQuery(this).val()==jQuery(this).siblings("label").text()){
jQuery(this).siblings("label").css("visibility","visible");
}
});
jQuery("#email").bind("input",function(){
jQuery(this).siblings("label").css("visibility","hidden");
if(jQuery("#emailErro").css("display")=="block"){
jQuery("#emailErro")._hide();
}
});
jQuery(".remember").click(function(e){
e.preventDefault();
jQuery(this).toggleClass("remember-select");
var _2=jQuery("#autoLogin").val();
if(_2=="true"){
jQuery("#autoLogin").val("false");
}else{
jQuery("#autoLogin").val("true");
}
});
});
jQuery(function(){
window.onresize=window.onload=function(){
var _3=jQuery(".login-bg img")[0];
autoresizeImg(_3);
};
function autoresizeImg(_4){
var h,w;
if(!!(window.attachEvent&&!window.opera)){
h=document.documentElement.clientHeight;
w=document.documentElement.clientWidth;
}else{
h=window.innerHeight;
w=window.innerWidth;
}
var _7=Math.max(625,h);
if(jQuery.browser.msie){
SmallSite.autoResizeImg(_4,w,_7);
jQuery(_4).css({"margin":0});
jQuery(".login").css({"height":_7});
}else{
jQuery(".login-bg").hide();
jQuery(".login").css({"height":_7});
setTimeout(function(){
jQuery(".login").css({"opacity":1});
},300);
}
}
});
var loginAnimation=function(_8){
this.args=jQuery.extend({delaytime:"3s",targetObj:[]},_8);
this.init();
};
loginAnimation.prototype={init:function(){
var _9=this;
if(jQuery.browser.msie){
return;
}
jQuery.each(_9.args.targetObj,function(i,_b){
jQuery(_b).css("margin-left","-"+jQuery(_b).width()+"px");
});
this.fixCSS();
this._bindEvent();
},fixCSS:function(){
var _c=this;
jQuery.each(_c.args.targetObj,function(i,_e){
setTimeout(function(){
jQuery(_e).css({"transition":"margin 0.8s ease-out 0.5s","-moz-transition":"margin 0.8s ease-out 0.5s","-webkit-transition":"margin 0.8s ease-out 0.5s"});
jQuery(_e).css("margin-left","0");
},300);
});
},_bindEvent:function(){
var _f=this;
jQuery("form[name=loginForm]").submit(function(){
var _10=jQuery("#email");
var _11=jQuery("#password");
if(_10.val()==""){
jQuery("#pswErro")._hide();
jQuery("#emailErro")._show();
return false;
}else{
if(_11.val()==""){
jQuery("#emailErro")._hide();
jQuery("#pswErro")._show();
return false;
}
}
_f.sliderOut();
return true;
});
},sliderOut:function(){
var _12=this;
setTimeout(function(){
jQuery.each(_12.args.targetObj,function(i,obj){
jQuery(obj).css("margin-left","-"+jQuery(obj).width()+"px");
});
},200);
},_getResult:function(){
}};
jQuery.fn.extend({_show:function(){
var ele=this;
if(ele.css("display")=="block"){
return;
}
ele.css({"opacity":"0","margin-left":"-96px"});
var _16={_ele:ele,_eleWidth:ele.width(),_init:function(){
this._setcss();
this._fixCss();
},_setcss:function(){
this._ele.css({"transition":"margin 0.3s ease-out ","-moz-transition":"margin 0.3s ease-out ","-webkit-transition":"margin 0.3s ease-out "});
},_fixCss:function(){
var _17=this;
this._ele.show();
setTimeout(function(){
_17._ele.css({"margin-left":"0px","opacity":1});
},300);
}};
_16._init();
},_hide:function(){
var _18=this;
if(this.css("display")=="none"){
return;
}
this.css({"margin-left":"-96px","opacity":0});
setTimeout(function(){
_18.hide();
},300);
}});
jQuery(function(){
new loginAnimation({targetObj:[".word-one",".word-two",".word-three",".item",".item-btn"]});
});
