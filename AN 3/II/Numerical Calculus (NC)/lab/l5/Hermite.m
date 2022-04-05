1;

function returnVal = hermite(x_values, f_values, deriv_values)
  %initialisation
  table = [];
  n = length(x_values);
  new_x_values = [];
  new_f_values = [];
    %supose we have 1 derivative => double the values for x anf f(x) 
  for i=1:n
    new_x_values = [new_x_values x_values(i) x_values(i)];
    new_f_values = [new_f_values f_values(i) f_values(i)];
  endfor  
  table = [new_x_values; new_f_values];
  t = length(new_x_values);
  
  %compute the line of the table with division by 0 issue  
  new_line = []
  for j = 1:n-1
		if mod(j, 2) == 1
			new_line = [new_line derive_values((j+1)/2)];
		else
			new_line = [new_line (t(2, j+1) - t(2, j)) / (t(1, j+1) - t(1, j))];
		end
	end
  t = [t ; new_line 0]; %last column is 1 value short
  
  %compute the other columns
  for i = 3:n
		new_line = [];
		for j = 1:n-i+1
			new_line = [new_line (t(i, j+1) - t(i, j)) / (t(1, j+i-1) - t(1, j))];
		endfor
		new_line = [new_line zeros(1, i-1)];
		t = [t ; new_line];		
	endfor
	t = t';
  
  p = 1;
	sol = 0;

	for i = 1:n
		sol += p * t(1, i+1);
		p = p * (point-x(i));
	end
endfunction


%f = x^2
hermite([1 2 3], [1 4 9], [2 4 6])