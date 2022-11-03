all: tester global executer global2 executer2 global3 executer3 test_all_exec clean

clean:
	rm -rf build/
	rm -f *.java~ Makefile~ *.sh~
	rm -rf abstract/src/*.java~ && rm -rf abstract/tst/*.java~
	rm -rf interface/src/*.java~ && rm -rf interface/tst/*.java~

compiler: creation.sh
	./$^ build
	javac -d build/ -cp build/ src/*.java
	javac -d build/ -cp build/ tst/*.java
tester_1:compiler
	javac -d build/ -cp build/ tst/TestPosition.java
	javac -d build/ -cp build/ tst/TestJauge.java
tester_2:compiler
	javac -d build/ -cp build/ tst/TestPassagerStandard.java
	javac -d build/ -cp build/ tst/TestPassagerIndecis.java
	javac -d build/ -cp build/ tst/TestPassagerStresse.java
	javac -d build/ -cp build/ tst/TestAutobus.java

tester: tester_1 tester_2
	java -ea -cp build/ tec.TestPosition
	java -ea -cp build/ tec.TestJauge
	java -ea -cp build/ tec.TestAutobus
	java -ea -cp build/ tec.TestPassagerStandard
	java -ea -cp build/ tec.TestPassagerIndecis
	java -ea -cp build/ tec.TestPassagerStresse
	@echo "==============================Fin tests unitaires et de recettes"

global: compiler #compilation seulement.
#pas de package tec au debut de simple=>pas introduction dans build/tec.*.
#mais -d en premier important sinon rien.($(executer))
	javac -d build/ -cp build/ SimpleInterface.java
DIRBUILD?=build
executer:$(DIRBUILD)
	java -cp build/ SimpleInterface

global2: compiler
	javac -d build/ -cp build/ SimpleIndecis.java
executer2: $(DIRBUILD)
	java -cp build/ SimpleIndecis

global3: compiler
	javac -d build/ -cp build/ SimpleStresse.java
executer3: $(DIRBUILD)
	java -cp build/ SimpleStresse

test_all: compiler src/SimpleAll.java
	javac -d build/ -cp build/ src/SimpleAll.java

test_all_exec: test_all
	java -cp build/ SimpleAll
	@echo "==========================FIN tests globaux sur les caracteres(cote client)===================================TEST sur leurs interactions sur un meme bus:(voir juste plus haut)"




#-cp indique le chemin.
