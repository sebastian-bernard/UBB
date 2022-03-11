%declaration 
x = 0:0.01:10;
x_values = linspace(0, 10, 21);
f_values = (1 + cos(pi*x_values)) ./ (1 + x_values);
f = (1+cos(pi*x)) ./ (1+x);

aproximation_values = [];
for i=1:length(x)
  aproximation_values = [aproximation_values barycentric(x_values, f_values, x(i))];  
endfor

subplot(1, 2, 1);
plot(x, f);
title("function");
subplot(1, 2, 2);
plot(x, aproximation_values, 'r');
title("aproximation");

##hold on;
##plot(x,f ,'--r');
##plot(x, aproximation_values, '--g');
##holf off;