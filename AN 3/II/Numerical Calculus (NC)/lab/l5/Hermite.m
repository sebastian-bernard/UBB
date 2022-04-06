1;

function returnVal = hermite(x_values, f_values, deriv_values, x)  
  %initialisation
  table = [];
  n = length(x_values);
  new_x_values = [];
  new_f_values = [];
    %supose we have 1 derivative => double the values for x and f(x) 
  for i=1:n
    new_x_values = [new_x_values x_values(i) x_values(i)];
    new_f_values = [new_f_values f_values(i) f_values(i)];
  endfor  
  table = [new_x_values; new_f_values];
  n = length(new_x_values);
  table;  
  
  %compute the line of the table with division by 0 issue  
  new_line = [];
  for j = 1:n-1
		if mod(j, 2) == 1
			new_line = [new_line deriv_values((j+1)/2)];
		else
			new_line = [new_line (table(2, j+1) - table(2, j)) / (table(1, j+1) - table(1, j))];
		end
	end
  table = [table ; new_line 0]; %last column is 1 value short   
  
  %compute the other columns
  for i = 3:n
		new_line = [];
		for j = 1:n-i+1
			new_line = [new_line (table(i, j+1) - table(i, j)) / (table(1, j+i-1) - table(1, j))];
		endfor
		new_line = [new_line zeros(1, i-1)];
		table = [table ; new_line];		
	endfor
	table = table';
  
  %calculate the hermite interpolation by computing the sum
  p = 1;
	sol = 0;
	for i = 1:n
		sol += p * table(1, i+1);
		p = p * (x-new_x_values(i));
	endfor
  returnVal = sol;
end


%f = x^2
%f' = 2x
%hermite([1 2 3], [1 4 9], [2 4 6], 3)