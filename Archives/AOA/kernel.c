float kernel(int n, double a[0][0])
{
	int i,j;
	float s = 0.0;

	for(j=0 ; j<n ; j++)
		for(i=0 ; i<n ; i++)
			s += a[i][j];

	return s;
}
