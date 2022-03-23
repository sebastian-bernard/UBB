x = [1 2 3 4 5];
f = [22 23 25 30 28];

  %a.)
a =  2.5;
printf("N5(%d) = %f \n", a, Newton(x, f, a));

  %b.)
x_values = 1:0.001:5;
f_values = [];
for i=1:length(x_values)
  f_values = [f_values Newton(x, f, x_values(i))];
endfor
subplot(1, 2, 1);
plot(x, f);
subplot(1, 2, 2);
plot(x_values, f_values, '-r');