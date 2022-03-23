x = [1 1.5 2 3 4];
f = [0 0.17609 0.30103 0.47712 0.60206];
a = 2.5;
b = 3.25;
printf("N4f(%d) = %f\n", a, Newton(x, f, a));
printf("N4f(%d) = %f\n", b, Newton(x, f, b));

x_values = 1 : 0.1 : 3.5;
f_values = log10(x_values);
interpolated = [];
len = length(x_values);
for i = 1:len
	interpolated = [interpolated Newton(x, f, x_values(i))];
end
plot(x_values, f_values ,x_values, interpolated);
printf("maxError = %f\n", max(abs(f_values-interpolated)));