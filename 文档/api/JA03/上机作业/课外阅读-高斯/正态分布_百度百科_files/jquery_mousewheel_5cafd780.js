F.module("/static/common/ui/jquery_mousewheel/jquery_mousewheel.js",function(b,a){
/*! Copyright (c) 2013 Brandon Aaron (http://brandon.aaron.sh)
 * Licensed under the MIT License (LICENSE.txt).
 *
 * Version: 3.1.9
 *
 * Requires: jQuery 1.2.2+
 */
(function(c){if(typeof define==="function"&&define.amd){define(["jquery"],c)}else{if(typeof a==="object"){a=c}else{c(jQuery)}}}(function(e){var f=["wheel","mousewheel","DOMMouseScroll","MozMousePixelScroll"],m=("onwheel" in document||document.documentMode>=9)?["wheel"]:["mousewheel","DomMouseScroll","MozMousePixelScroll"],k=Array.prototype.slice,l,d;if(e.event.fixHooks){for(var g=f.length;g;){e.event.fixHooks[f[--g]]=e.event.mouseHooks}}var h=e.event.special.mousewheel={version:"3.1.9",setup:function(){if(this.addEventListener){for(var o=m.length;o;){this.addEventListener(m[--o],n,false)}}else{this.onmousewheel=n}e.data(this,"mousewheel-line-height",h.getLineHeight(this));e.data(this,"mousewheel-page-height",h.getPageHeight(this))},teardown:function(){if(this.removeEventListener){for(var o=m.length;o;){this.removeEventListener(m[--o],n,false)}}else{this.onmousewheel=null}},getLineHeight:function(i){return parseInt(e(i)["offsetParent" in e.fn?"offsetParent":"parent"]().css("fontSize"),10)},getPageHeight:function(i){return e(i).height()},settings:{adjustOldDeltas:true}};e.fn.extend({mousewheel:function(i){return i?this.bind("mousewheel",i):this.trigger("mousewheel")},unmousewheel:function(i){return this.unbind("mousewheel",i)}});function n(i){var p=i||window.event,t=k.call(arguments,1),v=0,r=0,q=0,s=0;i=e.event.fix(p);i.type="mousewheel";if("detail" in p){q=p.detail*-1}if("wheelDelta" in p){q=p.wheelDelta}if("wheelDeltaY" in p){q=p.wheelDeltaY}if("wheelDeltaX" in p){r=p.wheelDeltaX*-1}if("axis" in p&&p.axis===p.HORIZONTAL_AXIS){r=q*-1;q=0}v=q===0?r:q;if("deltaY" in p){q=p.deltaY*-1;v=q}if("deltaX" in p){r=p.deltaX;if(q===0){v=r*-1}}if(q===0&&r===0){return}if(p.deltaMode===1){var u=e.data(this,"mousewheel-line-height");v*=u;q*=u;r*=u}else{if(p.deltaMode===2){var o=e.data(this,"mousewheel-page-height");v*=o;q*=o;r*=o}}s=Math.max(Math.abs(q),Math.abs(r));if(!d||s<d){d=s;if(c(p,s)){d/=40}}if(c(p,s)){v/=40;r/=40;q/=40}v=Math[v>=1?"floor":"ceil"](v/d);r=Math[r>=1?"floor":"ceil"](r/d);q=Math[q>=1?"floor":"ceil"](q/d);i.deltaX=r;i.deltaY=q;i.deltaFactor=d;i.deltaMode=0;t.unshift(i,v,r,q);if(l){clearTimeout(l)}l=setTimeout(j,200);return(e.event.dispatch||e.event.handle).apply(this,t)}function j(){d=null}function c(o,i){return h.settings.adjustOldDeltas&&o.type==="mousewheel"&&i%120===0}}));return a},[]);