FROM python
WORKDIR /home/root/flask-python
COPY flask-python ./
ENV GREETING="Jojo & Manu"
RUN pip install pipenv
RUN pip install flask
EXPOSE 5000
CMD pipenv install && pipenv shell
CMD export FLASK_APP=app.py
CMD flask run