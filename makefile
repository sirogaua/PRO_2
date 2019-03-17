.PHONY: clean

lab2: input_masiv.o output_masiv.o target.o main.o
	gcc input_masiv.o output_masiv.o target.o main.o -o lab2
input_masiv.o: input_masiv.c
	gcc -c input_masiv.c -o input_masiv.o
output_masiv.o: output_masiv.c
	gcc -c output_masiv.c -o output_masiv.o
target.o: target.c
	gcc -c target.c -o target.o
main.o: main.c
	gcc -c main.c -o main.o

clean:
	rm -rf lab2 *.o


