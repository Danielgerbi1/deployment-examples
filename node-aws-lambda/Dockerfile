FROM amazon/aws-sam-cli-build-image-nodejs14.x
RUN mkdir -p /build
RUN mkdir -p /dist
WORKDIR /build
COPY . . 
RUN npm install
RUN zip -r /dist/rookout_lambda_test.zip .
ENV AWS_DEFAULT_REGION us-east-2
