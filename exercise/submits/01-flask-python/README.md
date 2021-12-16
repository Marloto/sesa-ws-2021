# Python / Flask HTTP-API

Provide HTTP endpoint for /hello, /healthz and /kill

## Dependencies

Uses pipenv for dependency management, based on python3 (python3.9 will work). 

## Usage

```bash
pipenv install # install dependencies
pipenv shell # start python subshell
export FLASK_APP=app.py
flask run
````

## References

- https://pipenv-fork.readthedocs.io/en/latest/basics.html

# Commands
## docker
```shell
docker build -t bl4d3s/flask-sesa .
docker push bl4d3s/flask-sesa:latest
```

## k8s
```shell
kubectl apply -f deployment.yaml
kubectl expose deployment flask-deployment --type=LoadBalancer --port=5000
minikube service flask-deployment
```

