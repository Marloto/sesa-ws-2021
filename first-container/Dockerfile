FROM alpine:3.12

ENV SOMETHING "Any Value"
# Es gibt auch Möglichkeiten über den run ENV zu definieren: -e

WORKDIR /app

# ... was soll passieren
# mittels && mehrere Befehle gruppieren
RUN echo "Hello, $SOMETHING" > ./something

# ADD und COPY
# COPY example /root/example
COPY example .

ADD https://en.wikipedia.org/wiki/File:Example.jpg ./

EXPOSE 8080

VOLUME ["/app"]

# CMD cat /root/something
# Kann bei Erzeugung neu vergeben werden!

#ENTRYPOINT ["echo", "hello"]
# kann genutzt werden für default argumente, falls entrypoint gesetzt ist
CMD ["/bin/sh"]