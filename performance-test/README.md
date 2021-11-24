## Usage

```
docker build -t test:single -f Dockerfile.single .
docker run --rm test:single
docker build -t test:multiple -f Dockerfile.multiple .
docker run --rm test:multiple
```