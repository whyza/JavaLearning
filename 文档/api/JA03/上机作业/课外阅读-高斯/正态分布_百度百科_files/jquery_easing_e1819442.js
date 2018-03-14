F.module("/static/common/ui/jquery_easing/jquery_easing.js",function(b,a){var c=b("/static/common/ui/jquery/jquery.js");c.easing.jswing=c.easing.swing;c.extend(c.easing,{def:"easeOutQuad",swing:function(f,g,e,i,h){return c.easing[c.easing.def](f,g,e,i,h)},easeInQuad:function(f,g,e,i,h){return i*(g/=h)*g+e},easeOutQuad:function(f,g,e,i,h){return -i*(g/=h)*(g-2)+e},easeInOutQuad:function(f,g,e,i,h){if((g/=h/2)<1){return i/2*g*g+e}return -i/2*((--g)*(g-2)-1)+e},easeInCubic:function(f,g,e,i,h){return i*(g/=h)*g*g+e},easeOutCubic:function(f,g,e,i,h){return i*((g=g/h-1)*g*g+1)+e},easeInOutCubic:function(f,g,e,i,h){if((g/=h/2)<1){return i/2*g*g*g+e}return i/2*((g-=2)*g*g+2)+e},easeInQuart:function(f,g,e,i,h){return i*(g/=h)*g*g*g+e},easeOutQuart:function(f,g,e,i,h){return -i*((g=g/h-1)*g*g*g-1)+e},easeInOutQuart:function(f,g,e,i,h){if((g/=h/2)<1){return i/2*g*g*g*g+e}return -i/2*((g-=2)*g*g*g-2)+e},easeInQuint:function(f,g,e,i,h){return i*(g/=h)*g*g*g*g+e},easeOutQuint:function(f,g,e,i,h){return i*((g=g/h-1)*g*g*g*g+1)+e},easeInOutQuint:function(f,g,e,i,h){if((g/=h/2)<1){return i/2*g*g*g*g*g+e}return i/2*((g-=2)*g*g*g*g+2)+e},easeInSine:function(f,g,e,i,h){return -i*Math.cos(g/h*(Math.PI/2))+i+e},easeOutSine:function(f,g,e,i,h){return i*Math.sin(g/h*(Math.PI/2))+e},easeInOutSine:function(f,g,e,i,h){return -i/2*(Math.cos(Math.PI*g/h)-1)+e},easeInExpo:function(f,g,e,i,h){return(g==0)?e:i*Math.pow(2,10*(g/h-1))+e},easeOutExpo:function(f,g,e,i,h){return(g==h)?e+i:i*(-Math.pow(2,-10*g/h)+1)+e},easeInOutExpo:function(f,g,e,i,h){if(g==0){return e}if(g==h){return e+i}if((g/=h/2)<1){return i/2*Math.pow(2,10*(g-1))+e}return i/2*(-Math.pow(2,-10*--g)+2)+e},easeInCirc:function(f,g,e,i,h){return -i*(Math.sqrt(1-(g/=h)*g)-1)+e},easeOutCirc:function(f,g,e,i,h){return i*Math.sqrt(1-(g=g/h-1)*g)+e},easeInOutCirc:function(f,g,e,i,h){if((g/=h/2)<1){return -i/2*(Math.sqrt(1-g*g)-1)+e}return i/2*(Math.sqrt(1-(g-=2)*g)+1)+e},easeInElastic:function(f,h,e,l,k){var i=1.70158;var j=0;var g=l;if(h==0){return e}if((h/=k)==1){return e+l}if(!j){j=k*0.3}if(g<Math.abs(l)){g=l;var i=j/4}else{var i=j/(2*Math.PI)*Math.asin(l/g)}return -(g*Math.pow(2,10*(h-=1))*Math.sin((h*k-i)*(2*Math.PI)/j))+e},easeOutElastic:function(f,h,e,l,k){var i=1.70158;var j=0;var g=l;if(h==0){return e}if((h/=k)==1){return e+l}if(!j){j=k*0.3}if(g<Math.abs(l)){g=l;var i=j/4}else{var i=j/(2*Math.PI)*Math.asin(l/g)}return g*Math.pow(2,-10*h)*Math.sin((h*k-i)*(2*Math.PI)/j)+l+e},easeInOutElastic:function(f,h,e,l,k){var i=1.70158;var j=0;var g=l;if(h==0){return e}if((h/=k/2)==2){return e+l}if(!j){j=k*(0.3*1.5)}if(g<Math.abs(l)){g=l;var i=j/4}else{var i=j/(2*Math.PI)*Math.asin(l/g)}if(h<1){return -0.5*(g*Math.pow(2,10*(h-=1))*Math.sin((h*k-i)*(2*Math.PI)/j))+e}return g*Math.pow(2,-10*(h-=1))*Math.sin((h*k-i)*(2*Math.PI)/j)*0.5+l+e},easeInBack:function(f,g,e,j,i,h){if(h==undefined){h=1.70158}return j*(g/=i)*g*((h+1)*g-h)+e},easeOutBack:function(f,g,e,j,i,h){if(h==undefined){h=1.70158}return j*((g=g/i-1)*g*((h+1)*g+h)+1)+e},easeInOutBack:function(f,g,e,j,i,h){if(h==undefined){h=1.70158}if((g/=i/2)<1){return j/2*(g*g*(((h*=(1.525))+1)*g-h))+e}return j/2*((g-=2)*g*(((h*=(1.525))+1)*g+h)+2)+e},easeInBounce:function(f,g,e,i,h){return i-c.easing.easeOutBounce(f,h-g,0,i,h)+e},easeOutBounce:function(f,g,e,i,h){if((g/=h)<(1/2.75)){return i*(7.5625*g*g)+e}else{if(g<(2/2.75)){return i*(7.5625*(g-=(1.5/2.75))*g+0.75)+e}else{if(g<(2.5/2.75)){return i*(7.5625*(g-=(2.25/2.75))*g+0.9375)+e}else{return i*(7.5625*(g-=(2.625/2.75))*g+0.984375)+e}}}},easeInOutBounce:function(f,g,e,i,h){if(g<h/2){return c.easing.easeInBounce(f,g*2,0,i,h)*0.5+e}return c.easing.easeOutBounce(f,g*2-h,0,i,h)*0.5+i*0.5+e}});a=c;return a},["/static/common/ui/jquery/jquery.js"]);