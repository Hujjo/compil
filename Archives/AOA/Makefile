all:

gcc2:
	gcc -g -O2 kernel.c -c
	gcc -g -O2 rdtsc.c -c
	gcc -g -O2 main.c -c
	gcc -g -O2 kernel.o rdtsc.o main.o -o run_kernel

gcc3:
	gcc -g kernel.c -c
	gcc -g rdtsc.c -c
	gcc -g main.c -c
	gcc -O3 kernel.o rdtsc.o main.o -o run_kernel

gcc3nativ:
	gcc kernel.c -c
	gcc rdtsc.c -c
	gcc main.c -c
	gcc -O3 -march=native kernel.o rdtsc.o main.o -o run_kernel

icc:
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc kernel.c -c
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc rdtsc.c -c
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc main.c -c
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc kernel.o rdtsc.o main.o -o run_kernel

icc2:
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc kernel.c -c
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc rdtsc.c -c
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc main.c -c
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc -O2 kernel.o rdtsc.o main.o -o run_kernel

icc3:
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc kernel.c -c
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc rdtsc.c -c
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc main.c -c
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc -O3 kernel.o rdtsc.o main.o -o run_kernel

icc3xHost:
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc kernel.c -c
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc rdtsc.c -c
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc main.c -c
	/opt/intel/compilers_and_libraries_2016.2.181/linux/bin/intel64/icc -O3 -xHost kernel.o rdtsc.o main.o -o run_kernel

clear:
	rm -f *.o
