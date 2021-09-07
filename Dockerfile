FROM alpine:3.14.2

RUN  apk update \
  && apk upgrade \
  && apk add ca-certificates \
  && update-ca-certificates \
  && apk add --update coreutils && rm -rf /var/cache/apk/*   \
  && apk add --update openjdk11 tzdata curl unzip bash \
  && apk add --no-cache nss \
  && rm -rf /var/cache/apk/* \
WORKDIR /app
COPY target/scala-2.13/server.jar .
EXPOSE 8080/tcp
CMD ["java", "-jar", "server.jar"]