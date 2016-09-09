include ./Make.inc



DYNLIB = $(LIBPATH)/$(LIBNAME)
STALIB = $(LIBPATH)/$(STATIC_LIBNAME)
FINALLIB = libjnirmath.so



all:
	cd Rmath && make && ar rcs $(STATIC_LIBNAME) *.o
	mkdir -p $(LIBPATH)
	cp Rmath/$(LIBNAME) $(DYNLIB)
	cp Rmath/$(STATIC_LIBNAME) $(STALIB)
	gcc -I$(JAVA_HOME)"/include/" -I$(JAVA_HOME)"/include/linux/"  -o $(FINALLIB) -shared JNIRMath.c  $(STALIB) -fPIC
	rm -f $(LIBPATH)/*
	mv $(FINALLIB) $(LIBPATH)



clean:
	cd Rmath && make clean
	cd $(LIBPATH) && rm *

