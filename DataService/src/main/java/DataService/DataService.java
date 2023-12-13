package DataService;

import data.exchange.grpc.DataExchange;
import data.exchange.grpc.DataExchangerGrpc;
import io.grpc.stub.StreamObserver;

public class DataService extends DataExchangerGrpc.DataExchangerImplBase {
    @Override
    public void sendData(DataExchange.DataRequest request, StreamObserver<DataExchange.DataResponse> responseObserver) {
        System.out.println(request.getJsonData());
        DataExchange.DataResponse response = DataExchange.DataResponse.newBuilder().setMessage("Success").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
