#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>

float kernel(int n,double a[n][n]);
__inline__ uint64_t rdtsc(void);

void init_array(int n, double a[n][n])
{
	int i,j;
	for(j=0 ; j<n ; j++)
		for(i=0 ; i<n ; i++)
			a[i][j] = (double) rand() / RAND_MAX;
}

int main(int argc, char *argv[])
{
	int r;
	float s = 0.0;

	/* Récupération arguments */
	int size = atoi(argv[1]);
	int rept = atoi(argv[2]);
    int repw = atoi(argv[3]);

	/* Allocation */
	/*double **a = calloc(size,sizeof(*a));
	if(a == NULL) exit(EXIT_FAILURE);
	for(r=0 ; r<size ; r++) {
		a[r] = calloc(size,sizeof(*(a[r])));
		if(a[r] == NULL) exit(EXIT_FAILURE);
	}*/
	double (*a)[size] = malloc (size * size * sizeof (a[0][0]));

	/* Init. tableaux lus */
	init_array(size,a);

	/* Warmup */
      for (r=0;r<repw;r++)
    	kernel(size,a);

	/* Répétitions */
	uint64_t t1 = rdtsc();
	for(r=0 ; r<rept ; r++)
		s = kernel(size,a);
	uint64_t t2 = rdtsc();

	/* Libération */
	/*for(r=0 ; r<size ; r++)
		free(a[r]);*/
	free(a);

	/* Affichage performance */
	printf("Cycles per iter.: %.2f\n",(t2-t1) / ( (float) size * size * rept ));

	return 0;
}