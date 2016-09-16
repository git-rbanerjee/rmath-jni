include ./Make.inc



DYNLIB = $(LIBPATH)/$(LIBNAME)
STALIB = $(LIBPATH)/$(STATIC_LIBNAME)



all:
	cd Rmath && make && ar rcs $(STATIC_LIBNAME) *.o
	mkdir -p $(LIBPATH)
	cp Rmath/$(LIBNAME) $(DYNLIB)
	cp Rmath/$(STATIC_LIBNAME) $(STALIB)
	gcc -I "$(JAVA_HOME)/include/" -I "$(JAVA_HOME)/include/$(PREFIX_OS)/"  -o $(FINALLIB) -shared JNIRMathNative.c  $(STALIB) -fPIC
	rm -f $(LIBPATH)/*
	mv $(FINALLIB) $(LIBPATH)



clean:
	cd Rmath && make clean
	cd $(LIBPATH) && rm *
