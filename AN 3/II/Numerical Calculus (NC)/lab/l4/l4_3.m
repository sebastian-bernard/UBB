x_values = linspace(0, 6, 13)
f_values = exp(sin(x_values))
x = 1 : 0.01 : 6;
f = exp(sin(x));
sol = [];
for i = 1 : length(x)
	sol = [sol Newton(x_values, f_values, x(i))];
endfor

%plot the interpolation points
subplot(3, 1, 1);
plot(x_values, f_values, '-r');

%plot the function
subplot(3, 1, 2);
plot(x, f,'-g');

%plot  the Newton intepolation polynomial N12
subplot(3, 1, 3);
plot(x, sol, '-b');