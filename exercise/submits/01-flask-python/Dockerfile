FROM python:3

WORKDIR /usr/src/app
ENV FLASK_APP=app.py
COPY . ./
RUN apt-get update && apt-get install pipenv -y && rm -rf /var/lib/apt/lists/* && pipenv install

EXPOSE 5000

ENTRYPOINT ["pipenv", "run"]

CMD ["flask", "run", "--host=0.0.0.0"]