temperature = [0 10 20 30 40 60 80 100];
pressure = [0.0061 0.0123 0.0234 0.0424 0.0738 0.1992 0.4736 1.0133];

%a.) two least squares approximations
f2 = polyfit(temperature, pressure, 7)
f5 = polyfit(temperature, pressure, 8)
p2 = polyval(f2, 45);
p5 = polyval(f5, 45);
true_val = 0.095848;
err_f2 = abs(p2-true_val);
err_f5 = abs(p5-true_val);
printf("a.)\n");
printf("approx for polynomial fct of order 2: %f\n",p2);
printf("approx for polynomial fct of order 5: %f\n",p5);
printf("\n");
printf("error for order 2:%f\n", err_f2);
printf("error for order 2:%f\n", err_f5);

%plot
x = 0 : 0.01 : 100;
pt1 = polyval(f2, x);
pt2 = polyval(f5, x);

pt_interpolated = [];
for i = 1:length(x)
  pt_interpolated = [pt_interpolated, barycentric(temperature, pressure, x(i))];
endfor

plot(x, pt1, "-r", x, pt2, "-g", x, pt_interpolated,"-b" , temperature, pressure, "*")
legend