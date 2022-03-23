1;

function retvalue = DDifferences(x_values, f_values, n)   
  %initialisation
  table = [];
  table = [table; x_values; f_values];
  
  %formula for devided differences is: 
  %(D_kf)(x_i) = ((D_k-1f)(x_i+1) - (D_k-1f)(x_i)) / (x_i+k - x_i)
  old_line = f_values;
  for k = 1:n-1 %number of the devided difference
    new_line = [];
    for i=1:n-k %index of current x
      new_line = [new_line, (old_line(i+1)-old_line(i)) / (x_values(i+k)-x_values(i))]; 
    end;  
    new_line = [new_line, zeros(1, k)]; %complete with 0 the line that will transform in column, for the places where we have no more numbers to substract
    table = [table; new_line]; %add new line to table, after the line before
    old_line = new_line;  
  end;
  table = table'; %compute and print the transpose of the table  
  retvalue = table;
endfunction


##x = [2 4 6 8];
##f = [4 8 14 16];
##DDifferences(x, f, 4)