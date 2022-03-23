x_values = linspace(0, 6, 13)
f_values = exp(sin(x_values))
x = 0 : 0.01 : 6;
f = exp(sin(x));
sol = [];
for i = 1 : length(x)
	sol = [sol Newton(x_values, f_values, x(i))];
endfor

%plot the interpolation points



%plot the function



%plot  the Newton intepolation polynomial N12

plot(x_values, f_values, '*',x, f, x, sol, '-b');