
JAVAC=/usr/bin/javac

.SUFFIXES: .java .class
SRCDIR=nkosinathintuli
BINDIR=bin

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<

CLASSES= CountZero.class CountZeroTest.class
CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)
clean:
	rm $(BINDIR)/*.class

runcount:
	java -cp $(BINDIR) CountZeroTest
